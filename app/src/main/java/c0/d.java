package C0;

import Z0.p;
import kf.q;
import nf.AbstractC4828h;
import q0.C5251c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f2493a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final c f2494b = new c();

    /* renamed from: c  reason: collision with root package name */
    public long f2495c = C5251c.f43619b;

    /* renamed from: d  reason: collision with root package name */
    public long f2496d;

    public final void a(long j6, long j10) {
        this.f2493a.a(C5251c.d(j10), j6);
        this.f2494b.a(C5251c.e(j10), j6);
    }

    public final long b(long j6) {
        if (p.b(j6) > 0.0f && p.c(j6) > 0.0f) {
            return AbstractC4828h.l(this.f2493a.b(p.b(j6)), this.f2494b.b(p.c(j6)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) p.f(j6))).toString());
    }

    public final void c() {
        c cVar = this.f2493a;
        q.d3(0, r1.length, null, cVar.f2488d);
        cVar.f2489e = 0;
        c cVar2 = this.f2494b;
        q.d3(0, r3.length, null, cVar2.f2488d);
        cVar2.f2489e = 0;
        this.f2496d = 0L;
    }
}
