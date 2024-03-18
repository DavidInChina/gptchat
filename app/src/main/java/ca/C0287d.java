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

/* renamed from: Ca.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0287d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2827Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2828Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Ba.c f2829h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287d(Ba.c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2829h0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C0287d c0287d = new C0287d(this.f2829h0, abstractC4825e);
        c0287d.f2828Z = obj;
        return c0287d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0287d) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2827Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f2828Z;
            C5760d B10 = E9.f.B("user_system_messages");
            AbstractC3557B.m0(B10, AbstractC6414c.f49880a);
            G.Companion.getClass();
            Ba.c cVar = this.f2829h0;
            AbstractC3557B.c0("customInstructions", cVar);
            String str = "";
            String str2 = cVar.f2009b;
            if (str2 == null) {
                str2 = str;
            }
            String str3 = cVar.f2010c;
            if (str3 != null) {
                str = str3;
            }
            G g10 = new G(str2, str);
            if (g10 instanceof AbstractC6848g) {
                B10.f46128d = g10;
                B10.b(null);
            } else {
                B10.f46128d = g10;
                Df.w a5 = kotlin.jvm.internal.C.a(G.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, G.class, H.O(a5), a5, B10);
            }
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49812c, B10, dVar);
            this.f2827Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
