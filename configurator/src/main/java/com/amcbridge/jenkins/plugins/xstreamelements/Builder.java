package com.amcbridge.jenkins.plugins.xstreamelements;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.io.Serializable;

@XStreamAlias("builder")
public class Builder implements Serializable{

    @XStreamAsAttribute
    private String key, value;

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
