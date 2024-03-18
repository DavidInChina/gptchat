package Ta;

import A.AbstractC0044t0;
import A.C0039q0;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6043l;
import xe.C6396A;

/* loaded from: classes2.dex */
public final class o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f17020Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f17021Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f17022h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ String f17023i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ String f17024j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f17022h0 = str;
        this.f17023i0 = str2;
        this.f17024j0 = str3;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        o oVar = new o(this.f17022h0, this.f17023i0, this.f17024j0, abstractC4825e);
        oVar.f17021Z = obj;
        return oVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f17020Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d c5760d = new C5760d();
            P4.a.R0(c5760d, "conversation", new C0039q0(this.f17024j0, 21), 7);
            R4.b.L1(c5760d, "message_id", this.f17022h0);
            R4.b.L1(c5760d, "sandbox_path", this.f17023i0);
            C6043l A10 = AbstractC0044t0.A(c5760d, C6396A.f49811b, c5760d, (ge.d) this.f17021Z);
            this.f17020Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
