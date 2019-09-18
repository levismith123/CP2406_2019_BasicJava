package week8;

public abstract class Book {

    private String title;
    double price;

    Book(String bookTitle){
        this.title = bookTitle;
    }

    String getTitle(){
        return this.title;
    }

    public double getPrice(){
        return this.price;
    }

    static class Fiction extends Book{

        Fiction(String bookTitle) {
            super(bookTitle);
            setPrice();
        }

            void setPrice(){
                this.price = 24.99;
            }
    }

    public static class NonFiction extends Book{

        public NonFiction(String bookTitle){
            super(bookTitle);
            setPrice();
        }
            void setPrice(){
                this.price = 37.99;
            }
    }

    public String toString(){
        return " " + this.title + " " + this.price;
    }
}
