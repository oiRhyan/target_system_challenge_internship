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

    fun requireNumber(number : Int) {
        if (number in fibonnaci) {
            println("O número pertence a sequência fibonnaci.")
        } else  {
            println("O número não pertence a sequência fibonnaci.")
        }
    }

    add(0)
    add(1)
    add(2)
    add(4)
    add(6)

    requireNumber(4)
    requireNumber(5)
    println(fibonnaci)
}