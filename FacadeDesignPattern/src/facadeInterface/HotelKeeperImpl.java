package facadeInterface;

import hotels.NonVegRestaurant;
import hotels.VegNonBothRestaurant;
import hotels.VegRestaurant;
import menus.Both;
import menus.NonVegMenu;
import menus.VegMenu;

public class HotelKeeperImpl implements HotelKeeper{
    @Override
    public VegMenu getVegMenu() {
        return (VegMenu) new VegRestaurant().getMenus();
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        return (NonVegMenu) new NonVegRestaurant().getMenus();
    }

    @Override
    public Both getVegNonMenu() {
        return (Both) new VegNonBothRestaurant().getMenus();
    }
}
