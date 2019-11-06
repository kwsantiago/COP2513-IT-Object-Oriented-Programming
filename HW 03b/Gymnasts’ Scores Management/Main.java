import java.util.ArrayList;
public class Main{
   public static void main(String[] args){
      ArrayList<Double> g1Skills;
      g1Skills = new ArrayList<Double>();
      g1Skills.add(9.2);
      Gymnast g1 = new Gymnast("Lauren","Hepburn",g1Skills);
      System.out.println(g1.display());
   }// end main
}// end class