package Ha;

import A.AbstractC0044t0;
import A.C0039q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import wf.n;
import xe.AbstractC6414c;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class f extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f7578Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f7579Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f7580h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f7580h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        f fVar = new f(this.f7580h0, abstractC4825e);
        fVar.f7579Z = obj;
        return fVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f7578Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "share", new C0039q0(this.f7580h0, 18), 7);
            AbstractC3557B.m0(c5760d, AbstractC6414c.f49880a);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49815f, c5760d, (ge.d) this.f7579Z);
            this.f7578Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
