import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(10)+1
    println(random)
    val scanner = Scanner(System.`in`)
    for (i in 1..4){
        print("Please enter you number:")
        var number = scanner.nextInt();
        println("第${i}次"+number )
        if(number>random){
            print(" lower")
        }else if (number< random){
            print(" higher")
        }else{
            print("great! you got the number is: "+random)
            break;
        }
    }
}