import java.util.Scanner;

public class library_system {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        Library_Manager lm = new Library_Manager(sc);
        lm.manager();

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
        void search_member(){

        boolean f = false ;

        System.out.println("\n--------------------------------------------------\n");
        System.out.println("\n===========| SEARCH BOOK |==========\n");
        System.out.println("ENTER THE MEMBER ID : ");
        String e_id = sc.nextLine();
        for(int i = 0 ; i < n ; i++){
            if(member [i].m_id.equals(e_id)){
                System.out.println("\nBOOK FOUND SUCCESSFULLY...");
                member [i].Diss_members();
                f = true;
                break;
            }
        }
        if(!f){
            System.out.println("\nMEMBER NOT FOUND....\n");
            System.out.println("DO WANT TO TRY AGAIN (Y/N) : ");
            char ch = sc.nextLine().charAt(0);
            if(ch == 'y' || ch == 'Y'){
                search_member();
            }
            else{
                System.out.println("\n--------------------------------\n===========|THANK YOU|===========\n--------------------------------");
            }

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
        System.out.print("HOW MANY BOOK ID YOU WANT TO ADD : ");
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
    void search_book(){

        boolean f = false ;

        System.out.println("\n--------------------------------------------------\n");
        System.out.println("\n===========| SEARCH BOOK |==========\n");
        System.out.println("ENTER THE BOOK ISBN NUMBER : ");
        String e_isbn = sc.nextLine();
        for(int i = 0 ; i < n ; i++){
            if(book [i].ISBN.equals(e_isbn)){
                System.out.println("\nBOOK FOUND SUCCESSFULLY...");
                book[i].diss_books();
                f = true;
                break;
            }
        }
        if(!f){
            System.out.println("\nBOOK NOT FOUND....\n");
            System.out.println("DO WANT TO TRY AGAIN (Y/N) : ");
            char ch = sc.nextLine().charAt(0);
            if(ch == 'y' || ch == 'Y'){
                search_book();
            }
            else{
                System.out.println("\n--------------------------------\n===========|THANK YOU|===========\n--------------------------------");
            }

        }
            
        }

    }

class Library_Manager {
   
    Scanner sc;
    Members M;
    Books B;

    Library_Manager(Scanner scanner){
        this.sc = scanner;   
        M = new Members(sc);
        B = new Books(sc);
    }

    void manager(){

        int choice;
        do{
            System.out.println("\n------------------------------------------\n===========| LIBRARY MANAGER |==========\n");
            System.out.println("1 . ADD MEMBER");
            System.out.println("2 . DISPLAY MEMBERS");
            System.out.println("3. ADD BOOKS");
            System.out.println("4. DISPLAY BOOKS ");
            System.out.println("5. LIBRARY SERVICE");
            System.out.println("6 . EXIT\n");
            System.out.println("ENTER YOUR CHOICE : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    M.arr_menber();
                    break;

                case 2:
                    M.arr_dis_member();
                    break;

                case 3:
                    B.arr_book();
                    break;

                case 4:
                    B.arr_dis_books();
                    break;
                
                case 5 :
                    assemble();
                    break;
                case 6:
                    System.out.println("--------------------------------\n===========|THANK YOU|===========\n--------------------------------");
                    break;
                default:
                    System.out.println("INVALID INPUT....TRY AGAIN");
                    manager();
                    break;
                }
            }
            while(choice != 5);  
    }
    void assemble(){
        
        System.out.println("------------------------------------------\n===========| LIBRARY SERVICE |==========\n");
        System.out.println("1 . SEARCH MEMBER");
        System.out.println("2 . SEARCH BOOK");
        System.out.println("3 . BACK TO MAIN MENU");
        System.out.println("4 . HELP\n");
        System.out.println("ENTER YOUR CHOICE : ");
        int c = sc.nextInt();
        sc.nextLine();
        switch (c) {
            case 1:
                M.search_member();
                manager();
                break;
            
            case 2 :
                B.search_book();
                manager();
                break;

            case 3 :
                manager();
                break;

            case 4 :
                System.out.println("\n------------------------------------------\n===========| LIBRARY HELP |==========\n");
                System.out.println("(1) FOR SEARCH MEMBER \n(2) FOR SEARCH BOOK \n(3) FOR BACK TO MAIN MENU\n(4) FOR EXIT\n----------------------------------------------------------");
                System.out.println("---------------------------------------------------------\nYOU WANT OTHER HELP MEAN CONTACT : XXXXXXXXXX OR EMAIL : KAVXXNXXXX@GMAIL.COM\n----------------------------------------------------------");
                assemble();
                break;
        
            default:
                System.err.println("INVALID INPUT....TRY AGAIN !");
                manager();
                break;
        }

    }

}
