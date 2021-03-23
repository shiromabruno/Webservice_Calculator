package com.example.calc;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalculadoraClient {
	
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:9876/shiromacalc?wsdl");
		
		//namespace, localpart where 
		//namespace name is an anyURI (endpoint resource)
		//local part is an NCName (name of the implemented server class + service)
		QName qname = new QName("http://shiromacalc/","CalculadoraServerImplService");
		
		//Creates a Service instance
		Service ws = Service.create(url, qname);
		
		// Interface class CalculadoraServer obj. The getPort method returns a proxy
		CalculadoraServer calc = ws.getPort(CalculadoraServer.class);
		
		//call using object CalculadoraServer
		System.out.println("Soma (5+1): " + calc.soma(5,1));
	    System.out.println("Subtracao (5-1): " + calc.subtracao(5,1));
	    System.out.println("Multiplicacao (5*1): " + calc.multiplicacao(5,1));
	    System.out.println("Divisao (5/1): " + calc.divisao(5,1));
	}

}
