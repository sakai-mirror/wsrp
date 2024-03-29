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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

import org.apache.wsrp4j.log.LogManager;
import org.apache.wsrp4j.log.Logger;

/**
 * @author Stephan.Laertz@de.ibm.com
 *
 * Helper to serialize the parameter map of the portlet url
 **/
public class MapSerializer
{

    // for logging and exception support
    private static Logger logger = LogManager.getLogManager().getLogger(MapSerializer.class);

    public static byte[] serialize(Map parameters) throws IOException
    {

        String MN = "serialize(Map)";
        if (logger.isLogging(Logger.TRACE_HIGH))
        {
            logger.entry(Logger.TRACE_HIGH, MN, parameters);
        }

        byte[] result = null;

        if (parameters instanceof Serializable)
        {

            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bytes);
            out.writeObject(parameters);
            out.flush();
            result = bytes.toByteArray();
            out.close();

        } else
        {

            if (logger.isLogging(Logger.WARN))
            {
                logger.text(Logger.WARN, MN, "Unable to serialize parameter map.");
            }
        }

        if (logger.isLogging(Logger.TRACE_HIGH))
        {
            logger.exit(Logger.TRACE_HIGH, MN, result);
        }

        return result;
    }
}
