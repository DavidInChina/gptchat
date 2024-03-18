package Pf;

import java.util.Collection;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class r implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14123Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1161t f14124Z;

    public /* synthetic */ r(C1161t c1161t, int i10) {
        this.f14123Y = i10;
        this.f14124Z = c1161t;
    }

    public final Collection a(C4294f c4294f) {
        int i10 = this.f14123Y;
        C1161t c1161t = this.f14124Z;
        switch (i10) {
            case 0:
                if (c4294f != null) {
                    return c1161t.j(c1161t.i().a(c4294f, Tf.d.f17216k0), c4294f);
                }
                c1161t.getClass();
                C1161t.h(8);
                throw null;
            default:
                if (c4294f != null) {
                    return c1161t.j(c1161t.i().f(c4294f, Tf.d.f17216k0), c4294f);
                }
                c1161t.getClass();
                C1161t.h(4);
                throw null;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f14123Y) {
            case 0:
                return a((C4294f) obj);
            default:
                return a((C4294f) obj);
        }
    }
}
