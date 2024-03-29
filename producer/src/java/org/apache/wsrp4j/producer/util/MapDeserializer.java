/*
 * Copyright 2000-2001,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* 

 */


package org.apache.wsrp4j.producer.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

import org.apache.wsrp4j.log.LogManager;
import org.apache.wsrp4j.log.Logger;

/**
 *
 * @author Stephan.Laertz@de.ibm.com
 *
 * Helper to deserialize the parameter map of the portlet url
 **/
public class MapDeserializer
{

    //     for logging and exception support
    private static Logger logger = LogManager.getLogManager().getLogger(MapDeserializer.class);

    public static Map deserialize(byte[] map) throws IOException, ClassNotFoundException
    {

        String MN = "deserialize(String)";
        if (logger.isLogging(Logger.TRACE_HIGH))
        {
            logger.entry(Logger.TRACE_HIGH, MN, map);
        }

        Map result = null;

        ByteArrayInputStream bytes = new ByteArrayInputStream(map);
        ObjectInputStream in = new ObjectInputStream(bytes);
        Object obj = in.readObject();
        in.close();

        if (obj instanceof Map)
        {

            result = (Map)obj;

        } else
        {

            logger.text(Logger.ERROR, MN, "Deserialized object is not a map.", obj);
        }

        if (logger.isLogging(Logger.TRACE_HIGH))
        {
            logger.exit(Logger.TRACE_HIGH, MN, result);
        }

        return result;
    }
}
