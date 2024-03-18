package A;

/* loaded from: classes2.dex */
public final class T0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f111Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f112Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f113h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Z0 f114i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f115j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(boolean z10, boolean z11, boolean z12, Z0 z02, Ng.F f6) {
        super(1);
        this.f111Y = z10;
        this.f112Z = z11;
        this.f113h0 = z12;
        this.f114i0 = z02;
        this.f115j0 = f6;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        L0.v vVar = (L0.v) obj;
        Df.v[] vVarArr = L0.t.f10472a;
        L0.u uVar = L0.r.f10457m;
        Df.v[] vVarArr2 = L0.t.f10472a;
        Df.v vVar2 = vVarArr2[6];
        uVar.a(vVar, Boolean.TRUE);
        Z0 z02 = this.f114i0;
        L0.h hVar = new L0.h(new W0(z02, 0), new W0(z02, 1), this.f111Y);
        boolean z10 = this.f112Z;
        if (z10) {
            L0.u uVar2 = L0.r.f10461q;
            Df.v vVar3 = vVarArr2[9];
            uVar2.a(vVar, hVar);
        } else {
            L0.u uVar3 = L0.r.f10460p;
            Df.v vVar4 = vVarArr2[8];
            uVar3.a(vVar, hVar);
        }
        if (this.f113h0) {
            L0.j jVar = (L0.j) vVar;
            jVar.y(L0.i.f10387d, new L0.a(null, new V0((Ng.F) this.f115j0, z10, z02)));
        }
        return jf.y.f36177a;
    }
}
