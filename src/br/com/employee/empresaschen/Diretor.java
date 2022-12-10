package br.com.employee.empresaschen;

import br.com.modules.empresaschen.Autenticador;
import br.com.modules.empresaschen.ConsoleColors;

public class Diretor extends Funcionario implements Autenticador {
    private int senha;

    public Diretor(int senha) {
        this.senha = senha;
    }

    private boolean autenticado;
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            autenticado = true;
            System.out.println(ConsoleColors.GREEN + "Autenticado!" + ConsoleColors.RESET);
        } else {
            autenticado = false;
            System.out.println(ConsoleColors.RED + "Não Autenticado!" + ConsoleColors.RESET);
        }
        return autenticado;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Diretor" + super.toString();
    }

}
