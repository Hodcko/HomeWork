package garage.parts;

import garage.parts.api.IKey;
import garage.parts.api.ILock;

public class Key implements IKey {

    private final String keySecret;

    @Override
    public String getKeySecret() {
        return keySecret;
    }

    public Key (String keySecret){
        this.keySecret = keySecret;
    }
}
