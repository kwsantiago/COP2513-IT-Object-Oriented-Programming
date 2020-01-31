public class MobilePhoneTest{

public static void main(String[] args) {
      BasicPhone bp1 = new BasicPhone("USF Mobile","3456789");
      bp1.setCarrier("USF Telecom");
      bp1.setTelNumber("3456780");
      BasicPhone bp2 = new BasicPhone("USF Mobile","2345678");
      SmartPhone sp1 = new SmartPhone("4567890","192.1.1.2");
      SmartPhone sp2 = new SmartPhone("4567891","192.1.1.3");
      bp1.call("123",3,10);
      bp1.call("356789",4,20);
      bp1.call("678901",5,15);
      bp1.call("678901",10,30);
      System.out.println(bp1.toString());
      bp2.call("913",30,15);
      bp2.call("556789",6,12);
      bp2.call("678901",5,15);
      bp2.call("234567",12,30);
      bp2.call("789012",8,33);
      System.out.println(bp2.toString());
      sp1.call("113",3,10);
      sp1.call("234567",8,15);
      sp1.call("345678",4,45);
      sp1.data(1.2);
      sp1.data(2.15);
      System.out.println(sp1.toString());
      sp2.call("118",2,16);
      sp2.call("234567",10,25);
      sp2.call("345678",7,33);
      sp2.call("456782",9,42);
      sp2.call("564738",9,45);
      sp2.data(1);
      sp2.data(1.25);
      sp2.data(4.7);
      System.out.println(sp2.toString());
   }// end of main
     
   }// end class