package hc;

import A.C0046u0;
import W.AbstractC1522a0;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: hc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3389d extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3389d f32192Y = new kotlin.jvm.internal.o(4);

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        C3403s c3403s = (C3403s) obj;
        wf.k kVar = (wf.k) obj2;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        int intValue = ((Number) obj4).intValue();
        AbstractC3557B.c0("state", c3403s);
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(c3403s)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((Z.r) abstractC1725n).i(kVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC1522a0.d(AbstractC3392g.f32195a, a5, R4.b.X(abstractC1725n, 395332931, new C3388c(0, kVar)), R4.b.X(abstractC1725n, 33478842, new C0046u0(c3403s, 24, kVar)), null, null, null, abstractC1725n, 3462, 114);
        return jf.y.f36177a;
    }
}
