fun main() {
    calculoBonus()
    //calculoBonus2()
    //varificacaoDeVerdadeiroOuFalso()
}

/* 1) Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no
final do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00 */

private fun calculoBonus() {
    val cargo: String = "Coordenador"
    var bonus: Float

    if (cargo == "Gerente") {
        bonus = 2000.00f
        println("Seu bonus como '$cargo' é de $bonus")
    } else if (cargo == "Coordenador") {
        bonus = 1500.00f
        println("Seu bonus como '$cargo' é de $bonus")
    } else if (cargo == "Engenheiro") {
        bonus = 1000.00f
        println("Seu bonus como '$cargo' é de $bonus")
    } else if (cargo == "Estagiário") {
        bonus = 500.00f
        println("Seu bonus como '$cargo' é de $bonus")
    } else {
        bonus = 0f
        println("Cargo inválido! $cargo")
    }
}

/* 2) Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00 */
private fun calculoBonus2() {
    val cargo: String = "Coordenador"
    val exp: Int = 2
    var bonus: Float

    if (cargo == "Gerente") {
        if (exp < 2) {
            bonus = 2000.00f
            println("Seu bonus como '$cargo' e o tempo de experiência de $exp ano(s) é de $bonus")
        } else if (exp >= 2) {
            bonus = 3000.00f
            println("Seu bonus como '$cargo' e o tempo de experiência de $exp ano(s) é de $bonus")
        }
    }
    /*  if (cargo == "Gerente" && exp < 2){
         bonus = 2000.00f
         println("Seu bonus como '$cargo' e o tempo de experiência de $exp ano(s) é de $bonus")
     }
        else if (cargo == "Gerente" && exp >= 2){
            bonus = 3000.00f
            println("Seu bonus como '$cargo' e o tempo de experiência de $exp ano(s) é de $bonus")
     } <- Jeito como não deve ser feito/encorajado. Ponto: Código Legível */
    else if (cargo == "Coordenador") {
        if (exp < 1) {
            bonus = 1500.00f
            println("Seu bonus como '$cargo' e o tempo de experiência de $exp ano(s) é de $bonus")
        } else if (exp >= 1) {
            bonus = 1800.00f
            println("Seu bonus como '$cargo' e o tempo de experiência de $exp ano(s) é de $bonus")
        }
    } else if (cargo == "Engenheiro") {
        bonus = 1000.00f
        println("Seu bonus como '$cargo' é de $bonus")
    } else if (cargo == "Estagiário") {
        bonus = 500.00f
        println("Seu bonus como '$cargo' é de $bonus")
    }
}

// Qual o resultado das comparações abaixo?
private fun varificacaoDeVerdadeiroOuFalso() {
    val a = false
    val b = false
    val c = true
    val d = true

    println("A resposta é: ${a && b && c && d}") // falso
    println("A resposta é: ${!a && !b && (c && d)}") // verdadeiro
    println("A resposta é: ${a && ((b || c) || d)}") // falso
    println("A resposta é: ${a || ((!b && c) || !d)}") // verdadeiro
}