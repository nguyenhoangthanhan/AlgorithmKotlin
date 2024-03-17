import kotlin.math.pow
import kotlin.math.sqrt

data class Point(
        val x: Double,
        val y: Double,
        val z: Double
)

class CalculateVolumeGlobular {
    fun calculateDistanceBetween2Point(a: Point, b: Point): Double {
        return sqrt(
                (b.x - a.x).pow(2.0) +
                        (b.y - a.y).pow(2.0) +
                        (b.z - a.z).pow(2.0)
        )
    }
}