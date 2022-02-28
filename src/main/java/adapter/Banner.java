package adapter;

/**
 * @ClassName:Banner
 * @Author:wangsw17
 * @Dtae:2022/2/24 10:50
 * @Description:
 **/
public class Banner {
    private String slogan;

    public Banner(String slogan){
        this.slogan = slogan;
    }
    public void showWithParen(){
        System.out.println("("+this.slogan+")");
    }
    public void showWithAster(){
        System.out.println("*"+this.slogan+"*");
    }
}
