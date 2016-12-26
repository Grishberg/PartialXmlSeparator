package com.grishberg.separator_core.converter;

import com.grishberg.separator_core.xml.XmlDoc;

/**
 * Created by grishberg on 26.12.16.
 */
public interface XmlRestorier {
    String restore(String input, XmlDoc doc);
}
