package L;

import A.C0007a0;
import N0.C1046e;

/* loaded from: classes2.dex */
public final class O extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ T0.G f10010Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ T0.z f10011Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f10012h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ T0.o f10013i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ boolean f10014j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ P0 f10015k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ T0.s f10016l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ N.t0 f10017m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ p0.l f10018n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(T0.G g10, T0.z zVar, boolean z10, T0.o oVar, boolean z11, P0 p02, T0.s sVar, N.t0 t0Var, p0.l lVar) {
        super(1);
        this.f10010Y = g10;
        this.f10011Z = zVar;
        this.f10012h0 = z10;
        this.f10013i0 = oVar;
        this.f10014j0 = z11;
        this.f10015k0 = p02;
        this.f10016l0 = sVar;
        this.f10017m0 = t0Var;
        this.f10018n0 = lVar;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        L0.v vVar = (L0.v) obj;
        C1046e c1046e = this.f10010Y.f16756a;
        Df.v[] vVarArr = L0.t.f10472a;
        L0.u uVar = L0.r.f10469y;
        Df.v[] vVarArr2 = L0.t.f10472a;
        Df.v vVar2 = vVarArr2[14];
        uVar.a(vVar, c1046e);
        T0.z zVar = this.f10011Z;
        long j6 = zVar.f16831b;
        L0.u uVar2 = L0.r.f10470z;
        Df.v vVar3 = vVarArr2[15];
        uVar2.a(vVar, new N0.D(j6));
        jf.y yVar = jf.y.f36177a;
        boolean z10 = this.f10012h0;
        if (!z10) {
            ((L0.j) vVar).y(L0.r.f10454j, yVar);
        }
        P0 p02 = this.f10015k0;
        L0.t.c(vVar, new G(p02, 2));
        boolean z11 = this.f10014j0;
        L0.j jVar = (L0.j) vVar;
        jVar.y(L0.i.f10391h, new L0.a(null, new J.d(z11, z10, p02, vVar)));
        jVar.y(L0.i.f10395l, new L0.a(null, new L(this.f10014j0, this.f10012h0, this.f10015k0, vVar, this.f10011Z)));
        jVar.y(L0.i.f10390g, new L0.a(null, new M(this.f10016l0, this.f10012h0, this.f10011Z, this.f10017m0, this.f10015k0, 0)));
        T0.o oVar = this.f10013i0;
        int i10 = oVar.f16807e;
        C0007a0 c0007a0 = new C0007a0(p02, 4, oVar);
        jVar.y(L0.r.f10439A, new T0.n(i10));
        jVar.y(L0.i.f10396m, new L0.a(null, c0007a0));
        jVar.y(L0.i.f10385b, new L0.a(null, new N(p02, this.f10018n0, z11, 0)));
        N.t0 t0Var = this.f10017m0;
        jVar.y(L0.i.f10386c, new L0.a(null, new K(t0Var, 1)));
        if (!N0.D.b(zVar.f16831b)) {
            jVar.y(L0.i.f10397n, new L0.a(null, new K(t0Var, 2)));
            if (z10 && !z11) {
                jVar.y(L0.i.f10398o, new L0.a(null, new K(t0Var, 3)));
            }
        }
        if (z10 && !z11) {
            jVar.y(L0.i.f10399p, new L0.a(null, new K(t0Var, 0)));
        }
        return yVar;
    }
}
