import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Book kgbt = new Book("KGBT", "Pelevin", 2022);
        Book gone = new Book("Gone With the Wind", "Mitchell", 1939);
        int kgbtYear = kgbt.getYear(2010);
        PrintStream var10000 = System.out;
        String var10001 = kgbt.getTitle();
        String var10002 = gone.getTitle();
        var10000.println(var10001 + " " + kgbt.getAuthor() + " " + kgbt.getYear(2010));
    }
}
