package O;

import A.AbstractC0044t0;
import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import r0.r;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C1724m0 f13224a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f13225b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f13226c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f13227d;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f13228e;

    /* renamed from: f  reason: collision with root package name */
    public final C1724m0 f13229f;

    /* renamed from: g  reason: collision with root package name */
    public final C1724m0 f13230g;

    /* renamed from: h  reason: collision with root package name */
    public final C1724m0 f13231h;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f13232i;

    /* renamed from: j  reason: collision with root package name */
    public final C1724m0 f13233j;

    /* renamed from: k  reason: collision with root package name */
    public final C1724m0 f13234k;

    /* renamed from: l  reason: collision with root package name */
    public final C1724m0 f13235l;

    /* renamed from: m  reason: collision with root package name */
    public final C1724m0 f13236m;

    public a(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        r rVar = new r(j6);
        o1 o1Var = o1.f22665a;
        this.f13224a = AbstractC4828h.Z(rVar, o1Var);
        this.f13225b = AbstractC4828h.Z(new r(j10), o1Var);
        this.f13226c = AbstractC4828h.Z(new r(j11), o1Var);
        this.f13227d = AbstractC4828h.Z(new r(j12), o1Var);
        this.f13228e = AbstractC4828h.Z(new r(j13), o1Var);
        this.f13229f = AbstractC4828h.Z(new r(j14), o1Var);
        this.f13230g = AbstractC4828h.Z(new r(j15), o1Var);
        this.f13231h = AbstractC4828h.Z(new r(j16), o1Var);
        this.f13232i = AbstractC4828h.Z(new r(j17), o1Var);
        this.f13233j = AbstractC4828h.Z(new r(j18), o1Var);
        this.f13234k = AbstractC4828h.Z(new r(j19), o1Var);
        this.f13235l = AbstractC4828h.Z(new r(j20), o1Var);
        this.f13236m = AbstractC4828h.Z(Boolean.TRUE, o1Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Colors(primary=");
        AbstractC0044t0.B(((r) this.f13224a.getValue()).f44265a, sb2, ", primaryVariant=");
        AbstractC0044t0.B(((r) this.f13225b.getValue()).f44265a, sb2, ", secondary=");
        AbstractC0044t0.B(((r) this.f13226c.getValue()).f44265a, sb2, ", secondaryVariant=");
        AbstractC0044t0.B(((r) this.f13227d.getValue()).f44265a, sb2, ", background=");
        AbstractC0044t0.B(((r) this.f13228e.getValue()).f44265a, sb2, ", surface=");
        AbstractC0044t0.B(((r) this.f13229f.getValue()).f44265a, sb2, ", error=");
        AbstractC0044t0.B(((r) this.f13230g.getValue()).f44265a, sb2, ", onPrimary=");
        AbstractC0044t0.B(((r) this.f13231h.getValue()).f44265a, sb2, ", onSecondary=");
        AbstractC0044t0.B(((r) this.f13232i.getValue()).f44265a, sb2, ", onBackground=");
        AbstractC0044t0.B(((r) this.f13233j.getValue()).f44265a, sb2, ", onSurface=");
        AbstractC0044t0.B(((r) this.f13234k.getValue()).f44265a, sb2, ", onError=");
        AbstractC0044t0.B(((r) this.f13235l.getValue()).f44265a, sb2, ", isLight=");
        return AbstractC6463a.l(sb2, ((Boolean) this.f13236m.getValue()).booleanValue(), ')');
    }
}
