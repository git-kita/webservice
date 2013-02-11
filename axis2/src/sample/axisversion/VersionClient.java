package sample.axisversion;

import java.io.FileOutputStream;
import java.io.PrintStream;


/**
* �T���v��VersionService�̃N���C�A���g�ł��B
* 
* ���̃N���C�A���g�����O�̉�����
* テストプッシュ
* �@0) VersionWsdl2Java.bat �����삵�܂��B
* �@1) 0)�ɂ�� VersionServiceStub.java �� VersionServiceCallbackHandler.java �̎����������s���܂����B
* �@2) 1)�ɂ�萶�����ꂽ�N���X��sample.axisversion�p�b�P�[�W�Ɉړ����܂����B
* �@4) �X�^�u��Exception���o��̂ŁAnew javax.xml.namespace.QName�ȏ��������Ă���Ƃ���������M��܂����B
* �@�@�@�����������ꂽservices.xml�Ǝ����������ꂽ�X�^�u�Ƃ̊ԂŃp�����[�^�s��v������l�q�B
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

