package com.javalec.car;

public class CarMain {
	public static void main(String[] args) {
		StarCar LowGrade = new LowGrade(CarSpecs.COLOR_BLUE, CarSpecs.HANDLE_NORMAL, CarSpecs.DISPLACEMENT_2000, CarSpecs.HANDLE_NORMAL);
		StarCar HighGrade = new HighGrade(CarSpecs.COLOR_RED, CarSpecs.HANDLE_POWER, CarSpecs.DISPLACEMENT_2200, CarSpecs.HANDLE_POWER);
		
		LowGrade.getSpec();
		HighGrade.getSpec();
	}
}



class CarSpecs {
	public static final String COLOR_RED = "레드";
	public static final String COLOR_BLUE = "블루";
	
	public static final String TIRE_NORMAL = "일반 타이어";
	public static final String TIRE_WILD = "광폭 타이어";
	
	public static final int DISPLACEMENT_2000 = 2000;
	public static final int DISPLACEMENT_2200 = 2200;
	
	public static final String HANDLE_NORMAL = "일반핸들";
	public static final String HANDLE_POWER = "파워핸들";
}




abstract class StarCar {
	
	public String color;
	public String tire;
	public int displacement;
	public String handle;
	
	public StarCar(String color, String tire,int displacement, String handle) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}
	
	public abstract void getSpec();
}




class LowGrade extends StarCar{
	
	private int tax = 1000;

	public LowGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}

	@Override
	public void getSpec() {
		System.out.println("************************");
		System.out.println("색상 : " + color);
		System.out.println("타이어 " + tire);
		System.out.println("배기량 " + displacement);
		System.out.println("핸들 : " + handle);
		
		if(displacement > 2000) tax = 1500;
		System.out.println("세금 :" + tax);
		System.out.println("************************");
	}
	
}




class HighGrade extends StarCar{
	
	private int tax = 1000;

	public HighGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
	}

	@Override
	public void getSpec() {
		System.out.println("************************");
		System.out.println("색상 : " + color);
		System.out.println("타이어 " + tire);
		System.out.println("배기량 " + displacement);
		System.out.println("핸들 : " + handle);
		
		if(displacement > 2000) tax = 1500;
		System.out.println("세금 :" + tax);
		System.out.println("************************");
	}
	
}