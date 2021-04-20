package by.nerallan.dsl_template

/*
Solving a sample coding interview problem
This algorithmic problem is about finding dictionary words inside a rectangle field with letters.
@link https://www.youtube.com/watch?v=abkHxIMJGIw&list=PLlFc5cFwUnmyQA0l15nAfE1-pnu6fSvvG
*/

class RectangleFieldCompetition {

    private val rectangleRow = """
        KOTE
        NULE
        AFIN
    """

    private val dictionaryRow = "Kotlin, fun, file, line, null"
    private val directionsOfPossibleNeighbors = listOf(1 to 0, 0 to 1, -1 to 0, 0 to -1)

    fun main() {
        val rectangle = rectangleRow.trimIndent().split("\n")
        val dictionary = dictionaryRow.toUpperCase().split(", ").toSet()
        val prefixes = dictionary.flatMap { world ->
            List(world.length + 1) { world.take(it) }
        }.toSet()


        fun searchByCoordinates(x: Int, y: Int, recursiveGeneratedWorld: String) {
            if (recursiveGeneratedWorld !in prefixes) return
            if (recursiveGeneratedWorld in dictionary) println("SUCCESS $recursiveGeneratedWorld")
            for ((dx, dy) in directionsOfPossibleNeighbors) {
                val xNew = x + dx
                val yNew = y + dy
                val letter = rectangle.getOrNull(yNew)?.getOrNull(xNew) ?: continue
                searchByCoordinates(xNew, yNew, recursiveGeneratedWorld + letter)
            }
        }

        for (y in rectangle.indices) for (x in rectangle[0].indices) {
            searchByCoordinates(x, y, rectangle[y][x].toString())
        }
    }
}