/**
N Fatorial (N!)
by g_devo

Este script recebe um número inteiro n e retorna o fatorial de n

Fatorial é o produto de um número multiplicado por seus antecessores até 1
 **/

fun main() {
    print("Digite o número: ")
    val numberInput = readLine()!!
    val fatorial = fatorial(numberInput.toInt())
    println("$numberInput fatorial é $fatorial")
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