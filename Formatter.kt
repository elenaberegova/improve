class Formatter {

    fun print(

        items:List<Measurement>

    ){

        println()

        println("Historical Measurements")

        println()

        items.forEach{

            println(it.name)

            println("Region : ${it.region}")

            println("Meters : ${it.meters}")

            println(it.description)

            println()

        }

    }

}
