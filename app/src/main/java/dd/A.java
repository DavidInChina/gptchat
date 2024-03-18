package Dd;

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

/* loaded from: classes.dex */
public final class A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f3499Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3500Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ B f3501h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ed.c f3502i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b10, Ed.c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3501h0 = b10;
        this.f3502i0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        A a5 = new A(this.f3501h0, this.f3502i0, abstractC4825e);
        a5.f3500Z = obj;
        return a5;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3499Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            ge.d dVar = (ge.d) this.f3500Z;
            C5760d c5760d = new C5760d();
            int ordinal = this.f3501h0.f3504b.f18579n.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        P4.a.Q0(c5760d, "/voice/get_token");
                    }
                } else {
                    c5760d.e(z.f3583Y);
                }
            } else {
                P4.a.Q0(c5760d, "/voice/get_token");
                c5760d.f46127c.f("magic-header-2023", "always");
            }
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            Ed.c cVar = this.f3502i0;
            if (cVar == null) {
                c5760d.f46128d = C6843b.f52007a;
                Df.w a5 = kotlin.jvm.internal.C.a(Ed.c.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, Ed.c.class, Df.H.O(a5), a5, c5760d);
            } else if (cVar instanceof AbstractC6848g) {
                c5760d.f46128d = cVar;
                c5760d.b(null);
            } else {
                c5760d.f46128d = cVar;
                Df.w a10 = kotlin.jvm.internal.C.a(Ed.c.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, Ed.c.class, Df.H.O(a10), a10, c5760d);
            }
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f3499Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
