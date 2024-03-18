package pg;

import Bg.A;
import Mf.AbstractC1000i;
import Mf.B;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: pg.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5165b extends AbstractC5170g {

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f43140b;

    public C5165b(wf.k kVar, List list) {
        super(list);
        this.f43140b = kVar;
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC1000i k10;
        AbstractC3557B.c0("module", b10);
        A a5 = (A) this.f43140b.invoke(b10);
        if (!Jf.l.y(a5) && (((k10 = a5.y0().k()) == null || Jf.l.r(k10) == null) && !Jf.l.B(a5, Jf.p.f9160V.i()) && !Jf.l.B(a5, Jf.p.f9161W.i()) && !Jf.l.B(a5, Jf.p.f9162X.i()))) {
            Jf.l.B(a5, Jf.p.f9163Y.i());
        }
        return a5;
    }
}
