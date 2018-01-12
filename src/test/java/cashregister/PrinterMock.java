package cashregister;

/**
 * Created by zhangjianming on 2018/1/12.
 */
public class PrinterMock extends Printer {
    public String data="";

    public void print(String printThis) {
        this.data += printThis;
    }

    public String getData(){
        System.out.println(data);
        return data;
    }
}
