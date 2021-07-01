package chapter14.throwingAnException;

import java.io.IOException;
import java.io.InputStream;

public interface MyIOAction {
    String ioAction(InputStream reader) throws IOException;
}
