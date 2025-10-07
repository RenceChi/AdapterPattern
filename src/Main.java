public class Main {
    public static void main(String[] args) {
        //Adaptee objects
        Laptop laptop = new Laptop();
        Refrigerator fridge = new Refrigerator();
        SmartPhoneCharger phoneCharger = new SmartPhoneCharger();

        //Adapters
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet fridgeAdapter = new RefrigeratorAdapter(fridge);
        PowerOutlet phoneAdapter = new SmartPhoneAdapter(phoneCharger);

        //Plug in
        System.out.println("Plugging in devices:");
        laptopAdapter.plugIn();
        fridgeAdapter.plugIn();
        phoneAdapter.plugIn();
    }
}
