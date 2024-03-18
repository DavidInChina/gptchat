package Ga;

import A.AbstractC0044t0;
import Df.H;
import L9.g0;
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
public final class u extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6240Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6241Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ g0 f6242h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(g0 g0Var, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6242h0 = g0Var;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        u uVar = new u(this.f6242h0, abstractC4825e);
        uVar.f6241Z = obj;
        return uVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6240Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f6241Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversations", null, 23);
            g0 g0Var = this.f6242h0;
            if (g0Var == null) {
                c5760d.f46128d = C6843b.f52007a;
                Df.w a5 = kotlin.jvm.internal.C.a(g0.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, g0.class, H.O(a5), a5, c5760d);
            } else if (g0Var instanceof AbstractC6848g) {
                c5760d.f46128d = g0Var;
                c5760d.b(null);
            } else {
                c5760d.f46128d = g0Var;
                Df.w a10 = kotlin.jvm.internal.C.a(g0.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, g0.class, H.O(a10), a10, c5760d);
            }
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49814e, c5760d, dVar);
            this.f6240Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
