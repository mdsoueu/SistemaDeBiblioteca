import java.util.Scanner;
import java.util.Calendar;

class Tela{
    public static void main (String args[]){
        Acervo liv = new Acervo();
        Usuario user = new Usuario();
        Livro manual = new Livro();
        Devolucao status = new Devolucao();
        Scanner l = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        
        int opcao;
        int volta = 0;
    
        do{
            System.out.print("Escolha uma das opções abaixo :\n1-Gerenciamento de acervo;\n2-Gerenciamento de usuário;\n3-Gerenciamento de livros;\n4-Devolução de livro.\nOpção: ");
            opcao = l.nextInt();
            l.nextLine();
            
            switch (opcao){
                case 1: 
                    System.out.print("\n\t* Gerenciamento de acervo *\n");
                    System.out.print("Título do livro: ");
                    liv.setTitulo(l.nextLine());
                    System.out.print("Autor do livro: ");
                    liv.setAutor(l.nextLine());
                    System.out.print("Editora: ");
                    liv.setEditora(l.nextLine());
                    System.out.print("Ano de publicação: ");
                    liv.setPublicacao(l.nextLine());
                    System.out.print("ISBN: ");
                    liv.setIsbn(l.nextLine());
                    System.out.print("Categoria do livro: ");
                    liv.setCategoria(l.nextLine());
                    System.out.print("Número do exemplar: ");
                    liv.setExemplares(l.nextLine());
                break;
                
                case 2:
                    System.out.print("\n\t* Gerenciamento de usuário *\n");
                    System.out.print("Nome: ");
                    user.setNome(l.nextLine());
                    System.out.print("Endereço: ");
                    user.setEndereco(l.nextLine());
                    System.out.print("Telefone: ");
                    user.setTelefone(l.nextLine());
                    System.out.print("E-mail: ");
                    user.setEmail(l.nextLine());
                break;
                
                case 3:
                    int dia = c.get(Calendar.DAY_OF_MONTH);
                    int mes = c.get(Calendar.MONTH)+1;
                    int ano = c.get(Calendar.YEAR);
                    int diad = c.get(Calendar.DAY_OF_MONTH);
                    int mesd = c.get(Calendar.MONTH)+1;
                    int anod = c.get(Calendar.YEAR);
                    
                    System.out.print("\n\t* Gerenciamento de livros *\n");
                    System.out.print("Nome: ");
                    manual.setNome(l.nextLine());
                    System.out.print("Empréstimo:");
                    System.out.print("\nDia: ");
            		dia = l.nextInt();
            		System.out.print("Mês: ");
            		mes = l.nextInt();
            		System.out.print("Ano: ");
            		ano = l.nextInt();
            		System.out.print("\nDevolução:");
                    System.out.print("\nDia: ");
            		diad = l.nextInt();
            		System.out.print("Mês: ");
            		mesd = l.nextInt();
            		System.out.print("Ano: ");
            		anod = l.nextInt();
            		
            		System.out.println("\nUsuário: " + manual.getNome());
            		System.out.println("Ínicio do empréstimo: " + dia + "/" + mes + "/" + ano + "\nDevolução prevista: " + diad + "/" + mesd + "/" + anod);
                break;
                
                case 4:
                    int diade = c.get(Calendar.DAY_OF_MONTH);
                    int mesde = c.get(Calendar.MONTH)+1;
                    int anode = c.get(Calendar.YEAR);
                    
                    System.out.print("\n\t* Devolução de livro *\n");
                    System.out.print("Status da empréstimo: ");
                    status.setEstado(l.nextLine());
                    System.out.print("\nData da devolução:");
                    System.out.print("\nDia: ");
            		diade = l.nextInt();
            		System.out.print("Mês: ");
            		mesde = l.nextInt();
            		System.out.print("Ano: ");
            		anode = l.nextInt();
            		
            		System.out.println("\nStatus: " + status.getEstado());
                    System.out.println("Devolução: " + diade + "/" + mesde + "/" + anode);
                break;
                
                default:
                    System.out.println("Valor inválido!");
                } /* Fim switch */
        
            System.out.println("\nCaso deseja encerrar digite 0.");
            volta = l.nextInt();
            System.out.print("\n");
        } while (volta != 0);
    }
}