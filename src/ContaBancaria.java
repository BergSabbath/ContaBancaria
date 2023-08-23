import java.util.Scanner;
import java.text.DecimalFormat;

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
        double valor;
        int operacao = 0;
        DecimalFormat df = new DecimalFormat(" 0.00");

        while (operacao != 4){
            System.out.println(
            """
            _________________________________
            Escolha uma das opções abaixo :
            
            1- Consultar saldos
            2- Receber valor
            3- Pagar valor
            4- Sair
            
            Digite a opção desejada:
            """);
            operacao = entrada.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("Seu saldo é R$ "+ df.format(saldo));
                    System.out.println("-------------------------------\n");
                    break;
                case 2:
                    System.out.println("Qual é o valor será recebido?:");
                    valor = entrada.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo disponivel: R$ " + df.format(saldo));
                    break;
                case 3:
                    System.out.println("Qual valor deseja pagar?: \n");
                    valor = entrada.nextDouble();
                    if (saldo < valor) {
                        System.out.println("Você não tem saldo disponível!");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo disponivel: R$ " + df.format(saldo));
                    }
                    break;
                case 4:
                    System.out.println("Você selecionou a opção SAIR");
                    break;
                default:
                    System.out.println("Você digitou uma opção inexistente! \n");
            }
        }
    }
}