package Ab;

import Kd.I;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class b extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f750Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f751Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C2969F f752h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, C2969F c2969f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f751Z = cVar;
        this.f752h0 = c2969f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new b(this.f751Z, this.f752h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f750Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            this.f750Y = 1;
            if (((I) this.f751Z.f756d.getValue()).g(this.f752h0, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
