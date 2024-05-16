package src;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int paramUm = terminal.nextInt();
        int paramDois = terminal.nextInt();

        terminal.close();

        try {
            contagem(paramUm, paramDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contagem(int paramUm, int paramDois) throws ParametrosInvalidosException{
        if(paramUm < paramDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = paramDois - paramUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
