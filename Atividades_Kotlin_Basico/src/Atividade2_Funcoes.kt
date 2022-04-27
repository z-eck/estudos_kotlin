fun main(){
    anoParaTudo()
    //retornarQuantidadeDeCaracteres()
    //calculoCubo()
    //milhasParaKm()
    //trocaString()
}

//1) Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.
private fun anoParaTudo(){
    print("Por favor, informe o ano (número inteiro, de preferência): ")
    var linha = readLine()
    fun transformando(linha:String){
        var ano = linha.toInt()
        //var ano:Int = 4

        val meses:Int = 12
        val dias:Int = 365
        val horas:Int = 365 * 24
        //val horas:Int = 8760
        val minutos:Int = horas * 60
        //val minutos:Int = 525600
        val segundos:Int = minutos * 60
        //val segundos:Int = 31536000

        println("=======================================================")
        println("$ano ano(s) é equivalente a:")
        println("")
        println("${ano * meses} meses")
        println("${ano * dias} dias")
        println("${ano * horas} horas")
        println("${ano * minutos} minutos")
        println("${ano * segundos} segundos")
        println("=======================================================")
    }
    if (linha == null || linha == "") {
        do {
            print("Por favor, informe o ano (número inteiro, de preferência): ")
            linha = readLine()
        } while (linha == null || linha == "")
        transformando(linha)
    } else {
        transformando(linha)
    }


}

//2) Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
private fun retornarQuantidadeDeCaracteres(){
    print("Por favor, informe uma palavra para retornar o número de caracteres: ")
    var linha = readLine()
    if (linha == null || linha == "") {
        do {
            print("Por favor, informe uma palavra para retornar o número de caracteres: ")
            linha = readLine()
        } while (linha == null || linha == "")
        println("Tamanho da Quantidade de $linha é: ${linha.length} caracteres.")
    }   else{
        println("Tamanho da Quantidade de $linha é: ${linha.length} caracteres.")
    }
}

//3) Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
private fun calculoCubo(){
    print("Por favor, informe um número a ser calculado (número inteiro, de preferência): ")
    var linha = readLine()
    fun calculo(linha:String){
        val num:Int = linha.toInt()

        val cubo:Int = num * num * num
        println("Este número ($num) é igual a $cubo elevado a terceira/elevado ao cubo!")
    }
    if (linha == null || linha == "") {
        do {
            print("Por favor, informe um número a ser calculado (número inteiro, de preferência): ")
            linha = readLine()
        } while (linha == null || linha == "")
        calculo(linha)
    }   else{
        calculo(linha)
    }
}

//4) Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).
private fun milhasParaKm(){
    print("Por favor, informe um número a ser calculado para quilômetros: ")
    var linha = readLine()
    fun km(linha:String){
        val milha:Float = linha.toFloat()

        val km:Float = milha * 1.60934f

        println("$milha milhas é igual a $km quilômetros!")
    }
    if (linha == null || linha == "") {
        do {
            print("Por favor, informe um número a ser calculado para quilômetros: ")
            linha = readLine()
        } while (linha == null || linha == "")
        km(linha)
    }   else{
        km(linha)
    }
}

//5) Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
//a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada. //Ok
//b. Escrever uma função para a troca de letras e impressão do valor final.
//c. String final deve estar com todas as letras minúsculas.
private fun trocaString(){
    print("Por favor, informe uma palavra para retornar a string divertida: ")
    var linha = readLine()
    fun stringX(linha:String){
        println("Transformando os 'a's da palavra em x: ${linha.replace("a", "x", true).lowercase()}")
    }
    fun stringValor(linha:String){
        println("Quantidade de caracteres: ${linha.length}")
    }
    fun stringMaiusculo(linha:String){
        println("A palavra em minúsculo: ${linha.lowercase()}")
    }
    if (linha == null || linha == "") {
        do {
            print("Por favor, informe uma palavra para retornar a string divertida: ")
            linha = readLine()
        } while (linha == null || linha == "")
        println("--------------------------------------------")
        stringX(linha)
        println("--------------------------------------------")
        stringValor(linha)
        println("--------------------------------------------")
        stringMaiusculo(linha)
        println("--------------------------------------------")
    }   else{
        println("--------------------------------------------")
        stringX(linha)
        println("--------------------------------------------")
        stringValor(linha)
        println("--------------------------------------------")
        stringMaiusculo(linha)
        println("--------------------------------------------")
    }
}

//6) Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se sim, transforme-as.
private fun linhaUnica234(){
    //As Funções criadas aqui, estão com tratamento de erro, então não está sendo possível :P
    //Mas qualquer coisa, Erick do futuro:
    //fun teste(a:String, b:String):String = a + b
    //fun teste(a:Int, b:Int) = a + b
}