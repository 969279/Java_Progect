package lesson6;

public class Laptop {
    String brand;
    String name;
    String display;
    String cpu;
    int hdd;
    int ram;

    public Laptop( String brand, String name, String display, String cpu, int hdd, int ram) {
        this.brand = brand;
        this.name = name;
        this.display = display;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }
    @Override
    public String toString() {
        return  "Ноутбук: " +
                brand + ", " +
                name + ", " +
                "монитор: " + display + ", " +
                cpu + ", " +
                hdd + "ГБ, " +
                ram + "ГБ;";
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name;  }

    public String getBrand() {  return brand;  }

    public void setBrand(String brand) { this.brand = brand;  }

    public String getDisplay() { return display;  }

    public void setDisplay(String display) { this.display = display;  }

    public String getCpu() { return cpu;  }

    public void setCpu(String cpu) { this.cpu = cpu;  }

    public int getHdd() { return hdd;  }

    public void setHdd(int hdd) { this.hdd = hdd;  }

    public int getRam() { return ram;  }

    public void setRam(int ram) {  this.ram = ram;  }
}
