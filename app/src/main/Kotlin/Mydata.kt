package com.example.horinoa.mykotlin


class Mydata {
    val hello: String = "HelloKotlin"
    var countData : Int = 0

    fun testcall(settxt:String,callback:(String) -> Unit){
        val txt = "Hello "
        callback(txt + settxt)
    }

    fun runtest(){
        testcall("World",{println(it)})
    }
    //結果
    //10827-10827/com.example.horinoa.mykotlin I/System.out: Hello World

}
