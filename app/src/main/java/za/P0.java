package Za;

import A.AbstractC0044t0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23498Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23499Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f23500h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f23501i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23500h0 = str;
        this.f23501i0 = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        P0 p02 = new P0(this.f23500h0, this.f23501i0, abstractC4825e);
        p02.f23499Z = obj;
        return p02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((P0) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23498Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "gizmos", new C6.a(9, c5760d, this.f23500h0, this.f23501i0), 7);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f23499Z);
            this.f23498Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
