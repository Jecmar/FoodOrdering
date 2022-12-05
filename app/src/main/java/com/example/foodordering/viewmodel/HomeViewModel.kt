package com.example.foodordering.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.foodordering.data.adapters.RestaurantAdapter
import com.example.foodordering.model.Restaurant
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel(){
    val restaurantList = MutableLiveData<RestaurantAdapter>()

    fun loadRestaurants(){
        viewModelScope.launch {

        }
    }
}