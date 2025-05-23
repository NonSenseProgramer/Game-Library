package Telas;


public class Usuario {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTIPO_USER() {
        return TIPO_USER;
    }

    public void setTIPO_USER(String TIPO_USER) {
        this.TIPO_USER = TIPO_USER;
    }

    public int id;

    public String nome;


    public String senha;

    public String TIPO_USER;
 

}
