import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cliente = """
                ***********************************
                Dados iniciais do cliente
                
                Nome:           Caio Lene Campos Magalhães
                Tipo conta:     Corrente
                Saldo inicial:  R$2500,00
                ***********************************
                """;
        String menu = """
                    Operações
                                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                    
                                    
                    Digite a opção desejada:
                    """;
        System.out.println(cliente);
        int option = 0;
        double saldo = 2500;
        double choice;
        while (option < 4) {
            System.out.println(menu);
            option = scanner.nextInt();
            if (option == 1){
                System.out.println("O saldo atual é R$" + saldo);
            }
            if (option == 2){
                System.out.println("Informe o valor a receber: ");
                choice = scanner.nextDouble();
                saldo = saldo + choice;
                System.out.println("Saldo atualizado: R$" + saldo);
            }
            if (option == 3) {
                System.out.println("Informe o valor a transferir: ");
                choice = scanner.nextDouble();
                saldo = saldo - choice;
                System.out.println("Saldo atualizado: R$" + saldo);
            }

        }
        scanner.close();
    }
}