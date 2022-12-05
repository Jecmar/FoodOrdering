package com.example.foodordering.data.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.foodordeeing.databinding.RestaurantItemBinding
import com.example.foodordering.model.Restaurant

class RestaurantAdapter(private val restaurantList: List<Restaurant>): RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    class ViewHolder(private val binding: RestaurantItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(restaurant: Restaurant){
            binding.restaurantName.text = restaurant.name
            val url = restaurant.logo

            if(url.isNotEmpty()){
                binding.restaurantImage.load(url){
                    crossfade(true)
                    crossfade(1000)
                }
            }

            binding.restaurantRate.text = "${restaurant.rate}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RestaurantItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.render(restaurantList[position])

    override fun getItemCount(): Int = restaurantList.size
}