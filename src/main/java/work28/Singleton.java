package work28;

import com.codeborne.selenide.SelenideElement;

public final class Singleton {
    private static SelenideElement sumValueAutoAllOffers;


    public static SelenideElement getSumValueAutoAllOffers() {
        if (sumValueAutoAllOffers == null) {
            sumValueAutoAllOffers = null;
        }
        return sumValueAutoAllOffers;
    }

    public void setSumValueAutoAllOffers(SelenideElement sumValueAutoAllOffers) {
        this.sumValueAutoAllOffers = sumValueAutoAllOffers;
    }

}
