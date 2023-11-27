public class App {
    public static void main(String[] args) {
        PrinterProcess p1 = new PrinterProcess(new Printer1());
        PrinterProcess p2 = new PrinterProcess(new Printer2());
p1.Scan();
p1.Print();
p2.Scan();
p2.Print();
    }
}
