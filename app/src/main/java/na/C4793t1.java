package na;

import Z8.AbstractC1809m0;
import Z8.C1829x;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.t1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4793t1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f40119Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40120Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4793t1(B1 b1, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40120Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4793t1(this.f40120Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4793t1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40119Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f40119Y = 1;
            B1 b1 = this.f40120Z;
            b1.getClass();
            AbstractC1809m0.a().b(C1829x.f23418c, kf.w.f37484Y);
            Object a5 = ((rc.Q) b1.f39714o).a(C4745d0.f39947j0, this);
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
