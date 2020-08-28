package com.example.desafioapi2picasso_27agosto.elretrofit

import com.example.desafioapi2picasso_27agosto.el_pojo.ThePics
import retrofit2.Call
import retrofit2.http.GET

interface ApiPics {

    @GET("/photos")
    fun getPhotos(): Call<ArrayList<ThePics>>
}