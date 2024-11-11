package hw3;

public class p6 {
    public static void main(String[] args) {
        Car car1; // 宣告一個Car類型的物件car1
        car1 = new Car(); // 使用new關鍵字建立一個Car類型的物件，並將其引用賦值給car1

        car1.num = 1234; // 為car1物件的num屬性賦值
        car1.gas = 20.5; // 為car1物件的gas屬性賦值

        System.out.println("車號是" + car1.num); // 印出車號
        System.out.println("汽油量是" + car1.gas); // 印出汽油量
    }
}

// Car類別
class Car {
    int num; // 儲存車號的整數型變數
    double gas; // 儲存汽油量的雙精度型變數
}