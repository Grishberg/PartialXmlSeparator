package com.grishberg.separator_core.xml;

import java.util.List;

/**
 * Created by grishberg on 25.12.16.
 */
public class XmlElement {
    private List<XmlField> fields;
    private List<XmlElement> children;
    private final String id;

    public XmlElement(String id) {
        this.id = id;
    }

    public List<XmlField> getFields() {
        return fields;
    }

    public String getId() {
        return id;
    }

    public void setFields(List<XmlField> fields) {
        this.fields = fields;
    }

    public void setChildren(List<XmlElement> children) {
        this.children = children;
    }
}
