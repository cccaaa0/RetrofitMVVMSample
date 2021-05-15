package com.marysugar.retrofit_mvvm_sample.data.repository

import com.marysugar.retrofit_mvvm_sample.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}