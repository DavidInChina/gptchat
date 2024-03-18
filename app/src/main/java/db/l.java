package Db;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f3477Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f3478Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ m f3479h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f3479h0 = mVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        l lVar = new l(this.f3479h0, abstractC4825e);
        lVar.f3478Z = obj;
        return lVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f3477Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.Q0(c5760d, this.f3479h0.f3481b.f18574i);
            P4.a.R0(c5760d, "dashboard/onboarding/verify_email", null, 23);
            c5760d.f46130f.e(Vc.m.f18555c, y.f36177a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, (ge.d) this.f3478Z);
            this.f3477Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
