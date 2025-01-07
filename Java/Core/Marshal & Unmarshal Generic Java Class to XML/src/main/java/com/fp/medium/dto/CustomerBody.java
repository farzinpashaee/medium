package com.fp.medium.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class CustomerBody {

    @XmlElement( name = "userId" )
    private Long userId;
    @XmlElement( name = "userName" )
    private String userName;
    @XmlElement( name = "age" )
    private Integer age;

}
