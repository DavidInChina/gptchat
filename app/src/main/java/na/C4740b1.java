package na;

import nf.AbstractC4825e;
import oa.C4972C;
import oa.C4980e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5476z;

/* renamed from: na.b1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4740b1 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39908Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B1 f39909Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4740b1(B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39909Z = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4740b1(this.f39909Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4740b1) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39908Y;
        B1 b1 = this.f39909Z;
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
            T9.a aVar = b1.f39710k;
            this.f39908Y = 1;
            C4972C c4972c = (C4972C) aVar;
            c4972c.getClass();
            obj = c4972c.q(new C4980e(c4972c, null), this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        wd.v0 v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.q0) {
            xd.f fVar = b1.f39713n;
            this.f39908Y = 2;
            if (((C5476z) fVar).a((wd.q0) v0Var, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
