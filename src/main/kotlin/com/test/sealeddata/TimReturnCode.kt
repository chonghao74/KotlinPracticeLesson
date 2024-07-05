package com.test.sealeddata

sealed class TimReturnCode {

    data class SuccessResponse<T>(val list:List<T>): TimReturnCode()
    data class ErrorResponse(val errorCode:String, val errorMessage: String): TimReturnCode()
}
