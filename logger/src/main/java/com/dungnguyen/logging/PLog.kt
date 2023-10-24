package com.dungnguyen.logging

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

object PLog {
    fun init() {
        Logger.addLogAdapter(AndroidLogAdapter())
    }

    fun d(message: String) = Logger.d(message)
    fun v(message: String) = Logger.v(message)
    fun e(message: String) = Logger.e(message)
    fun w(message: String) = Logger.w(message)
    fun i(message: String) = Logger.i(message)
}