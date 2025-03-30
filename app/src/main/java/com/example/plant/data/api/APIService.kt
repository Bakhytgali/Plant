package com.example.plant.data.api

import com.example.plant.data.model.GardenModel
import retrofit2.Response
import retrofit2.http.POST

interface APIService {
    interface ApiService {

        @POST("/")
        suspend fun getGardens(): Response<List<GardenModel>>

    }
}