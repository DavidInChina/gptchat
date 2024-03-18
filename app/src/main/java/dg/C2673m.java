package dg;

import Mf.V;
import id.AbstractC3557B;
import java.util.List;
import kg.C4290b;
import kg.C4294f;
import pg.AbstractC5170g;
import pg.C5171h;
import pg.C5173j;

/* renamed from: dg.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2673m extends AbstractC2666f {

    /* renamed from: c  reason: collision with root package name */
    public final Mf.B f28341c;

    /* renamed from: d  reason: collision with root package name */
    public final U3.i f28342d;

    /* renamed from: e  reason: collision with root package name */
    public final U3.c f28343e;

    /* renamed from: f  reason: collision with root package name */
    public jg.g f28344f = jg.g.f36187g;

    public C2673m(Pf.G g10, U3.i iVar, Ag.q qVar, Rf.d dVar) {
        super(qVar, dVar);
        this.f28341c = g10;
        this.f28342d = iVar;
        this.f28343e = new U3.c(g10, iVar);
    }

    public static final AbstractC5170g t(C2673m c2673m, C4294f c4294f, Object obj) {
        AbstractC5170g b10 = C5171h.f43145a.b(obj, c2673m.f28341c);
        if (b10 == null) {
            String str = "Unsupported annotation argument: " + c4294f;
            AbstractC3557B.c0("message", str);
            return new C5173j(str);
        }
        return b10;
    }

    @Override // dg.AbstractC2666f
    public final C2672l p(C4290b c4290b, V v10, List list) {
        AbstractC3557B.c0("result", list);
        return new C2672l(this, R4.b.v0(this.f28341c, c4290b, this.f28342d), c4290b, list, v10);
    }
}
