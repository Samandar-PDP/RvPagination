package com.sdk.rvpagination.network

import com.sdk.rvpagination.model.Item
import com.sdk.rvpagination.model.RickAndMortyList
import com.sdk.rvpagination.util.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(Constants.END_POINT)
    fun getUsers(
        @Query("page") page: Int
    ): Call<Item>

    @GET(Constants.END_POINT2)
    suspend fun getAllCharacters(
        @Query("page") page: Int
    ): RickAndMortyList
}