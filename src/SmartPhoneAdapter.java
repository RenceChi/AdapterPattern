public class SmartPhoneAdapter implements PowerOutlet {
    private SmartPhoneCharger charger;

    public SmartPhoneAdapter(SmartPhoneCharger charger) {
        this.charger = charger;
    }
    @Override
    public void plugIn() {
        charger.chargePhone();
    }
}