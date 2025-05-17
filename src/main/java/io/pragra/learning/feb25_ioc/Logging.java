package io.pragra.learning.feb25_ioc;

public class Logging {
    public static Logging logging;
    private Logging(){

    }
    public synchronized static Logging getInstance() {

            if (null == logging) {
                logging = new Logging();
            }

            return logging;
        }

}
