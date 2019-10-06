package enums;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public enum PrinterType {
    DOT_MATRIX("imprimanta matriciala", 1000),
    INK_JET("imprimanta cu cerneala", 4000),
    LASER("imprimanta laser", 2000),                      //singurele instante ale clasei
    _3D("imprimanta 3D", 0);

    private final String description;
    private final Integer capacity;

    PrinterType(String description, Integer capacity) {
        this.description = description;
        this.capacity = capacity;
    }

    public String getDescription() {
//        this.ordinal();
//        this.name(); //nu poate fi suprascris
        return this.description;
    }

    public int getCapacity() {
        return capacity;
    }
    //    public PrinterType getPrinter(Scanner in) {
//      if (in.equals(getDescription())) {
//          return getPrinter(getDescription(in));
//        }
//
//    }

    /**
     * Tries to match printer type. Should be static
     * @param description
     * @return
     */

    public static PrinterType matchPrinterType (String description) {
        for (PrinterType printerType : PrinterType.values()) {
            if (description.equalsIgnoreCase(printerType.getDescription())) {
                return printerType;
            }

        }
        throw new UnknowPrinter(String.format("Nu exista!"));
    }

    public  static class UnknowPrinter extends RuntimeException {
        public UnknowPrinter(String message) {
            super(message);
        }
    }


}
