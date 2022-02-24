package inherit.factory_method;

/**
 * @ClassName:ProductFactory
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:06
 * @Description:TODO
 **/
public abstract class ProductFactory {

    public Product create(String owner){
        Product product = this.createProduct(owner);
        registerProduct(product);
        return product;
    }
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
