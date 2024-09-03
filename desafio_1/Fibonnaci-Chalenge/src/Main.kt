fun main() {

    val fibonnaci : MutableList<Int> = mutableListOf();

    fun add(number: Int) {
        if(fibonnaci.isEmpty()) {
            fibonnaci.add(number)
        } else {
            val aux = fibonnaci.last() + number
            fibonnaci.add(number)
            fibonnaci.addLast(aux)
        }
    }

    add(0)
    add(1)
    add(2)
    add(4)

    println(fibonnaci)
}