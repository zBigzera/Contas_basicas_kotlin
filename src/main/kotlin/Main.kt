fun main() {

    var x = true;
    while (x) {
        println("\nQual operação deseja utilizar?:")
        println("1 - Somar")
        println("2 - Subtrair")
        println("3 - Dividir")
        println("4 - Multiplicar")
        println("5 - Potencia")
        println("6 - Raiz")
        println("7 - Sair")

        var option = readLine()!!.toInt()


        when(option){
            1 -> {
                println("Digite o primeiro número: ")
                var x = readLine()!!.toDouble()
                println("Digite o segundo número: ")
                var y = readLine()!!.toDouble()
                var resultado = soma(x,y)
                print("A soma é de: "+ resultado)
            }
            2 -> {
                println("Digite o primeiro número: ")
                var x = readLine()!!.toDouble()
                println("Digite o segundo número: ")
                var y = readLine()!!.toDouble()
                var resultado = sub(x,y)
                print("A subtração é de: "+ resultado)
            }
            3-> {
                println("Digite o primeiro número: ")
                var x = readLine()!!.toDouble()
                println("Digite o segundo número: ")
                var y = readLine()!!.toDouble()
                var resultado = div(x,y)
                print("O resultado da divisão é de: "+ resultado)
            }
            4->{
                println("Digite o primeiro número: ")
                var x = readLine()!!.toDouble()
                println("Digite o segundo número: ")
                var y = readLine()!!.toDouble()
                var resultado = mult(x,y)
                print("O resultado da multiplicação é de: "+ resultado)
            }
            5-> {
                println("Digite o número a ser elevado: ")
                var x = readLine()!!.toDouble()
                println("Digite sua elevação: ")
                var y = readLine()!!.toDouble()
                var resultado = pow(x,y)
                print("O resultado da elevação é de: "+ resultado)
            }
            6->{
                println("Raiz quadrada de?: ")
                var x = readLine()!!.toDouble()
                var resultado = raiz(x)
                print("Sua raiz quadrada vale: "+ resultado)
            }
        7-> break}        }

}

fun soma(x: Double, y: Double) = x + y

fun sub(x: Double, y: Double) = x - y

fun div(x: Double, y: Double) = x / y

fun mult(x: Double, y: Double) = x * y

fun pow(x: Double, y: Double): Double {
    return Math.pow(x,y)
}

fun raiz(x: Double): Double{
    return Math.sqrt(x)
}