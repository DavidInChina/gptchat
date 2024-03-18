package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class SecurityServer extends SecurityAgree implements SecurityServerHeader, AbstractC2266v {
    public SecurityServer() {
        super("Security-Server");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }
}
