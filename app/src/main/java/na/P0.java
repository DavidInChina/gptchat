package na;

import Uc.C1422g;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import oa.C4972C;
import of.EnumC5000a;
import pf.AbstractC5163j;
import yb.AbstractC6574a;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39850Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.P f39851Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6574a f39852h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f39853i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ B1 f39854j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(androidx.lifecycle.P p10, AbstractC6574a abstractC6574a, boolean z10, B1 b1, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39851Z = p10;
        this.f39852h0 = abstractC6574a;
        this.f39853i0 = z10;
        this.f39854j0 = b1;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new P0(this.f39851Z, this.f39852h0, this.f39853i0, this.f39854j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((P0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wd.v0 v0Var;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39850Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    v0Var = (wd.v0) obj;
                    if (v0Var instanceof wd.q0) {
                        x8.W.W(Pc.e.a(), "Failed to refresh conversation", ((wd.q0) v0Var).f48450a, null, 4);
                    }
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
            return jf.y.f36177a;
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C1422g c1422g = C1422g.f17674i;
        androidx.lifecycle.P p10 = this.f39851Z;
        AbstractC3557B.c0("savedStateHandle", p10);
        String str = (String) p10.b("fromOauth");
        if (str != null && str.length() > 0) {
            this.f39850Y = 1;
            if (((Ab.c) this.f39852h0).a(this.f39853i0, this) == enumC5000a) {
                return enumC5000a;
            }
            return jf.y.f36177a;
        }
        T9.a aVar = this.f39854j0.f39710k;
        this.f39850Y = 2;
        C4972C c4972c = (C4972C) aVar;
        c4972c.getClass();
        obj = c4972c.q(new oa.n(c4972c, null), this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        v0Var = (wd.v0) obj;
        if (v0Var instanceof wd.q0) {
        }
        return jf.y.f36177a;
    }
}
