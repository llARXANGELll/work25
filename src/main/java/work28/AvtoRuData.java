package work28;

import java.util.Objects;

public class AvtoRuData {

    private static AvtoRuData instance;
    private String sumValueAutoAllOffers;

    private AvtoRuData() {
    }

    public static AvtoRuData getInstance() {
        if (Objects.isNull(instance)) {
            instance = new AvtoRuData();
        }
        return instance;
    }

    public String getSumValueAutoAllOffers() {
        return sumValueAutoAllOffers;
    }

    public void setSumValueAutoAllOffers(String sumValueAutoAllOffers) {
        this.sumValueAutoAllOffers = sumValueAutoAllOffers;
    }
}