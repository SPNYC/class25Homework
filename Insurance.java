package class25.Homework;

import java.util.ArrayList;

/*
Create a class Insurance that will have an attribute as insuranceName and
unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Insurance {

        protected String insuranceName;

        public Insurance(String insuranceName) {
            this.insuranceName = insuranceName;
        }

        public double getQuote() {

            return 0.0;
        }

        public void cancelInsurance() {

        }
    }

    class Car extends Insurance {
        private String carModel;

        public Car(String insuranceName, String carModel) {
            super(insuranceName);
            this.carModel = carModel;
        }

        public double getQuote() {

            return 1000.0;
        }

        public void cancelInsurance() {

            System.out.println("Car Insurance canceled for " + insuranceName);
        }

        public String getCarModel() {
            return carModel;
        }
    }

    class Pet extends Insurance {
        private String petType;

        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }

        public double getQuote() {

            return 500.0;
        }

        public void cancelInsurance() {

            System.out.println("Pet Insurance canceled for " + insuranceName);
        }

        public String getPetType() {
            return petType;
        }
    }

    class Health extends Insurance {
        public Health(String insuranceName) {
            super(insuranceName);
        }

        public double getQuote() {

            return 1500.0;
        }

        public void cancelInsurance() {

            System.out.println("Health Insurance canceled for " + insuranceName);
        }
    }

     class InsuranceTester {
        public static void main(String[] args) {
            ArrayList<Insurance> insuranceList = new ArrayList<>();


            Car car1 = new Car("Car Insurance 1", "Tesla Model S");
            Car car2 = new Car("Car Insurance 2", "BMW X5");
            Car car3 = new Car("Car Insurance 3", "Toyota Camry");


            Pet pet1 = new Pet("Pet Insurance 1", "Dog");
            Pet pet2 = new Pet("Pet Insurance 2", "Cat");
            Pet pet3 = new Pet("Pet Insurance 3", "Bird");


            Health health1 = new Health("Health Insurance 1");
            Health health2 = new Health("Health Insurance 2");
            Health health3 = new Health("Health Insurance 3");


            insuranceList.add(car1);
            insuranceList.add(car2);
            insuranceList.add(car3);
            insuranceList.add(pet1);
            insuranceList.add(pet2);
            insuranceList.add(pet3);
            insuranceList.add(health1);
            insuranceList.add(health2);
            insuranceList.add(health3);


            for (Insurance insurance : insuranceList) {
                System.out.println("Insurance Name: " + insurance.insuranceName);
                System.out.println("Quote: " + insurance.getQuote());
                insurance.cancelInsurance();
                System.out.println();

            }
        }
    }