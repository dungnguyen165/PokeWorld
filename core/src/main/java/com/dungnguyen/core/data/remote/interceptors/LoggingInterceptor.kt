package com.dungnguyen.core.data.remote.interceptors

import com.dungnguyen.logging.PLog
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

class LoggingInterceptor @Inject constructor(): HttpLoggingInterceptor.Logger {
    override fun log(message: String) {
        PLog.i(message)
    }
}