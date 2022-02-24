package iterator.array;

import iterator.Aggregate;
import iterator.Book;
import iterator.Iterator;

/**
 * @ClassName:BookSelf
 * @Author:wangsw17
 * @Dtae:2022/2/18 16:33
 * @Description:TODO
 **/
public class BookSelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    private final static int DEFAULT_LENGTH = 20;

    public BookSelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public BookSelf(){
        this.last = DEFAULT_LENGTH;
        this.books = new Book[DEFAULT_LENGTH];
    }
    public Book getBook(int index)throws ArrayIndexOutOfBoundsException{
        return books[index];
    }

    public int getLength(){
        return this.last;
    }
    public void addBook(Book newBook) throws ArrayIndexOutOfBoundsException{
        books[last] = newBook;
        ++last;
    }
    @Override
    public Iterator<Book> iterator(){
        return new BookSelfIterator(this);
    }

}
