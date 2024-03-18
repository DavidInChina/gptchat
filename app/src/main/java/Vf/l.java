package Vf;

import Ag.q;
import Df.v;
import Jf.p;
import Uf.A;
import bg.AbstractC2193a;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.u;
import s3.z;

/* loaded from: classes2.dex */
public final class l extends b {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ v[] f18957g;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.l f18958f;

    static {
        D d10 = C.f37623a;
        f18957g = new v[]{d10.g(new u(d10.b(l.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC2193a abstractC2193a, z zVar) {
        super(zVar, abstractC2193a, p.f9187t);
        AbstractC3557B.c0("annotation", abstractC2193a);
        AbstractC3557B.c0("c", zVar);
        Ag.u e10 = zVar.e();
        A a5 = new A(2, this);
        q qVar = (q) e10;
        qVar.getClass();
        this.f18958f = new Ag.l(qVar, a5);
    }

    @Override // Vf.b, Nf.c
    public final Map b() {
        return (Map) A7.b.X0(this.f18958f, f18957g[0]);
    }
}
