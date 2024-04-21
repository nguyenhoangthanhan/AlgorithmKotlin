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
    }
}