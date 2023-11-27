class Printer1 implements CanPrint, CanScan {
    public void Print() {
        System.out.println("Printer prints");
    }

    public void Scan() {
        System.out.println("Printer scans");
    }
}