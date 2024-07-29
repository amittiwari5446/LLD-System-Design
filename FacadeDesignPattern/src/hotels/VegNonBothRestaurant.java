package hotels;

import menus.Both;
import menus.Menus;

public class VegNonBothRestaurant implements Hotel{
    @Override
    public Menus getMenus() {
        return new Both();
    }
}
