package kd;

import A.AbstractC0044t0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* renamed from: kd.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4240d extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37299Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f37300Z;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, nf.e, kd.d] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f37300Z = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4240d) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37299Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "register-websocket", null, 23);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49812c, c5760d, (ge.d) this.f37300Z);
            this.f37299Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
