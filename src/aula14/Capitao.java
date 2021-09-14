package aula14;

public class Capitao {
    private String nome;
    private String apelido;
    private String registoNav;

    public Capitao(String nome, String apelido, String registoNav) {
        this.nome = nome;
        this.apelido = apelido;
        this.registoNav = registoNav;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRegistoNav() {
        return registoNav;
    }

    public void setRegistoNav(String registoNav) {
        this.registoNav = registoNav;
    }


}
