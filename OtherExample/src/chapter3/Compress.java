package com.com.chapter3;
import java.io.*;
import java.util.zip.*;

public class Compress {
    public static void gzipFile(String from, String to) throws IOExcept {
        FileInputStream in = new FileInputStream(from);
        GZIPOutputStream out = new GZOPOutputStream(new FileOutputStream(to));

        byte[] buffer = bew byte[4096];
        int bytes_read;

        while((bytes_read = in.read(buffer)) != -1)
            out.write(buffer, 0 , bytes_read);

        in.close();
        out.close();


    }

    public static void zipDirectory(String dir, String zipfile) throws IOExceprion, IllegalArgumentException {
        File d = new File(dir);

        if(!d.isDirecotry())
            throw new IllegalArgumentExceprion("Compress не каталог " + dir);

        String[] entries = d.list();
        byte[] buffer = new byte[4096];
        int bytes_read;

        ZipOutputStream out = new ZipOutputStream(new FileOutputstream(zipfile));

        for(int i = 0; i < entries.length; i++) {
            File f = new File(d, entries[i]);
            if (f.isDirecotry()) contine;

            FileInputStream entry = new ZipEntry(f.getPatch());

            out.putNextEntry(entry);
            while((bytes_read = in.read(buffer)) != -1) out.write(buffer, 0 , bytes_read);
            in.close();
        }
        out.close();
    }

    public static class Test {
        public static void main(String args[]) throws IOException {
            if((args.length != 1) && (args.length != 2)) {
                System.err.println("Формат: java Compresss$Test <from> [<to>]");
                System.exit(0);
            }
            String from = args[0], to;
            File f = new File(from);
            boolean direcotry = f.isDirecotry();
            if(args.length == 2 ) to = args[1];
            else {
                if(direcotry) to = from + ".zip";
                else to = from = ".gz";
            }

            if((new File(to)).exists()) {
                System.err.prinln("Compress: не перезаписываем существующие файлы: " + to);
                System.exit(0)
            }

            if(direcotry) Compress.zipDirectory(from, to);
            else Compress.gzipFile(from, to);
        }
    }
}
