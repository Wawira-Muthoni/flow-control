fun main(){
   oddNum()
    var name= namess(arrayOf("Christine","Abraham","job","Bonnie"))
    println(name)
    drinks(2)
    drinks(15)
    drinks(48)
    multiple()
}
fun oddNum(){
    for (number in 1..100)
        if(number%2 !=0){
            println(number)
    }

}
/*Create a function that takes in an array of names and returns the number of
names longer than 5 characters*/
fun namess(names:Array<String>):Int{
    var y=0
    for(x in names){
        if(x.length>5){
            y++
        }

    }
    return y
}
/*You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of coca cola. Create a function that will make these decisions,
printing out the name of the drink each person gets according to their age*/
fun drinks(age:Int){
      if(age<6 ) {
          println("milk")

    }
  else  if(age  in 6..15){
        println("fanta orange")
    }
    if (age>15){
        println("coca cola")
    }

}
/*Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number*/
fun multiple(){
    for (nums in 1..100) {
        if (nums % 3 == 0 && nums % 5 == 0)

            println("FizzBuzz")
        else if (nums % 3 == 0) {
            println("Fizz")
        } else if (nums % 5 == 0) {
            println("Buzz")
        } else {
            println(nums)
        }

    }
}