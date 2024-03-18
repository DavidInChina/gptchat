package Za;

import A.AbstractC0044t0;
import A.C0039q0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class N0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23490Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23491Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f23492h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23492h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        N0 n02 = new N0(this.f23492h0, abstractC4825e);
        n02.f23491Z = obj;
        return n02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N0) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23490Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "gizmo_reviews", new C0039q0(this.f23492h0, 24), 7);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f23491Z);
            this.f23490Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
