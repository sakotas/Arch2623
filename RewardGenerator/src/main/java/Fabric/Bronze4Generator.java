package Fabric;

import Interface.iGameItem;
import Product.Bronze4Reward;

public class Bronze4Generator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bronze4Reward();
    }
}
