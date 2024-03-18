package B;

import q0.C5251c;

/* renamed from: B.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0147n0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f1422Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.n f1423Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0147n0(wf.n nVar, int i10) {
        super(1);
        this.f1422Y = i10;
        this.f1423Z = nVar;
    }

    public final void a(B0.u uVar) {
        int i10 = this.f1422Y;
        wf.n nVar = this.f1423Z;
        switch (i10) {
            case 0:
                nVar.invoke(uVar, new C5251c(r9.y.Q0(uVar, false)));
                uVar.a();
                return;
            case 1:
                nVar.invoke(uVar, Float.valueOf(C5251c.d(r9.y.Q0(uVar, false))));
                uVar.a();
                return;
            default:
                nVar.invoke(uVar, Float.valueOf(C5251c.e(r9.y.Q0(uVar, false))));
                uVar.a();
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f1422Y) {
            case 0:
                a((B0.u) obj);
                return yVar;
            case 1:
                a((B0.u) obj);
                return yVar;
            default:
                a((B0.u) obj);
                return yVar;
        }
    }
}
