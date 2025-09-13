/**
 * 
 */
package com.collectors.codechallenge;

/**
 * @author NaveenWodeyar
 *
 */
//1. SRP - Single Responsibility Principle
class Printer {
 public void print(String message) {
     System.out.println(message);
 }
}

//2. OCP - Open/Closed Principle
interface Shape {
 double area();
}

class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 public double area() {
     return Math.PI * radius * radius;
 }
}

//3. LSP - Liskov Substitution Principle
class Rectangle implements Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 public double area() {
     return width * height;
 }
}

//4. ISP - Interface Segregation Principle
interface Scanner {
 void scan();
}

interface Fax {
 void fax();
}

class SimplePrinter implements Scanner {
 public void scan() {
     System.out.println("Scanning document...");
 }
}

//5. DIP - Dependency Inversion Principle
interface MessageService {
 void sendMessage(String message);
}

class EmailService implements MessageService {
 public void sendMessage(String message) {
     System.out.println("Sending Email: " + message);
 }
}

class Notification {
 private MessageService service;

 public Notification(MessageService service) {
     this.service = service;
 }

 public void notifyUser(String message) {
     service.sendMessage(message);
 }
}

//Main class to run the demo
public class SimpleSolidDemo {
 public static void main(String[] args) {
     // SRP
     Printer printer = new Printer();
     printer.print("Hello, SOLID!");

     // OCP & LSP
     Shape circle = new Circle(2);
     Shape rectangle = new Rectangle(3, 4);
     System.out.println("Circle area: " + circle.area());
     System.out.println("Rectangle area: " + rectangle.area());

     // ISP
     Scanner scanner = new SimplePrinter();
     scanner.scan();

     // DIP
     MessageService service = new EmailService();
     Notification notification = new Notification(service);
     notification.notifyUser("You have a new message!");
 }
}
