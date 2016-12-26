package com.grishberg.separator_core.xml;

import java.util.List;

/**
 * Created by grishberg on 25.12.16.
 */
public class XmlDoc {
    private String name;
    private List<XmlElement> elements;

    public XmlDoc(String name) {
        this.name = name;
    }

    public List<XmlElement> getElements() {
        return elements;
    }

    public void setElements(List<XmlElement> elements) {
        this.elements = elements;
    }
}
