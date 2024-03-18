package A;

import Ng.AbstractC1073l0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class F extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f58Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f59Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f60h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ B.Y0 f61i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f62j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ D.m f63k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C0006a f64l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f65m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(B.Y0 y02, long j6, D.m mVar, C0006a c0006a, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f61i0 = y02;
        this.f62j0 = j6;
        this.f63k0 = mVar;
        this.f64l0 = c0006a;
        this.f65m0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        F f6 = new F(this.f61i0, this.f62j0, this.f63k0, this.f64l0, this.f65m0, abstractC4825e);
        f6.f60h0 = obj;
        return f6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        D.q qVar;
        boolean z10;
        Object obj2;
        AbstractC1073l0 abstractC1073l0;
        D.k kVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f59Z;
        jf.y yVar = jf.y.f36177a;
        C0006a c0006a = this.f64l0;
        D.m mVar = this.f63k0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4 && i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        c0006a.f160b = null;
                        return yVar;
                    }
                    qVar = (D.q) this.f60h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f60h0 = null;
                    this.f59Z = 4;
                    if (mVar.b(qVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    c0006a.f160b = null;
                    return yVar;
                }
                z10 = this.f58Y;
                com.google.android.gms.internal.play_billing.N.B0(obj);
                if (z10) {
                    D.p pVar = new D.p(this.f62j0);
                    D.q qVar2 = new D.q(pVar);
                    this.f60h0 = qVar2;
                    this.f59Z = 3;
                    if (mVar.b(pVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    qVar = qVar2;
                    this.f60h0 = null;
                    this.f59Z = 4;
                    if (mVar.b(qVar, this) == enumC5000a) {
                    }
                }
                c0006a.f160b = null;
                return yVar;
            }
            abstractC1073l0 = (AbstractC1073l0) this.f60h0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
            obj2 = obj;
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            abstractC1073l0 = Ad.l.O0((Ng.F) this.f60h0, null, null, new E(this.f65m0, this.f62j0, this.f63k0, this.f64l0, null), 3);
            this.f60h0 = abstractC1073l0;
            this.f59Z = 1;
            obj2 = this.f61i0.k0(this);
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (abstractC1073l0.a()) {
            this.f60h0 = null;
            this.f58Y = booleanValue;
            this.f59Z = 2;
            abstractC1073l0.k(null);
            Object F10 = abstractC1073l0.F(this);
            if (F10 != enumC5000a) {
                F10 = yVar;
            }
            if (F10 == enumC5000a) {
                return enumC5000a;
            }
            z10 = booleanValue;
            if (z10) {
            }
            c0006a.f160b = null;
            return yVar;
        }
        D.p pVar2 = c0006a.f160b;
        if (pVar2 != null) {
            if (booleanValue) {
                kVar = new D.q(pVar2);
            } else {
                kVar = new D.o(pVar2);
            }
            this.f60h0 = null;
            this.f59Z = 5;
            if (mVar.b(kVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        c0006a.f160b = null;
        return yVar;
    }
}
