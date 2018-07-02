package com.suifeng.kotlin.baselibrary.data.net

import com.suifeng.kotlin.baselibrary.common.BaseConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author ljc
 * @data 2018/6/29
 * @describe
 */
class RetrofitFactory private constructor() {
    companion object {
        val instance : RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BaseConstant.SERVER_ADDRESS)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .client(initClient())
            .build()

    private val mInterceptor: Interceptor = Interceptor {
        chain ->
            val request = chain.request()
                    .newBuilder()
                    .addHeader("ContentType", "application/json")
                    .addHeader("charset", "utf-8")
                    .build()
            chain.proceed(request)
    }

    private fun initClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(mInterceptor)
                .addInterceptor(initLogInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build()
    }

    private fun initLogInterceptor(): Interceptor {
        val logInterceptor = HttpLoggingInterceptor()
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return logInterceptor
    }

    fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }

}