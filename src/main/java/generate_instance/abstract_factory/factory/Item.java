package generate_instance.abstract_factory.factory;

/**
 * @ClassName:item
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:10
 * @Description:零件父类
 **/
public abstract class Item {
    protected String caption;

    public Item(String caption){
        this.caption = caption;
    }

    public abstract String makeString();
}
