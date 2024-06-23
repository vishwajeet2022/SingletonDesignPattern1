package org.example;

public class SingletonClass {
    private static SingletonClass INSTANCE;
    public String value;

    private  SingletonClass(String value){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value=value;
    }
    public static SingletonClass getINSTANCE(String value){
        if(INSTANCE==null){
            synchronized (SingletonClass.class){
                if(INSTANCE==null){
                    INSTANCE=new SingletonClass(value);
                }
            }
        }
        return INSTANCE;
    }
}
