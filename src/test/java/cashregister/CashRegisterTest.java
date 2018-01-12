package cashregister;

import junit.framework.Assert;
import org.junit.Test;

public class CashRegisterTest {


    @Test
    public void should_print_null_purchase() {
        //initialize CashRegister and fake Printer

        PrinterMock printer = new PrinterMock();
        CashRegister cashRegister = new CashRegister(printer);

        Item[] items = new Item[1];
        items[0] = new Item("dog", 100);
        Purchase purchase = new Purchase(items);

        cashRegister.process(purchase);

        Assert.assertEquals("dog\t100.0\n", printer.getData());
        //verify that printer was called
    }

    @Test
    public void should_print_stub_purchase() {
        //initialize CashRegister and fake Printer

        PrinterMock printer = new PrinterMock();
        CashRegister cashRegister = new CashRegister(printer);

        Purchase purchase = new PurchaseStup(null);

        cashRegister.process(purchase);

        Assert.assertEquals("dog100", printer.getData());
    }
}