fun main(){
    println("The maximum Int value is: ${getMax(4,9)}")
    println("The maximum Double value is ${getMax(3.2,8.6)}")
}

fun getMax(a: Int, b: Int): Int{
    if (a > b){
        return a
    } else {
        return b
    }
}

//this method has the same name as its predecessor, but it takes in Doubles and returns a double
//this is the overloaded method. It shares the same name, but performs a different task
fun getMax(a: Double, b: Double): Double{
    if (a > b){
        return a
    } else {
        return b
    }
}

//Compact function example
fun getMax2(a:Int, b:Int) = if(a > b) a else b