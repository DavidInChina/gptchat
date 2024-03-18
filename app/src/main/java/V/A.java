package V;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6714o;
import z.C6694e;

/* loaded from: classes2.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17891Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f17892Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6714o f17893h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b10, AbstractC6714o abstractC6714o, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17892Z = b10;
        this.f17893h0 = abstractC6714o;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new A(this.f17892Z, this.f17893h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17891Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            Float f6 = new Float(0.0f);
            this.f17891Y = 1;
            if (C6694e.c((C6694e) this.f17892Z.f17896c, f6, this.f17893h0, null, this, 12) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
