package lesson6;

public class Laptop {
    String name;
    String brand;
    double display;
    String cpu;
    int hdd;
    int ram;

    @Override
    public String toString() {
        return "Ноутбук: " + brand + '\n' + name + display;
    }

    public Laptop(String name, String brand, double display, String cpu, int hdd, int ram) {
        this.name = name;
        this.brand = brand;
        this.display = display;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
