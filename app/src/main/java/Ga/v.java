package Ga;

import A.AbstractC0044t0;
import A.C0039q0;
import Df.H;
import L9.O;
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
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f6243Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f6244Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ O f6245h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f6246i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(O o10, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f6245h0 = o10;
        this.f6246i0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        v vVar = new v(this.f6245h0, this.f6246i0, abstractC4825e);
        vVar.f6244Z = obj;
        return vVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f6243Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f6244Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversation", new C0039q0(this.f6246i0, 13), 7);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            O o10 = this.f6245h0;
            if (o10 == null) {
                c5760d.f46128d = C6843b.f52007a;
                Df.w a5 = kotlin.jvm.internal.C.a(O.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, O.class, H.O(a5), a5, c5760d);
            } else if (o10 instanceof AbstractC6848g) {
                c5760d.f46128d = o10;
                c5760d.b(null);
            } else {
                c5760d.f46128d = o10;
                Df.w a10 = kotlin.jvm.internal.C.a(O.class);
                AbstractC2469q0.s(kotlin.jvm.internal.C.f37623a, O.class, H.O(a10), a10, c5760d);
            }
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f6243Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
