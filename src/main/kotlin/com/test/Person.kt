package com.test

import com.test.enumdata.Gender

class Person (val name:String, val birthday: Int,  val tel:String = "XXX", val gender:Gender = Gender.Male){
}