import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class VehiculosCristian implements Serializable {
    private String matriculas;
    private String modelos; 
    private String marcas; 
 

    public VehiculosCristian() {
    }
    public VehiculosCristian( String matriculas, String modelos, String marcas) {
    	this.matriculas=matriculas;
    	this.modelos=modelos;
    	this.marcas=marcas;
    }
	public String getMatriculas() {
		return matriculas;
	}
	public void setMatriculas(String matriculas) {
		this.matriculas = matriculas;
	}
	public String getModelos() {
		return modelos;
	}
	public void setModelos(String modelos) {
		this.modelos = modelos;
	}
	public String getMarcas() {
		return marcas;
	}
	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}
}

