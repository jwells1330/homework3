package edu.elon.calc;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 * Copyright: Jasmine Jones & Jacob Wells & Sarah Allen
 */
public class Calculation implements Serializable {

  private double investment;
  private double interest;
  private double years;
  private double finalAmount;
  private double[] valuesList;

  public Calculation() {
    investment = 0;
    interest = 0;
    years = 0;
    finalAmount = 0;
  }

  public Calculation(double investment, double interest, double years) {
    this.investment = investment;
    this.interest = interest;
    this.years = years;
    this.valuesList = new double[(int)(years)];
    finalAmount = 0;
  }

  public void doInterestCalculation() {
    for(int i = 0; i<years; i++){
        valuesList[i] = investment * (Math.pow((1 + (.01 * interest)), i+1));
    }
    finalAmount = investment * (Math.pow((1 + (.01 * interest)), years));
    
  }

  public double getInvestment() {

      return investment;
  }

  public double getInterest() {
    return interest;
  }

  public int getYears() {
    return (int) (years);
  }

  public double getFinalAmount() {
  return finalAmount;
  }
  public double [] getValuesList(){
    return valuesList;
  }
  
  public void setInvestment(double investment) {
    this.investment = investment;
  }

  public void setInterest(double interest) {
    this.interest = interest;
  }

  public void setYears(double years) {
    this.years = years;
  }

  public void setFinalAmount(double finalAmount) {
    this.finalAmount = finalAmount;
  }
  
  public void setValuesList(double[] valuesList){
    this.valuesList = valuesList;
  }
}
