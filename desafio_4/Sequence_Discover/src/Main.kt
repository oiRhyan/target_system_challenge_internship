fun main() {
    val sequenceA : MutableList<Int> = mutableListOf(1,3,5,7)
    val sequenceB : MutableList<Int> = mutableListOf(2,4,8,16,32,64)
    val sequenceC : MutableList<Int> = mutableListOf(0,1,4,9,16,25,36)
    val sequenceD : MutableList<Int> = mutableListOf(4, 16, 36, 64)
    val sequenceE : MutableList<Int> = mutableListOf(1, 1, 2, 3, 5, 8)
    val sequenceF : MutableList<Int> = mutableListOf(2, 10, 12, 16, 17, 18, 19)


    fun nextSequence1() {
        val next : Int = sequenceA.last() + 2
        sequenceA.add(next)
    }

    fun nextSequence2() {
        val next : Int = sequenceB.last() * 2
        sequenceB.add(next)
    }

    fun nextSequence3() {
        val nextNumber : Int = 7 * 7
        sequenceC.add(nextNumber)
    }

    fun nextSequence4() {
        val next : Int = 10 * 10
        sequenceD.add(next)
    }

    fun nextSequence5() {
        sequenceE.add(13)
    }

    fun nextSequence6() {
        sequenceF.add(20)
    }

    nextSequence1()
    nextSequence2()
    nextSequence3()
    nextSequence4()
    nextSequence5()
    nextSequence6()

    println(sequenceA)
    println(sequenceB)
    println(sequenceC)
    println(sequenceD)
    println(sequenceE)
    println(sequenceF)

}