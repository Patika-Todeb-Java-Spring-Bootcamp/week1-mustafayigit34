# week1-mustafayigit34
week1-mustafayigit34 created by GitHub Classroom

## Ödev 1 (week1/immutable)

Java’da değişmez sınıf (immutable class) yapmak için aşağıdaki adımları uygulamanız gerekir. Bu adımlar:
-   Sınıfı, **final** anahtarı ile işaretlemek gerekir, böylece genişletilemez (extend edilemez).
-   Sınıfın tüm alanlarını  **private**  yapın, böylece doğrudan erişime izin verilmez.
-   Değişkenler için  **setter**  yöntemleri sağlamayın.
-   Tüm değiştirilebilen alanları  **final**  yapın, böylece yalnızca bir kez atanabilir.
-   Tüm alanların,  **contructor**  aracılığıyla ilk değerlerini atamasını sağla.
-   Değiştirebilir olan tüm alanların dışarıya nesnelerin klonlanarak dönmesini gerçekleştirin.

Bu koşulların sağlandığı "immutable" bir Car sınıfı oluşturulmuştur.
```
package immutable;

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
```

## Ödev 2 (week1/work1)
Maven build sistemi ile bir ana proje ve içerisinde iki farklı java projesi olacak şekilde Consumer ve Producer oluşturulmuştur.
* Consumer
	* score.txt dosyası okunacak.
	* System.out ile ekrana yazdırılacak. 
* Producer
	* Ekrana yazılan girdi okunacak ve score.txt dosyasına kaydedilecek.
	* İnput yapısı: "**Takım1 Skor1-Skor2 Takım2**" şeklinde olacaktır.

Oluşturulan Maven build sistemi aşağıdaki gibidir:

<p align="center">
  <img src="https://user-images.githubusercontent.com/65903573/175335280-41353655-eab3-43a7-aee4-bbe548f06b8b.png" />
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/65903573/175336982-8321f23b-c920-49e0-8434-0b1a86ce3af5.png" />
</p>

## Ödev 3 (week1/work2)
Ödev 2'ye ek olarak yine Maven build sistemi ve 3. bir projede "thread" ile bu işlem yapılmıştır. Bu projeye ait yapı aşağıdaki gibidir:

<p align="center">
  <img src="https://user-images.githubusercontent.com/65903573/175336632-57d951ce-044d-441c-84e8-c107efcedd64.png" />
</p>

<p align="center">
  <img src="https://user-images.githubusercontent.com/65903573/175337448-cd5fd65f-1dfc-4951-8d64-358c01438566.png" />
</p>
