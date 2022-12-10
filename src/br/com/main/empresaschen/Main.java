/**
 * Código principal que invoca a criação de funcionário
 *
 * @author Brooklyn
 * @author Hene Chen
 * @version 1.0
 */

package br.com.main.empresaschen;

import br.com.employee.empresaschen.Diretor;
import br.com.employee.empresaschen.Funcionario;
import br.com.modules.empresaschen.ConsoleColors;
import br.com.modules.empresaschen.GeraFuncionario;
import br.com.modules.empresaschen.MainMenu;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = null;

        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenuAction();

    }
}