package usbPort;

public class User {
    public static void main(String[] args) {
        USB usb = new Computer();
        usb.connect();

        Iphone iphone = new Iphone();
        USB USB = new IphoneAdapter(iphone);
        USB.connect();

    }

}
