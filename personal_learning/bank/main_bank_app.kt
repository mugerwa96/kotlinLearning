package personal_learning.bank

fun main() {
    val user1=Bank(
        customerName = "Mugerwa",
        accountNumber = 121212,
        balance=20.0
    )
    user1.displayCustomerInformation()

//    customer two
    val user2=Bank()
    user2.displayCustomerInformation()
}