package lc;

import Z8.AbstractC1809m0;
import Z8.C1811n0;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5451O;

/* renamed from: lc.W  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4398W extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38132Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4401Z f38133Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4380D f38134h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4398W(AbstractC4380D abstractC4380D, C4401Z c4401z, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38133Z = c4401z;
        this.f38134h0 = abstractC4380D;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4398W(this.f38134h0, this.f38133Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4398W) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38132Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ec.o oVar = ((C4425x) this.f38134h0).f38277a;
            this.f38132Y = 1;
            C4401Z c4401z = this.f38133Z;
            c4401z.getClass();
            AbstractC1809m0.a().b(C1811n0.f23393e, P4.a.o0(new C3959i("code", oVar.f4631Y)));
            Object f6 = ((C5451O) c4401z.f38144m).f(oVar.f4631Y, this);
            if (f6 != enumC5000a) {
                f6 = yVar;
            }
            if (f6 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
