package ClassWork.February.Wednesday08.models;

import ClassWork.February.Wednesday08.models.interfaces.Printable;
import ClassWork.February.Wednesday08.models.interfaces.Storable;

public class Animal extends BaseModel implements Printable, Storable {
    @Override
    public void doMe() {
        System.out.println("Hello from animal");
    }
}
