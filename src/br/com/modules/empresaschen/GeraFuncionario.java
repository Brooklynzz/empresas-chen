/**
 * Classe responsável pela criação do funcionário. Caso este possua acesso restrito (Diretor ou Gerente), a senha também
 * é armazenada e passada como parâmetro para autenticação.
 */

package br.com.modules.empresaschen;

import br.com.employee.empresaschen.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeraFuncionario extends Funcionario {
    String nome;
    String sobrenome;
    String cpf;
    int senhaDef = 0;
    public Funcionario novoFuncionario() {
        Scanner input = new Scanner(System.in);
        System.out.println(ConsoleColors.GREEN + "Cadastro de novo funcionário" + ConsoleColors.RESET);
        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        sobrenome = input.nextLine();

        System.out.println("Digite seu CPF: ");
        cpf = input.nextLine();

        System.out.println("""
                Seu acesso é nível:\s
                1 - Diretor\s
                2 - Gerente
                3 - TI
                4 - Vendas
                \s""");
        int id = input.nextInt();
        if (id == 2 || id == 1) {
            int rawSenha = 0;
            System.out.println("Digite sua senha: ");
            try {
                rawSenha = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println(ConsoleColors.RED + "Sua senha precisa ser numérica!" + ConsoleColors.RESET);
                System.exit(0);
            }
            System.out.println("Confirme sua senha: ");
            int rawSenhaConfirmacao = input.nextInt();
            if (rawSenha == rawSenhaConfirmacao) {
                senhaDef = rawSenha;
            }
        }
        Funcionario f = new Funcionario(nome, sobrenome, cpf);
        switch (id) {
        case 1:
            Diretor f1 = new Diretor(senhaDef);
            f.setFuncionario(f1);
            break;
        case 2:
            Gerente g1 = new Gerente(senhaDef);
            f.setFuncionario(g1);
            break;
        case 3:
            TI t1 = new TI();
            f.setFuncionario(t1);
            break;
        case 4:
            Vendas v1 = new Vendas();
            f.setFuncionario(v1);
            break;
        }
        return f;
    }
}
