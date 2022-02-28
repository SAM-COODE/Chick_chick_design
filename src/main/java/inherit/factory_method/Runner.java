package inherit.factory_method;

/**
 * @ClassName:Runner
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:22
 * @Description:
 **/
public class Runner {
    /**
     * emmm,说不出什么
     * @param args
     */
    public static void main(String[] args) {
        ProductFactory idCardFactory = new IDCardFactory();
        Product product1 = idCardFactory.create("一乐");
        Product product2 = idCardFactory.create("二乐");
        Product product3 = idCardFactory.create("三乐");
        product1.use();
        product2.use();
        product3.use();
    }
}
