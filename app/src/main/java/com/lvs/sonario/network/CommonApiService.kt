package com.lvs.sonario.network

import retrofit2.Call
import retrofit2.http.GET



/**
 * Created by lipchenko on 25.01.18.
 */
interface CommonApiService {
    @GET
    fun icoList(): Call<List<Int>>

}