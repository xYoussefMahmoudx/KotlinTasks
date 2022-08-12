import java.util.*

fun main (){
    var input = Scanner(System.`in`)

    var N = input.nextInt();
        input .nextLine()
    var listOfNames = mutableListOf<String>()
    var c =0;

    while(c<N){

        listOfNames.add(   input.nextLine())

        c++
    }

    for(item in listOfNames){
      if(item.contains("M", true))
          println(item.uppercase(Locale.getDefault()))
          else if (item.contains("A", true))
          println(item.uppercase(Locale.getDefault()))
        else
            continue;
    }

}