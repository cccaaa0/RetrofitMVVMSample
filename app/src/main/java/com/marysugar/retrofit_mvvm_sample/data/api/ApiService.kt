package com.marysugar.retrofit_mvvm_sample.data.api

import com.marysugar.retrofit_mvvm_sample.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}