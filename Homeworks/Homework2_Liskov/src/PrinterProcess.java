class PrinterProcess {
    private CanPrint printer;

    public PrinterProcess(CanPrint printer) {
        this.printer = printer;
    }

    public void Print() {
        if (printer instanceof CanPrint) {
            ((CanPrint) printer).Print();
        } else {
            System.out.println("Printer can't print.");
        }
    }

    public void Scan() {
        if (printer instanceof CanScan) {
            ((CanScan) printer).Scan();
        } else {
            System.out.println("Printer can't scan.");
        }
    }
}