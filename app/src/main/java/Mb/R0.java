package Mb;

import Cb.C0293c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class R0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f11833Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ X0 f11834Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(X0 x02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11834Z = x02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new R0(this.f11834Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((R0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f11833Y;
        X0 x02 = this.f11834Z;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            Ia.j jVar = ((Cb.S) x02.f11869j).f2910c;
            this.f11833Y = 1;
            obj = L4.a.m0(jVar, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        C0293c c0293c = ((Cb.Y) obj).f2921c;
        if (c0293c != null) {
            str = c0293c.f2933c;
        } else {
            str = null;
        }
        x02.l(new bb.B0(str, 4));
        this.f11833Y = 2;
        if (X0.m(x02, this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
