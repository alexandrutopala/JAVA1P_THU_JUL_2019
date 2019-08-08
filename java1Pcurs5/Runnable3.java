import java.util.concurrent.locks.*;
import java.time.*;

public class Runnable3 implements Runnable {
    
    
    private ReadWriteLock lock = 
        new ReentrantReadWriteLock();
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            read();
            write();
        }
    }
    
    private void read() {
        lock.readLock().lock();
        
        String name = Thread.currentThread().getName();
        
        System.out.println(name + " citeste");
        Exemplu1.sleep(1000);
        System.out.println(name + "a terminat de citit");
        
        lock.readLock().unlock();
    }
    
    private void write() {
        lock.writeLock().lock();
        
        String name = Thread.currentThread().getName();
        
        System.out.println(name + " scrie");
        Exemplu1.sleep(1000);
        System.out.println(name + "a terminat de scris");
        
        lock.writeLock().unlock();
    }
}


