package hotels;

import menus.Menus;
import menus.NonVegMenu;

public class NonVegRestaurant implements Hotel{
        @Override
        public Menus getMenus() {
                return new NonVegMenu();
        }
}
