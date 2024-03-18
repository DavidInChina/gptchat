package Jb;

import Mb.C0967m0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;

/* loaded from: classes2.dex */
public final class o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f9009Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C0967m0 f9010Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f9011h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C0967m0 c0967m0, Tc.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f9010Z = c0967m0;
        this.f9011h0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new o(this.f9010Z, this.f9011h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f9009Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p c5426p = this.f9010Z.f812i;
            n nVar = new n(this.f9011h0, null);
            this.f9009Y = 1;
            if (L4.a.b0(c5426p, nVar, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
