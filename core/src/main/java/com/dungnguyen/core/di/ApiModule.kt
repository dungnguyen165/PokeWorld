package com.dungnguyen.core.di

import com.dungnguyen.core.data.remote.ApiEndpoint
import com.dungnguyen.core.data.remote.interceptors.LoggingInterceptor
import com.dungnguyen.core.data.remote.service.PokeApi
import com.dungnguyen.core.data.remote.service.PokeClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun providePokeClient(pokeApi: PokeApi) = PokeClient(pokeApi)

    @Provides
    @Singleton
    fun providePokeApi(builder: Retrofit.Builder): PokeApi {
        return builder
            .build()
            .create(PokeApi::class.java)
    }

    @Provides
    fun provideRetrofitBuilder(okHttpClient: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(ApiEndpoint.BASE_ENDPOINT)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
    }

    @Provides
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Provides
    fun provideHttpLoggingInterceptor(loggingInterceptor: LoggingInterceptor) =
        HttpLoggingInterceptor(loggingInterceptor).apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
}