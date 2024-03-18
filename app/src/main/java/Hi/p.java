package Hi;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Build;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f7909Y = new kotlin.jvm.internal.o(0);

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        boolean z10;
        boolean z11;
        boolean isProfileableByShell;
        Application application = AbstractC4828h.f40327i;
        if (application != null) {
            ApplicationInfo applicationInfo = application.getApplicationInfo();
            boolean z12 = false;
            if ((applicationInfo.flags & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                isProfileableByShell = applicationInfo.isProfileableByShell();
                if (isProfileableByShell) {
                    z11 = true;
                    if (!z10 || z11) {
                        z12 = true;
                    }
                    return Boolean.valueOf(z12);
                }
            }
            z11 = false;
            if (!z10) {
            }
            z12 = true;
            return Boolean.valueOf(z12);
        }
        AbstractC3557B.C2(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
        throw null;
    }
}
