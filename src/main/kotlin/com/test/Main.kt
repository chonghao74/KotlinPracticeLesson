import com.google.gson.Gson
import com.test.Inheritancetest.NewPersonWallet
import com.test.Person
import com.test.dto.Candy
import com.test.dto.MyHttpResponse
import com.test.enumdata.Gender
import com.test.enumdata.Sugar
import com.test.extension.Guava
import com.test.extension.addMultiStart
import com.test.generics.*
import com.test.genericsvariance.*
import com.test.interfaces.Fruit
import com.test.extension.getSugar
import com.test.extension.setSugar
import com.test.gettersettertest.Bird
import com.test.sealeddata.Counter1
import com.test.sealeddata.Counter2
import com.test.sealeddata.TimReturnCode
import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args: Array<String>) {
    //testBasic()
    //testArray()
    //testCollection()
    //testGetterSetter()
    //testInheritance
    //testInheritance();
    //testSealed()

    //測試 Generics
    //Basic
    //testGenericsBasic()
    //Upper
    //testGenericsUpper()
    //interface
    //testGenericInterface()
    //testGenericVariance()
    //testGenericType()
    //testExtension()
    //testTernary(10)

    //testKeywordBy();
    //testScopeFunction();

    //Singleton
    testSingletonObject();

}

//Test Basic
private fun testBasic(){
    //String
    //1. println
    val input11 = "A"
    println("*** $input11 ***")
    println("*** ${input11.length} ***")
    //3.字串3-substring
    val input13 = "ABCD"
    println("substring : ${input13.substring(0,2)} ")
    println("substring : ${input13.substring(0 until 2)} ")
    println("substring : ${input13.substring(0 .. 2)} ")
    //4.字串3-substring
    val input14  = "ABCD"
    val input141 = "ABCD"
    println("== : ${(input14 == input141)} ")
    println("Equals : ${input14.equals(input141)} ")
    //5.function defalut
    val tom = Person("Tom", 176)
    val tim = Person(birthday = 176, name = "Tim", gender = Gender.Male, tel = "0999999")
    //6. Function Varargs
    println("Function Varargs")
    testVarargs(1)
    println()
    testVarargs(1,2)
    println()
    println()
    testVarargs2(3, 1,5,7,9)
    println()
    testVarargs3(arrayOf(1, 2, 3), arrayOf(1, 2, 3, 4))

}

//Test Array
private fun testArray(){
    //定義一個空但長度為5的陣列
    val arrayNull1 = arrayOfNulls<Int>(5)
    arrayNull1[0]=0
    arrayNull1[1]=1
    arrayNull1[2]=2
    arrayNull1[3]=3
    println(arrayNull1)

    //定義一個有值的陣列
    val arrayDeclared = arrayOf<Int>(1, 2, 3, 4, 5)//自己定義
    val arrayAutomatic = arrayOf(1, 2, 3, 4, 5)//同型態->系統自行判斷
    val arrayAutomatic2 = arrayOf(Any(), Unit, true, 4, 5)//不同型態->系統自行判斷

    //Primitive Array
    val arrayIntSize0 = intArrayOf()
    val arrayIntSize4 = intArrayOf(1, 2, 3, 4)
    println(arrayIntSize0.size)
    println(arrayIntSize4.size)

    //Common Method
    println(arrayIntSize0.size)
    //陣列是否空
    println(arrayIntSize4.isEmpty())
    //取得最後一個元素，return the last element
    println(arrayIntSize4.last())
    //all 符合
    println(arrayIntSize4.all{ it > 0})
    //其一 符合
    println(arrayIntSize4.any{ (it%2) == 0})
    //get value
    for (value in arrayIntSize4){
        println(value)
    }
    //get index
    for (index in arrayIntSize4.indices){
        println(index)
    }


}

//Test Function Varargs
private fun testVarargs(vararg list:Int){
    for(data in list){
        print(data)
    }
}

private fun testVarargs2(normal:Int, vararg list:Int){
    for(data in list){
        if(normal > data){
            println("$normal > $data")
        }
        else{
            println("$normal <= $data")
        }
    }
}

private fun <T> testVarargs3(vararg list:Array<T>){
    for(data in list){
        println(data)
    }
}

