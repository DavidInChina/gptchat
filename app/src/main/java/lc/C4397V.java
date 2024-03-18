package lc;

import Z8.AbstractC1809m0;
import Z8.C1811n0;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: lc.V  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4397V extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f38129Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4401Z f38130Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4380D f38131h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4397V(AbstractC4380D abstractC4380D, C4401Z c4401z, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f38130Z = c4401z;
        this.f38131h0 = abstractC4380D;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4397V(this.f38131h0, this.f38130Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4397V) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f38129Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            zd.d dVar = ((C4424w) this.f38131h0).f38276a;
            this.f38129Y = 1;
            C4401Z c4401z = this.f38130Z;
            c4401z.getClass();
            AbstractC1809m0.a().b(C1811n0.f23392d, P4.a.o0(new C3959i("colorScheme", dVar)));
            c4401z.f(new C4410i(dVar));
            Object a5 = ((rc.Q) c4401z.f38143l).a(new nb.d(16, dVar), this);
            if (a5 != enumC5000a) {
                a5 = yVar;
            }
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
