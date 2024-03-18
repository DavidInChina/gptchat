package g2;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: g2.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3139D extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31033Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3153k f31034Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3139D(C3153k c3153k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31034Z = c3153k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C3139D(this.f31034Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3139D) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31033Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            this.f31033Y = 1;
            C3153k c3153k = this.f31034Z;
            c3153k.getClass();
            if (K4.J.k0(c3153k.f31103i0, new C3152j(c3153k, null), this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
