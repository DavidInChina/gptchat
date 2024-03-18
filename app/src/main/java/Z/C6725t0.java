package z;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: z.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6725t0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f51377Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f51378Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6729v0 f51379h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6725t0(C6729v0 c6729v0, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51379h0 = c6729v0;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6725t0 c6725t0 = new C6725t0(this.f51379h0, abstractC4825e);
        c6725t0.f51378Z = obj;
        return c6725t0;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((C6725t0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
        return EnumC5000a.f41328Y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Ng.F f6;
        C6723s0 c6723s0;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f51377Y;
        if (i10 != 0) {
            if (i10 == 1) {
                f6 = (Ng.F) this.f51378Z;
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            f6 = (Ng.F) this.f51378Z;
        }
        do {
            c6723s0 = new C6723s0(AbstractC6696f.q(f6.i()), 0, this.f51379h0);
            this.f51378Z = f6;
            this.f51377Y = 1;
        } while (kotlin.jvm.internal.m.v(getContext()).S(c6723s0, this) != enumC5000a);
        return enumC5000a;
    }
}
