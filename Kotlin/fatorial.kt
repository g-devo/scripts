/*
 * N Fatorial (N!)
 *
 * by g_devo @2021
 *
 * Este script recebe um número inteiro n e retorna o fatorial de n.
 * Fatorial é o produto de um número multiplicado por seus antecessores até 1
 *
 */

fun main() {
    println("Digite o número: ")

    val inputNumber = readLine()!!.toInt()
    val fatorialResult = fatorial(inputNumber)

    println("O fatorial de $inputNumber é $fatorialResult")
}

fun fatorial(number: Int): Int {
    var fator = number
    var n = number
    while (n > 1) {
        n -= 1
        fator *= n
    }
    return fator
}