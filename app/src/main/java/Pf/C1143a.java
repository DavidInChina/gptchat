package Pf;

import Bg.C0213f;
import Bg.m0;
import java.util.List;
import ug.C5927i;
import wf.AbstractC6216a;

/* renamed from: Pf.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1143a implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14074Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1144b f14075Z;

    public /* synthetic */ C1143a(AbstractC1144b abstractC1144b, int i10) {
        this.f14074Y = i10;
        this.f14075Z = abstractC1144b;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f14074Y;
        AbstractC1144b abstractC1144b = this.f14075Z;
        switch (i10) {
            case 0:
                ug.n n02 = abstractC1144b.n0();
                Jf.i iVar = new Jf.i(1, this);
                Dg.j jVar = m0.f2138a;
                if (Dg.m.f(abstractC1144b)) {
                    return Dg.m.c(Dg.l.f3696p0, abstractC1144b.toString());
                }
                Bg.Y f6 = abstractC1144b.f();
                if (f6 != null) {
                    if (n02 != null) {
                        List e10 = m0.e(f6.getParameters());
                        Bg.Q.f2084Z.getClass();
                        return C0213f.o(Bg.Q.f2085h0, f6, e10, false, n02, iVar);
                    }
                    m0.a(13);
                    throw null;
                }
                m0.a(12);
                throw null;
            case 1:
                return new C5927i(abstractC1144b.n0());
            default:
                return new C1166y(abstractC1144b);
        }
    }
}
