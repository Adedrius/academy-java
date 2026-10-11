package com.bptn.course._05_oop;

class Car {

    // Fill in the code for Step 3
    String color;
    String brand;
    int price;

    
      public Car() {
		this("Blue", "BMW", 750000);
	}


	  public Car(String color, String brand, int price) {
        // Fill in the code for Step 4
        this.color = color;
        this.brand = brand;
        this.price = price;
      }


      void printCarDetails() {
          this.print();
    }

    // Fill in the code
    private void print() {
        System.out.println("Car{" +
                  "color='" + color + '\'' +
                  ", brand='" + brand + '\'' +
                  ", price=" + price +
                  '}');
    }
    
    public static void main(String[] args) {
    	Car myCar = new Car("Red", "Mercedes", 150000);
    	myCar.printCarDetails();
	}
}