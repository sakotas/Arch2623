import Fabric.*;
import Interface.iGameItem;
import Product.ItemReward;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        // Создаем Фабрики на все продукты
        ItemGenerator f1 = new GemGenerator();
        ItemGenerator f2 = new GoldGenerator();
        ItemGenerator f3 = new SilverGenerator();
        ItemGenerator f4 = new Bronze1Generator();
        ItemGenerator f5 = new Bronze2Generator();
        ItemGenerator f6 = new Bronze3Generator();
        ItemGenerator f7 = new Bronze4Generator();
        ItemGenerator f8 = new Bronze5Generator();

        System.out.println("-----------------");

        // Проверяем, что объекты генерируют награды
        f1.openReward();
        f2.openReward();
        f3.openReward();
        f4.openReward();
        f5.openReward();
        f6.openReward();
        f7.openReward();
        f8.openReward();

        System.out.println("-----------------");

        // Создаем список с фабриками
        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);
        itemGeneratorList.add(f4);
        itemGeneratorList.add(f5);
        itemGeneratorList.add(f6);
        itemGeneratorList.add(f7);
        itemGeneratorList.add(f8);

        // Проверяем, что список создался и включает в себя объекты-фабрики
        System.out.println(itemGeneratorList);
        System.out.println("-----------------");

        /*
        Задание 1.Закончить разработку паттерна Фабричный метод.
        1) Добавить в пример из семинара как минимум 5 наград.
        2) Награды должны генерироваться в соотношении:
        10:10:10:10:10:10 (ваши награды и серебро SILVER):
        3(золото GOLD):
        1(алмазы GEM)
         */

        // Генерируем счетчики и считаем вероятности выпадения
        Random random = ThreadLocalRandom.current();
//        Integer gemCounter = 0;
//        Integer goldCounter = 0;
//        Integer generalCounter = 0;
//        Double gemProbability = (double) (1/64);
//        Double goldProbability = (double) (3/64);
//        Double generalProbability = (double) (60/64);
//        List<Double> probs = new ArrayList<>();
//        probs.add(gemProbability);
//        probs.add(goldProbability);
//        probs.add(generalProbability);
//        probs.add(generalProbability);
//        probs.add(generalProbability);
//        probs.add(generalProbability);
//        probs.add(generalProbability);
//        probs.add(generalProbability);

        // Создаем список, куда будем складывать выпавшие значения
        List<ItemGenerator> itemRewardsList = new ArrayList<>();

        // Цикл генерации наград
        // Ограничение:
        // - максимум одна награда уровня GOLD
        // - максимум одна награда уровня GEM
        for (int i = 0; i < 20; i++) {
            ItemGenerator item = null;
            if (itemRewardsList.contains(f1)) {
                item = itemGeneratorList.get(random.nextInt(2,8));
                itemRewardsList.add(item);
            } else if (itemRewardsList.contains(f2)) {
                item = itemGeneratorList.get(random.nextInt(3,8));
                itemRewardsList.add(item);
            } else {
                item = itemGeneratorList.get(random.nextInt(8));
                itemRewardsList.add(item);
            }
        }

        for (ItemGenerator item: itemRewardsList) {
            item.openReward();
        }


    }
}
