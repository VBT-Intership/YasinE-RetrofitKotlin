package com.egesoftware.data.api

import com.egesoftware.data.models.User
import retrofit2.http.GET

interface ApiService {

    @GET("/users")
    suspend fun getUsers(): List<User>

}