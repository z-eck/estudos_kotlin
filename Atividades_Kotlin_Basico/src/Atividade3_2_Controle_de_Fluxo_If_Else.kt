fun main(){
    //qualASaida(4)
    //formaQuadrado(2,3)
    //formaTriangulo(2,2,3)
    //portariav1(18,"COMum","XtGKJLGNAEKJGA")
    portariav2()
}

/*1) Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).*/
private fun formaQuadrado (x:Int, y:Int){
    if (x == y){
        println("Forma um Quadrado!")
    }
    else println("Não forma um Quadrado. Forma um retângulo!")
}

/*2) Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo.
Informar se é um triângulo equilátero (todos os lados iguais).*/
private fun formaTriangulo(x:Int,y:Int,z:Int){
    if (x == y){
        if (y == z){
            println("Forma um Triângulo Equilátero!")
        }
        else println("Não forma um Triângulo Equilátero. Forma outro tipo de Triângulo")
    }
    else println("Não forma um Triângulo Equilátero. Forma outro tipo de Triângulo")
}

/*3) Considere o código abaixo. Qual a saída do programa caso informado o valor 4?*/

private fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string") // <- resposta do Erick: devolverá esta string
    }
    println("Terceira string")
    // Resposta: Acabou saindo a "Segunda string" e a "Terceira String", por conta do if sem o else if :P
}

/*4) Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não
seja nenhum destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam
com “XT”. Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite
inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”*/

private fun portariav1(idade: Int, tipoConviteVal: String, conviteVal: String) {
    if (idade >= 18) {
        val tipoConvite = tipoConviteVal.lowercase()
        val convite = conviteVal.uppercase()
        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
            if ((tipoConvite == "comum" && convite.startsWith("XT"))
                || (tipoConvite == "premium" || tipoConvite == "luxo") && convite.startsWith("XL")
            ) {
                println("Welcome :)")
            } else println("Negado. Convite inválido.")
        } else println("Negado. Convite inválido.")
    } else println("Negado. Menores de idade não são permitidos.")
}

private fun portariav2() {
    print("Qual é a sua idade: ")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() >= 18) {
            print("Qual é o seu tipo de convite: ")
            var tipoConvite = readLine()
            if (tipoConvite != null && tipoConvite != "") {
                tipoConvite = tipoConvite.lowercase().trim()
                if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {
                    print("Qual é o código de convite: ")
                    var convite = readLine()
                    if (convite != null && convite != "") {
                        convite = convite.uppercase().trim()
                        if ((tipoConvite == "comum" && convite.startsWith("XT"))
                            || (tipoConvite == "premium" || tipoConvite == "luxo") && convite.startsWith("XL")
                        ) {
                            println("Welcome :)")
                            return
                        } else return println("Negado. Convite inválido.")
                    }
                } else return println("Negado. Tipo de convite inválido.")
            }
        } else return println("Negado. Menores de idade não são permitidos.")
    } else {
        println("Idade inválida!")
        return
    }
}