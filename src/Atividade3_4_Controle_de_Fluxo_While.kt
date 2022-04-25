fun main() {
    //aguaEmBalao() //Atvd1
    //fizzBuzz() //Atvd2
    //invertido() //Atvd3
    //xO() //Atvd4
    aposentadoria() //Desafio
}
/* 1 Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água
de 7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido? */
private fun aguaEmBalao() {
    val caixa = 2000
    val balao = 7

    var qntBaloes = 0
    var caixaLimite = caixa
    do {
        qntBaloes++
        if (qntBaloes == 1) {
            println("Você encheu $qntBaloes Balão")
        } else println("Você encheu $qntBaloes Balões!")

        caixaLimite = (caixaLimite - balao)
    } while (caixaLimite >= balao)

    if (qntBaloes == 1){
        println("Você encheu no total: $qntBaloes Balão!")
    } else println("Você encheu no total: $qntBaloes Balões!")
}

/* 2 FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz. */
private fun fizzBuzz() {
    var numero = 0
    do {
        numero++
        if (numero % 3 == 0 && numero % 5 == 0){
            println("($numero) FizzBuzz!")
        } else if (numero % 3 == 0) {
            println("($numero) Buzz!")
        } else if (numero % 5 == 0) {
            println("($numero) Fizz!")
        } else println("$numero")
    } while (numero < 50)
}

/* 3 Escreva um programa capaz de receber um texto e imprimí-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM */
private fun invertido(){
    print("Por favor, informe um texto que será invertido: ")
    val inv = readLine()
    println()
    if (inv != null && inv != ""){
        var lenght = inv.length - 1

        do {
            print("${inv[lenght]}")
            lenght--
        } while (lenght >= 0)
        println()
    }
}


/* 4 Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false */
private fun xO(){
    print("Por favor, informe um texto que será devolvido se existe uma númeração igual a 'x' e 'o': ")
    var xo = readLine()
    println()
    if (xo != null && xo != ""){
        xo = xo.lowercase()
        var lenght = xo.length -1
        var x = 0
        var o = 0
        do {
            val verfX = xo[lenght] == 'x'
            val verfO = xo[lenght] == 'o'
            if (verfX) {
                x++
            } else if (verfO) {
                o++
            }
            lenght--
        } while (lenght >= 0)
        print("'$xo' -> ")
        if (x == o && x != 0) {
            print(true)
        } else print(false)
    }
}

/* DESAFIO
Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os
funcionários a pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o
funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0,2% ao
mês.
Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que
conhece investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que
investirão 5% do salário.
Em quantos meses o patrimônio de Paula vai superar o patrimônio de Ana? */
private fun aposentadoria() {
    val ana = 500 * 2
    val paula = 500

    var poupancaAna = 0f
    var poupancaPaula = 0f

    //val investimentoAna = 0.002f
    //val investimentoPaula = 0.008f

    var mesAna:Float
    var mesPaula:Float

    var mes = 0
    do {
        mes++

        mesAna = ana.toFloat() + (poupancaAna * 0.002f)
        mesPaula = paula.toFloat() + (poupancaPaula * 0.008f)

        poupancaAna += mesAna
        poupancaPaula += mesPaula
    } while (poupancaAna >= poupancaPaula)
    val ano = mes / 12
    val meses = ((mes.toFloat() / 12f) - mes / 12) * 12
    println("A poupança de Paula ($poupancaPaula) superou a poupança de Ana ($poupancaAna) " +
            "em: $ano anos e $meses meses! (Ou $mes meses)")
}