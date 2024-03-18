package a0;

import Z.AbstractC1707e;
import Z.AbstractC1734s;
import Z.C1742w;
import Z.Q0;

/* loaded from: classes2.dex */
public final class y extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final y f23842c = new AbstractC1901G(0, 0, 3);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        if (q02.f22555m == 0) {
            q02.z();
            q02.f22560r = 0;
            q02.f22561s = q02.m() - q02.f22549g;
            q02.f22550h = 0;
            q02.f22551i = 0;
            q02.f22556n = 0;
            return;
        }
        AbstractC1734s.j("Cannot reset when inserting".toString());
        throw null;
    }
}
