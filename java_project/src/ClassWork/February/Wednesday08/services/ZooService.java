package ClassWork.February.Wednesday08.services;

import ClassWork.February.Wednesday08.models.Animal;
import ClassWork.February.Wednesday08.models.interfaces.DBStorable;
import ClassWork.February.Wednesday08.models.interfaces.FileStorable;
import ClassWork.February.Wednesday08.services.interfaces.Findable;
import ClassWork.February.Wednesday08.services.interfaces.Keeperable;

import java.util.ArrayList;
import java.util.Stack;

public class ZooService implements Findable<Animal, Integer>, Keeperable<Animal>, DBStorable , FileStorable {


    @Override
    public Animal getById(Integer i) {
        return items.get(1);
    }

    Stack<Animal> items;

    @Override
    public void push(Animal animal) {
        items.push(animal);
    }

    @Override
    public Animal pop() {
        return items.pop();
    }

    @Override
    public void saveAll() {

    }

    @Override
    public void saveAll(String fileName) {

    }
}
