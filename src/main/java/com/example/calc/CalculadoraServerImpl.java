package com.example.calc;

import javax.jws.WebService;

// SIB (Service Implementation Bean)
// Connecting this SIB do SEI
@WebService(endpointInterface = "com.example.calc.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer{

	public float soma(float num1, float num2) {
	    return num1 + num2;
	  }

	  public float subtracao(float num1, float num2) {
	    return num1 - num2;
	  }

	  public float multiplicacao(float num1, float num2) {
	    return num1 * num2;
	  }

	  public float divisao(float num1, float num2) {
	    return num1 / num2;
	  }
}
