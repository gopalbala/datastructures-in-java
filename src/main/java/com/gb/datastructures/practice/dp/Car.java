package com.gb.datastructures.practice.dp;

public class Car {
    boolean isSedan;
    int seats;
    int mileage;

    private String sedanString;
    private String mileageString;
    private String seaterString;

    public Car(boolean isSedan, int seats, int mileage) {
        this.isSedan = isSedan;
        this.seats = seats;
        this.mileage = mileage;
        setSedanString();
        setMileageString();
        setSeaterString();
    }

    private void setSedanString() {
        if (isSedan) {
            sedanString = " is Sedan";
        } else {
            sedanString = " is not Sedan";
        }
    }

    private void setMileageString() {
        this.mileageString = " has a mileage of around" + this.mileage + " kmpl.";
    }

    private void setSeaterString() {
        this.mileageString = " is " + this.seats + "-seater";
    }

    public boolean isSedan() {
        return isSedan;
    }

    public int getSeats() {
        return seats;
    }

    public int getMileage() {
        return this.mileage;
    }


    public void printCar(String car) {

        System.out.println("A " + car + this.sedanString + ", " + this.seaterString + ", and " + this.mileageString);
    }

//    public void printCar(String car) {
//
//        System.out.println("A " + car + this.sedanString + ", " + this.seaterString + ", and " + this.mileageString);
//    }
}


/**
 * class Car {
 * boolean isSedan;
 * int seats;
 * int mileage;
 * <p>
 * <p>
 * <p>
 * private void setSedanString() {
 * if(isSedan){
 * sedanString = " is Sedan";
 * } else {
 * sedanString = " is not Sedan";
 * }
 * }
 * <p>
 * private void setMileageString() {
 * this. mileageString = " has a mileage of around" + this.mileage +" kmpl.";
 * }
 * <p>
 * private void setSeaterString() {
 * this. mileageString = " is " + this.seats +"-seater";
 * }
 * public boolean isSedan() {
 * return isSedan;
 * }
 * <p>
 * public String getSeats() {
 * return seats;
 * }
 * <p>
 * public int getMileage() {
 * return this.mileage;
 * }
 * <p>
 * <p>
 * public void printCar(String car) {
 * System.out.println("A " + car + this.sedanString + ", " + this.seaterString + ", and " + this.mileageString);
 * }
 * }
 **/