    package com.example.plant.data.api

    import android.content.Context
    import retrofit2.Retrofit
    import retrofit2.converter.gson.GsonConverterFactory

    object RetrofitClient {
        private const val BASE_URL = "http://192.168.1.78:8080/"

        val api: APIService.ApiService by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(APIService.ApiService::class.java)
        }
    }
