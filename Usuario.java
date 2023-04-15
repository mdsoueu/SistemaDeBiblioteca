/* 
Gerenciamento de usuário:
- Nome (String);
- Endereço (String);
- Telefone(String);
- E-mail (String); */

public class Usuario {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public void setNome(String nom){
        if(nom.length() > 0 && nom.matches("^[A-Z][a-zA-Zéãçá]*"))
            this.nome = nom;
        else
            System.out.print("Nome inválido!\n");
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setEndereco(String end){
        if(end.length() > 0 && end.matches("^[A-Z][a-zA-Z0-9áã]*"))
            this.endereco = end;
        else
            System.out.print("Endereço inválido!\n");
    }
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setTelefone(String tel){
        if(tel.length() == 11)
            this.telefone = tel;
        else
            System.out.print("Telefone inválido!\n");
    }
    public String setTelefone(){
        return this.telefone;
    }
    
    public void setEmail(String ema){
        if(ema.length() > 0 && ema.matches("^[a-z][a-z@]*"))   
            this.email = ema;
        else
            System.out.print("E-mail inválido!");
    }
    public String getEmail(){
        return this.email;
    }
}