/**
 * RegistrationState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package oasis.names.tc.wsrp.v1.types;

public class RegistrationState  implements java.io.Serializable {
    private byte[] registrationState;
    private oasis.names.tc.wsrp.v1.types.Extension[] extensions;

    public RegistrationState() {
    }

    public RegistrationState(
           oasis.names.tc.wsrp.v1.types.Extension[] extensions,
           byte[] registrationState) {
           this.registrationState = registrationState;
           this.extensions = extensions;
    }


    /**
     * Gets the registrationState value for this RegistrationState.
     * 
     * @return registrationState
     */
    public byte[] getRegistrationState() {
        return registrationState;
    }


    /**
     * Sets the registrationState value for this RegistrationState.
     * 
     * @param registrationState
     */
    public void setRegistrationState(byte[] registrationState) {
        this.registrationState = registrationState;
    }


    /**
     * Gets the extensions value for this RegistrationState.
     * 
     * @return extensions
     */
    public oasis.names.tc.wsrp.v1.types.Extension[] getExtensions() {
        return extensions;
    }


    /**
     * Sets the extensions value for this RegistrationState.
     * 
     * @param extensions
     */
    public void setExtensions(oasis.names.tc.wsrp.v1.types.Extension[] extensions) {
        this.extensions = extensions;
    }

    public oasis.names.tc.wsrp.v1.types.Extension getExtensions(int i) {
        return this.extensions[i];
    }

    public void setExtensions(int i, oasis.names.tc.wsrp.v1.types.Extension _value) {
        this.extensions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegistrationState)) return false;
        RegistrationState other = (RegistrationState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registrationState==null && other.getRegistrationState()==null) || 
             (this.registrationState!=null &&
              java.util.Arrays.equals(this.registrationState, other.getRegistrationState()))) &&
            ((this.extensions==null && other.getExtensions()==null) || 
             (this.extensions!=null &&
              java.util.Arrays.equals(this.extensions, other.getExtensions())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRegistrationState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegistrationState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegistrationState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegistrationState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "RegistrationState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "registrationState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Extension"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
