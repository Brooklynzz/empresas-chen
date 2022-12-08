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
import br.com.modules.empresaschen.GeraFuncionario;

public class Main {
    public static void main(String[] args) {
        GeraFuncionario teste = new GeraFuncionario();
        Funcionario coco = teste.novoFuncionario();
    }
}