import java.util.Scanner;

public class library_system {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        Library_Manager lm = new Library_Manager(sc);
    }
}

class Members {
    
    Scanner sc;
    String m_name , m_id , p_num ;
    int n;
    Members [] member;
    Members(Scanner scanner){
        this.sc = scanner;
    }
    void add_menber(){
        System.out.println("\n------------------------------------------\n===========| ADD MEMBER FORM |==========\n");
        System.out.print("ENTER THE NAME : ");
        m_name = sc.nextLine();
        System.out.print("CREATE MEMBER ID : ");
        m_id = sc.nextLine();
        System.out.print("ENTER THE PHONE NUMBER : ");
        p_num = sc.nextLine();
        System.out.println("\nSUCCESS FULLY ADDED.....\n------------------------------------------");
    }
    void Diss_members(){
        System.out.println("\n\n------------------------------------------\n\n==========| MEMBER |==========\n\n| NAME : "+m_name+" |\n| ID : "+m_id+" |\n| PHONE NUMBER : "+p_num+" |\n\n------------------------------------------");
    }
    void arr_menber(){
        System.out.print("HOW MANY MEMBERS ID YOU WANT TO CREATE : ");
        n = sc.nextInt();
        sc.nextLine();
           member = new Members[n];
        for(int i = 0 ; i < n ; i++){
           System.out.println("==========|FORM "+(i+1)+" |==========");
           member[i] = new Members(sc);
           member[i].add_menber();
        } 
    }
    void arr_dis_member(){
        System.out.println("\n\n==========| MEMBERS |===========\n");
        for(int i = 0 ; i < n ; i++){
           member[i].Diss_members();
        }
           
        }
    }

class Books {
    
    Scanner sc;
    String ISBN ,title , author , price;
    int n;
    Books [] book;
    Books(Scanner sc){
        this.sc = sc;
    }
    
    void add_book(){
        System.out.println("\n===========| ADD BOOK FORM |==========\n");
        System.out.print("ENTER THE NAME OF THE BOOK : ");
        title = sc.nextLine();
        System.out.print("ENTER THE AUTHOR NAME : ");
        author = sc.nextLine();
        System.out.print("ENTER THE ISBN NUMBER : ");
        ISBN = sc.nextLine();
        System.out.print("ENETR THE PRICE : ");
        price = sc.nextLine();  
    }
    void diss_books(){
        System.out.println("\n\n------------------------------------------\n==========| BOOK |==========\n| BOOK NAME : "+title+" |\n| AUTHOR NAME : "+author+" |\n| ISBN NUMBER : "+ISBN+" |\n| PRICE : "+price+" |\n\n------------------------------------------");
    }
    void arr_book(){
        System.out.print("HOW MANY MEMBERS ID YOU WANT TO CREATE : ");
        n = sc.nextInt();
        sc.nextLine();
           book = new Books[n];
        for(int i = 0 ; i < n ; i++){
           System.out.println("==========|FORM "+(i+1)+" |==========");
           book [i] = new Books(sc);
           book [i].add_book();
        }       
    }
    void arr_dis_books(){
        System.out.println("\n\n==========| BOOKS |===========\n");
        for(int i = 0 ; i < n; i++ ){
           book[i].diss_books();
        }
    }
}
class Library_Manager {
   
    Scanner sc;
    Members M = new Members(sc);
    Books B = new Books(sc);

    Library_Manager(Scanner scanner){
        this.sc = scanner;
    }

    void manager(){

    }
    void assemble(){

    }

}
