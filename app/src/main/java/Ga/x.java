package Ga;

import A.AbstractC0044t0;
import A.C0039q0;
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
import ze.C6843b;

/* loaded from: classes.dex */
public final class x extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6250Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6251Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ R9.c f6252h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f6253i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(R9.c cVar, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6252h0 = cVar;
        this.f6253i0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        x xVar = new x(this.f6252h0, this.f6253i0, abstractC4825e);
        xVar.f6251Z = obj;
        return xVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6250Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f6251Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversation", new C0039q0(this.f6253i0, 15), 7);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            R9.c cVar = this.f6252h0;
            if (cVar == null) {
                c5760d.f46128d = C6843b.f52007a;
                Df.w a5 = kotlin.jvm.internal.C.a(R9.c.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, R9.c.class, H.O(a5), a5, c5760d);
            } else if (cVar instanceof AbstractC6848g) {
                c5760d.f46128d = cVar;
                c5760d.b(null);
            } else {
                c5760d.f46128d = cVar;
                Df.w a10 = kotlin.jvm.internal.C.a(R9.c.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, R9.c.class, H.O(a10), a10, c5760d);
            }
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f6250Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
