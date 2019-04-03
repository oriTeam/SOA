#Java Webservice using Maven

##Install

#####Tomcat: https://www.digitalocean.com/community/tutorials/install-tomcat-9-ubuntu-1804 

#####Maven : ```sudo apt install maven```

#####Go to project's folder:   ```mvn clean install```   

#####Restart server: ```sudo systemctl restart tomcat```

#####Deploy to Tomcat ang go:

   http://127.0.0.1:8080/GreetingService/greeting
   
##Test by Postman

    POST /GreetingService/greeting?wsdl HTTP/1.1
    Host: 127.0.0.1:8080
    Content-Type: text/xml
    SOAPAction: ""
    Content-Length: 262
    Connection: Keep-Alive
    Accept-Encoding: gzip,deflate
    Cache-Control: no-cache
    Postman-Token: 3579a71e-7dc1-7eb2-dfa7-6e32e3eeb84b
    
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" 
                      xmlns:ws="http://web.vtnc.com/">
      <soapenv:Header/>
        <soapenv:Body>
          <ws:sayHello>
            <guestname> Văn Trọng</guestname>
          </ws:sayHello>
        </soapenv:Body>
    </soapenv:Envelope>


![alt text](https://raw.githubusercontent.com/vantrong291/SOA/master/web-service/img/test.png "Logo Title Text 1")
