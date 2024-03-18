package hd;

import id.AbstractC3557B;
import io.sentry.L0;
import java.util.Map;
import jf.y;
import kotlin.jvm.internal.o;
import wf.p;

/* renamed from: hd.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3412f extends o implements p {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3412f f32250Y = new o(4);

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        int intValue = ((Number) obj).intValue();
        String str2 = (String) obj2;
        Throwable th2 = (Throwable) obj3;
        AbstractC3557B.c0("message", str2);
        AbstractC3557B.c0("<anonymous parameter 3>", (Map) obj4);
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue != 5) {
                        if (intValue != 6) {
                            str = "UNKNOWN";
                        } else {
                            str = "ERROR";
                        }
                    } else {
                        str = "WARN";
                    }
                } else {
                    str = "INFO";
                }
            } else {
                str = "DEBUG";
            }
        } else {
            str = "VERBOSE";
        }
        L0.c().u(android.gov.nist.core.a.k("[", str, "] ", str2));
        return y.f36177a;
    }
}
