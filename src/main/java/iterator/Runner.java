package iterator;


import iterator.arrayList.BookSelf;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/24 10:58
 * @Description:
 **/
public class Runner {
    public static void main(String[] args) {
        /**
         *将容器与迭代的实现分离,修改迭代实现方式无须修改容器,只需要新增迭代器
         *体现开闭原则
         */
        //数组做容器的Iterator
        testIteratorWithArgs();
        //ArrayList做容器的Iterator
        testIteratorWithArrayList();
    }
    public static void testIteratorWithArgs(){
        iterator.array.BookSelf bookSelf =new iterator.array.BookSelf(5);
        for(int i =0;i<5;++i){
            bookSelf.addBook(new Book("book"+i));
        }
        Iterator<Book> iterator = bookSelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
    public static void testIteratorWithArrayList(){
        BookSelf bookSelf =new BookSelf(5);
        for(int i =0;i<10;++i){
            bookSelf.addBook(new Book("book"+i));
        }
        Iterator<Book> iterator = bookSelf.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
