package POO;


public class ProgramaInformativo 
{
    private String estelar;
    private String canal;
    private String horario;
    private String comentarios;

    public ProgramaInformativo() 
    {
        
        this.estelar = "";
        this.canal = "";
        this.horario = "";
        this.comentarios = "";
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

    public String getHorario()
    {
        return horario;
    }

    public void setHorario(String horario)
    {
        this.horario = horario;
    }

    public String getComentarios() 
    {
        return comentarios;
    }

    public void setComentarios(String comentarios) 
    {
        this.comentarios = comentarios;
    }  
      
}
