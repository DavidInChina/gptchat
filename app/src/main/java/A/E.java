package A;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class E extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public D.p f42Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f43Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f45i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ D.m f46j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0006a f47k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AbstractC6216a abstractC6216a, long j6, D.m mVar, C0006a c0006a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44h0 = abstractC6216a;
        this.f45i0 = j6;
        this.f46j0 = mVar;
        this.f47k0 = c0006a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new E(this.f44h0, this.f45i0, this.f46j0, this.f47k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        D.p pVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f43Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    pVar = this.f42Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f47k0.f160b = pVar;
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            if (((Boolean) this.f44h0.mo122invoke()).booleanValue()) {
                long j6 = L.f89a;
                this.f43Z = 1;
                if (R4.b.p0(j6, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        D.p pVar2 = new D.p(this.f45i0);
        this.f42Y = pVar2;
        this.f43Z = 2;
        if (this.f46j0.b(pVar2, this) == enumC5000a) {
            return enumC5000a;
        }
        pVar = pVar2;
        this.f47k0.f160b = pVar;
        return jf.y.f36177a;
    }
}
