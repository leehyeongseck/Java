## Machine을 상속받고 함수 오버로딩하는 문제   
=================================

#### 사용 프로그램   
  * eclipse
  * jdk 11.0.5   

#### **사용 클래스(하나의 패키지에 포함)**   
1. FlyingMachine(with main)   
2. Machine   

#### **문제 내용**   
1. 아래 주어진 Machine 클래스를 상속받은 FlyingMachine 클래스를 정의하시오.   
2. FlyingMachine 클래스에서는 speedUp() 메소드에 최대 speed가 1000이 되도록 오버로딩 하시오.   
3. main에서 FlyingMachine 객체, Machine 객체를 통해 speedUp(스피드값) 을 여러번 호출하여   
  정상적으로 실행되는지 확인하시오.   

#### <객체 선언 방식>
#### FlyingMachine fm = new FlyingMachine("Gasoline", 0);   
#### Machine mm = new Machine("Diesel", 0);   
 

## Machine 클래스   
<pre>
<code>
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
</code>
</pre>

## **오버로딩 대상(in Machine class)**   
<pre>
<code>
void speedUp(int value) {
	if((value + speed) < 200) {
		speed = speed + value;
	}
	else {
		System.out.print("speed reach the maximum...");
	}
}
</code>
</pre>

## **오버로딩 이후(in FlyingMachine class)**   
<pre>
<code>
void speedUp(int value) {
	if((value + speed) < 1000) { // 최대 값만 바꿔주면 된다.
		speed = speed + value;
	}
	else {
		System.out.print("speed reach the maximum...");
	}
}
</code>
</pre>

## FlyingMachine 클래스   
<pre>
<code>

public class FlyingMachine extends Machine { // extends 키워드로 Machine 클래스를 상속받는다.

	FlyingMachine(String f, int s) { // FlyingMachine 생성자 호출 시 Machine 생성자도 호출된다.
		super(f, s); // FlyingMachine 생성자 호출 시 super 클래스에 인자 전달
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

</code>
</pre>

#### * 결과
#### flyingMachine 1번 째 호출   
#### flyingMachine 2번 째 호출 speed reach the maximum..   
#### flyingMachine 3번 째 호출 speed reach the maximum..   
#### machine 1번 째 호출   
#### machine 2번 째 호출   
#### machine 3번 째 호출 speed reach the maximum..