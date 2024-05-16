class LinkedHashSetDemo1 {
    fun demo(){

        var planets =  LinkedHashSet<String>();

        planets.addAll(listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter"));

        for(planet in planets)
        {
            println(planet);
        }
    }
}