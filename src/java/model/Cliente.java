package model;
public class Cliente {
    //atributos 
    private String nome , email ,tipo_moradia, cpf, num_tel, cep ;
    
    //metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTipo_moradia() {
        return tipo_moradia;
    }

    public void setTipo_moradia(String tipo_moradia) {
        this.tipo_moradia = tipo_moradia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(String num_tel) {
        this.num_tel = num_tel;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
