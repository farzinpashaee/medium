package com.fp.medium.dto;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlRootElement(name = "request")
@XmlAccessorType(XmlAccessType.FIELD)
public class Request<T> {

    @XmlElement( name = "header" )
    Header header = new Header();
    @XmlAnyElement( lax = true )
    T body;

}
