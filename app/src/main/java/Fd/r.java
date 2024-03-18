package Fd;

import Cd.J;
import Ng.F;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import gb.m0;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class r extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f5269Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ v f5270Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m0 f5271h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4532l f5272i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ J f5273j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f5274k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Context f5275l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, m0 m0Var, AbstractActivityC4532l abstractActivityC4532l, J j6, Tc.f fVar, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5270Z = vVar;
        this.f5271h0 = m0Var;
        this.f5272i0 = abstractActivityC4532l;
        this.f5273j0 = j6;
        this.f5274k0 = fVar;
        this.f5275l0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new r(this.f5270Z, this.f5271h0, this.f5272i0, this.f5273j0, this.f5274k0, this.f5275l0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5269Y;
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
            C5426p c5426p = this.f5270Z.f812i;
            p pVar = new p(this.f5272i0, this.f5273j0, null);
            this.f5269Y = 1;
            if (L4.a.b0(c5426p, pVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        C5426p c5426p2 = this.f5271h0.f812i;
        q qVar = new q(this.f5274k0, this.f5275l0, null);
        this.f5269Y = 2;
        if (L4.a.b0(c5426p2, qVar, this) == enumC5000a) {
            return enumC5000a;
        }
        return jf.y.f36177a;
    }
}
