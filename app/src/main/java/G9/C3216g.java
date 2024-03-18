package g9;

import Qg.F0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: g9.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3216g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC3215f f31318Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f31319Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f31320h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3220k f31321i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3216g(C3220k c3220k, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31321i0 = c3220k;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3216g c3216g = new C3216g(this.f31321i0, abstractC4825e);
        c3216g.f31320h0 = obj;
        return c3216g;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3216g) create((nd.k) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        nd.k kVar;
        AbstractC3215f abstractC3215f;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31319Z;
        C3220k c3220k = this.f31321i0;
        if (i10 != 0) {
            if (i10 == 1) {
                abstractC3215f = this.f31318Y;
                kVar = (nd.k) this.f31320h0;
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            kVar = (nd.k) this.f31320h0;
            AbstractC3215f abstractC3215f2 = (AbstractC3215f) c3220k.f31337f.getValue();
            if (!AbstractC3557B.K(abstractC3215f2.e(), kVar)) {
                this.f31320h0 = kVar;
                this.f31318Y = abstractC3215f2;
                this.f31319Z = 1;
                if (C3220k.f(c3220k, abstractC3215f2, this) == enumC5000a) {
                    return enumC5000a;
                }
                abstractC3215f = abstractC3215f2;
            }
            return y.f36177a;
        }
        F0 f02 = c3220k.f31337f;
        AbstractC3215f g10 = c3220k.g(kVar);
        c3220k.h(abstractC3215f, g10);
        f02.setValue(g10);
        return y.f36177a;
    }
}
