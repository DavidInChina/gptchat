package ub;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6694e;
import z.C6697f0;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46597Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f46598Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C6694e c6694e, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46598Z = c6694e;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new t(this.f46598Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46597Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            Float f6 = new Float(-40.0f);
            this.f46597Y = 1;
            if (this.f46598Z.f(f6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        Float f10 = new Float(0.0f);
        C6697f0 u10 = AbstractC6696f.u(0.85f, 100.0f, null, 4);
        this.f46597Y = 2;
        if (C6694e.c(this.f46598Z, f10, u10, null, this, 12) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
