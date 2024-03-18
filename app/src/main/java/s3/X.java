package s3;

import id.AbstractC3557B;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class X {

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f45278b = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f45279a = new LinkedHashMap();

    public final void a(W w10) {
        AbstractC3557B.c0("navigator", w10);
        String y10 = B2.u.y(w10.getClass());
        if (y10.length() > 0) {
            LinkedHashMap linkedHashMap = this.f45279a;
            W w11 = (W) linkedHashMap.get(y10);
            if (!AbstractC3557B.K(w11, w10)) {
                boolean z10 = false;
                if (w11 != null && w11.f45277b) {
                    z10 = true;
                }
                if (!z10) {
                    if (!w10.f45277b) {
                        W w12 = (W) linkedHashMap.put(y10, w10);
                        return;
                    }
                    throw new IllegalStateException(("Navigator " + w10 + " is already attached to another NavController").toString());
                }
                throw new IllegalStateException(("Navigator " + w10 + " is replacing an already attached " + w11).toString());
            }
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final W b(String str) {
        AbstractC3557B.c0("name", str);
        if (str.length() > 0) {
            W w10 = (W) this.f45279a.get(str);
            if (w10 != null) {
                return w10;
            }
            throw new IllegalStateException(android.gov.nist.core.a.A("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
