package model;

/*Classe que vai controlar o objeto usuario, vai gerar o objeto usuario para as interfaces*/

public class ModelUsuario {
  
//atributos de um usuario, caracteristicas de um usuario, oque um usuario possui
  private String nome;
  private Integer codigoId;
  private String login;
  private String senha;

  
  //metodos especiais acessores de atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(Integer codigoId) {
        this.codigoId = codigoId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
  
}
