package Ca;

import A.AbstractC0044t0;
import Df.H;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.AbstractC6414c;
import xe.C6396A;
import ze.AbstractC6848g;

/* renamed from: Ca.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0289f extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2833Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2834Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f2835h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0289f(boolean z10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2835h0 = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0289f c0289f = new C0289f(this.f2835h0, abstractC4825e);
        c0289f.f2834Z = obj;
        return c0289f;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0289f) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2833Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f2834Z;
            C5760d B10 = E9.f.B("user_system_message_enabled");
            AbstractC3557B.m0(B10, AbstractC6414c.f49880a);
            n nVar = new n(this.f2835h0);
            if (nVar instanceof AbstractC6848g) {
                B10.f46128d = nVar;
                B10.b(null);
            } else {
                B10.f46128d = nVar;
                Df.w a5 = kotlin.jvm.internal.C.a(n.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, n.class, H.O(a5), a5, B10);
            }
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49812c, B10, dVar);
            this.f2833Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
