package r9;

import B.AbstractC0130h1;
import B.L0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44612Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44613Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ L0 f44614h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(L0 l02, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44614h0 = l02;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        v vVar = new v(this.f44614h0, abstractC4825e);
        vVar.f44613Z = obj;
        return vVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((AbstractC0130h1) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44612Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f44612Y = 1;
            if (this.f44614h0.a((AbstractC0130h1) this.f44613Z, 0.0f, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
