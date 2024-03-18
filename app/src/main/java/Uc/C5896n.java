package uc;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;
import rc.C5472v;

/* renamed from: uc.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5896n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46651Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ xd.b f46652Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ xd.g f46653h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5900r f46654i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5896n(xd.b bVar, xd.g gVar, C5900r c5900r, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46652Z = bVar;
        this.f46653h0 = gVar;
        this.f46654i0 = c5900r;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5896n(this.f46652Z, this.f46653h0, this.f46654i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5896n) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46651Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            C5426p l02 = L4.a.l0(new C5426p(((C5472v) this.f46652Z).f44936f, 8));
            C5894l c5894l = new C5894l(this.f46653h0, this.f46654i0, null);
            this.f46651Y = 1;
            if (L4.a.b0(l02, c5894l, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
