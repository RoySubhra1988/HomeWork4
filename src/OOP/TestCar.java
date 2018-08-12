package OOP;

public class TestCar  {

	public static void main(String[] args) {
		
		ParentCar Audi = new Audi();
		Audi.changeGear();
		Audi.speedUp();
		Audi.applyBreaks();
	
		
		DreamCar dreamCar = new DreamCar();
		dreamCar.applyBreaks();
		dreamCar.Battery();
		dreamCar.speedUp();
		dreamCar.VoiceRecognition();
		dreamCar.changeGear();
	}

}
