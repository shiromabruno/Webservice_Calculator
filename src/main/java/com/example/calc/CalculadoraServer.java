package com.example.calc;

// POM --> <groupId>javax.jws</groupId> and <artifactId>javax.jws-api</artifactId> Vers 1.1
// Json Web Signature
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;

// SEI (Service Endpoint Interface)
// 2 ways to translate WSDL binding to a SOAP body: Document or RPC.
@WebService
@SOAPBinding
//@SOAPBinding(style = Style.RPC)
public interface CalculadoraServer {
	
	  @WebMethod float soma(float num1, float num2);
	  @WebMethod float subtracao(float num1, float num2);
	  @WebMethod float multiplicacao(float num1, float num2);
	  @WebMethod float divisao(float num1, float num2);

}
