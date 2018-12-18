
//package importobj;
import org.lwjgl.*;
import java.util.*;

/*
Cos'è una face?
è un oggetto che collega i vertici con i normal per poter di fatto creare i triangoli.
Inoltre ha anche la possibilità di collegarci la texture ma che in questo caso non ci interessa.

Cos'è un Vector3f?
è di fatto la rappresentazione in java di un vettore 3-dimensionale.
in particolare in questo caso ci riferiamo a un vettore 3-dimensionale di float.
*/

public class Face
{
  Vector3f vertex=new Vector3f(); //vertice
  Vector3f normal=new Vector3f(); //normal

  //metodo costruttore semplice
  public Face(Vector3f vertex_par,Vector3f normal_par)
  {
    vertex=vertex_par;
    normal=normal_par;
  }
}
