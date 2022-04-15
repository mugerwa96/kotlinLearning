fun main() {


    //whenever the hours are greater than 24
  var hour:Int=1
 do{
     var amountToPay=0.0
      hour = readLine()!!.toString().toInt()
        if(hour>24)
        {
            hour=hour-24
            amountToPay+=3
            if(hour>5)
            {
                hour=hour-5
                amountToPay+=1
                amountToPay+=(hour*0.3)
            }
        }
        else if(hour>5)
        {
            hour=hour-5
            amountToPay+=1
            amountToPay+=(hour*0.3)
        }
        else
        {
            amountToPay+=1
        }

     println("You are to pay $amountToPay")

 } while(hour!=7)

}