package Alumnos;
public class alumnos {
    private int idAlumnos;
    private String nombre; 
    private String direccion;
    private int Rut;
    private Double nota;
    private String calificacion;
    public alumnos(int idAlumnos, String nombre,String direccion,int Rut,int rut, Double nota) {
        this.idAlumnos = idAlumnos;   this.nombre = nombre;    this.direccion=direccion;
        this.Rut=rut; this.nota=nota;}

    public void setNota(Double nota){this.nota=nota;}
    public void setCalificacion(String calificacion){this.calificacion=calificacion;}
    @Override
    public String toString() { return "ID Alumno: "+idAlumnos+" Nombre: "+nombre+" Direccion: "+direccion+" Rut: "+Rut+" Nota: "+nota+"  "+calificacion+"\n";  }
  }