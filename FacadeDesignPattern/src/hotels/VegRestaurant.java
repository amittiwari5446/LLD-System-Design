package hotels;

import menus.Menus;
import menus.VegMenu;

public class VegRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}
