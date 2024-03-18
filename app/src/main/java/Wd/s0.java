package wd;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s0 extends q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i10, Throwable th2) {
        super(th2);
        if (i10 != 1) {
            if (i10 != 2) {
                AbstractC3557B.c0(ParameterNames.CAUSE, th2);
                return;
            }
            AbstractC3557B.c0(ParameterNames.CAUSE, th2);
            super(th2);
            return;
        }
        AbstractC3557B.c0(ParameterNames.CAUSE, th2);
        super(th2);
    }
}
