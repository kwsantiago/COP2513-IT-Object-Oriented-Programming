import java.io.*;
import java.util.*;
public class TemperaturesDataStore extends ArrayList<Double>{
   private String filename;
   private File file;
   
   TemperaturesDataStore(){
      this("default.txt");
   }// end no-arg
   
   TemperaturesDataStore(String dataStoreName){
      this.filename = dataStoreName;
      this.file = new File(dataStoreName);
   }// end constructor
   
   public String getFilename(){
   return this.filename;
   }
   
   public File getFile(){
   return this.file;
   }
   
   public void clear(){
      this.clear();
   }
   
   public void save() throws TemperaturesDataStoreException{
      if(file.exists())
         throw new TemperaturesDataStoreException(filename + " exists");
      try(PrintWriter pw = new PrintWriter(file)){
         for(Double d: this)
            pw.println(d);
      }catch(FileNotFoundException e){
         throw new TemperaturesDataStoreException("FileNotFoundException");
      }
   }// end save
   
   public void load() throws TemperaturesDataStoreException{
      if(file.exists())
         throw new TemperaturesDataStoreException(filename + " exists");
      if(!file.canRead())
         throw new TemperaturesDataStoreException(filename + " cannot read");
      try(Scanner s = new Scanner(file)){
         while(s.hasNext())
            this.add(s.nextDouble());
      }catch(FileNotFoundException e){
         throw new TemperaturesDataStoreException("FileNotFoundException");
      }
   }// end load
   
}//end class