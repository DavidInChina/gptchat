package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ClientTransactionExt;
import android.gov.nist.javax.sip.SipStackImpl;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface NioTlsChannelInterface {
    void addPlaintextBytes(byte[] bArr);

    ClientTransactionExt getEncapsulatedClientTransaction();

    SipStackImpl getSIPStack();

    ByteBuffer prepareAppDataBuffer();

    ByteBuffer prepareAppDataBuffer(int i10);

    ByteBuffer prepareEncryptedDataBuffer();

    void sendEncryptedData(byte[] bArr);
}
