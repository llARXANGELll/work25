package work28;

public class Singleton {
    private static Singleton sumValueAutoAllOffers;

    public Singleton() {
    }

    public static Singleton getSumValueAutoAllOffers() {
        if (sumValueAutoAllOffers == null) {
            sumValueAutoAllOffers = new Singleton();
        }
        return sumValueAutoAllOffers;
    }
}
