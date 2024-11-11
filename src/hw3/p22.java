package hw3;

public class p22 {
	    public static void main(String[] args) {
	        Car car1;
	        car1 = new Car();
	        car1.setNumGas(1234, 20.5);
	        System.out.println("設定不正確的汽油量(-10.0)看看:");
	        car1.setNumGas(1234, -10.0);
	        car1.show();
	    }
	}

	// Car類別
	class Car {
	    private int num;
	    private double gas;

	    public void setNumGas(int n, double g) {
	        if (n > 0 && g >= 0 && g <= 100) {
	            num = n;
	            gas = g;
	            System.out.println("將車號設為" + num + ", 汽油量設為" + gas);
	        } else {
	            System.out.println("不正確的汽油量");
	        }
	    }

	    public void show() {
	        System.out.println("車號是" + this.num);
	        System.out.println("汽油量是" + this.gas);
	    }
	}