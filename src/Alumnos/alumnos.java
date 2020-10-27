package Alumnos;
	public class alumnos {
	    private int idAlumno;
	    private String nombre; 
	    private String sexo;
	    private int edad;
	    private Double nota;
	    private String calificacion;
	    public alumnos(int idAlumno, String nombre,String sexo,int edad,Double nota) {
	        this.idAlumno = idAlumno;   this.nombre = nombre;    this.sexo=sexo;
	        this.edad=edad; this.nota=nota;}

	    public void setNota(Double nota){this.nota=nota;}
	    public void setCalificacion(String calificacion){this.calificacion=calificacion;}
	    @Override
	    public String toString() { return "ID Alumno: "+idAlumno+" Nombre: "+nombre+" Sexo: "+sexo+" Edad: "+edad+" Nota: "+nota+"  "+calificacion+"\n";  }
	  }

