fun main(){
    //ordemCrescente() //atvd1
    //ordemDecrescente() //atvd2
    //ordemCrescentePula5() //atvd3
    //soma500() //atvd4
    escadaria() //atvd5
}

/*1) Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50” */
private fun ordemCrescente(){
    println("Ordem Crescente: ")
    for (i in 1..50){
        print("$i ")
    }
}

/*2) Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1” */
private fun ordemDecrescente(){
    println("Ordem Decrescente: ")
    for (i in 50 downTo 1){
        print("$i ")
    }
}

/*3) Usando a resolução do exercício 1, não imprima os números múltiplos de 5. */
private fun ordemCrescentePula5(){
    println("Ordem Crescente que pula múltiplo de 5:")
    for (i in 1..50){
        if(i % 5 != 0) {
            print("$i ")
        }
    }
}
/* Esta porcentagem (%), significa divisão!
Ou seja. se "i" é dividido por 5 e resulta em diferente de 0, imprima.
Detalhe que eu fiquei nessa questão por muito tempo para chegar nesta resposta......... saco......... */

/*4) Faça a soma de todos os números no intervalo de 1 a 500. */
private fun soma500(){
    var add = 0
    for (i in 1..500){
        add += i
    }
    println(add)
}

/*5) Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N
usando o caracter #.
Se a entrada do programa for 3, teremos:
#
##
###
Se a entrada do programa for 5, teremos:
#
##
###
####
##### */
private fun escadaria(){
    print("Infome a quantidade da escada: ")
    val linha = readLine()
    if (linha != null && linha != "") {
        val escada = linha.toInt()
        for (i in 1..escada) {
            for (j in 1..i) {
                print("#")
            }
            println("")
        }
    }
}