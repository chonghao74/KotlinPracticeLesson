package com.test.objectexpression

class Generator {
    fun printGeneratorNo(no: Int) {
        val parameter = object : BaseClass() {
            //override fun getParameter() = "Generator's parameter"
            override fun getParameter(): String {
                return super.getParameter()+"fff";
            }
        }

        println("parameter: ${parameter.getParameter()}")
        println("no: $no")
    }
}