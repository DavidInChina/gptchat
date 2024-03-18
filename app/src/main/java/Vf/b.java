package Vf;

import Ag.q;
import Bg.A;
import Df.v;
import Mf.V;
import Sf.C1386e;
import bg.AbstractC2193a;
import bg.AbstractC2194b;
import id.AbstractC3557B;
import java.util.Map;
import kf.t;
import kf.w;
import kg.C4291c;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.u;
import s3.z;
import ud.C5902a;

/* loaded from: classes2.dex */
public class b implements Nf.c, Wf.h {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ v[] f18938e;

    /* renamed from: a  reason: collision with root package name */
    public final C4291c f18939a;

    /* renamed from: b  reason: collision with root package name */
    public final V f18940b;

    /* renamed from: c  reason: collision with root package name */
    public final Ag.l f18941c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC2194b f18942d;

    static {
        D d10 = C.f37623a;
        f18938e = new v[]{d10.g(new u(d10.b(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public b(z zVar, AbstractC2193a abstractC2193a, C4291c c4291c) {
        V v10;
        AbstractC2194b abstractC2194b;
        AbstractC3557B.c0("c", zVar);
        AbstractC3557B.c0("fqName", c4291c);
        this.f18939a = c4291c;
        if (abstractC2193a != null) {
            v10 = ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(abstractC2193a);
        } else {
            v10 = V.f12075a;
        }
        this.f18940b = v10;
        Ag.u e10 = zVar.e();
        C5902a c5902a = new C5902a(zVar, 17, this);
        q qVar = (q) e10;
        qVar.getClass();
        this.f18941c = new Ag.l(qVar, c5902a);
        if (abstractC2193a != null) {
            abstractC2194b = (AbstractC2194b) t.g2(((C1386e) abstractC2193a).a());
        } else {
            abstractC2194b = null;
        }
        this.f18942d = abstractC2194b;
    }

    @Override // Nf.c
    public final C4291c a() {
        return this.f18939a;
    }

    @Override // Nf.c
    public Map b() {
        return w.f37484Y;
    }

    @Override // Nf.c
    public final V g() {
        return this.f18940b;
    }

    @Override // Nf.c
    public final A getType() {
        return (Bg.D) A7.b.X0(this.f18941c, f18938e[0]);
    }
}
