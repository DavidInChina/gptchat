package Tb;

import A.AbstractC0044t0;
import Df.H;
import Df.w;
import Rb.I;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wf.n;
import xe.AbstractC6414c;
import xe.C6396A;
import ze.AbstractC6848g;
import ze.C6843b;

/* loaded from: classes2.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17032Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17033Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ I f17034h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(I i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17034h0 = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f17034h0, abstractC4825e);
        cVar.f17033Z = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17032Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f17033Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "report_flow", b.f17031Y, 7);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            I i11 = this.f17034h0;
            if (i11 == null) {
                c5760d.f46128d = C6843b.f52007a;
                w a5 = C.a(I.class);
                AbstractC2469q0.s(C.f37623a, I.class, H.O(a5), a5, c5760d);
            } else if (i11 instanceof AbstractC6848g) {
                c5760d.f46128d = i11;
                c5760d.b(null);
            } else {
                c5760d.f46128d = i11;
                w a10 = C.a(I.class);
                AbstractC2469q0.s(C.f37623a, I.class, H.O(a10), a10, c5760d);
            }
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f17032Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
