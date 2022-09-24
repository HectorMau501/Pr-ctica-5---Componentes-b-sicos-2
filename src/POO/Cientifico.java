package POO;


public class Cientifico extends ProgramaInformativo
{
    private String tipo;
    private String interes;
    

    public Cientifico() {

        this.tipo = "";
        this.interes = "";

    }


    

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public String getInteres() 
    {
        return interes;
    }

    public void setInteres(String interes) 
    {
        this.interes = interes;
    }

    
  
}
