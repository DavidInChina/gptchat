package Lf;

import Df.v;
import Pf.G;
import id.AbstractC3557B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.u;
import ud.C5902a;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class j extends Jf.l {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ v[] f11095h;

    /* renamed from: f  reason: collision with root package name */
    public AbstractC6216a f11096f;

    /* renamed from: g  reason: collision with root package name */
    public final Ag.l f11097g;

    static {
        D d10 = C.f37623a;
        f11095h = new v[]{d10.g(new u(d10.b(j.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Ag.q qVar) {
        super(qVar);
        h[] hVarArr = h.f11092Y;
        this.f11097g = new Ag.l(qVar, new C5902a(this, 13, qVar));
    }

    public final q I() {
        return (q) A7.b.X0(this.f11097g, f11095h[0]);
    }

    @Override // Jf.l
    public final Of.b d() {
        return I();
    }

    @Override // Jf.l
    public final Iterable l() {
        Iterable l10 = super.l();
        Ag.u uVar = this.f9121d;
        if (uVar != null) {
            G k10 = k();
            AbstractC3557B.b0("getBuiltInsModule(...)", k10);
            return kf.t.v2(l10, new g(uVar, k10));
        }
        Jf.l.a(6);
        throw null;
    }

    @Override // Jf.l
    public final Of.e p() {
        return I();
    }
}
