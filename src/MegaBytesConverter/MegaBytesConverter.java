package MegaBytesConverter;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kilobytesPerMegaBytes = 1024;
        int megaBytes = (kiloBytes / kilobytesPerMegaBytes);
        int remainingKiloBytes = kiloBytes % kilobytesPerMegaBytes;
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB" + " = " + megaBytes + " MB" + " and " + remainingKiloBytes + " KB");
          }

    }

}
