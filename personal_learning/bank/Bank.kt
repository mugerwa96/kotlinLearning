package personal_learning.bank

class Bank(customerName:String="", accountNumber:Int=0,balance:Double=0.0) {
   private var customerName=customerName
   private var accountNumber=accountNumber
   private  var  balance=balance

//    passing logic to the constructor
    init {
        if(customerName.isBlank())
        {
            this.customerName="No name passed "
        }else
        {
            this.customerName=customerName.trim()
        }
    }

    fun displayCustomerInformation():Unit{
        println("==========CUSTOMER INFORMATION===========")
        println("Customer Name:$customerName")
        println("Accoutn Nmber:$accountNumber")
        println("Account balance:$balance")
        println("=====================================")
    }
    fun deposit(amountFromUser:Double):Double {
        return  balance+amountFromUser
    }
        fun checkBalance():Double{
            return balance
        }

}