package com.fp.medium.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@Data
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductBody {

    @XmlElement( name = "productId" )
    private Long productId;
    @XmlElement( name = "productName" )
    private String productName;
    @XmlElement( name = "price" )
    private BigDecimal price;
    @XmlElement( name = "quantity" )
    private Integer quantity;

}
