package garage.parts.api;

import garage.parts.Lock;

public interface ILock {
    String getLockSecret();
    boolean open(IKey key);
    boolean close(IKey key);



}

