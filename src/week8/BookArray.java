package week8;

public class BookArray {

    public static void main(String[] args){

        Book[] bookArray = new Book[10];
        for (int a = 0; a<10; a++){
            if (a%2 == 1) {
                Book.Fiction bookFiction = new Book.Fiction("Fiction " + a);
                bookArray[a] = bookFiction;
            }
            else {
                Book.NonFiction bookNonFiction = new Book.NonFiction("NonFiction " + a);
                bookArray[a] = bookNonFiction;
            }

            System.out.println(bookArray[a].toString());
        }
    }
}
