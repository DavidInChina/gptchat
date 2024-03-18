package ug;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.EnumC0998g;
import Mf.P;
import Pf.T;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import kg.C4294f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;

/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f46801f;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0997f f46802b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f46803c;

    /* renamed from: d  reason: collision with root package name */
    public final Ag.l f46804d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.l f46805e;

    static {
        D d10 = C.f37623a;
        f46801f = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(r.class), "functions", "getFunctions()Ljava/util/List;")), d10.g(new kotlin.jvm.internal.u(d10.b(r.class), DiagnosticsEntry.Event.PROPERTIES_KEY, "getProperties()Ljava/util/List;"))};
    }

    public r(Ag.u uVar, AbstractC0997f abstractC0997f, boolean z10) {
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("containingClass", abstractC0997f);
        this.f46802b = abstractC0997f;
        this.f46803c = z10;
        abstractC0997f.e();
        EnumC0998g enumC0998g = EnumC0998g.f12084Y;
        Ag.q qVar = (Ag.q) uVar;
        this.f46804d = new Ag.l(qVar, new q(this, 0));
        this.f46805e = new Ag.l(qVar, new q(this, 1));
    }

    @Override // ug.o, ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        Ig.f fVar = new Ig.f();
        for (Object obj : (List) A7.b.X0(this.f46804d, f46801f[0])) {
            if (AbstractC3557B.K(((T) obj).getName(), c4294f)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        Ag.l lVar = this.f46804d;
        Df.v[] vVarArr = f46801f;
        return kf.t.w2((List) A7.b.X0(this.f46805e, vVarArr[1]), (List) A7.b.X0(lVar, vVarArr[0]));
    }

    @Override // ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return null;
    }

    @Override // ug.o, ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        Ig.f fVar = new Ig.f();
        for (Object obj : (List) A7.b.X0(this.f46805e, f46801f[1])) {
            if (AbstractC3557B.K(((P) obj).getName(), c4294f)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
