package fruitshop.service;

import db.Storage;
import fruitshop.model.FruitTransaction;

public class ReturnOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        int currentQuantity = Storage.fruits.getOrDefault(transaction.getFruit(), 0);
        Storage.fruits.put(transaction.getFruit(), currentQuantity - transaction.getQuantity());
    }
}
