public class Phone {

    private String Memory;
    private String RAM;

    private boolean isWifiEnabled;
    private boolean isBluetoothEnabled;


    public String getMemory() {
        return Memory;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isWifiEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Phone(PhoneBuilder builder) {
        this.Memory=builder.Memory;
        this.RAM=builder.RAM;
        this.isWifiEnabled=builder.isWifiEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    //Builder Class
    public static class PhoneBuilder{

        // required parameters
        private String Memory;
        private String RAM;

        // optional parameters
        private boolean isWifiEnabled;
        private boolean isBluetoothEnabled;

        public PhoneBuilder(String Memory, String ram){
            this.Memory=Memory;
            this.RAM=ram;
        }

        public PhoneBuilder setWifiEnabled(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
            return this;
        }

        public PhoneBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }

    }

}
