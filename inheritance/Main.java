package inheritance;

class Electronics {
    protected String brand;
    protected int price;

    public Electronics(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class Mobile extends Electronics {
    private int camera;

    public Mobile(String brand, int price, int camera) {
        super(brand, price);
        this.camera = camera;
    }

    public void display() {
        super.display();
        System.out.println("Camera: " + camera + " MP");
    }
}

class TV extends Electronics {
    private int screenSize;

    public TV(String brand, int price, int screenSize) {
        super(brand, price);
        this.screenSize = screenSize;
    }

    public void display() {
        super.display();
        System.out.println("Screen size: " + screenSize + " inches");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Apple", 100000, 12);
        System.out.println("Mobile:");
        mobile.display();

        System.out.println("\nTV:");
        TV tv = new TV("Samsung", 50000, 50);
        tv.display();
    }
}