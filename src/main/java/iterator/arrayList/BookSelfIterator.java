package iterator.arrayList;


import iterator.Book;
import iterator.Iterator;

/**
 * @ClassName:BookSelfArrayListIterator
 * @Author:wangsw17
 * @Dtae:2022/2/18 17:50
 * @Description:
 **/
public class BookSelfIterator implements Iterator<Book> {
    private BookSelf bookSelf;
    private int index=0;
    public BookSelfIterator(BookSelf bookSelf){
        this.bookSelf = bookSelf;
    }
    @Override
    public Book next() {
        Book book = bookSelf.getBook(index);
        ++index;
        return book;
    }

    @Override
    public boolean hasNext() {
        return bookSelf.getLength()>index;
    }
}
