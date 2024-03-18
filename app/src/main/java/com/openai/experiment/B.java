package com.openai.experiment;

import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.AbstractC6216a;
import x8.W;

/* loaded from: classes2.dex */
public final class B extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f27654Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C f27655Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f27656h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c10, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f27655Z = c10;
        this.f27656h0 = abstractC6216a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new B(this.f27655Z, this.f27656h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f27654Y;
        C c10 = this.f27655Z;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F0 f02 = c10.f27660b;
            ?? abstractC5163j = new AbstractC5163j(2, null);
            this.f27654Y = 1;
            if (L4.a.n0(f02, abstractC5163j, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        try {
            this.f27656h0.mo122invoke();
        } catch (IllegalStateException e10) {
            W.W(c10.f27661c, "Statsig not initialized", e10, null, 4);
        }
        return jf.y.f36177a;
    }
}
