package android.gov.nist.javax.sip.header.ims;

import c.AbstractC2266v;
import java.text.ParseException;

/* loaded from: classes.dex */
public class SecurityVerify extends SecurityAgree implements SecurityVerifyHeader, AbstractC2266v {
    public SecurityVerify() {
        super("Security-Verify");
    }

    public void setValue(String str) {
        throw new ParseException(str, 0);
    }
}
