package Cd;

import android.content.Context;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes.dex */
public final class D extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2992Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ J f2993Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f2994h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f2995i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.k f2996j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(J j6, Tc.f fVar, Context context, wf.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2993Z = j6;
        this.f2994h0 = fVar;
        this.f2995i0 = context;
        this.f2996j0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new D(this.f2993Z, this.f2994h0, this.f2995i0, this.f2996j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2992Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5426p c5426p = this.f2993Z.f812i;
            C c10 = new C(this.f2994h0, this.f2995i0, this.f2996j0, null);
            this.f2992Y = 1;
            if (L4.a.b0(c5426p, c10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
