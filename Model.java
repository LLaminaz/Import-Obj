
//package importobj;
import org.lwjgl.*;

public class Model
{
  ArrayList<Vector3f> vertex=new ArrayList();
  ArrayList<Vector3f> normal=new ArrayList();
  ArrayList<Face> faces=new ArrayList();

  public Model()
  {

  }

  public Model(ArrayList<Vector3f> vertex_par, ArrayList<Vector3f> normal_par, ArrayList<Vector3f> faces_par)
  {
    vertex=vertex_par;
    normal=normal_par;
    faces=faces_par;
  }
}
