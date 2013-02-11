
    /**
     * VersionServiceCallbackHandler.java
     *
     * This file was auto-generated from WSDL
     * by the Apache Axis2 version: 1.1.1-RC1 Dec 22, 2006 (04:13:34 LKT)
     */
    package sample.axisversion;

    /**
     *  VersionServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class VersionServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public VersionServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public VersionServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getVersion method
            *
            */
           public void receiveResultgetVersion(
                    sample.axisversion.VersionServiceStub.GetVersionResponse param1) {
           }

          /**
           * auto generated Axis2 Error handler
           *
           */
            public void receiveErrorgetVersion(java.lang.Exception e) {
            }
                


    }
    