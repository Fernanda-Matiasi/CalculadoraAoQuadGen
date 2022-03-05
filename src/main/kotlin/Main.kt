fun main() {
    
    real n1, n2, n3, n4, result1, result2, result3, result4

		escreva("Digite a primeiro número: ")
		leia(n1)
		result1 = n1 * n1

		escreva("Digite a segundo número: ")
		leia(n2)
		result2 = n2 * n2

		escreva("Digite a terceiro número: ")
		leia(n3)
		result3 = n3 * n3

		escreva("Digite a quarto número: ")
		leia(n4)
		result4 = n4 * n4

		se (result3 >= 1000){

			escreva("\nEste é o quadrado do número: ", n3, " = ", result3)

		}senao{
			escreva("Valores fornecidos com resultado ao quadrado: \nn1: ",n1, " = ", result1,
			"\nn2: ", n2, " = ", result2,
			"\nn3: ", n3, " = ", result3,
			"\nn4: ", n4, " = ", result4)


    
}