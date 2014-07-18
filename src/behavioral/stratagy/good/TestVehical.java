package behavioral.stratagy.good;

public class TestVehical {
	public static void main(String[] args) {
		StreetRacer streetRacer = new StreetRacer();
		FormulaOne formulaOne = new FormulaOne();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();

		streetRacer.go();
		formulaOne.go();
		helicopter.go();
		jet.go();
	}
}
