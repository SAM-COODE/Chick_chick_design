package generate_instance.builder;

/**
 * @ClassName:Director
 * @Author:wangsw17
 * @Dtae:2022/2/28 13:55
 * @Description:TODO
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        this.builder.makeTitle("想玩游戏");
        this.builder.makeString("但是又没有钱");
        this.builder.makeItems(new String[]{
                "地平线-西部禁地",
                "艾尔登法环",
                "赛博朋克2077"
        });
        this.builder.makeString("又没有时间");
        this.builder.makeItems(new String[]{
                "网络",
                "操作系统",
                "并发",
                "设计模式"
        });

        this.builder.close();
    }

    public String getResult(){
        return this.builder.getResult();
    }
}
