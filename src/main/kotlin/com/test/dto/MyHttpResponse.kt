package com.test.dto

data class MyHttpResponse(
    val code : Int,
    var data : List<HttpData>,
    val errorCode : String,
    var errorMessage : String

){
     data class HttpData(
        val name : String,
        val id : Int,
        val weight: String
    )
}
