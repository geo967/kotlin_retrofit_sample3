package com.example.retrofit_kotlin

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {
    companion object{
    const val BaseUrl="https://jsonplaceholder.typicode.com"}
    @get:GET("posts")
    val posts: Call<List<Model>>
}