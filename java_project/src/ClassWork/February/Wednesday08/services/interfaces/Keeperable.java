package ClassWork.February.Wednesday08.services.interfaces;

import ClassWork.February.Wednesday08.models.interfaces.Storable;

public interface Keeperable<TEntity extends Storable> {

    public void push(TEntity entity);

    public TEntity pop();
}
