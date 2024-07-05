package com.test.sealeddata


sealed interface ReturnCode {
    val success: Int
    val error99: Int
}