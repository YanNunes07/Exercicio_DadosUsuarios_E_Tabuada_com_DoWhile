package model;

public class Usuario {
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private int codigo;

    public Usuario() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;

    }
    @Override
    public String toString() {
        return "\nUsuario: " + nome +
                "\nRG: " + rg +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone;
    }
}
