package Za;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.AbstractC6414c;
import xe.C6396A;
import ze.AbstractC6848g;
import ze.C6843b;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23485Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f23486Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Wa.q f23487h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(Wa.q qVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23487h0 = qVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        M0 m02 = new M0(this.f23487h0, abstractC4825e);
        m02.f23486Z = obj;
        return m02;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23485Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            ge.d dVar = (ge.d) this.f23486Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "gizmos", I0.f23470h0, 7);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            Wa.q qVar = this.f23487h0;
            if (qVar == null) {
                c5760d.f46128d = C6843b.f52007a;
                Df.w a5 = kotlin.jvm.internal.C.a(Wa.q.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, Wa.q.class, Df.H.O(a5), a5, c5760d);
            } else if (qVar instanceof AbstractC6848g) {
                c5760d.f46128d = qVar;
                c5760d.b(null);
            } else {
                c5760d.f46128d = qVar;
                Df.w a10 = kotlin.jvm.internal.C.a(Wa.q.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, Wa.q.class, Df.H.O(a10), a10, c5760d);
            }
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f23485Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
