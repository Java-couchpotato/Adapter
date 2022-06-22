package usbPort;

public class Computer implements USB{

    @Override
    public void connect() {
        System.out.println("connected");
    }
}
