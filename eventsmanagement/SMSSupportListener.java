/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer.eventsmanagement;

/**
 *
 * @author lenovo
 */
import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;

    public SMSSupportListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        String smsContent = "Sample SMS text from file: " + file.getName(); // Replace with actual file content handling

        if (smsContent.length() > 160) {
            System.out.println("Warning: SMS exceeds 160 characters. Define a valid SMS.");
        } else {
            System.out.println("Sending SMS to " + phoneNumber + ": " + smsContent);
        }
    }
}
