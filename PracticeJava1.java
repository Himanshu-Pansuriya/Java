import java.util.Scanner;
public class PracticeJava1 {
    public static void main(String[] args) {

        Scanner scString = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);
        System.out.println("enter length of an array");
        int n = scint.nextInt();
        BookDetails[] books = new BookDetails[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter book title of book " + (i + 1));
            String book_title = scString.nextLine();

            System.out.println("enter author name of book " + (i + 1));
            String author_name = scString.nextLine();

            System.out.println("enter price of book " + (i + 1));
            int price = scint.nextInt();

            System.out.println("enter stock of book " + (i + 1));
            int current_stock = scint.nextInt();

            books[i] =new BookDetails(book_title, author_name, price, current_stock);
        }

        while (true) {
            System.out.println("enter 1 for search,2 for update,3 for display books");
            int ab = scint.nextInt();

            if (ab == 1) {
                System.out.println("enter name that would you find : ");
                String aa = scString.nextLine();

                for (int i = 0; i < n; i++) {
                    if (books[i].search(aa)) {
                        System.out.println("Book Title = " + books[i].book_title);
                    }
                }
            }
            else if (ab == 2) {
                System.out.println("enter title of book : ");
                String bb = scString.nextLine();
                System.out.println("Enter positive number to purchase or negative number for sell");
                int noOfBooks = scint.nextInt();
                for (int i = 0; i < n; i++) {
                    if (books[i].search(bb)) {
                        books[i].updateStock(noOfBooks);
                    }
                }
            }
            else if(ab==3){
                for(int i=0;i<n;i++){
                    System.out.println("Title of book["+(i+1)+"]= "+books[i].book_title);
                    System.out.println("Author of book["+(i+1)+"]= "+books[i].author_name);
                    System.out.println("Price of book["+(i+1)+"]= "+books[i].price);
                    System.out.println("Stock of book["+(i+1)+"]= "+books[i].current_stock);
                }
            }
            else{
                break;
            }
        }
    }
}
class Book{
    String book_title;
    String author_name;
    Book(String book_title, String author_name) {
        this.book_title = book_title;
        this.author_name = author_name;
    }
}
class BookDetails extends Book{
    int price;
    int current_stock;
    BookDetails(String book_title,String author_name,int price,int current_stock) {
        super(book_title, author_name);
        this.current_stock = current_stock;
        this.price = price;
    }
        public boolean search(String aa){
            if(book_title.indexOf(aa)>-1 || author_name.indexOf(aa)>-1){
                return true;
            }
            else{
                return false;
            }
        }

        public void updateStock(int noOfBooks){
            current_stock += noOfBooks;
        }
}