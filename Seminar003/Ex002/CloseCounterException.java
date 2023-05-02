package Ex002;

import java.io.IOException;

class CloseCounterException extends IOException {

    public CloseCounterException(String string) {
        super(string);
    }

}
