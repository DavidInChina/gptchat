package mh;

import id.AbstractC3557B;
import q0.C5251c;

/* renamed from: mh.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4675e extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4675e f39441Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Float f6;
        Float f10;
        C4686p c4686p = (C4686p) obj2;
        AbstractC3557B.c0("$this$Saver", (i0.d) obj);
        AbstractC3557B.c0("it", c4686p);
        C4674d g10 = c4686p.g();
        Float f11 = null;
        if (g10 != null) {
            f6 = Float.valueOf(C5251c.d(g10.f39437a));
        } else {
            f6 = null;
        }
        if (g10 != null) {
            f10 = Float.valueOf(C5251c.e(g10.f39437a));
        } else {
            f10 = null;
        }
        if (g10 != null) {
            f11 = Float.valueOf(g10.f39438b);
        }
        return new oh.K(f6, f10, f11);
    }
}
