package cashregister;

import junit.framework.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class CashRegisterTest {

    @Test
    public void should_print_mock_purchase() {
        //initialize CashRegister and fake Printer
        Printer printer = mock(Printer.class);
        CashRegister cashRegister = new CashRegister(printer);

        Item[] items = new Item[1];
        items[0] = new Item("dog", 100);
        Purchase purchase = new Purchase(items);

        cashRegister.process(purchase);
        verify(printer,times(1)).print(purchase.asString());
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