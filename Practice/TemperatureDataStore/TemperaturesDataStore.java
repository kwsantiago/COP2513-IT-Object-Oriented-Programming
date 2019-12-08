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
      return filename;
   }
   
   public File getFile(){
      return file;
   }
   
   public void clear(){
      this.clear();
   }
   
   public void save() throws TemperaturesDataStoreException{
      if(file.exists())
         throw new TemperaturesDataStoreException(file + " exists");
      try(PrintWriter pw = new PrintWriter(file)){
         if(!file.canWrite())
            throw new TemperaturesDataStoreException(file + " cannot write");
         for(Double d: this)
            pw.println(d);
      }catch(FileNotFoundException e){
         throw new TemperaturesDataStoreException("FileNotFoundException");
      }
   }// end save
   
   public void load() throws TemperaturesDataStoreException{
      if(file.exists())
         throw new TemperaturesDataStoreException(file + " exists");
      if(!file.canRead())
         throw new TemperaturesDataStoreException(file + " cannot read");
      try(Scanner s = new Scanner(file)){
         while(s.hasNext())
            this.add(s.nextDouble());
      }catch(FileNotFoundException e){
         throw new TemperaturesDataStoreException("FileNotFoundException");
      }
   }// end load
}// end class