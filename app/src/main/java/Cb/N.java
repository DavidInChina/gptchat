package Cb;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.u0;

/* loaded from: classes.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2893Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ S f2894Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2894Z = s10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new N(this.f2894Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2893Y;
        S s10 = this.f2894Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Z z10 = s10.f2908a;
            this.f2893Y = 1;
            obj = L4.a.m0(z10.f44961e, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        F f6 = ((Y) obj).f2925g;
        if (f6 != null) {
            return new u0(f6);
        }
        this.f2893Y = 2;
        s10.getClass();
        obj = Ad.l.e0(new M(s10, null), this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        return obj;
    }
}
