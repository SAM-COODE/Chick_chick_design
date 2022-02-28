package inherit.factory_method;

import java.util.ArrayList;

/**
 * @ClassName:IDCardFactory
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:10
 * @Description:
 **/
public class IDCardFactory extends ProductFactory{

    private ArrayList<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public ArrayList<String> getOwners(){
        return this.owners;
    }
}
