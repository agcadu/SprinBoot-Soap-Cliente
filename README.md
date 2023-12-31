![Encabezado del Proyecto](./header.png)
## SpringBootSoap - Cliente SOAP para Calculadora

Bienvenido a SpringBootSoap, una aplicación Java 17 basada en Spring Boot que actúa como un cliente SOAP para consumir un servicio de calculadora SOAP. Este cliente se conecta al servicio SOAP proporcionado por [http://www.dneonline.com/calculator.asmx](http://www.dneonline.com/calculator.asmx) para realizar operaciones de suma, resta, multiplicación y división.

### Configuración

Para comenzar a utilizar la aplicación SpringBootSoap, sigue los siguientes pasos:

1. **Clonar el repositorio:**
   Clona este repositorio desde GitHub utilizando el siguiente comando:

   ```bash
   git clone https://github.com/agcadu/SprinBoot-Soap-Cliente.git
   ```

2. **Ejecutar la aplicación en Docker:**
   Asegúrate de tener Docker instalado en tu máquina. Luego, navega al directorio raíz del repositorio clonado y ejecuta el siguiente comando para levantar la aplicación en un contenedor Docker:

   ```bash
   docker compose up
   ```

   La aplicación se ejecutará en el puerto 8080.

### Uso

Una vez que la aplicación esté en funcionamiento, puedes utilizar Postman para interactuar con los endpoints del cliente SOAP. En el archivo `AplicationSoapClient.postman_collection.json`, encontrarás una colección de solicitudes Postman que puedes importar y usar para probar las operaciones de la calculadora.

#### Endpoints

La aplicación ofrece los siguientes endpoints:

1. **Suma:**
   Realiza una suma de dos números.

   Endpoint: `POST http://localhost:8080/api/add`

2. **Resta:**
   Realiza una resta entre dos números.

   Endpoint: `POST http://localhost:8080/api/subtract`

3. **Multiplicación:**
   Realiza una multiplicación entre dos números.

   Endpoint: `POST http://localhost:8080/api/multiply`

4. **División:**
   Realiza una división entre dos números.

   Endpoint: `POST http://localhost:8080/api/divide`



### Recursos Adicionales

- Documentación del servicio SOAP: [WSDL](http://www.dneonline.com/calculator.asmx?WSDL)
- Paquete de clases generadas por el servicio SOAP: `com.soap.wsdl`

¡Disfruta utilizando SpringBootSoap para consumir el servicio de calculadora SOAP de manera sencilla! 

---

