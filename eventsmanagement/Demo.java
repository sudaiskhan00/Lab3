/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.eventsmanagement;

/**
 *
 * @author lenovo
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("sudaismurad3@gmail.com"));
        editor.events.subscribe("save", new SMSSupportListener("+923139823318")); // Replace with real number

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
