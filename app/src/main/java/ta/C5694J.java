package ta;

import Z8.AbstractC1809m0;
import Z8.X0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import za.C6783B;
import za.EnumC6785b;

/* renamed from: ta.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5694J extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f45825Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X f45826Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5694J(X x10, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f45826Z = x10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new C5694J(this.f45826Z, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((C5694J) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f45825Y;
        X x10 = this.f45826Z;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC1809m0.a().b(X0.f23282c, kf.w.f37484Y);
            xd.h hVar = x10.f45865l;
            C5705d c5705d = C5705d.f45922u0;
            this.f45825Y = 1;
            if (((rc.Q) hVar).a(c5705d, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        EnumC6785b enumC6785b = ((C6783B) x10.f808e.getValue()).f51769l;
        x10.l(C5705d.f45923v0);
        if (enumC6785b != null) {
            x10.h(new C5695K(x10, enumC6785b, null));
        }
        return jf.y.f36177a;
    }
}
