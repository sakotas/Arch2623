package Fabric;

import Interface.iGameItem;
import Product.Bronze3Reward;

public class Bronze3Generator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bronze3Reward();
    }
}
