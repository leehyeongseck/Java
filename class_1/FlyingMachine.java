package homework;



public class FlyingMachine extends Machine {

	FlyingMachine(String f, int s) {
		super(f, s);
		// TODO Auto-generated constructor stub
	}
	void speedUp(int value) {
		if((value + speed) < 1000) {
			speed = speed + value;
		}
		else {
			System.out.print("speed reach the maximum..");
		}
	}
	void speedDown(int value) {
		if((speed - value) >= 0) {
			speed = speed - value;
		}
		else {
			System.out.println("speed reach the minimum...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FlyingMachine fm = new FlyingMachine("Gasoline", 0);
			Machine mm = new Machine("Diesel", 0);
			
			for(int i=0; i<3; i++) {
				System.out.print("flyingMachine "+(i+1) + "번 째 호출 ");
				fm.speedUp(500);
				System.out.println();
			}
			for(int i=0; i<3; i++) {
				System.out.print("machine "+(i+1) + "번 째 호출 ");
				mm.speedUp(70);
				System.out.println();
			}
			
	}

}
