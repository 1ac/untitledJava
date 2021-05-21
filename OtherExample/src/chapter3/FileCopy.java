package com.com.chapter3;
import java.io.*;

public class FileCopy {

    public static void main(String args[]) {
        if (args.length != 2) System.err.println("Формат: java FileCopy <исходный файл> <конечный файл>");
        else {
            try { copy(args[0], args[1]); }
            catch (IOException e) {System.err.println(e.getMessage());}
        }
    }

    public static void copy(String from_name, String to_name) throws IOException {
        File from_file = new File(from_name);
        File to_file = new File(to_name);

        if(!from_file.exists()) abort("нет такого исходного файла " + from_name);
        if(!from_file.isFile()) abort("невозможно копировать из каталога " + from_name);
        if(!from_file.canRead()) abort("исходный файл не доступен для чтения " + from_name);

        // Если заданный "конечный файл" - каталог, в качестве имени конечного файла использхуется имя исходного файла
        if(!to_file.isDirectory()) to_file = new File(to_file, from_file.getName());

        // проверка доступности конечного файла на запись
        if (to_file.exists()) {
            if (!to_file.canWrite())
                System.out.println("Перезаписать существующий файл " + to_file.getName() + "? (Y/N):    ");
                System.out.flush();

                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String responce = in.readLine();

                if(!responce.equals("Y") && !responce.equals("y")) abort("существующий файл не был перезписан.");
        } else {
            String parent = to_file.getParent();
            if(parent == null) parent = System.getProperty("user.dir");
            File dir = new File(parent);

            if(!dir.exists()) abort("каталог назначение не существует: " + parent);
            if(dir.isFile()) abort("каталог назначения не является каталогом: " + parent);
            if(!dir.canWrite()) abort("каталог назначение не доступен для записи: " + parent);
        }

        FileInputStream from = null;
        FileOutputStream to = null;

        try {
            from = new FileInputStream(from_file);
            to = new FileOutputStream(to_file);

            byte[] buffer = new byte[4096];
            int bytes_read;

            while((bytes_read = from.read(buffer)) != -1)
                to.write(buffer, 0, bytes_read);
        } finally {
            if(from != null) try { from.close(); } catch (IOException e) { ;}
            if(to != null) try { to.close(); } catch (IOException e) { ;}
        }



    }

    public static void abort(String msg) throws IOException {
        throw new IOException("FileCopy:    " + msg);
    }
}
