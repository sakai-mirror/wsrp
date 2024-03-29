/**
 * WSRP_v1_PortletManagement_Binding_SOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package oasis.names.tc.wsrp.v1.bind;

public class WSRP_v1_PortletManagement_Binding_SOAPStub extends org.apache.axis.client.Stub implements oasis.names.tc.wsrp.v1.intf.WSRP_v1_PortletManagement_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortletDescription");
        oper.addParameter(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "getPortletDescription"), new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getPortletDescription"), oasis.names.tc.wsrp.v1.types.GetPortletDescription.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletDescriptionResponse"));
        oper.setReturnClass(oasis.names.tc.wsrp.v1.types.PortletDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "getPortletDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategory"),
                      "oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategoryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParameters"),
                      "oasis.names.tc.wsrp.v1.types.InconsistentParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistration"),
                      "oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailed"),
                      "oasis.names.tc.wsrp.v1.types.OperationFailedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParameters"),
                      "oasis.names.tc.wsrp.v1.types.MissingParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDenied"),
                      "oasis.names.tc.wsrp.v1.types.AccessDeniedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDeniedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandle"),
                      "oasis.names.tc.wsrp.v1.types.InvalidHandleFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandleFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clonePortlet");
        oper.addParameter(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "clonePortlet"), new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">clonePortlet"), oasis.names.tc.wsrp.v1.types.ClonePortlet.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletContext"));
        oper.setReturnClass(oasis.names.tc.wsrp.v1.types.PortletContext.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "clonePortletResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategory"),
                      "oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategoryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParameters"),
                      "oasis.names.tc.wsrp.v1.types.InconsistentParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistration"),
                      "oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailed"),
                      "oasis.names.tc.wsrp.v1.types.OperationFailedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParameters"),
                      "oasis.names.tc.wsrp.v1.types.MissingParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDenied"),
                      "oasis.names.tc.wsrp.v1.types.AccessDeniedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDeniedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandle"),
                      "oasis.names.tc.wsrp.v1.types.InvalidHandleFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandleFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("destroyPortlets");
        oper.addParameter(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "destroyPortlets"), new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">destroyPortlets"), oasis.names.tc.wsrp.v1.types.DestroyPortlets.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "DestroyPortletsResponse"));
        oper.setReturnClass(oasis.names.tc.wsrp.v1.types.DestroyPortletsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "destroyPortletsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParameters"),
                      "oasis.names.tc.wsrp.v1.types.InconsistentParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistration"),
                      "oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailed"),
                      "oasis.names.tc.wsrp.v1.types.OperationFailedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParameters"),
                      "oasis.names.tc.wsrp.v1.types.MissingParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPortletProperties");
        oper.addParameter(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "setPortletProperties"), new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">setPortletProperties"), oasis.names.tc.wsrp.v1.types.SetPortletProperties.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletContext"));
        oper.setReturnClass(oasis.names.tc.wsrp.v1.types.PortletContext.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "setPortletPropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategory"),
                      "oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategoryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParameters"),
                      "oasis.names.tc.wsrp.v1.types.InconsistentParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistration"),
                      "oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailed"),
                      "oasis.names.tc.wsrp.v1.types.OperationFailedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParameters"),
                      "oasis.names.tc.wsrp.v1.types.MissingParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDenied"),
                      "oasis.names.tc.wsrp.v1.types.AccessDeniedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDeniedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandle"),
                      "oasis.names.tc.wsrp.v1.types.InvalidHandleFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandleFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortletProperties");
        oper.addParameter(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "getPortletProperties"), new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getPortletProperties"), oasis.names.tc.wsrp.v1.types.GetPortletProperties.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PropertyList"));
        oper.setReturnClass(oasis.names.tc.wsrp.v1.types.PropertyList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "getPortletPropertiesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategory"),
                      "oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategoryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParameters"),
                      "oasis.names.tc.wsrp.v1.types.InconsistentParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistration"),
                      "oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailed"),
                      "oasis.names.tc.wsrp.v1.types.OperationFailedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParameters"),
                      "oasis.names.tc.wsrp.v1.types.MissingParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDenied"),
                      "oasis.names.tc.wsrp.v1.types.AccessDeniedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDeniedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandle"),
                      "oasis.names.tc.wsrp.v1.types.InvalidHandleFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandleFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPortletPropertyDescription");
        oper.addParameter(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "getPortletPropertyDescription"), new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getPortletPropertyDescription"), oasis.names.tc.wsrp.v1.types.GetPortletPropertyDescription.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletPropertyDescriptionResponse"));
        oper.setReturnClass(oasis.names.tc.wsrp.v1.types.PortletPropertyDescriptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "getPortletPropertyDescriptionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategory"),
                      "oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategoryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParameters"),
                      "oasis.names.tc.wsrp.v1.types.InconsistentParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistration"),
                      "oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailed"),
                      "oasis.names.tc.wsrp.v1.types.OperationFailedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParameters"),
                      "oasis.names.tc.wsrp.v1.types.MissingParametersFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDenied"),
                      "oasis.names.tc.wsrp.v1.types.AccessDeniedFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDeniedFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandle"),
                      "oasis.names.tc.wsrp.v1.types.InvalidHandleFault",
                      new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandleFault"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public WSRP_v1_PortletManagement_Binding_SOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WSRP_v1_PortletManagement_Binding_SOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WSRP_v1_PortletManagement_Binding_SOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ServiceDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ServiceDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Extension");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Extension.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UploadContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UploadContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MissingParametersFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.MissingParametersFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ItemDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ItemDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MarkupResponse");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.MarkupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "DestroyPortletsResponse");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.DestroyPortletsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "RegistrationData");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.RegistrationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidUserCategoryFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UnsupportedWindowStateFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UnsupportedWindowStateFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "RegistrationState");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.RegistrationState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ResourceList");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ResourceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "CacheControl");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.CacheControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ModelDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ModelDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Contact");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "BlockingInteractionResponse");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.BlockingInteractionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ReturnAny");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ReturnAny.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "AccessDeniedFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.AccessDeniedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletPropertyDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PortletPropertyDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getServiceDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.GetServiceDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidSessionFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InvalidSessionFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ModelTypes");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ModelTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UnsupportedLocaleFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UnsupportedLocaleFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Fault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Fault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MarkupParams");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.MarkupParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PropertyDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PropertyDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">releaseSessions");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ReleaseSessions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "NamedStringArray");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.NamedStringArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getPortletPropertyDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.GetPortletPropertyDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InconsistentParametersFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InconsistentParametersFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "EmployerInfo");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.EmployerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "TelephoneNum");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.TelephoneNum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UserProfile");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UpdateResponse");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Postal");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Postal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Resource");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Resource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PersonName");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PersonName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Handle");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UserContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UserContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getPortletProperties");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.GetPortletProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "LocalizedString");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.LocalizedString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ClientData");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ClientData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Templates");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Templates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "RuntimeContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.RuntimeContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MarkupContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.MarkupContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidCookieFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InvalidCookieFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "CookieProtocol");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.CookieProtocol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UnsupportedModeFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UnsupportedModeFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PortletContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PortletDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "DestroyFailed");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.DestroyFailed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">modifyRegistration");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ModifyRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InteractionParams");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InteractionParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ResourceValue");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ResourceValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Property");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Property.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getMarkup");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.GetMarkup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "NamedString");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.NamedString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "SessionContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.SessionContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">clonePortlet");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ClonePortlet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidHandleFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InvalidHandleFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "StateChange");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.StateChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Telecom");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Telecom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">setPortletProperties");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.SetPortletProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "InvalidRegistrationFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">destroyPortlets");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.DestroyPortlets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "StringArray");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.StringArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Online");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.Online.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">getPortletDescription");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.GetPortletDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "UnsupportedMimeTypeFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.UnsupportedMimeTypeFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">initCookie");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.InitCookie.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "Key");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "OperationFailedFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.OperationFailedFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", ">performBlockingInteraction");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PerformBlockingInteraction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "MarkupType");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.MarkupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletStateChangeRequiredFault");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PortletStateChangeRequiredFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PortletDescriptionResponse");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PortletDescriptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "PropertyList");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.PropertyList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "RegistrationContext");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.RegistrationContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:wsrp:v1:types", "ResetProperty");
            cachedSerQNames.add(qName);
            cls = oasis.names.tc.wsrp.v1.types.ResetProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call =
                    (org.apache.axis.client.Call) super.service.createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public oasis.names.tc.wsrp.v1.types.PortletDescriptionResponse getPortletDescription(oasis.names.tc.wsrp.v1.types.GetPortletDescription getPortletDescription) throws java.rmi.RemoteException, oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault, oasis.names.tc.wsrp.v1.types.InconsistentParametersFault, oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault, oasis.names.tc.wsrp.v1.types.OperationFailedFault, oasis.names.tc.wsrp.v1.types.MissingParametersFault, oasis.names.tc.wsrp.v1.types.AccessDeniedFault, oasis.names.tc.wsrp.v1.types.InvalidHandleFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:oasis:names:tc:wsrp:v1:getPortletDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPortletDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPortletDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (oasis.names.tc.wsrp.v1.types.PortletDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (oasis.names.tc.wsrp.v1.types.PortletDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, oasis.names.tc.wsrp.v1.types.PortletDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.OperationFailedFault) {
              throw (oasis.names.tc.wsrp.v1.types.OperationFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.MissingParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.MissingParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.AccessDeniedFault) {
              throw (oasis.names.tc.wsrp.v1.types.AccessDeniedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidHandleFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidHandleFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public oasis.names.tc.wsrp.v1.types.PortletContext clonePortlet(oasis.names.tc.wsrp.v1.types.ClonePortlet clonePortlet) throws java.rmi.RemoteException, oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault, oasis.names.tc.wsrp.v1.types.InconsistentParametersFault, oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault, oasis.names.tc.wsrp.v1.types.OperationFailedFault, oasis.names.tc.wsrp.v1.types.MissingParametersFault, oasis.names.tc.wsrp.v1.types.AccessDeniedFault, oasis.names.tc.wsrp.v1.types.InvalidHandleFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:oasis:names:tc:wsrp:v1:clonePortlet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "clonePortlet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clonePortlet});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (oasis.names.tc.wsrp.v1.types.PortletContext) _resp;
            } catch (java.lang.Exception _exception) {
                return (oasis.names.tc.wsrp.v1.types.PortletContext) org.apache.axis.utils.JavaUtils.convert(_resp, oasis.names.tc.wsrp.v1.types.PortletContext.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.OperationFailedFault) {
              throw (oasis.names.tc.wsrp.v1.types.OperationFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.MissingParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.MissingParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.AccessDeniedFault) {
              throw (oasis.names.tc.wsrp.v1.types.AccessDeniedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidHandleFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidHandleFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public oasis.names.tc.wsrp.v1.types.DestroyPortletsResponse destroyPortlets(oasis.names.tc.wsrp.v1.types.DestroyPortlets destroyPortlets) throws java.rmi.RemoteException, oasis.names.tc.wsrp.v1.types.InconsistentParametersFault, oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault, oasis.names.tc.wsrp.v1.types.OperationFailedFault, oasis.names.tc.wsrp.v1.types.MissingParametersFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:oasis:names:tc:wsrp:v1:destroyPortlets");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "destroyPortlets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {destroyPortlets});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (oasis.names.tc.wsrp.v1.types.DestroyPortletsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (oasis.names.tc.wsrp.v1.types.DestroyPortletsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, oasis.names.tc.wsrp.v1.types.DestroyPortletsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.OperationFailedFault) {
              throw (oasis.names.tc.wsrp.v1.types.OperationFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.MissingParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.MissingParametersFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public oasis.names.tc.wsrp.v1.types.PortletContext setPortletProperties(oasis.names.tc.wsrp.v1.types.SetPortletProperties setPortletProperties) throws java.rmi.RemoteException, oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault, oasis.names.tc.wsrp.v1.types.InconsistentParametersFault, oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault, oasis.names.tc.wsrp.v1.types.OperationFailedFault, oasis.names.tc.wsrp.v1.types.MissingParametersFault, oasis.names.tc.wsrp.v1.types.AccessDeniedFault, oasis.names.tc.wsrp.v1.types.InvalidHandleFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:oasis:names:tc:wsrp:v1:setPortletProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setPortletProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {setPortletProperties});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (oasis.names.tc.wsrp.v1.types.PortletContext) _resp;
            } catch (java.lang.Exception _exception) {
                return (oasis.names.tc.wsrp.v1.types.PortletContext) org.apache.axis.utils.JavaUtils.convert(_resp, oasis.names.tc.wsrp.v1.types.PortletContext.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.OperationFailedFault) {
              throw (oasis.names.tc.wsrp.v1.types.OperationFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.MissingParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.MissingParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.AccessDeniedFault) {
              throw (oasis.names.tc.wsrp.v1.types.AccessDeniedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidHandleFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidHandleFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public oasis.names.tc.wsrp.v1.types.PropertyList getPortletProperties(oasis.names.tc.wsrp.v1.types.GetPortletProperties getPortletProperties) throws java.rmi.RemoteException, oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault, oasis.names.tc.wsrp.v1.types.InconsistentParametersFault, oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault, oasis.names.tc.wsrp.v1.types.OperationFailedFault, oasis.names.tc.wsrp.v1.types.MissingParametersFault, oasis.names.tc.wsrp.v1.types.AccessDeniedFault, oasis.names.tc.wsrp.v1.types.InvalidHandleFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:oasis:names:tc:wsrp:v1:getPortletProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPortletProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPortletProperties});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (oasis.names.tc.wsrp.v1.types.PropertyList) _resp;
            } catch (java.lang.Exception _exception) {
                return (oasis.names.tc.wsrp.v1.types.PropertyList) org.apache.axis.utils.JavaUtils.convert(_resp, oasis.names.tc.wsrp.v1.types.PropertyList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.OperationFailedFault) {
              throw (oasis.names.tc.wsrp.v1.types.OperationFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.MissingParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.MissingParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.AccessDeniedFault) {
              throw (oasis.names.tc.wsrp.v1.types.AccessDeniedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidHandleFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidHandleFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public oasis.names.tc.wsrp.v1.types.PortletPropertyDescriptionResponse getPortletPropertyDescription(oasis.names.tc.wsrp.v1.types.GetPortletPropertyDescription getPortletPropertyDescription) throws java.rmi.RemoteException, oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault, oasis.names.tc.wsrp.v1.types.InconsistentParametersFault, oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault, oasis.names.tc.wsrp.v1.types.OperationFailedFault, oasis.names.tc.wsrp.v1.types.MissingParametersFault, oasis.names.tc.wsrp.v1.types.AccessDeniedFault, oasis.names.tc.wsrp.v1.types.InvalidHandleFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:oasis:names:tc:wsrp:v1:getPortletPropertyDescription");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getPortletPropertyDescription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getPortletPropertyDescription});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (oasis.names.tc.wsrp.v1.types.PortletPropertyDescriptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (oasis.names.tc.wsrp.v1.types.PortletPropertyDescriptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, oasis.names.tc.wsrp.v1.types.PortletPropertyDescriptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidUserCategoryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.InconsistentParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidRegistrationFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.OperationFailedFault) {
              throw (oasis.names.tc.wsrp.v1.types.OperationFailedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.MissingParametersFault) {
              throw (oasis.names.tc.wsrp.v1.types.MissingParametersFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.AccessDeniedFault) {
              throw (oasis.names.tc.wsrp.v1.types.AccessDeniedFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof oasis.names.tc.wsrp.v1.types.InvalidHandleFault) {
              throw (oasis.names.tc.wsrp.v1.types.InvalidHandleFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
