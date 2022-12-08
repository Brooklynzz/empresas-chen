package br.com.employee.empresaschen;

import br.com.modules.empresaschen.ConsoleColors;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int senha;
    private Funcionario funcionario;
    private static int quantidade = 0;
    private boolean autenticado;

    public Funcionario(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        quantidade += 1;
    }
    public Funcionario() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Funcionario.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return " - " + quantidade;
    }
}
