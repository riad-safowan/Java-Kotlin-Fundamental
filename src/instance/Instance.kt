package instance

fun main() {
    val obj1 = Test(12, "12")
//val obj2 = Test(12,"12")
    val obj2 = obj1.copy(num = 13)
    if (obj1 == obj2)
        println("They are same")
    else
        println("They are not same")


}

data class Test(var num: Int, val text: String)