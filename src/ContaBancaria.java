import java.util.Scanner;
public class ContaBancaria {
    public static void main(String[] args) {
        System.out.println(
        """
        *************************
        Dados iniciais do cliente:
        
        Nome: Terry Bogard
        Tipo de conta: Corrente
        Saldo inicial: R$ 2500,00
        *************************
        """
        );
        Scanner entrada = new Scanner(System.in);
        double saldo = 2500.00;
        double valor = 0.00;
        int operacao = 0;

        while (operacao != 4){
            System.out.println(
            """
            ---------------------------------------
            Operações a serem realizadas:
            
            1- Consultar saldos
            2- Receber valor
            3- Pagar valor
            4- Sair
            
            Digite a opção desejada:
            """);
            operacao = entrada.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é "+ saldo);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Qual é o valor será recebido?: ");
                    System.out.println("");
                    valor = entrada.nextDouble();
                    saldo += valor;
                    break;
                case 3:
                    System.out.println("Qual valor deseja pagar?:");
                    System.out.println("");
                    valor = entrada.nextDouble();
                    saldo -= valor;
                default:
                    System.out.println("Você digitou uma opção inexistente!");
                    System.out.println("");
                    
            }
        }
    }
}