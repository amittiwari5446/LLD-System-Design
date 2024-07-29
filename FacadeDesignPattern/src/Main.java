import facadeInterface.HotelKeeper;
import facadeInterface.HotelKeeperImpl;
import menus.Both;
import menus.NonVegMenu;
import menus.VegMenu;

public class Main {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper=new HotelKeeperImpl();

        VegMenu vegMenu=hotelKeeper.getVegMenu();
        vegMenu.showMenu();

        NonVegMenu nonVegMenu=hotelKeeper.getNonVegMenu();
        nonVegMenu.showMenu();

        Both bothMenus=hotelKeeper.getVegNonMenu();
        bothMenus.showMenu();
    }
}