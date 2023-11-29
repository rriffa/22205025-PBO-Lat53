/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205025.pbo.lat53;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

/*
 *
 * @author Lenovo
 * Nama :Ma'rifatu Khirzah
 * Nim :22205025
 * Prodi :Teknik Informatika
 * Deskripsi :Membuat program dengan animal kelas kelinci
 */
// Kelas Animal 
class Animal {

    //Atribut 
    private boolean vegetarian;
    private String eats;
    private int no0fLegs;

    //Constructor 
    public Animal(boolean vegetarian, String food, int no0fLegs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.no0fLegs = no0fLegs;
    }
    // Method getVegetarian()

    public boolean isVegetarian() {
        return vegetarian;
    }
    // Method getEats()

    public String getEats() {
        return eats;
    }
    // Method getNo0fLegs()

    public int getNoOfLegs() {
        return no0fLegs;
    }
}
// Kelas Rabbit 

class Rabbit extends Animal {
    // Atribut 

    private String color;
    private String name;
    // Constructor 

    public Rabbit(String name, boolean vegetarian, String eats, int no0fLegs, String color) {
        super(vegetarian, eats, no0fLegs);
        this.name = name;
        this.color = color;
    }
    // Method getName()

    public String getName() {
        return name;
    }
    // Method getColor()

    public String getColor() {
        return color;
    }
}
// Main Class

public class PBOLat53 {
    // Method main()

    public static void main(String[] args) {
        // Membuat objek Rabbit 
        Rabbit rabbit = new Rabbit("Peter", true, "rumput", 4, "Abu-abu");

        // Menampilkan atribut dari objek rabbit 
        System.out.println("Nama: " + rabbit.getName());
        System.out.println("Vegetarian: " + rabbit.isVegetarian());
        System.out.println("Makanan: " + rabbit.getEats());
        System.out.println("Jumlah kaki: " + rabbit.getNoOfLegs());
        System.out.println("Warna: " + rabbit.getColor());
    }
}