//Collection
private fun testCollection(){
    //List
    var list10= mutableListOf<Int>()
    for(i in 0..9){
        list10.add(i);
    }

    println("Show MutableListOf Value 1: ${list10[0]}")
    println("Show MutableListOf Value 2 : ${list10.get(0)}")
    println("MutableListOf Size : ${list10.size}")

    //Set
    val listSet = mutableSetOf(1,2,3)
    println("MutableSetOf : $listSet")
    println("MutableSetOf Size : ${listSet.size}")
    listSet.add(1)
    listSet.add(4)
    println("MutableSetOf : ${listSet.elementAt(0)}")
    println("MutableSetOf Size : ${listSet.size}")

    //Map
    val listMap = mutableMapOf<String, Int>();
    val listMap2 = mapOf<String, Int>()
    listMap["A"] = 1
    listMap["B"] = 2
    listMap["C"] = 3
    listMap["A"] = 4
    listMap["B"] = 5
    listMap["C"] = 6
    println(listMap["D"])
    println(listMap.get("D"))
    println(listMap.getValue("D"))

    listMap.forEach { (K, V) ->
        println("K:$K , V:$V")
    }




}

//Getter Setter
private fun testGetterSetter(){
    var bird1 = Bird()
    bird1.name = "Eagle"
    println(bird1.name)

}


//Inheritance
private fun testInheritance(){
    var timWallet1 = NewPersonWallet(19850503, BigDecimal(1000), LocalDateTime.now())

    var timWallet2 = NewPersonWallet(19850503, BigDecimal(10000001), LocalDateTime.now())
    println(timWallet1.id)
    println(timWallet2.id)

    println(timWallet1.canVIPApplyFor())
    println(timWallet2.canVIPApplyFor())

}

//Sealed
private fun testSealed(){
    var gson  = Gson()
    var jsonString = """{"code":200,"data":""}""";
    val getJsonData =  getJsonSuccess()
    val objectList = gson.fromJson(getJsonData, MyHttpResponse::class.java)


    checkReturnCode(200, objectList)
}

private fun checkReturnCode(returnCode: Int, objectList: MyHttpResponse){
    when (returnCode){
        200 ->{
            val ff = TimReturnCode.SuccessResponse(objectList.data);
        }

    }
}

private fun getJsonSuccess():String{
    val code = "code"
    val data = "data"
    val name = "name"
    val id = "id"
    val weight = "weight"
    val candy1 = "candy1"
    val candy2 = "candy2"

    val dataJson = "{" +
            "  code: 200" +
            "  ," +
            "  data:[" +
            "    {" +
            "      name : candy1," +
            "      id   : 0," +
            "      weight: 100" +
            "    }," +
            "    {" +
            "      name : candy2," +
            "      id   : 0," +
            "      weight: 100" +
            "    }" +
            "  ]" +
            "  ," +
            "  errorCode:," +
            "  errorMessage:" +
            "}"
    val dataJson1 ="""{"code":200,"data":[{"name":"candy1", "id":0, "weight":"100"},{"name":"candy2", "id":1, "weight":"200"}], "errorCode":"", "errorMessage":""}""";
    val dataJson2 ="""{"code":"200","data":[{"name":"candy1", "id":"0", "weight":"100"},{"name":"candy2", "id":"1", "weight":"200"}], "errorCode":"", "errorMessage":""}""";

    return dataJson1
}

//測試 Generics
private fun testGenericsBasic() {
    //1.Generic method
    println(GenericsTest2.transStrOrInt("-110").toInt().plus(111))
    println(GenericsTest2.transStrOrInt(-110).toInt().minus(111))
    println(GenericsTest2.transStrOrInt("10").toInt().times(111))
    println(GenericsTest2.transStrOrInt(110).toInt().div(111))

    //Generic Class
    //non use Generic
    var floatPoint = FloatPoint()
    var intPoint = IntegerPoint()
    floatPoint.setX(30.5f)
    floatPoint.setY(15.3f)
    intPoint.setX(30)
    intPoint.setY(15)
    println("X-> ${floatPoint.getX()}  Y->  ${floatPoint.getY()} ")
    println("X-> ${intPoint.getX()}  Y->  ${intPoint.getY()} ")

    //use Generic class and Generic method
    var floatGenericPoint = ObjectPoint(0f, 0f)
    var intGenericPoint = ObjectPoint(0, 0)
    floatGenericPoint.setX(30.5f)
    floatGenericPoint.setY(15.3f)
    intGenericPoint.setX(30)
    intGenericPoint.setY(15)

    intGenericPoint.showType2(1)
    intGenericPoint.showType2("1")
    intGenericPoint.showType3(1)
//    intGenericPoint.showType3("1")


    println("X(G)-> ${floatGenericPoint.getX()}  Y(G)->  ${floatGenericPoint.getY()} ")
    println("X(G)-> ${intGenericPoint.getX()}  Y(G)->  ${intGenericPoint.getY()} ")

    println("數字 1 -> ${ObjectPoint.showTypeString(1)}")
    println("數字 1f -> ${ObjectPoint.showTypeString(1f)}")
    println("字串 1 -> ${ObjectPoint.showTypeString("1")}")

    var ob2 = ObjectPoint2<Int>()
}

