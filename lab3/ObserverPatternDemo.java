/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author lenovo
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

      
        System.out.println("\nDetaching OctalObserver...");
        subject.detach(octalObserver);

        System.out.println("Second state change: 10");
        subject.setState(10);

        
        System.out.println("\nDetaching BinaryObserver...");
        subject.detach(binaryObserver);

        System.out.println("Third state change: 20");
        subject.setState(20);
        
        System.out.println("\nReattaching BinaryObserver...");
        subject.attach(binaryObserver);

        System.out.println("Fourth state change: 25");
        subject.setState(25);
    }
}
