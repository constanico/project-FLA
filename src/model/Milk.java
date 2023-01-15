package model;

public class Milk {
	private static int  ml = 0;
	public Milk(int milk) {
		ml += milk;
	}
	 public int getMl(){
		return ml;
	}

	public void setMl(){ //balikin jadi 0 buat coffe baru
		ml = 0;
	}
}
