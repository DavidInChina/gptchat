package com.openai.experiment;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes2.dex */
public final class E extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f27664Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ G f27665Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(G g10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f27665Z = g10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new E(this.f27665Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f27664Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            long j6 = G.f27671f;
            this.f27664Y = 1;
            if (R4.b.q0(j6, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        G g10 = this.f27665Z;
        Object value = g10.f27675d.getValue();
        s sVar = s.f27697Z;
        if (value != sVar) {
            W.F(g10.f27673b, "Statsig initialization timed out", null, 6);
            g10.f27675d.setValue(sVar);
        }
        return jf.y.f36177a;
    }
}
