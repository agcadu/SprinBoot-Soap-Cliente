package com.soap;

import com.soap.client.SoapClient;
import com.soap.wsdl.AddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}

	@Bean
	CommandLineRunner init(SoapClient soapClient) {
		return args -> {
			Integer numberA = 10;
			Integer numberB = 20;

			AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);

			LOGGER.info("La suma de los numeros "+ numberA +" y " + numberB + " es: " + addResponse.getAddResult());

		};
	}

}
