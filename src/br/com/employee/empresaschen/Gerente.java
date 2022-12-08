package br.com.employee.empresaschen;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente(int senha) {
        this.senha = senha;
    }

    private boolean autenticado;
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            autenticado = true;
        }
        autenticado = false;
        return autenticado;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
