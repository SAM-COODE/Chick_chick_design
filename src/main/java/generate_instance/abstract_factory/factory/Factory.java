package generate_instance.abstract_factory.factory;

/**
 * @ClassName:Factory
 * @Author:wangsw17
 * @Dtae:2022/2/28 15:09
 * @Description:TODO
 **/
public abstract class Factory {
    /**
     * @param factoryName
     * @return
     */
    public static Factory getFactory(String factoryName){
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(factoryName).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption,String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title,String author);
}
