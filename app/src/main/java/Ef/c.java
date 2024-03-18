package ef;

import Ad.l;
import Ng.F;
import Ng.L;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.k;
import wf.n;

/* loaded from: classes.dex */
public final class c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29371Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29372Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ k f29373h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29373h0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        c cVar = new c(this.f29373h0, abstractC4825e);
        cVar.f29372Z = obj;
        return cVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29371Y;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f6 = (F) this.f29372Z;
            String name = Thread.currentThread().getName();
            AbstractC3557B.b0("currentThread().name", name);
            boolean I22 = Lg.n.I2(name, "LK_RTC_THREAD", false);
            k kVar = this.f29373h0;
            if (I22) {
                this.f29371Y = 1;
                obj = kVar.invoke(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                L L10 = l.L(f6, e.f29376b, new b(kVar, null), 2);
                this.f29371Y = 2;
                obj = L10.z(this);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return obj;
    }
}
