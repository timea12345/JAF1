package enums;

import org.junit.Assert;
import org.junit.Test;

public class EnumsTest {

    @Test
    public void testEnum() {
        Assert.assertEquals(PrinterType.DOT_MATRIX, PrinterType.matchPrinterType("imprimanta matriciala"));
    }

    @Test(expected = PrinterType.UnknowPrinter.class)
    public void testUnknownPrinter() {
        PrinterType.matchPrinterType("imprimanta buna");
    }
}
