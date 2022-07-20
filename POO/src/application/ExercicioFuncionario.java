package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class ExercicioFuncionario {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Digite a quantidade de funcionarios: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){
            System.out.println("Dados do funcionario #" + (i + 1) + ": ");
            System.out.print("O funcionario é terceirizado (s/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valor = sc.nextDouble();

            if(ch == 's'){
                System.out.print("Cobrança adicional: ");
                double adicional = sc.nextDouble();
                list.add(new FuncionarioTerceirizado(nome, horas, valor, adicional));
            }else{
                list.add(new Funcionario(nome, horas, valor));
            }
        }


        System.out.println();
        System.out.println("PAGAMENTOS:");
        for(Funcionario func : list){
            System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
        }
        sc.close();
    }
}