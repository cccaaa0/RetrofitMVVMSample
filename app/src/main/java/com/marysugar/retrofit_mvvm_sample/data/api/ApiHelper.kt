package com.marysugar.retrofit_mvvm_sample.data.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}