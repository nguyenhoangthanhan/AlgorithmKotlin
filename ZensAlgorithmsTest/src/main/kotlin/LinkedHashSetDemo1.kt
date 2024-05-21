class LinkedHashSetDemo1 {
    fun demo(){

        var planets =  LinkedHashSet<String>();

        planets.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"));

        for(planet in planets)
        {
            println(planet);
        }


        var planets2 =  LinkedHashSet<String>();

        planets2.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"));

        println("============== Before add ================");
        for(planet in planets2)
        {
            println(planet);
        }

        planets2.add("Neptune");

        println("============== After add ================");
        for(planet in planets2)
        {
            println(planet);
        }


        var planets3 =  LinkedHashSet<String>()

        planets3.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"))

        println("============== Before clear ================")
        for(planet in planets3)
        {
            println(planet)
        }

        planets3.clear()

        println("============== After clear ================")
        println("Planets isEmpty = " + planets3.isEmpty())
        for(planet in planets3)
        {
            println(planet)
        }



        var planets4 =  LinkedHashSet<String>()

        planets4.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"))

        println("============== Before clone ================")
        for(planet in planets4)
        {
            println(planet)
        }


        var cloneOfThePlanets = planets4.clone() as LinkedHashSet<String>;

        println("============== After clone ================")
        for(planet in cloneOfThePlanets)
        {
            println(planet)
        }


        var planets5 =  LinkedHashSet<String>()

        planets5.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Neptune"))

        println("============== Contains Check ================")
        println("Does it contain earth? " + planets5.contains("Earth"))
        println("Does it contain Pluto? " + planets5.contains("Pluto"))


        var planets6 = LinkedHashSet<String>()

        planets6.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Neptune"))

        println("============== Size check ================")
        println("Count of elements in Set " + planets6.size)
    }
}