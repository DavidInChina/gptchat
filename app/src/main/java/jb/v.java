package Jb;

import Mb.F0;
import Ng.F;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9020Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ F0 f9021Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9022h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Context f9023i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(F0 f02, Tc.f fVar, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9021Z = f02;
        this.f9022h0 = fVar;
        this.f9023i0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f9021Z, this.f9022h0, this.f9023i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9020Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f9021Z.f812i;
            u uVar = new u(this.f9022h0, this.f9023i0, null);
            this.f9020Y = 1;
            if (L4.a.b0(c5426p, uVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
