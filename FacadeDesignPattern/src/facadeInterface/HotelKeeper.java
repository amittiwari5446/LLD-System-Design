package facadeInterface;

import menus.Both;
import menus.NonVegMenu;
import menus.VegMenu;

public interface HotelKeeper {
    VegMenu getVegMenu();
    NonVegMenu getNonVegMenu();
    Both getVegNonMenu();
}
