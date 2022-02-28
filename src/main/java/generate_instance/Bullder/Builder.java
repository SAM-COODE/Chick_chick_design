package generate_instance.Bullder;

/**
 * @ClassName:Builder
 * @Author:wangsw17
 * @Dtae:2022/2/28 13:53
 * @Description:TODO
 **/
public  abstract class Builder {
    protected StringBuffer stringBuffer = new StringBuffer();
    public abstract void makeTitle(String text);

    public abstract void makeString(String text);

    public abstract void makeItems(String[] items);

    public abstract void close();

    public String getResult(){
        return this.stringBuffer.toString();
    }
}
