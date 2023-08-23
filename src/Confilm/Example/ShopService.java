package Confilm.Example;

public class ShopService {

    private static ShopService shopService = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance() {
        return shopService;
    }
}

