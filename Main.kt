fun main(){

    val catalog =

        Catalog()

    val units =

        catalog.all()

    Formatter()

        .print(

            units

        )

    val search =

        Search()

    val arshin =

        search.byName(

            units,

            "Arshin"

        )

    if(arshin != null){

        val meters =

            Converter()

                .toMeters(

                    5.0,

                    arshin

                )

        println(

            "5 Arshin = $meters meters"

        )

    }

}
