package B;

import B0.EnumC0195l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class I1 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f1100Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1101h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f1102i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f1103j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1104k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1105l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(Ng.F f6, wf.o oVar, wf.k kVar, C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1102i0 = f6;
        this.f1103j0 = oVar;
        this.f1104k0 = kVar;
        this.f1105l0 = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        I1 i12 = new I1(this.f1102i0, this.f1103j0, this.f1104k0, this.f1105l0, abstractC4825e);
        i12.f1101h0 = obj;
        return i12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((I1) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0.u uVar;
        B0.N n10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1100Z;
        Ng.F f6 = this.f1102i0;
        C0115c1 c0115c1 = this.f1105l0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    uVar = (B0.u) obj;
                    if (uVar != null) {
                        Ad.l.O0(f6, null, null, new G1(c0115c1, null), 3);
                    } else {
                        uVar.a();
                        Ad.l.O0(f6, null, null, new H1(c0115c1, null), 3);
                        wf.k kVar = this.f1104k0;
                        if (kVar != null) {
                            kVar.invoke(new C5251c(uVar.f1672c));
                        }
                    }
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n10 = (B0.N) this.f1101h0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            n10 = (B0.N) this.f1101h0;
            Ad.l.O0(f6, null, null, new E1(c0115c1, null), 3);
            this.f1101h0 = n10;
            this.f1100Z = 1;
            obj = Z1.c(n10, this, 3);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        B0.u uVar2 = (B0.u) obj;
        uVar2.a();
        B0 b02 = Z1.f1251a;
        wf.o oVar = this.f1103j0;
        if (oVar != b02) {
            Ad.l.O0(f6, null, null, new F1(oVar, c0115c1, uVar2, null), 3);
        }
        this.f1101h0 = null;
        this.f1100Z = 2;
        obj = Z1.e(n10, EnumC0195l.f1657Z, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        uVar = (B0.u) obj;
        if (uVar != null) {
        }
        return jf.y.f36177a;
    }
}
