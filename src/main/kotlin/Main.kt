import java.lang.Exception

fun main(args: Array<String>) {

    try{
        print("შეიყვანეთ X: ")
        var x:Int = readLine()!!.toInt()

        print("შეიყვანეთ Y: ")
        var y:Int= readLine()!!.toInt()

        var z:Int = x + y
        println("X და Y ჯამი არის: $z")
    }
    catch(e:Exception){
        println("მოხდა შეცდომა ;-;")
    }

    while(true){

        println("გსურთ თავიდან დაწყება? Y/N")
        var answer = readLine()!!.lowercase()

        try{
            if(answer == "y"){
                try{
                    print("შეიყვანეთ X: ")
                    var x:Int = readLine()!!.toInt()

                    print("შეიყვანეთ Y: ")
                    var y:Int= readLine()!!.toInt()

                    var z:Int = x + y
                    println("X და Y ჯამი არის: $z")
                }
                catch(e:Exception){
                    println("შეიყვანეთ რიცხვი გეთაყვა c:")
                }
                continue
            }
            else if(answer == "n"){
                println("კეთილი დღე! c:")
                break
            }
            else {
                println("არასწორი პასუხი ;-;")
                continue
            }
        }
        catch(e:Exception){
            println("ცარიელს ნუ დატოივებთ გეთაყვა c:")
        }
    }
}



