class Book {
    static int  totalNoOfBooks;
String author ;
String title;
String isbn ;
boolean isBorrowed ;

static {
    totalNoOfBooks =  0;
}
    {//object init
        totalNoOfBooks++;
    }
    Book(String isbn,String title , String author){
    this.isbn = isbn ;
    this.title = title ;
    this.author = author ;
    }
 Book(String isbn){
    this(isbn, "Unknown" , "Unknown");
 }
 static int getTotalNoOfBooks(){
    return totalNoOfBooks;
 }
 void borrowBook (){
 if (isBorrowed){
     System.out.println(" Book is already Borrowed");
 }else{
     this.isBorrowed =true ;
     System.out.println("read the  "+ this.title);
 }

}
    void returnBook(){
    if (isBorrowed){
        this.isBorrowed= false;
        System.out.println("Hope you enjoyed your Book , please leave a review");
    }else{
        System.out.println("this book is already in library");
    }
  }
    public static void main(String[] args) {
        Book designOfThings = new Book("1","degin" , "author");
        Book myBook= new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}
