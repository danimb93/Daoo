package Daoo;

/**
 * Created by Dani on 15/03/2017.
 */
public class Office extends Dao{

    private int id;
    private String nombre, direccion;

    public Office(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getDireccion(){
        return direccion;

    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
