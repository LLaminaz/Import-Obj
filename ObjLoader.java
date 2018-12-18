
//package importobj;
import org.lwjgl.*; //la libreria che ci permette di usare l'oggetto Vector3f

public class ObjLoader
{
  public Model Loader(File f)
  {
    Model m=new Model();
    BufferedReader in=new BufferedReader(new FileReader("*.obj")); //instanzio un buffered reader su un qualunque file .obj presente nella cartella
    String app=new String(); //Stringa che useremo per gestire l'input del buffered reader
    float x,y,z;
    while((app = in.readLine())!=NULL)
    {
      if(app.split(" ")[0]=="v")  //una volta letta la stringa la divido in base agli spazi creando di fatto un array di stringhe in cui vado a controllare la prima
      {
        x=Float.parseFloat(app.split(" ")[1]); //sempre la stringa divisa in spazi, questa volta mi serve il secondo elemento dell'array, in particolare sotto forma di float quindi faccio un casting.
        y=Float.parseFloat(app.split(" ")[2]);
        z=Float.parseFloat(app.split(" ")[3]);
        m.vertex.add(new Vector3f(x,y,z)); //aggiungo all'arraylist dei vertici del modello l'elemento letto dal file
      }
      else if(app.split(" ")[0]=="vn")
      {
        x=Float.parseFloat(app.split(" ")[1]);
        y=Float.parseFloat(app.split(" ")[2]);
        z=Float.parseFloat(app.split(" ")[3]);
        m.normal.add(new Vector3f(x,y,z));
      }
      else if(app.split(" ")[0]=="f")
      {
        x=Float.parseFloat(app.split(" ")[1].split("/")[0]); //in questo caso la stringa divisa in base allo spazio la devo dividere anche base allo / poichè nel file è scritto come v/vt/vn
        y=Float.parseFloat(app.split(" ")[2].split("/")[0]);
        z=Float.parseFloat(app.split(" ")[3].split("/")[0]);
        Vector3f app1=new Vector3f(x,y,z);
        x=Float.parseFloat(app.split(" ")[1].split("/")[2]);
        y=Float.parseFloat(app.split(" ")[2].split("/")[2]);
        z=Float.parseFloat(app.split(" ")[3].split("/")[2]);
        Vector3f app2=new Vector3f(x,y,z);
        m.faces.add(new Face(app1,app2));
      }
      in.flush(); //vado a ripulire il buffer di lettura ogni volta che devo leggere nuovamente
    }
    in.close(); //forzo la chiusura del buffered reader
    return m;
  }
}
