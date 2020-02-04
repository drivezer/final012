package com.example.final012

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("albums/12/photos")
    fun getPhotos(): Call<List<DataModel>>

}
