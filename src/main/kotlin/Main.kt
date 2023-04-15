import java.sql.RowId

//fun main() {
//    println("Use the val keyword when the value doesn't change.")
//    println("Use the var keyword when the value can change.")
//    println("When you define a function, you define the parameters that can be passed to it.")
//    println("When you call a function, you pass arguments for the parameters.")
//}


//fun main() {
//    var discountPercentage: Int = 0
//    var offer: String = ""
//    val item = "Google Chromecast"
//    discountPercentage = 20
//    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
//
//    println(offer)
//}

//fun main() {
//    val numberOfAdults = 20
//    val numberOfKids = 30
//    val total = numberOfAdults + numberOfKids
//    println("The total party size is: $total")
//}


//fun main() {
//    val baseSalary = 5000
//    val bonusAmount = 1000
//    val totalSalary = "$baseSalary + $bonusAmount"
//    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
//}
//
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val result = firstNumber + secondNumber
//
//    println("$firstNumber + $secondNumber = $result")
//}

//
//fun main() {
//    val firstNumber = 10
//    val secondNumber = 5
//    val thirdNumber = 8
//
//    val result = subtract(firstNumber, secondNumber)
//    val anotherResult = subtract(firstNumber, thirdNumber)
//
//    println("$firstNumber - $secondNumber = $result")
//    println("$firstNumber - $thirdNumber = $anotherResult")
//}
//
//// Define add() function below this line
////
////fun add(firstNumber: Int, secondNumber: Int): Int {
////    return firstNumber + secondNumber
////}
//
//fun subtract(firstNumber: Int, secondNumber: Int): Int {
//    return firstNumber - secondNumber
//}




fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "UnknownOS", emailId: String): String {
     return ("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}