package generate_instance.prototype;

import java.util.HashMap;

/**
 * @ClassName:Manager
 * @Author:wangsw17
 * @Dtae:2022/2/25 17:23
 * @Description:
 **/
public class Manager {
    private HashMap<String,Product> showcase = new HashMap();

    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String name){
        Product product = showcase.get(name);
        return product.createClone();
    }
}
