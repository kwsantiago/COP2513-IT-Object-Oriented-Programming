import java.util.ArrayList;
public class Main{
   public static void main(String[] args){
      ArrayList<Double> g1Skills;
      g1Skills = new ArrayList<Double>();
      g1Skills.add(9.2);
      g1Skills.add(9.3);
      g1Skills.add(9.0);
      g1Skills.add(9.9);
      g1Skills.add(9.5);
      g1Skills.add(9.5);
      g1Skills.add(9.6);
      g1Skills.add(9.8);
      Gymnast g1 = new Gymnast("Lauren","Hepburn",g1Skills);
      System.out.println(g1.display());
      
      ArrayList<Double> g2Skills;
      g2Skills = new ArrayList<Double>();
      g2Skills.add(9.2);
      g2Skills.add(9.2);
      g2Skills.add(9.0);
      g2Skills.add(9.9);
      g2Skills.add(9.5);
      g2Skills.add(9.5);
      g2Skills.add(9.7);
      g2Skills.add(9.6);
      Gymnast g2 = new Gymnast("Kerrie","Quinn",g2Skills);
      System.out.println(g2.display());
      
      ArrayList<Double> g3Skills;
      g3Skills = new ArrayList<Double>();
      g3Skills.add(9.7);
      g3Skills.add(9.1);
      g3Skills.add(9.3);
      g3Skills.add(9.4);
      g3Skills.add(9.5);
      g3Skills.add(9.4);
      g3Skills.add(9.6);
      g3Skills.add(9.2);
      Gymnast g3 = new Gymnast("Sherry","Paul",g3Skills);
      System.out.println(g3.display());
      
      ArrayList<Double> g4Skills;
      g4Skills = new ArrayList<Double>();
      g4Skills.add(9.2);
      g4Skills.add(9.0);
      g4Skills.add(9.1);
      g4Skills.add(9.5);
      g4Skills.add(9.2);
      g4Skills.add(9.3);
      g4Skills.add(9.4);
      g4Skills.add(9.6);
      Gymnast g4 = new Gymnast("Dixie","Barlow",g4Skills);
      System.out.println(g4.display());
      
      ArrayList<Double> g5Skills;
      g5Skills = new ArrayList<Double>();
      g5Skills.add(9.2);
      g5Skills.add(9.2);
      g5Skills.add(9.2);
      g5Skills.add(9.9);
      g5Skills.add(9.5);
      g5Skills.add(9.2);
      g5Skills.add(9.3);
      g5Skills.add(9.8);
      Gymnast g5 = new Gymnast("Sarah","Holt",g5Skills);
      System.out.println(g5.display());
      
      Gymnast g6 = new Gymnast();
      ArrayList<Double> g6Skills;
      g6Skills = new ArrayList<Double>();
      g6Skills.add(9.2);
      g6Skills.add(9.3);
      g6Skills.add(9.3);
      g6Skills.add(9.7);
      g6Skills.add(9.2);
      g6Skills.add(9.2);
      g6.SetScores(g6Skills);
      System.out.println(g6.display());
   }// end main
}// end class