
package lpoo_p1_01.cap4;

public class Sandwich {
    private Bread bread;
    private SandwichFilling filling;
	
    public Sandwich(String breadType, Double breadSliceCalories, String fillingType, Double fillingCalories) {
	bread = new Bread(breadType, breadSliceCalories);
	filling = new SandwichFilling(fillingType, fillingCalories);
    }
    public String getSFillingType() {	
        return filling.getFillingType();
    }
    public Double getSCalor() {
	return filling.getCalories();
    }
    public String getSBreadType() {
	return bread.getBread();
    }
    public Double getCalXRe() {
        return bread.getCals();
    }
    public Double totalCal() {
	return filling.getCalories()+bread.getCals()*2;
    }
}
