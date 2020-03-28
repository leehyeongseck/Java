package homework;

public class Machine {
	String fuel;
	int speed=0;
	
	Machine(String fuel, int speed){
		this.fuel = fuel;
		this.speed = speed;
	}
	int getSpeed() {
		return speed;
	}
	
	void speedUp(int value) {
		// ���ǵ� �������� ���� ���ǵ尡 200�� ���� ���� ��
		if((value + speed) < 200) {
			speed = speed + value;
		}
		else {
			System.out.print("speed reach the maximum...");
		}
	}
	void speedDown(int value) {
		if((speed-value) >= 0) {
			speed = speed - value;
		}
		else {
			System.out.println("speed reach the minimum...");
		}
	}
}
