#!/usr/bin/env python
#
# N Fatorial (N!)
# by g_devo
#
# Este script recebe um número inteiro n e retorna o fatorial de n
#
# Fatorial é o produto de um número multiplicado por seus antecessores até 1
#


def fatorial(number: int) -> int:
    n = fator = number
    while n > 1:
        n -= 1
        fator *= n
    print(f'{number} fatorial é {fator}')
    return fator


if __name__ == '__main__':
    input_number = int(input('Digite o número: '))
    fatorial(input_number)
