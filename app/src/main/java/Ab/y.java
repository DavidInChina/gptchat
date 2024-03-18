package ab;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class y extends AbstractC5163j implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public int f24140Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1945C f24141Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1964r f24142h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1945C c1945c, AbstractC1964r abstractC1964r, AbstractC4825e abstractC4825e) {
        super(1, abstractC4825e);
        this.f24141Z = c1945c;
        this.f24142h0 = abstractC1964r;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(AbstractC4825e abstractC4825e) {
        return new y(this.f24141Z, this.f24142h0, abstractC4825e);
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        return ((y) create((AbstractC4825e) obj)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f24140Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            String str = ((C1961o) this.f24142h0).f24118a;
            this.f24140Y = 1;
            if (C1945C.m(this.f24141Z, str, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
