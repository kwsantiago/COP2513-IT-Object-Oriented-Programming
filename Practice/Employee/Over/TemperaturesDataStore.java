import java.io.*;
import java.util.*;
public class TemperaturesDataStore extends ArrayList<Double>{
   private String filename;
   private File file;
   
   TemperaturesDataStore(){
      this("default.txt");
   }// end no arg
   
   TemperaturesDataStore(String filename){
      this.filename = filename;
      this.file = new File(filename);
   }// end constructor
   
   public void clear(){
      this.clear();
   }// end clear
   
   public void save() throws TemperaturesDataStoreException{
      if(file.exists())
         throw new TemperaturesDataStoreException(filename + " exists");
      try(PrintWriter pw = new PrintWriter(file)){
         if(!file.canWrite())
            throw new TemperaturesDataStoreException(filename + " exists");
         for(Double d: this)
            pw.println(d);
      }catch(FileNotFoundException e){
         throw new TemperaturesDataStoreException("temp");
      }
   }// end save
   
   public void load() throws TemperaturesDataStoreException{
      if(!file.exists())
         throw new TemperaturesDataStoreException(filename + " does not exist");
      if(!file.canRead())
         throw new TemperaturesDataStoreException(filename + " does not exist");
      try(Scanner s = new Scanner(file)){
         while(s.hasNext())
            this.add(s.nextDouble());
      }catch(FileNotFoundException e){
         throw new TemperaturesDataStoreException("temp");
      }
   }// end load
   
}// end class

   class TemperaturesDataStoreException extends Exception{
   TemperaturesDataStoreException(String msg){
      super(msg);
   }
   
}// end class