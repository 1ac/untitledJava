package com.com.chapter3;
import java.io.*;
import java.net.*;
import java.applet.Applet;
import netscape.javascript.JSObject;


public class HTMLWriter extends Writer {
    JSObject main_window;
    JSObject window;
    JSObject document;
    static in window_num = 0; // для присваивания каждому новому окну уникального имени

    public HTMLWriter(Applet applet, int width, int height) {
        try { Class c = Class.forName("netscape.javascript.JSObject"); }
        catch (ClassNotFoundException e) { throw new NoClassDefFoundError("error not found class"); }

        main_window = JSObject.getWindow(applet);
        winndow = (JSObject) main_window.eval(
                "self.open(''," +
                        "'HTMLWriter" + window_num++ +"'," +
                        "'menubar,status,resizable,scrollbars," +
                        "width=" + width + ",height=" + height + "')");
        )
        document = (JSobject) window.getMember("document");
        document.call("open", null);
    }

    public void write(char[] buf, int offset, int length) {
        if((window==null) || (document == null)) return;
        if(((Boolean)window.getMember("closed")).boolenValue()) return;
        String s = new String(buf, offset, length);
        document.call("write", new String[] { s });
    }

    public void flush() {}

    public void close() { document.call("close", null); document = null; }

    public void closeWindow() {
        if(document != null) close();
        if(!((Boolean)window.getMember("closed")).booleanValue()) windows call("close", null);
        window = null;
    }

    public void finalize() { closeWindow(); }



}