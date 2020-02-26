package com.javalec.interfaceex;

public class ToyMain {
	public static void main(String[] args) {
		toy pooh = new PoohToyClass();
//		MoveArmleg pooh1 = new PoohToyClass();
//		PoohToyClass pooh2 = new PoohToyClass();   //데이터 타입을 여러가지 많을수 있다 => 다형성

		toy maz = new MazingerToyClass();
//		Missile maz1 = new MazingerToyClass();
//		MoveArmleg maz2 = new MazingerToyClass();
//		MazingerToyClass maz3 = new MazingerToyClass();

		toy air = new AirplaneToyClass();
//		Missile air1 = new AirplaneToyClass();
//		Light air2 = new AirplaneToyClass();
//		AirplaneToyClass air3 = new AirplaneToyClass();
		
		toy[] toys = {pooh, maz, air};
	}
}

class PoohToyClass implements MoveArmleg {

	public PoohToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("곰돌이 입니다!!!");
		canMoveArmLeg();
		System.out.println("================================");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리 움직임 가능");
	}
}

class MazingerToyClass implements Missile, MoveArmleg {
	public MazingerToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("마징가 z장남감 입니다!!");
		canMisslie();
		canMoveArmLeg();
		System.out.println("================================");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리 움직이기 가능!!!");
	}

	@Override
	public void canMisslie() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사 가능");
	}
}

class AirplaneToyClass implements Missile, Light {
	public AirplaneToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기 장남감 입니다!!!");
		canLight();
		canMisslie();
		System.out.println("================================");
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛 발사 가능 합니다!!");
	}

	@Override
	public void canMisslie() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사 가능!!!!");
	}
}

interface MoveArmleg extends toy {
	void canMoveArmLeg();
}

interface Light extends toy {
	void canLight();
}

interface Missile extends toy {
	void canMisslie();
}

interface toy { // 토이라는 객체 타입으로 묶어주는 역할을 한다.!!!

}