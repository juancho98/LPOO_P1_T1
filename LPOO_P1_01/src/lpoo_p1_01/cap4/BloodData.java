package lpoo_p1_01.cap4;

public class BloodData {
    private String san;
    private String rh;

    
    BloodData() {
        san = "O";
	rh = "+";
    }
	
    BloodData(String tipoSan, String factRH) {
        this.san = tipoSan;
	this.rh = factRH;
    }
	
    public String getTipoSan() {
        return san;
    }
	
    public void setTipoSan(String tipo) {
        this.san = tipo;
    }
	
    public String getRh() {
	return this.rh;
    }
	
    public void setRh(String factor) {
	this.rh = factor;
    }
}
