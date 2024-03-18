package ab;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class z extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f24143Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1945C f24144Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1964r f24145h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C1945C c1945c, AbstractC1964r abstractC1964r, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f24144Z = c1945c;
        this.f24145h0 = abstractC1964r;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new z(this.f24144Z, this.f24145h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((z) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f24143Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f24143Y = 1;
            if (C1945C.n(this.f24144Z, (C1963q) this.f24145h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
