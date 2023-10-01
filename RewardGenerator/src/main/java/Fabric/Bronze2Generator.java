package Fabric;

import Interface.iGameItem;
import Product.Bronze2Reward;

public class Bronze2Generator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new Bronze2Reward();
    }
}
