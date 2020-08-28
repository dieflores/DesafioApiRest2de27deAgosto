package com.example.desafioapi2picasso_27agosto.elretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ElRetrofit {

    companion object{
        private const val URL_BASE = ""
        fun retrofitInstance(): ApiPics{
            val retrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create()).build()

            return retrofit.create(ApiPics::class.java)
        }
    }
}