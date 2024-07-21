public class Main {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter=new LegacyPrinter();
        Printer printer=new PrinterAdapter(legacyPrinter);
        clientCode(printer);

    }
    public static void clientCode(Printer printer){
        printer.print();
    }
}