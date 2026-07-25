class Search {

    fun byName(

        items:List<Measurement>,

        name:String

    ) = items.find {

        it.name.equals(

            name,

            true

        )

    }

}
