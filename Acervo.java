/* 
Gerenciamento de acervo:
- Titulo (String);
- Autor (String);
- Editora (String);
- Ano de publicação (int);
- ISBN (String);
- Categoria (String);
- Núm. de exemplares (int); */

public class Acervo {
    private String titulo;
    private String autor;
    private String editora;
    private String publicacao;
    private String isbn;
    private String categoria;
    private String exemplares;
    
    public void setTitulo (String tit){
        if(tit.length() > 0 && tit.matches("^[A-Z][a-zA-Zéãçá]*"))
            this.titulo = tit;
        else
            System.out.println("Título inválido!\n");
    }
    public String getTitulo(){
        return this.titulo;
    }
   
    public void setAutor(String aut){
        if(aut.length() > 0 && aut.matches("^[A-Z][a-zA-Zéãçá]*"))
            this.autor = aut;
        else
            System.out.println("Autor inválido!\n");
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setEditora(String edi){
        if(edi.length() > 0 && edi.matches("^[A-Z][a-zA-Zéãçá]*"))
            this.editora = edi;
        else
            System.out.println("Editora inválida!\n");
    }
    public String getEditora(){
        return this.editora;
    }
    
    public void setPublicacao(String pub){
        if(pub.length() > 0 && pub.matches("[0-9]*"))
            this.publicacao = pub;
        else
            System.out.println("Ano de publicação inválido!\n");
    }
    public String getPublicacao(){
        return this.publicacao;
    }
    
    public void setIsbn(String isbn1){
        if(isbn1.length() == 13)
            this.isbn = isbn1;
        else
            System.out.println("ISBN inválido!\n");
    }
    public String getIsbn(){
        return this.isbn;
    }
    
    public void setCategoria(String cat){
        if(cat.length() > 0 && cat.matches("^[A-Z][a-zA-Zéãçá]*"))
            this.categoria = cat;
        else
            System.out.println("categoria inválida!\n");
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setExemplares(String exe){
        if(exe.length() > 0 && exe.matches("[0-9]*"))
            this.exemplares = exe;
        else
            System.out.println("Número de exemplar inválido!\n");
    }
    public String getxemplares(){
        return this.exemplares;
    }
}
