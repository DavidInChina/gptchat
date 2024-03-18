package Db;

import A.AbstractC0044t0;
import Df.H;
import Df.w;
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
import xe.AbstractC6414c;
import xe.C6396A;
import ze.AbstractC6848g;
import ze.C6843b;

/* loaded from: classes2.dex */
public final class h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f3463Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3464Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f3465h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Eb.f f3466i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Eb.f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3465h0 = mVar;
        this.f3466i0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        h hVar = new h(this.f3465h0, this.f3466i0, abstractC4825e);
        hVar.f3464Z = obj;
        return hVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3463Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            ge.d dVar = (ge.d) this.f3464Z;
            C5760d c5760d = new C5760d();
            P4.a.Q0(c5760d, this.f3465h0.f3481b.f18574i);
            P4.a.R0(c5760d, "dashboard/onboarding/phone/check", null, 23);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            Eb.f fVar = this.f3466i0;
            if (fVar == null) {
                c5760d.f46128d = C6843b.f52007a;
                w a5 = C.a(Eb.f.class);
                AbstractC2469q0.s(C.f37623a, Eb.f.class, H.O(a5), a5, c5760d);
            } else if (fVar instanceof AbstractC6848g) {
                c5760d.f46128d = fVar;
                c5760d.b(null);
            } else {
                c5760d.f46128d = fVar;
                w a10 = C.a(Eb.f.class);
                AbstractC2469q0.s(C.f37623a, Eb.f.class, H.O(a10), a10, c5760d);
            }
            c5760d.f46130f.e(Vc.m.f18555c, y.f36177a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, dVar);
            this.f3463Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
