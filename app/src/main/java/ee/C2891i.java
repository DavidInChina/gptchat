package ee;

import B.AbstractC0170v0;
import B.C0123f0;
import B.C0144m0;
import B.C0156q0;
import B.C0158r0;
import B.C0169v;
import Df.H;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ee.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2891i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f29316Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f29317Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ q f29318h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ B0.A f29319i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C2881B f29320j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0.d f29321k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2891i(q qVar, B0.A a5, C2881B c2881b, C0.d dVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29318h0 = qVar;
        this.f29319i0 = a5;
        this.f29320j0 = c2881b;
        this.f29321k0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2891i c2891i = new C2891i(this.f29318h0, this.f29319i0, this.f29320j0, this.f29321k0, abstractC4825e);
        c2891i.f29317Z = obj;
        return c2891i;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2891i) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f29316Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            F f6 = (F) this.f29317Z;
            int ordinal = this.f29318h0.ordinal();
            if (ordinal != 0) {
                B0.A a5 = this.f29319i0;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        C2881B c2881b = this.f29320j0;
                        C0.d dVar = this.f29321k0;
                        C2889g c2889g = new C2889g(c2881b, dVar, this.f29318h0, f6, 2);
                        C2890h c2890h = new C2890h(c2881b, dVar, f6, 2);
                        this.f29316Y = 3;
                        C0123f0 c0123f0 = AbstractC0170v0.f1534a;
                        Object q10 = H.q(a5, new C0158r0(C0169v.f1530j0, c2890h, c2889g, C0144m0.f1416i0, null), this);
                        if (q10 != enumC5000a) {
                            q10 = yVar;
                        }
                        if (q10 == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                } else {
                    C2881B c2881b2 = this.f29320j0;
                    C0.d dVar2 = this.f29321k0;
                    C2889g c2889g2 = new C2889g(c2881b2, dVar2, this.f29318h0, f6, 1);
                    C2890h c2890h2 = new C2890h(c2881b2, dVar2, f6, 1);
                    this.f29316Y = 2;
                    C0123f0 c0123f02 = AbstractC0170v0.f1534a;
                    Object q11 = H.q(a5, new C0156q0(C0169v.f1529i0, c2890h2, c2889g2, C0144m0.f1415h0, null), this);
                    if (q11 != enumC5000a) {
                        q11 = yVar;
                    }
                    if (q11 == enumC5000a) {
                        return enumC5000a;
                    }
                }
            } else {
                C2881B c2881b3 = this.f29320j0;
                C0.d dVar3 = this.f29321k0;
                C2889g c2889g3 = new C2889g(c2881b3, dVar3, this.f29318h0, f6, 0);
                C2890h c2890h3 = new C2890h(c2881b3, dVar3, f6, 0);
                this.f29316Y = 1;
                if (AbstractC0170v0.f(this.f29319i0, null, c2889g3, c2890h3, this, 5) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return yVar;
    }
}
