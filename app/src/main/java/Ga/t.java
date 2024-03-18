package Ga;

import A.AbstractC0044t0;
import Df.H;
import L9.V;
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
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6237Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6238Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ V f6239h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(V v10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6239h0 = v10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        t tVar = new t(this.f6239h0, abstractC4825e);
        tVar.f6238Z = obj;
        return tVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6237Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f6238Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversations", null, 23);
            V v10 = this.f6239h0;
            if (v10 == null) {
                c5760d.f46128d = C6843b.f52007a;
                Df.w a5 = kotlin.jvm.internal.C.a(V.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, V.class, H.O(a5), a5, c5760d);
            } else if (v10 instanceof AbstractC6848g) {
                c5760d.f46128d = v10;
                c5760d.b(null);
            } else {
                c5760d.f46128d = v10;
                Df.w a10 = kotlin.jvm.internal.C.a(V.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, V.class, H.O(a10), a10, c5760d);
            }
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49814e, c5760d, dVar);
            this.f6237Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
