package Fabric;

import Interface.iGameItem;
import Product.Bronze1Reward;

public class Bronze1Generator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bronze1Reward();
    }
}
