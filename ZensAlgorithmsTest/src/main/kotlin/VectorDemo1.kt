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
    }
}