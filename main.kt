
//Basic Hello World Program

fun main() {
    println("Hello, World!")

//setting up variables
    var word: String
    word = "Pirate"

    val number: Int
    number = 88

    //this works
    word = "Sparrow"

    //this does not
    // number = 73

    //printing variables
    println("the password is $word")

    //working with user input

    //prompt for input
    print("Enter a new password: ")

    //read the input and store it in a variable
    word = readline()!!

    println("the new password is $word")

    //using a for loop
    var count: Int
    count = 10

    for(i in 1..10)
    {
        println("$count")
        count = --count
    }

    println("we have liftoff")
}
