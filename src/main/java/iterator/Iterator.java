package iterator;

/**
 * @author wangsw17
 */
public interface Iterator<T> {
    /**
     * @return 当前元素
     * @description 获取当前元素,并将指针指向下一个元素
     */
    public T next();

    /**
     * @return
     * @description 指针下一位位置是否仍有元素
     */
    public boolean hasNext();
}
