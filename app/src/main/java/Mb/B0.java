package Mb;

import android.content.Context;
import b9.AbstractC2133b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class B0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11758Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f11759Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f11760h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(F0 f02, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11759Z = f02;
        this.f11760h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B0(this.f11759Z, this.f11760h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11758Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC2133b abstractC2133b = this.f11759Z.f11776m;
            this.f11758Y = 1;
            if (((C9.l) abstractC2133b).e(this.f11760h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
