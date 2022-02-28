package generate_instance.prototype;

/**
 * @ClassName:MessageBox
 * @Author:wangsw17
 * @Dtae:2022/2/25 17:33
 * @Description:
 **/
public class MessageBox implements Product{
    private char decoChar;

    public MessageBox(char decoChar){
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i =0;i<length;++i){
            System.out.print(decoChar);
        }
        System.out.println(" ");
        System.out.println(decoChar + " " + s + " " + decoChar);
        for(int i =0;i<length;++i){
            System.out.print(decoChar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
