package com.example.recipeapplication.network

import com.example.recipeapplication.model.MealDbResponse
import retrofit2.Call
import retrofit2.http.GET

interface TheMealDbApi {
    @GET("random.php")
    fun getRandomMeal(): Call<MealDbResponse>
}
