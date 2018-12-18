
//package importobj;
import org.lwjgl.*;

public class ObjLoader
{
  public Model Loader(File f)
  {
    Model m=new Model();
    BufferedReader in=new BufferedReader(new FileReader("*.obj"));
    String app=new String();
    float x,y,z;
    while((app = in.readLine())!=NULL)
    {
      if(app.split(" ")[0]=="v")
      {
        x=Float.parseFloat(app.split(" ")[1]);
        y=Float.parseFloat(app.split(" ")[2]);
        z=Float.parseFloat(app.split(" ")[3]);
        m.vertex.add(new Vector3f(x,y,z));
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
        x=Float.parseFloat(app.split(" ")[1].split("/")[0]);
        y=Float.parseFloat(app.split(" ")[2].split("/")[0]);
        z=Float.parseFloat(app.split(" ")[3].split("/")[0]);
        Vector3f app1=new Vector3f(x,y,z);
        x=Float.parseFloat(app.split(" ")[1].split("/")[2]);
        y=Float.parseFloat(app.split(" ")[2].split("/")[2]);
        z=Float.parseFloat(app.split(" ")[3].split("/")[2]);
        Vector3f app2=new Vector3f(x,y,z);
        m.faces.add(new Face(app1,app2));
      }
    }

    return m;
  }
}
