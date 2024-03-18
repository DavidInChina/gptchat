package na;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: na.r1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4787r1 extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f40104Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f40105Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4787r1(B1 b1, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f40105Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C4787r1(this.f40105Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C4787r1) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f40104Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f40104Y = 1;
            B1 b1 = this.f40105Z;
            b1.getClass();
            Ad.l.O0(b1.f39712m, null, null, new C4740b1(b1, null), 3);
            B1.t(b1, false, null, true, 2);
            if (yVar == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
