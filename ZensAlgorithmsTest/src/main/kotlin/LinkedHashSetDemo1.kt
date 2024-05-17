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
    }
}