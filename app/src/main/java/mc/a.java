package Mc;

import A.AbstractC0044t0;
import Df.H;
import Df.w;
import Vc.m;
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

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f12012Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f12013Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Nc.c f12014h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Nc.c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f12014h0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        a aVar = new a(this.f12014h0, abstractC4825e);
        aVar.f12013Z = obj;
        return aVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f12012Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f12013Z;
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "playintegrity", null, 23);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            Nc.c cVar = this.f12014h0;
            if (cVar == null) {
                c5760d.f46128d = C6843b.f52007a;
                w a5 = C.a(Nc.c.class);
                AbstractC2469q0.s(C.f37623a, Nc.c.class, H.O(a5), a5, c5760d);
            } else if (cVar instanceof AbstractC6848g) {
                c5760d.f46128d = cVar;
                c5760d.b(null);
            } else {
                c5760d.f46128d = cVar;
                w a10 = C.a(Nc.c.class);
                AbstractC2469q0.s(C.f37623a, Nc.c.class, H.O(a10), a10, c5760d);
            }
            c5760d.f46130f.e(m.f18555c, y.f36177a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f12012Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
