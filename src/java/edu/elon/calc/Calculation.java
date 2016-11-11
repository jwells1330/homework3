package edu.elon.calc;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 * Copyright: Jasmine Jones & Jacob Wells
 *
 * @author Jacob_Wells
 */
public class Calculation implements Serializable {

  private double investment;
  private double interest;
  private double years;
  private double finalAmount;
  private String[] valuesList;

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
    this.valuesList = new String[(int)(years)];
    finalAmount = 0;
  }

  public void doInterestCalculation() {
    for(int i = 0; i<years; i++){
      double value = investment * (Math.pow((1 + (.01 * interest)), i+1));
      NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
      valuesList[i] = currencyFormatter.format(value);
    }
    finalAmount = investment * (Math.pow((1 + (.01 * interest)), years));
    
  }

  public String getInvestment() {
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    return currencyFormatter.format(investment);
  }

  public double getInterest() {
    return interest;
  }

  public int getYears() {
    return (int) (years);
  }

  public String getFinalAmount() {
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    return currencyFormatter.format(finalAmount);
  }
  public String[] getValuesList(){
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
  
  public void setValuesList(String[] valuesList){
    this.valuesList = valuesList;
  }
}
