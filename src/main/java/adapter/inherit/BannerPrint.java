package adapter.inherit;

import adapter.Banner;

/**
 * @ClassName:BannerPrint
 * @Author:wangsw17
 * @Dtae:2022/2/24 11:07
 * @Description:
 **/
public class BannerPrint extends Banner implements Print {

    public BannerPrint(String slogan) {
        super(slogan);
    }

    @Override
    public void printWeek() {
     this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
