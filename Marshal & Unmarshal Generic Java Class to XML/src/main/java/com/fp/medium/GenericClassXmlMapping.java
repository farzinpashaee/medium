package com.fp.medium;

import com.fp.medium.dto.CustomerBody;
import com.fp.medium.dto.ProductBody;
import com.fp.medium.dto.Request;
import com.fp.medium.dto.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;


public class GenericClassXmlMapping {

    public static void main( String[] args ) {

        // Testing marshall - mapping object to XML
        marshal();
        // Testing unmarshal - mapping XML to object
        unmarshal();

    }

    public static void marshal(){
        Request<CustomerBody> customerRequest = new Request<>();
        customerRequest.getHeader().setRequestId("RIDXXXXXXXXXXX01");
        CustomerBody customerBody = new CustomerBody();
        customerBody.setAge(28);
        customerBody.setUserId(1L);
        customerBody.setUserName("John Doe");
        customerRequest.setBody(customerBody);

        Request<ProductBody> productRequest = new Request<>();
        productRequest.getHeader().setRequestId("RIDXXXXXXXXXXX01");
        ProductBody productBody = new ProductBody();
        productBody.setProductId(1L);
        productBody.setPrice(new BigDecimal("99.99"));
        productBody.setProductName("Product Name");
        productBody.setQuantity(1);
        productRequest.setBody(productBody);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Request.class, CustomerBody.class, ProductBody.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT,true);

            StringWriter customerXml = new StringWriter();
            marshaller.marshal(customerRequest, customerXml);
            System.out.println("Marshaled Customer : " + customerXml);


            StringWriter productXml = new StringWriter();
            marshaller.marshal(productRequest, productXml);
            System.out.println("Marshaled Product : " + productXml);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public static void unmarshal(){

        try {

            String customerXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><response><header><requestId>RIDXXXXXXXXXXX01</requestId></header><body><userId>1</userId><userName>John Doe</userName><age>28</age></body></response>";
            String productXml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><response><header><requestId>RIDXXXXXXXXXXX02</requestId></header><body><productId>1</productId><productName>Product Name</productName><price>119.99</price><quantity>1</quantity></body></response>";

            JAXBContext jaxbContextCustomer = JAXBContext.newInstance(Response.class, CustomerBody.class);
            Unmarshaller customerUnmarshaller = jaxbContextCustomer.createUnmarshaller();
            Response<CustomerBody> customerResponse = (Response<CustomerBody>) customerUnmarshaller.unmarshal(new StringReader(customerXml));
            System.out.println(customerResponse);

            JAXBContext jaxbContextProduct = JAXBContext.newInstance(Response.class, ProductBody.class);
            Unmarshaller productUunmarshaller = jaxbContextProduct.createUnmarshaller();
            Response<CustomerBody> productResponse = (Response<CustomerBody>) productUunmarshaller.unmarshal(new StringReader(productXml));
            System.out.println(productResponse);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
