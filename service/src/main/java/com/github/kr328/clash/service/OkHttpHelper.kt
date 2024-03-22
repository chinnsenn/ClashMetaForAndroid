package com.github.kr328.clash.service

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * @author: chinnsenn
 * @date: 2024/3/22
 */
object OkHttpHelper {
    val client by lazy {
        OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()
    }
}