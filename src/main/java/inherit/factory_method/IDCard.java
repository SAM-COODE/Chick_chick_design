package inherit.factory_method;

/**
 * @ClassName:IDCard
 * @Author:wangsw17
 * @Dtae:2022/2/24 16:10
 * @Description:
 **/
public class IDCard extends Product {
    private String owner;
    public IDCard(String owner){
        this.owner = owner;
        System.out.println(owner+"创建了工卡");
    }
    @Override
    public void use() {
        System.out.println(owner+"使用了IDCard");

    }
    public String getOwner(){
        return this.owner;
    }
}
