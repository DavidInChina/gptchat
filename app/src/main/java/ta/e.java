package Ta;

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
public final class e extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f16987Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f16988Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f16989h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f16989h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        e eVar = new e(this.f16989h0, abstractC4825e);
        eVar.f16988Z = obj;
        return eVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ge.d) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f16987Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5760d B10 = E9.f.B(R.a.t(new StringBuilder("files/"), this.f16989h0, "/download"));
            C6396A c6396a = C6396A.f49811b;
            C6043l A10 = AbstractC0044t0.A(B10, C6396A.f49811b, B10, (ge.d) this.f16988Z);
            this.f16987Y = 1;
            obj = A10.b(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