private fun testGenericsUpper() {
    val genericsTest = GenericsTest2()
    println(genericsTest.compareObj(10.1, 10.1f))
}

private fun testGenericInterface() {
    val infoString = InfoString("Tim")
    println(infoString.getValue())
    infoString.setValue("Tim Good")
    println(infoString.getValue())

    val infoDouble = InfoObject(13.111111)
    println(infoDouble.getValue())
    println(infoDouble.getType())
    infoDouble.setValue(12.1)
    println(infoDouble.getValue())

    val infoInt = InfoObject(13)
    println(infoInt.getValue())
    println(infoInt.getType())
    infoInt.setValue(12)
    println(infoInt.getValue())
}

private fun testGenericVariance() {
    var ff: List<*> = ArrayList<String>()
    var apple: Fruit = Apple("Apple")
    var orange: Fruit = Orange("Apple")

    var listFruit: List<Fruit> = mutableListOf()
    listFruit.toMutableList().add((Apple("1")))
    listFruit.toMutableList().add((Orange("1")))
//    listFruit.toMutableList()[0] = Apple("1")

    for (fruit in listFruit.toMutableList()) {
        println(fruit.getName())
    }


    var kBigBoxUSV: KBigBoxUSV<out Number, in Double> = KBigBoxUSV<Int, Number>()

    var numberI: Number = 12.111
    var kBigBoxUSV2: KBigBoxUSV2<out Apple> = KBigBoxUSV2(GreenApple("Apple"));
    var kBigBoxUSV22: KBigBoxUSV2<in GreenApple> = KBigBoxUSV2(Apple("Apple"));

    val ffA = kBigBoxUSV2.getA()?.getName()

//    val fffA = kBigBoxUSV22.setA(GreenApple("Start "))
    val fffT = kBigBoxUSV22.getA()
    when (fffT) {
        is GreenApple -> {

            (fffT as GreenApple).getName()
            println("GreenApple : ${(fffT as GreenApple).getName()}")
        }

        is Apple -> {
            println("Apple : ${(fffT as Apple).getName()}")
        }

        else -> println("Nothing")
    }
    var numberIT: Number = 12.111

}

private fun testGenericType() {
//    val ff = TypeCheck(1)
//    ff.ch
}

private fun testExtension(){
    val guava = Guava(sugar = Sugar.Regular)
    println(guava.getSugar())
    guava.setSugar(Sugar.No)
    println(guava.getSugar())


    println(Guava.addMultiStart(guava.getName()))
}

private fun testTernary(input : Int){
    if (input >4) println("$input >4") else println("$input < 4")
}

//測試 Delegate Properties-> kotlin use keyword by
private  fun testKeywordBy(){
    val counter1 = Counter1(10);
    Counter2(counter1).count();
    Counter2(counter1).countDouble();
}

//測試 Scope

private fun testScopeFunction(){
    val testScope = TestScope(10);
    println("Scope - apply{}")
    testScope.apply {
        input2 = 11
        inout3 = 12
        addDataConsole(12,13)
        showInputData();
    }


    println("testScope.input2 is ${testScope.input2}")

    println();
    println("Scope - run{}")
    val getCountRun = testScope.run {
        input2 = 11
        inout3 = 12
        addDataReturn(100, 200);
    }

    println(getCountRun)

    println();
    println("Scope - let{}")
    testScope.let {
        it.input2 = 11
        it.inout3 = 12
        it.addDataReturn(100, 200)
    }.let {
        println(it)
    }

    println();
    println("Scope - also{}")
    testScope.also {
        it.input2 = 22
        it.inout3 = 33
        it.addDataConsole(12,13)
    }

    println("testScope.input2 is ${testScope.input2}")

    println();
    println("Scope - TakeIf{} and takeUnless{}")

    val takeIf = testScope.takeIf {
         it.input2 >100
    }

    val takeUnless = testScope.takeUnless {
        it.input2 >100
    }

    println(takeIf)
    println(takeUnless)
}


class TestScope(val input:Int){
    var input2 = 0
    var inout3 = 0

    fun addDataConsole(i1: Int , i2:Int){
        println("$i1 + $i2 = ${i1+i2}");
    }

    fun addDataReturn(i1: Int , i2:Int):String{
        return  "$i1 + $i2 = ${i1+i2}"
    }

    fun showInputData():String{
        return "$input2";
    }
}

//測試 Singleton
private fun testSingletonObject(){
    println(ProfileName.name)
    println(ProfileName.showAddName("Yu"))
}
