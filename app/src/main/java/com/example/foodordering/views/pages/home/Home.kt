package com.example.foodordering.views.pages.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodordeeing.R
import com.example.foodordeeing.databinding.FragmentHomeBinding
import com.example.foodordering.data.adapters.RestaurantAdapter
import com.example.foodordering.model.Restaurant

class Home : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val list = MutableLiveData<List<Restaurant>>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initTest()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun initTest(){
        val restaurants = listOf(
            Restaurant(1,"Juanes",3.4,"Hola","https://picsum.photos/200"),
            Restaurant(2,"Pancho",4.8,"Hola","https://picsum.photos/200"),
            Restaurant(3,"Los tacos lokos",3.7,"Hola","https://picsum.photos/200"),
            Restaurant(4,"sdfasdf",4.6,"Hola","https://picsum.photos/200"),
            Restaurant(5,"asdfsd",2.5,"Hola","https://picsum.photos/200"),
            Restaurant(6,"asda",1.4,"Hola","https://picsum.photos/200"),
            Restaurant(7,"sdfsgds",2.3,"Hola","https://picsum.photos/200"),
            Restaurant(8,"gpi",3.2,"Hola","https://picsum.photos/200"),
            Restaurant(9,"asdfas",4.1,"Hola","https://picsum.photos/200"),
            Restaurant(10,"agggsdfe",5.0,"Hola","https://picsum.photos/200")
        )

        list.postValue(restaurants)

        binding.rcRestaurants.layoutManager = LinearLayoutManager(requireContext())

        list.observe(viewLifecycleOwner){
            binding.rcRestaurants.adapter = RestaurantAdapter(it)
        }
    }
}