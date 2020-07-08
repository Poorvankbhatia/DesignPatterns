package singletonpattern;

public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance() {
        if(uniqueInstance == null) { // Only enter if there is no instance.
            synchronized (Singleton.class) { // We only synchronize the first time.
                if (uniqueInstance ==  null) { // Once in the block check again and if null create an instance.
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}

/**
 * We can also do :
 * private static Singleton uniqueInstance = new Singleton();,
 * with no null check in getInstance() method.
 * Creating an instance in the static initializer. This code is guaranteed to be thread safe.
 * With this approach we rely on the JVM to create unique instance when class is loaded.
 * JVM will guarantee that the instance will be created before any thread will access the static unique
 * instance variable.
 */