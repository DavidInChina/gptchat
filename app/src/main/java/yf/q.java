package Yf;

import Mf.V;
import dg.C2654C;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class q extends Pf.I {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f22377r0;

    /* renamed from: l0  reason: collision with root package name */
    public final Sf.A f22378l0;

    /* renamed from: m0  reason: collision with root package name */
    public final s3.z f22379m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Ag.l f22380n0;

    /* renamed from: o0  reason: collision with root package name */
    public final C1692d f22381o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Ag.d f22382p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Nf.i f22383q0;

    static {
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f22377r0 = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(q.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), d10.g(new kotlin.jvm.internal.u(d10.b(q.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s3.z zVar, Sf.A a5) {
        super(zVar.d(), a5.f16588a);
        Nf.i iVar;
        AbstractC3557B.c0("outerContext", zVar);
        AbstractC3557B.c0("jPackage", a5);
        this.f22378l0 = a5;
        s3.z W6 = R4.b.W(zVar, this, null, 6);
        this.f22379m0 = W6;
        AbstractC3557B.c0("<this>", ((Xf.a) zVar.f45394a).f21955d.c().f50012c);
        jg.g gVar = jg.g.f36187g;
        Ag.u e10 = W6.e();
        p pVar = new p(this, 0);
        Ag.q qVar = (Ag.q) e10;
        qVar.getClass();
        this.f22380n0 = new Ag.l(qVar, pVar);
        this.f22381o0 = new C1692d(W6, a5, this);
        Ag.u e11 = W6.e();
        p pVar2 = new p(this, 2);
        Ag.q qVar2 = (Ag.q) e11;
        qVar2.getClass();
        this.f22382p0 = new Ag.d(qVar2, pVar2);
        if (((Xf.a) W6.f45394a).f21973v.f17850c) {
            iVar = Nf.h.f12822a;
        } else {
            iVar = Bi.c.B1(W6, a5);
        }
        this.f22383q0 = iVar;
        ((Ag.q) W6.e()).a(new p(this, 1));
    }

    @Override // Mf.G
    public final ug.n R() {
        return this.f22381o0;
    }

    @Override // Pf.I, Pf.AbstractC1159q, Mf.AbstractC1004m
    public final V g() {
        return new C2654C(this);
    }

    @Override // Nf.b, Nf.a
    public final Nf.i getAnnotations() {
        return this.f22383q0;
    }

    @Override // Pf.I, Pf.AbstractC1158p
    public final String toString() {
        return "Lazy Java package fragment: " + this.f14010j0 + " of module " + ((Xf.a) this.f22379m0.f45394a).f21966o;
    }
}
