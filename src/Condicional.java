/*
 * Desafio 2
 * Objetivo: praticar estrutura condicional (if/else) e operador de módulo
 */
public class Condicional {
    public static void main(String[] args) {
        int x = 15;
        // % (módulo) devolve o resto da divisão — resto 0 significa que é divisível por 2, logo, par
            if (x % 2 == 0) {
                System.out.println("O número " + x + " é par!"); 
            }
            else {
                System.out.println("O número " + x + " é ímpar!"); 
            }
    }
}