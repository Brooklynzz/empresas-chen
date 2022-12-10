package br.com.modules.empresaschen;

import br.com.employee.empresaschen.Funcionario;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
    Funcionario f1 = null;
    public Funcionario mainMenuAction() {
        ClearConsole cc = new ClearConsole();
        Scanner input = new Scanner(System.in);
        System.out.println(ConsoleColors.WHITE_BACKGROUND + "Menu Principal" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.WHITE_BOLD + "1 - Cadastrar novo funcionário" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.WHITE_BOLD + "2 - Acessar funcionário existente" + ConsoleColors.RESET);

        int acesso1 = input.nextInt();
        if (acesso1 == 1) {
            GeraFuncionario g1 = new GeraFuncionario();
            f1 = g1.novoFuncionario();
//            cc.clear();
            mainMenuAction();
        }
        return f1;
    }
    public void identificaCargo(Funcionario f) {
        int levelOfAccess = f.getAccessLevel();
        if (levelOfAccess == 1 || levelOfAccess == 2) {
            System.out.println("Não tá pronto ainda");
        } else {
            menuFuncionario(f);
        }
    }

    public void menuFuncionario(Funcionario f) {
        Scanner input = new Scanner(System.in);
        System.out.println(ConsoleColors.WHITE_BOLD + "1 - Extrato do seu salário" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.WHITE_BOLD + "2 - Consultar suas vendas" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.WHITE_BOLD + "3 - Consultar seus dados" + ConsoleColors.RESET);
    }
}
