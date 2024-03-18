package W;

import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class U1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f19715Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f19716Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U1(AbstractC6216a abstractC6216a, int i10) {
        super(1);
        this.f19715Y = i10;
        this.f19716Z = abstractC6216a;
    }

    public final void a(L0.v vVar) {
        int i10 = this.f19715Y;
        AbstractC6216a abstractC6216a = this.f19716Z;
        switch (i10) {
            case 2:
                L0.f fVar = new L0.f(((Number) abstractC6216a.mo122invoke()).floatValue(), new Cf.d(0.0f, 1.0f));
                Df.v[] vVarArr = L0.t.f10472a;
                L0.u uVar = L0.r.f10448d;
                Df.v vVar2 = L0.t.f10472a[1];
                uVar.a(vVar, fVar);
                return;
            default:
                L0.f fVar2 = new L0.f(((Number) abstractC6216a.mo122invoke()).floatValue(), new Cf.d(0.0f, 1.0f));
                Df.v[] vVarArr2 = L0.t.f10472a;
                L0.u uVar2 = L0.r.f10448d;
                Df.v vVar3 = L0.t.f10472a[1];
                uVar2.a(vVar, fVar2);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f19715Y;
        AbstractC6216a abstractC6216a = this.f19716Z;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) obj;
                abstractC6216a.mo122invoke();
                return yVar;
            case 1:
                long j6 = ((C5251c) obj).f43623a;
                abstractC6216a.mo122invoke();
                return yVar;
            case 2:
                a((L0.v) obj);
                return yVar;
            default:
                a((L0.v) obj);
                return yVar;
        }
    }
}
