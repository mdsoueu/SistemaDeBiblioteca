/*
Empréstimo de livros: 
- usuário que realizou o empréstimo (String); 
- Data de empréstimo (Calendar);
- Data de devolução prevista (Calendar); */

public class Livro {
    private String nome;
    
    public void setNome(String nome1){
        if(nome1.length() > 0 && nome1.matches("^[A-Z][a-zA-Zéãçá]*"))
            this.nome = nome1;
        else
            System.out.print("Nome inválido!\n");
    }
    public String getNome(){
        return this.nome;
    }
    
}
    