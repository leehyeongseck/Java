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
		// 스피드 증가값과 본래 스피드가 200이 넘지 않을 때
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
