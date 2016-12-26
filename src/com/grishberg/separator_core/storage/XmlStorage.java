package com.grishberg.separator_core.storage;

import com.grishberg.separator_core.xml.XmlDoc;

/**
 * Created by grishberg on 25.12.16.
 */
public interface XmlStorage {
    boolean storeModel(String name, XmlDoc doc);

    XmlDoc loadModel(String name);
}
