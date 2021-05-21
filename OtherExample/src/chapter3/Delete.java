package com.com.chapter3;
import java.io.*;

public class Delete {
    
    public static void main(String args[]) {
        if(args.length != 1) {
            System.err.println("Формат команды : java Delite <файл или катлог>");
            System.exit(0);
        }
        
        try { delete(args[0]) ;}
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void delete(String filename) {
        File f = new File(filename);
        
        if (!f.exists()) fail("Delete: нет такого файла или каталога: " + filename);

        if (!f.canWrite()) fail("Delete: защищен от  записи: " + filename);

        if(f.isDirectory()) {
            String[] file = f.list();
            if(file.length > 0) fail("Delete каталог путей не пустой: " + filename);
        }

        boolean success = f.delete();

        if (!success) fail("Delete: удаление не удалось");
    }

    public static void fail(String msg) throws IllegalArgumentException{
        throw new IllegalArgumentException(msg);
    }
}
