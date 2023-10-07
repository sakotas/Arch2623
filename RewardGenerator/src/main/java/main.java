import Fabric.*;
import Interface.iGameItem;
import Product.ItemReward;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {

        Random random = new Random();

        List<ItemGenerator> chest = generateChest();

        for (int i = 0; i < 100; i++) {
            int index = random.nextInt(chest.size());
            chest.get(index).openReward();
        }
    }

    public static List<ItemGenerator> generateChest() {
        List<ItemGenerator> newChest = new ArrayList<>();

        newChest.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            newChest.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            newChest.add(new SilverGenerator());
            newChest.add(new Bronze1Generator());
            newChest.add(new Bronze2Generator());
            newChest.add(new Bronze3Generator());
            newChest.add(new Bronze4Generator());
            newChest.add(new Bronze5Generator());
        }

        return newChest;
    }
}
