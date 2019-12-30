package garage.parts;

import garage.parts.api.ILock;

public class Lock implements ILock {
    private final String lockSecret;

    @Override
    public String getLockSecret() {
        return lockSecret;
    }

    public Lock (String lockSecret){
        this.lockSecret = lockSecret;
    }




}
