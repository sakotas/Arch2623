package Fabric;

import Interface.iGameItem;
import Product.Bronze5Reward;

public class Bronze5Generator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bronze5Reward();
    }
}
