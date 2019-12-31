package garage.parts;

import garage.parts.api.IKey;
import garage.parts.api.ILock;

public class Lock implements ILock {
    private final String lockSecret;

    @Override
    public String getLockSecret() {
        return lockSecret;
    }
    @Override
    public boolean open(IKey key){
        return false;
    }

    @Override
    public boolean close(IKey key) {
        return false;
    }

    public Lock (String lockSecret){
        this.lockSecret = lockSecret;
    }
}
