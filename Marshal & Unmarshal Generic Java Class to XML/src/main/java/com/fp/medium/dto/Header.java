package com.fp.medium.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "header")
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

    @XmlElement( name = "requestId" )
    private String requestId;
    @XmlElement( name = "status" )
    private String status;


}
