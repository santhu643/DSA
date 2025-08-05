class pencil {
    int inkQty;
    String colour;

    public pencil(int inkQty, String colour) {
        this.inkQty = inkQty;
        this.colour = colour;
    }

    public void write(String text) {
        if (inkQty > 0) {
            System.out.println("Writing in " + colour + ": " + text);
            inkQty--;
        } else {
            System.out.println("Ink is empty! Refill the pencil.");
        }
    }

    public void refill(int qty) {
        if (qty > 0) {
            inkQty += qty;
            System.out.println("Refilled " + qty + " units. Total ink now: " + inkQty);
        } else {
            System.out.println("Invalid refill quantity!");
        }
    }

    public void showStatus() {
        System.out.println("Current Ink Quantity: " + inkQty);
    }
}

public class TestPen {
    public static void main(String[] args) {
        pencil pen1 = new pencil(2, "Blue");
        pencil pen2 = new pencil(0, "Black");

        pen1.write("Hello, world!");
        pen1.write("This is a blue pen.");
        pen1.write("Out of ink?"); 

        pen2.write("Trying to write..."); 
        pen2.refill(3);
        pen2.write("Now it works!");
        pen1.showStatus();
        pen2.showStatus();
    }
}
