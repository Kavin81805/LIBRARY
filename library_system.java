import java.util.Scanner;

public class library_system {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
    }
}

class Members {
    
    Scanner sc;
    String m_name , m_id , p_num ;
    int n;
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
    void arr_menber(){
        System.out.print("HOW MANY MEMBERS ID YOU WANT TO CREATE : ");
        n = sc.nextInt();
        sc.nextLine();
        Members [] member = new Members[n];
        for(int i = 0 ; i < n ; i++){
           System.out.println("==========|FORM "+(i+1)+" |==========");
           member[i] = new Members(sc);
           member[i].add_menber();
        } 
    }
    void dis_member(){
        System.out.println("\n------------------------------------------\n==========| MEMBERS |===========\n");

           
        }
    }

class Books {
    
    Scanner sc;
    String ISBN ,title , author , price;
    int n;
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
    void arr_book(){
        System.out.print("HOW MANY MEMBERS ID YOU WANT TO CREATE : ");
        n = sc.nextInt();
        sc.nextLine();
        Books [] book = new Books[n];
        for(int i = 0 ; i < n ; i++){
           System.out.println("==========|FORM "+(i+1)+" |==========");
           book [i] = new Books(sc);
           book [i].add_book();
        }       
    }
}
class Library_Manager {
   
    Scanner sc;

    Library_Manager(Scanner scanner){
        this.sc = scanner;
    }

}
