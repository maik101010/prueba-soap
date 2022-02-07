package com.prueba.prueba.ws;

import javax.xml.bind.annotation.*;

/**
 * Created by michael.garcia on 6/02/2022
 */
@XmlRootElement(name = "employedResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "names",
})
public class EmployedResponse {
    @XmlElement(required = true)
    protected String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

}
