package com.example.johnniecooper.tipcalculator_counter.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator {

    private int  numberOfPeople;
    private float billAmount;
    private float tipAmount;

    public Calculator(){
        new Calculator(0, 0, 0);
    }
    public Calculator( int numberOfPeople, float billAmount, float tipAmount){

        this.numberOfPeople = numberOfPeople;
        this.billAmount = billAmount;
        this.tipAmount = tipAmount;
    }

    public String calculateTip(){

        DecimalFormat df = new DecimalFormat("###.##");
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return String.valueOf(formatter.format((billAmount * tipAmount)/numberOfPeople));
    }


    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public float getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(float tipAmount) {
        this.tipAmount = tipAmount;
    }
}
