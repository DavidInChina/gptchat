package B;

import G0.AbstractC0579h;
import H0.AbstractC0701r0;
import b0.C2104h;
import java.util.NoSuchElementException;
import l0.AbstractC4325q;
import q0.C5252d;
import wf.AbstractC6216a;

/* renamed from: B.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110b extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1269Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4325q f1270Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0110b(int i10, AbstractC4325q abstractC4325q) {
        super(0);
        this.f1269Y = i10;
        this.f1270Z = abstractC4325q;
    }

    public final Boolean a() {
        boolean z10;
        A.L0 l02;
        int i10 = this.f1269Y;
        AbstractC4325q abstractC4325q = this.f1270Z;
        switch (i10) {
            case 0:
                return (Boolean) ((AbstractC0137k) abstractC4325q).f1384x0.mo122invoke();
            default:
                A1 a12 = ((C0139k1) abstractC4325q).f1396u0;
                if (!a12.f1022a.a() && !((Boolean) a12.f1028g.getValue()).booleanValue() && ((l02 = a12.f1024c) == null || !l02.c())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        C5252d B02;
        int i10 = this.f1269Y;
        AbstractC4325q abstractC4325q = this.f1270Z;
        switch (i10) {
            case 1:
                S s10 = (S) abstractC4325q;
                K k10 = s10.f1170w0;
                while (k10.f1120a.l()) {
                    C2104h c2104h = k10.f1120a;
                    if (!c2104h.k()) {
                        C5252d c5252d = (C5252d) ((O) c2104h.f25567Y[c2104h.f25569h0 - 1]).f1142a.mo122invoke();
                        if (c5252d == null || s10.C0(s10.f1163B0, c5252d)) {
                            ((O) c2104h.n(c2104h.f25569h0 - 1)).f1143b.resumeWith(jf.y.f36177a);
                        } else {
                            if (s10.f1162A0 && (B02 = s10.B0()) != null && s10.C0(s10.f1163B0, B02)) {
                                s10.f1162A0 = false;
                            }
                            s10.f1165D0.f1281e = S.A0(s10);
                            return;
                        }
                    } else {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                }
                if (s10.f1162A0) {
                    s10.f1162A0 = false;
                }
                s10.f1165D0.f1281e = S.A0(s10);
                return;
            default:
                AbstractC0579h.p((C0165t1) abstractC4325q, AbstractC0701r0.f7002e);
                return;
        }
    }
}
