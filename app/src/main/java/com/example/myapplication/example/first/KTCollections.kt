package com.example.myapplication.example.first

import org.json.JSONObject

//Kotlin容器
fun main() {
    //数组
    //1.arrayOfC创建数组，可以是任意类型
    val arrayNumber:Array<Int> = arrayOf(1,2,3,4)

    //集合中的元素可以是任意类型
   // val array:Array<Any> = arrayOf(1,true,2,"haha",JSONObject())   //java环境下没有JSONObject()，在手机上有

    //2.arrayOfNulls创建空数组
        //创建一个置顶大小的、所有元素都为空的数组，但是必须指定集合中的元素类型
    val arrayOfNulls:Array<String?> = arrayOfNulls<String>(5)
    arrayOfNulls[0]="element1"
    arrayOfNulls[1]="element2"

    //3.利用array的构造函数。动态创建数组
    //创建一个Array<String>初始化位["0","1","4","9","16]
    // 数组创建的时候会循环5次，i就是数组的下标
    val asc:Array<String> =Array(5){
        i->(i*i).toString()
    }

    //4.字节数组，都存在与之相对应的数组类型
    val bytes=ByteArray(5)//IntArray\LongArray\BooleanArray\CharArray\FloatArray\DoubleArray
    bytes[0]=0

    //5.使用IntArray创建整型数据数组
    //创建一个长度位5的空的IntArray
    val intArray2=IntArray(5)
    intArray2[0]=1
    //创建一个长度为5的值全为100的IntArray[100,100,100,100,100]
    val inArr2=IntArray(5){100}
    //注意这里it是它索引下标值，所以这是创建一个长度为5的IntArray[0,2,4,6,8]
    val intArr3=IntArray(5){it*2}//it是lambda表达式中专有的变量，这里指的是数组的下标


    //数组for循环遍历
    //for-in
    for (item:Int in intArr3){
        println(item)
    }
    //for-下标遍历
    for (i:Int in intArr3.indices){
        println(i.toString() +"->"+intArr3[i])
    }
    //for-in 同时遍历下标和元素
    for((index:Int,item:Int) in intArr3.withIndex()){
        println("$index->$item")
    }
    //forEach 依次回调给我们数组中的元素
    intArr3.forEach {
        println("forEach:$it")//这里的it代表的是数组中的元素
    }
    //forEach增强版
    intArr3.forEachIndexed { index, i -> println("$index:$i") }

}