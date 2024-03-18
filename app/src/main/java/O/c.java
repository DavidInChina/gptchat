package O;

import Z.AbstractC1725n;
import Z.AbstractC1748z;
import Z.C1724m0;
import Z.m1;
import Z.r;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final m1 f13242a = new AbstractC1748z(b.f13237Z);

    public static final long a(long j6, AbstractC1725n abstractC1725n) {
        long j10;
        r rVar = (r) abstractC1725n;
        a aVar = (a) rVar.m(f13242a);
        boolean c10 = r0.r.c(j6, ((r0.r) aVar.f13224a.getValue()).f44265a);
        C1724m0 c1724m0 = aVar.f13231h;
        if (c10) {
            j10 = ((r0.r) c1724m0.getValue()).f44265a;
        } else if (r0.r.c(j6, ((r0.r) aVar.f13225b.getValue()).f44265a)) {
            j10 = ((r0.r) c1724m0.getValue()).f44265a;
        } else {
            boolean c11 = r0.r.c(j6, ((r0.r) aVar.f13226c.getValue()).f44265a);
            C1724m0 c1724m02 = aVar.f13232i;
            if (c11) {
                j10 = ((r0.r) c1724m02.getValue()).f44265a;
            } else if (r0.r.c(j6, ((r0.r) aVar.f13227d.getValue()).f44265a)) {
                j10 = ((r0.r) c1724m02.getValue()).f44265a;
            } else if (r0.r.c(j6, ((r0.r) aVar.f13228e.getValue()).f44265a)) {
                j10 = ((r0.r) aVar.f13233j.getValue()).f44265a;
            } else if (r0.r.c(j6, ((r0.r) aVar.f13229f.getValue()).f44265a)) {
                j10 = ((r0.r) aVar.f13234k.getValue()).f44265a;
            } else if (r0.r.c(j6, ((r0.r) aVar.f13230g.getValue()).f44265a)) {
                j10 = ((r0.r) aVar.f13235l.getValue()).f44265a;
            } else {
                j10 = r0.r.f44263k;
            }
        }
        if (j10 == r0.r.f44263k) {
            return ((r0.r) rVar.m(d.f13243a)).f44265a;
        }
        return j10;
    }
}
