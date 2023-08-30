package com.soap.client;

import com.soap.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SoapClient extends WebServiceGatewaySupport {

    /**
     * Suma de dos numeros
     * @param numberA
     * @param NumberB
     * @return addResponse
     */
    public AddResponse getAddResponse(int numberA, int NumberB) {
        Add add = new Add();
        add.setIntA(numberA);
        add.setIntB(NumberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");

        AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", add, soapActionCallback);

        return addResponse;
    }

    /**
     * Resta de dos numeros
     * @param numberA
     * @param NumberB
     * @return subtractResponse
     */
    public SubtractResponse getSubtractResponse(int numberA, int NumberB) {
        Subtract subtract = new Subtract();
        subtract.setIntA(numberA);
        subtract.setIntB(NumberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

        SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtract, soapActionCallback);

        return subtractResponse;
    }

    /**
     * Multiplicacion de dos numeros
     * @param numberA
     * @param NumberB
     * @return multiplyResponse
     */
    public MultiplyResponse getMultiplyResponse(int numberA, int NumberB) {
        Multiply multiply = new Multiply();
        multiply.setIntA(numberA);
        multiply.setIntB(NumberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

        MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiply, soapActionCallback);

        return multiplyResponse;

    }

    /**
     * Division de dos numeros
     * @param numberA
     * @param NumberB
     * @return divideResponse
     */
    public DivideResponse getDivideResponse(int numberA, int NumberB) {
        Divide divide = new Divide();
        divide.setIntA(numberA);
        divide.setIntB(NumberB);

        SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

        DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divide, soapActionCallback);

        return divideResponse;

    }
}
