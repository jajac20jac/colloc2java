/* Builder DP
*  Нужен чтобы решить некоторые проблемы Factory и AbstractFactory
*  Данный пример показывает Phone class и PhoneBuilder
*
*
*
*/

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setWifiEnabled(true).build();
    }

}