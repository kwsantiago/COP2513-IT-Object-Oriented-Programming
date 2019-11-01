public class MobilePhoneTest{

public static void main(String[] args) {
      BasicPhone bp1 = new BasicPhone("USD Mobile","3456789");
      bp1.setCarrier("USD Telecom");
      bp1.setTelNumber("3456780");
      BasicPhone bp2 = new BasicPhone("USD Mobile","2345678");
      SmartPhone sp1 = new SmartPhone("4567890","192.1.1.2");
      SmartPhone sp1 = new SmartPhone("4567891","192.1.1.3");
      bp1.call(123);
   }// end of main
     
   }// end class