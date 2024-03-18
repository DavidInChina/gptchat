package lc;

import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1811n0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lc.X  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4399X extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38135Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4401Z f38136Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4380D f38137h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4399X(AbstractC4380D abstractC4380D, C4401Z c4401z, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38136Z = c4401z;
        this.f38137h0 = abstractC4380D;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4399X(this.f38137h0, this.f38136Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4399X) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C1811n0 c1811n0;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38135Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            boolean z10 = ((C4423v) this.f38137h0).f38275a;
            this.f38135Y = 1;
            C4401Z c4401z = this.f38136Z;
            c4401z.getClass();
            AbstractC1805k0 a5 = AbstractC1809m0.a();
            if (z10) {
                c1811n0 = C1811n0.f23391c;
            } else {
                c1811n0 = C1811n0.f23390b;
            }
            a5.b(c1811n0, kf.w.f37484Y);
            Object a10 = ((rc.Q) c4401z.f38143l).a(new J.c(7, z10), this);
            if (a10 != enumC5000a) {
                a10 = yVar;
            }
            if (a10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
