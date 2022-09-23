package POO;


public class ProgramaInformativo 
{
    private String nombre;
    private String estelar;
    private String canal;
    private int horario;

    public ProgramaInformativo()
    {
        this.nombre = "";
        this.estelar = "";
        this.canal = "";
        this.horario = 0;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getEstelar() 
    {
        return estelar;
    }

    public void setEstelar(String estelar) 
    {
        this.estelar = estelar;
    }

    public String getCanal() 
    {
        return canal;
    }

    public void setCanal(String canal) 
    {
        this.canal = canal;
    }

    public int getHorario() 
    {
        return horario;
    }

    public void setHorario(int horario) 
    {
        this.horario = horario;
    }
    
    
      
}
