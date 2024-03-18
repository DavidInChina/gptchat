package Vf;

import Ag.q;
import Df.v;
import Jf.p;
import bg.AbstractC2193a;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.u;
import s3.z;

/* loaded from: classes2.dex */
public final class g extends b {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ v[] f18951g;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.l f18952f;

    static {
        D d10 = C.f37623a;
        f18951g = new v[]{d10.g(new u(d10.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC2193a abstractC2193a, z zVar) {
        super(zVar, abstractC2193a, p.f9180m);
        AbstractC3557B.c0("c", zVar);
        Ag.u e10 = zVar.e();
        f fVar = f.f18950Y;
        q qVar = (q) e10;
        qVar.getClass();
        this.f18952f = new Ag.l(qVar, fVar);
    }

    @Override // Vf.b, Nf.c
    public final Map b() {
        return (Map) A7.b.X0(this.f18952f, f18951g[0]);
    }
}
