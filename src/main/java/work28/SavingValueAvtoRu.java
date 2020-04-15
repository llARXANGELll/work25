package work28;

public class SavingValueAvtoRu {
    private static String sumValueAutoAllOffers;

    private static SavingValueAvtoRu getInstance() {
        if (sumValueAutoAllOffers == null) {
            sumValueAutoAllOffers = null;
        }
        return getInstance();
    }

    public static String getSumValueAutoAllOffers() {
        return sumValueAutoAllOffers;
    }

    public static void setSumValueAutoAllOffers(String sumValueAutoAllOffers) {
        SavingValueAvtoRu.sumValueAutoAllOffers = sumValueAutoAllOffers;
    }
}
