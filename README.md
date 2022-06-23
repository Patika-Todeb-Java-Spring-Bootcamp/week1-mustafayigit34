# week1-mustafayigit34
week1-mustafayigit34 created by GitHub Classroom

## Ödev 1

`package immutable;

import java.awt.Color;
import java.util.Date;

public final class Car {

	enum Model {
		TOYOTA, FORD;
	}

	private final Model Model;
	private final int year;
	private final int howMany;
	private final Date productionDate;
	private final int km;
	private final Color color;

	public Car(Model model, int year, int howMany, Date productionDate, int km, Color color) {
		this.Model = model;
		this.year = year;
		this.howMany = howMany;
		this.productionDate = productionDate;
		this.km = km;
		this.color = color;
	}

	public Model getModel() {
		return Model;
	}

	public int getYear() {
		return year;
	}

	public int getHowMany() {
		return howMany;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public int getKm() {
		return km;
	}

	public Color getColor() {
		return color;
	}

}
`
