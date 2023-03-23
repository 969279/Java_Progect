package lesson6;

public class Laptop {
    String name;
    int IMEI;
    String brand;
    int memory;
    double display;
    String cpu;
    int prise;

    @Override
    public String toString() {
        return "Ноутбук: " + brand + '\n' + name + display;

    }

    public void showInfo() {
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
