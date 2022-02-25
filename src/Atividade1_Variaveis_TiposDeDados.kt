fun main() {
    // Declarar uma string variavel mutavel com meu nome
    var nomeCompleto: String = "Erick O. Souza"
    // Declarar uma string vazia
    var texto: String
    // Declarar o numero em que eu calco com a menor unidade do Kotlin em uma variavel nao mutavel
    val numeroCalcado: Byte = 44
    // Declarar uma variavel com o numero do PIB nele
    val numeroPIB: Long = 1869000000000
    // Declarar uma variavel com o numero da populacao nele
    val popBr: Int = 211000000

    println("O Valor do PIB per Capita é: ${numeroPIB / popBr}")
}