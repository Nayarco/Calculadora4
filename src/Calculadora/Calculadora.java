package Calculadora;

public class Calculadora {

    public static void main(String[] args) {
        int numeroA;
        int numeroB;
        String signo;

        System.out.println ("Calculadora.Calculadora");

        numeroA = Integer.parseInt(args[0]);
        signo = args[1];
        numeroB = Integer.parseInt(args[2]);

        float resultado = 0;

        switch (signo) {
            case "+" -> resultado = numeroA + numeroB;
            case "-" -> resultado = numeroA - numeroB;
            case "*" -> resultado = numeroA * numeroB;
            case "/" -> resultado = (float) numeroA / (float) numeroB;
            default -> System.out.println(("No se reconoce la operación"));
        }
        System.out.println("RESULTADO: " + resultado);
            }

        }





