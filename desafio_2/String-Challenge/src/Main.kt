fun main() {
    val stringName = "Target Sistemas - [DESAFIO]"
    val letterA = 'a'
    val letterCapitalA = 'A'

    val timesLetter = stringName.count { it == letterA || it == letterCapitalA }

    println("O caracter '$letterA' e '$letterCapitalA' aparecem $timesLetter vezes.")
}