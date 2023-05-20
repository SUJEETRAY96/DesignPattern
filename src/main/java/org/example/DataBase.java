package org.example;

public class DataBase {
    private String url;
    private String userName;
    private String password;
    private static DataBase instance;

    public static DataBase getInstance(){
        if(instance==null){
            synchronized (DataBase.class){
                if(instance == null)
                    instance = new DataBase();
            }
        }
        return instance;
    }
    private DataBase(){

    }

}
