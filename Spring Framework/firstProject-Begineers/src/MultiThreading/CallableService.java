package MultiThreading;

import java.util.Objects;
import java.util.concurrent.Callable;

public class CallableService implements Callable<String> {

    public String stringName;

    public CallableService(String stringName) {
        this.stringName = stringName;
    }

    @Override
    public String call() throws Exception {
//        Testing to add a processing timer.
//        Thread.sleep(100);
//        if (Objects.equals(stringName, "First callable")){
//        }
        return stringName;
    }
}
