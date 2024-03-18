package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class SecurityClient extends SecurityAgree implements SecurityClientHeader, AbstractC2266v {
    public SecurityClient() {
        super("Security-Client");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }
}
