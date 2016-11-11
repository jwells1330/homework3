/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.tags;

import java.io.IOException;
import java.text.NumberFormat;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Copyright: Jacob Wells & Sarah Allen
 */
public class CurrencyFormatTag extends TagSupport{
  
  private double value;
  
  public void setValue(double value){
    this.value = value;
  }
  
  @Override
  public int doStartTag() throws JspException{
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    String money = currencyFormatter.format(value);
    try {
      JspWriter out = pageContext.getOut();
      out.print(money);
    } catch (IOException e) {
      System.out.println(e);
    }
    return SKIP_BODY;
  }
  
}
