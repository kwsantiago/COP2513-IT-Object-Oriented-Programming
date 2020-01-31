public class Main{

public static void main(String[] args) {
      MobilePlan mobileplan = new MobilePlan(1000,10,1000);
      System.out.println(mobileplan.toString());
      
      mobileplan.setMinutes(500);
      mobileplan.setData(15);
      mobileplan.setSMS(800);
      System.out.println(mobileplan.toString());
      
      Streaming streaming = new Streaming(1000,5,1000,5);
      System.out.println(streaming.toString());
      streaming.setMinutes(500);
      streaming.setSMS(800);
      streaming.setData(10);
      streaming.setDataStreaming(10);
      System.out.println(streaming.toString());
      
      InternationalLongDistance ild = new InternationalLongDistance(1000,5,1000,100);
      System.out.println(ild.toString());
      ild.setMinutes(600);
      ild.setSMS(700);
      ild.setData(8);
      ild.setMinsILD(150);
      System.out.println(ild.toString());
   }// end of main
   
   }// end class