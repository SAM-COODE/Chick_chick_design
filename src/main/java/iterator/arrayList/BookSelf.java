package iterator.arrayList;


import iterator.Aggregate;
import iterator.Book;
import iterator.Iterator;

import java.util.ArrayList;

/**
 * @ClassName:BookSelfArrayList
 * @Author:wangsw17
 * @Dtae:2022/2/18 17:46
 * @Description:TODO
 **/
public class BookSelf implements Aggregate {
    private ArrayList<Book> books;

    public BookSelf(int maxSize){
        books = new ArrayList<>(5);
    }

    public BookSelf(){
        books = new ArrayList<>();
    }
    public int getLength(){
        return books.size();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public Book getBook(int index){
        return books.get(index);
    }
    @Override
    public Iterator<Book> iterator() {
        return new BookSelfIterator(this);
    }

}
