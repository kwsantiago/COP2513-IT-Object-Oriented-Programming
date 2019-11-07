public class Main{
  public static void main(String[] args){
    // Begin set1
    ArrayList<String> set1Names;
    set1Names = new ArrayList<String>;
    set1Names.add("Bob Scott");
    set1Names.add("Maria Robinson");
    set1Names.add("John Stones");
    set1Names.add("Angela Johnson");
    
    ArrayList<Integer> set1Ages;
    set1Ages = new ArrayList<Integer>;
    set1Ages.add(10);
    set1Ages.add(11);
    set1Ages.add(9);
    set1Ages.add(13);
    
    ArrayList<String> set1FavClasses;
    set1FavClasses = new ArrayList<String>;
    set1FavClasses.add("Math");
    set1FavClasses.add("Science");
    set1FavClasses.add("Reading");
    set1FavClasses.add("Writing");
    
    StudentSet set1 = new StudentSet(set1Names,set1Ages,set1FavClasses);
    System.out.println(set1.toString);
    System.out.println(set1.info_of_oldest);
    set1.remove_oldest();
    set1.addStudent("Emily",12,"Math");
    System.out.println(set1.toString);
    
    // Begin set2
    ArrayList<String> set2Names;
    set2Names = new ArrayList<String>;
    set2Names.add("Bill Miller");
    set2Names.add("James Williams");
    set2Names.add("Michael Smith");
    set2Names.add("Sarah Wood");
    set2Names.add("Olivia Abraham");
    set2Names.add("Emma Wilson");
    
    ArrayList<Integer> set2Ages;
    set2Ages = new ArrayList<Integer>;
    set2Ages.add(14);
    set2Ages.add(11);
    set2Ages.add(10);
    set2Ages.add(12);
    set2Ages.add(13);
    set2Ages.add(10);
    
    ArrayList<String> set2FavClasses;
    set2FavClasses = new ArrayList<String>;
    set2FavClasses.add("Geography");
    set2FavClasses.add("Math");
    set2FavClasses.add("Writing");
    set2FavClasses.add("Science");
    set2FavClasses.add("Social Studies");
    set2FavClasses.add("Reading");
    
    StudentSet set2 = new StudentSet(set2Names,set2Ages,set2FavClasses);
    System.out.println(set2.toString);
    System.out.println(set2.info_of_youngest);
    set2.remove_youngest();
    set2.addStudent("Andy Jones",15,"Science");
    System.out.println(set2.toString);
  }// end main
}// end class
