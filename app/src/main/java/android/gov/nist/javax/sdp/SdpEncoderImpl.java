package android.gov.nist.javax.sdp;

import a.AbstractC1890j;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class SdpEncoderImpl {
    public void output(AbstractC1890j abstractC1890j, OutputStream outputStream) {
        if (outputStream instanceof ObjectOutputStream) {
            ObjectOutputStream objectOutputStream = (ObjectOutputStream) outputStream;
            if (abstractC1890j != null) {
                objectOutputStream.writeObject(abstractC1890j);
                return;
            }
            throw new IOException("The parameter is null");
        }
        throw new IOException("The output stream has to be an instance of ObjectOutputStream");
    }

    public void setEncoding(String str) {
        throw new UnsupportedEncodingException("Method not supported");
    }

    public void setRtpmapAttribute(boolean z10) {
    }

    public void setTypedTime(boolean z10) {
    }
}
