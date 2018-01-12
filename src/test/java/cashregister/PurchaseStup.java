package cashregister;

/**
 * Created by zhangjianming on 2018/1/12.
 */
public class PurchaseStup extends Purchase{

    public PurchaseStup(Item[] items) {
        super(items);
    }

    @Override
    public String asString() {
        return "dog100";
    }
}
