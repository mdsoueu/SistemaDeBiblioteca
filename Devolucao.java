/*
Devolução de livros: 
- Status da devolução do livro;
- Data de devolução; */

public class Devolucao {
    private String estado;
    
    public void setEstado(String estad){
        if(estad.length() > 0 && estad.matches("^[A-Z][a-zA-Z]*"))
            this.estado = estad;
        else
            System.out.print("Informação inválida!\n");
    }
    public String getEstado(){
        return this.estado;
    }
}