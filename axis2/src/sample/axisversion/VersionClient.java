package sample.axisversion;

import java.io.FileOutputStream;
import java.io.PrintStream;


/**
* サンプルVersionServiceのクライアントです。
* 
* このクライアントを作る前の下準備
* 
* 　0) VersionWsdl2Java.bat を自作します。
* 　1) 0)により VersionServiceStub.java と VersionServiceCallbackHandler.java の自動生成を行いました。
* 　2) 1)により生成されたクラスをsample.axisversionパッケージに移動しました。
* 　4) スタブでExceptionが出るので、new javax.xml.namespace.QNameな処理をしているところを少し弄りました。
* 　　　自動生成されたservices.xmlと自動生成されたスタブとの間でパラメータ不一致がある様子。
*/
public class VersionClient {

public static void main(String[] args) {
try {

VersionServiceStub stub = new VersionServiceStub(
"http://localhost:8080/axis2/services/Version");
getVersion(stub);

} catch (Throwable e) {
e.printStackTrace();
}
}

private static void getVersion(VersionServiceStub stub) throws Throwable {
VersionServiceStub.GetVersion req = new VersionServiceStub.GetVersion();
VersionServiceStub.GetVersionResponse res = stub.getVersion(req);
System.err.println(res.getGetVersionReturn());
}
}

