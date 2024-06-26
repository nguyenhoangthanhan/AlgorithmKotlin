import java.util.*

class VectorDemo1 {
    fun demo(){
        var planets =  Vector<String>();
        planets.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        println("Planets = " + planets)


        var planets2 =  Vector<String>();
        planets2.addAll(listOf("Mercury", "Venus", "Earth", "Pluto1"))

        println("Vector capacity = " + planets2.capacity())

        var planets3 =  Vector<String>();
        planets3.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets3.ensureCapacity(100)
        println("Vector capacity = " + planets3.capacity())

        var planets4 =  Vector<String>();
        planets4.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets4.addElement("Sirius A3")
        println("Vector = " + planets4)

        var planets5 =  Vector<String>();
        planets5.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets5.addElement("Sirius A3")
        for(planet in planets5)
        {
            println(planet);
        }

        var planets6 =  Vector<String>();
        planets6.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        for(planet in planets6)
        {
            println(planet)
        }
        var planets7 =  Vector<String>();
        planets7.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        var firstPlanet = planets7.firstElement()
        println("First planet = " + firstPlanet)
        var planets8 =  Vector<String>();
        planets8.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        var lastPlanet = planets8.lastElement()
        println("Last planet = " + lastPlanet)
        var planets9 =  Vector<String>();
        planets9.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets9.addAll(listOf("Jupiter", "Saturn"))
        for(planet in planets9)
        {
            println(planet);
        }


        var planets10 =  Vector<String>();
        planets10.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets10.removeAt(2)

        for(planet in planets10)
        {
            println(planet)
        }

        var planets11 =  Vector<String>();
        planets11.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets11.removeIf { x -> x.startsWith("E") }

        for(planet in planets11)
        {
            println(planet)
        }

        var planets12 =  Vector<String>();
        planets12.addAll(listOf("Mercury", "Venus", "Earth", "Pluto"))

        planets12.reverse()

        for(planet in planets12)
        {
            println(planet)
        }

        var numbers13 =  Vector<Int>();
        numbers13.addAll(listOf(21, 44, 99, 74, 33))

        var value = numbers13.indexOf(99)
        println("value = " + value)

        var numbers14 =  Vector<Int>();
        numbers14.addAll(listOf(21, 44, 99, 74, 33))

        var value2 = numbers14[2]
        println("value = " + value2)

        var numbers15 =  Vector<Int>();
        numbers15.addAll(listOf(21, 44, 99, 74, 33))

        var value15 = numbers15.get(2)
        println("value = " + value15)

        var numbers16 =  Vector<Int>();
        numbers16.addAll(listOf(21, 44, 99, 74, 33))

        var maxValue16 = numbers16.min()
        println("Vector Min value16 = " + maxValue16)
        var numbers17 =  Vector<Int>();
        numbers17.addAll(listOf(21, 44, 99, 74, 33))

        var maxValue17 = numbers17.max()
        println("Vector Max value = " + maxValue17)

        var planets18 =  Vector<String>();
        planets18.addAll(listOf("Mercury", "Venus", "Earth", "Earth", "Venus", "Pluto"))

        planets18.clear()

        if(planets18.isEmpty())
        {
            println("Planets vector is empty!")
        }
        else
        {
            println("Planets vector is NOT Empty!")
        }


        //We can remove duplicate elements from vector
        // and get a new List, using distinct function.
        // In the below example, we have some duplicate
        // entries in our planets vector. We then used
        // distinct function call to get a new list without
        // the duplicates.
        var planets19 =  Vector<String>();
        planets19.addAll(listOf("Mercury", "Venus", "Earth", "Earth", "Venus", "Pluto"))
        var uniquePlanets = planets19.distinct()

        for(planet in uniquePlanets)
        {
            println(planet)
        }
    }

}