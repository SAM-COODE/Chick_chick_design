package iterator.array;

import iterator.Book;
import iterator.Iterator;

/**
 * @ClassName:BookSelfIterator
 * @Author:wangsw17
 * @Dtae:2022/2/18 16:34
 * @Description:
 **/
public class BookSelfIterator implements Iterator<Book> {
    private BookSelf bookSelf;
    private int index;

    public BookSelfIterator(BookSelf bookSelf){
        this.bookSelf = bookSelf;
        index = 0;
    }
    @Override
    public Book next() {
        Book book = this.bookSelf.getBook(index);
        ++index;
        return book;
    }

    @Override
    public boolean hasNext() {
        return bookSelf.getLength() > index;
    }
}
