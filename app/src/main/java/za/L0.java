package Za;

import A.AbstractC0044t0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class L0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23482Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23483Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, Za.L0, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f23483Z = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23482Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5760d c5760d = new C5760d();
            c5760d.e(D0.f23447h0);
            C6396A c6396a = C6396A.f49811b;
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f23483Z);
            this.f23482Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
