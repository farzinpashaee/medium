package com.fp.medium.dto;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response<T> {

    @XmlElement( name = "header" )
    Header header = new Header();
    @XmlAnyElement( lax = true )
    T body;

}
