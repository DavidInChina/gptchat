package mh;

import id.AbstractC3557B;
import q0.C5251c;
import q0.C5254f;

/* renamed from: mh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4676f extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4676f f39442Y = new kotlin.jvm.internal.o(1);

    @Override // wf.k
    public final Object invoke(Object obj) {
        C4674d c4674d;
        oh.K k10 = (oh.K) obj;
        AbstractC3557B.c0("it", k10);
        Float f6 = k10.f41394Y;
        if (f6 != null) {
            float floatValue = f6.floatValue();
            Float f10 = k10.f41395Z;
            if (f10 != null) {
                long r10 = R4.b.r(floatValue, f10.floatValue());
                Float f11 = k10.f41396h0;
                if (f11 != null) {
                    c4674d = new C4674d(r10, f11.floatValue(), C5251c.f43619b, C5254f.f43637b);
                    return new C4686p(c4674d, false, false, 6);
                }
            }
        }
        c4674d = null;
        return new C4686p(c4674d, false, false, 6);
    }
}
