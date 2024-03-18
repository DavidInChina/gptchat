package B;

import B0.EnumC0195l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5161h;
import q0.C5251c;

/* loaded from: classes.dex */
public final class V1 extends AbstractC5161h implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public int f1204Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f1205h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ng.F f1206i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1207j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ wf.k f1208k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1209l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ C0115c1 f1210m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(Ng.F f6, wf.k kVar, wf.k kVar2, kotlin.jvm.internal.B b10, C0115c1 c0115c1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f1206i0 = f6;
        this.f1207j0 = kVar;
        this.f1208k0 = kVar2;
        this.f1209l0 = b10;
        this.f1210m0 = c0115c1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        V1 v12 = new V1(this.f1206i0, this.f1207j0, this.f1208k0, this.f1209l0, this.f1210m0, abstractC4825e);
        v12.f1205h0 = obj;
        return v12;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((V1) create((B0.N) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f1204Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f1204Z = 1;
            obj = Z1.e((B0.N) this.f1205h0, EnumC0195l.f1657Z, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        B0.u uVar = (B0.u) obj;
        jf.y yVar = jf.y.f36177a;
        Ng.F f6 = this.f1206i0;
        C0115c1 c0115c1 = this.f1210m0;
        if (uVar != null) {
            uVar.a();
            Ad.l.O0(f6, null, null, new T1(c0115c1, null), 3);
            this.f1207j0.invoke(new C5251c(uVar.f1672c));
            return yVar;
        }
        Ad.l.O0(f6, null, null, new U1(c0115c1, null), 3);
        wf.k kVar = this.f1208k0;
        if (kVar == null) {
            return null;
        }
        kVar.invoke(new C5251c(((B0.u) this.f1209l0.f37622Y).f1672c));
        return yVar;
    }
}
