package W;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5251c;
import z.C6694e;

/* renamed from: W.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1592o0 extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f20250Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6694e f20251Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ float f20252h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f20253i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C1597p0 f20254j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ D.k f20255k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592o0(C6694e c6694e, float f6, boolean z10, C1597p0 c1597p0, D.k kVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f20251Z = c6694e;
        this.f20252h0 = f6;
        this.f20253i0 = z10;
        this.f20254j0 = c1597p0;
        this.f20255k0 = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1592o0(this.f20251Z, this.f20252h0, this.f20253i0, this.f20254j0, this.f20255k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1592o0) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        D.p pVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f20250Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6694e c6694e = this.f20251Z;
            float f6 = ((Z0.e) c6694e.f51232e.getValue()).f22788Y;
            float f10 = this.f20252h0;
            if (!Z0.e.a(f6, f10)) {
                if (!this.f20253i0) {
                    Z0.e eVar = new Z0.e(f10);
                    this.f20250Y = 1;
                    if (c6694e.f(eVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    float f11 = ((Z0.e) c6694e.f51232e.getValue()).f22788Y;
                    C1597p0 c1597p0 = this.f20254j0;
                    if (Z0.e.a(f11, c1597p0.f20274b)) {
                        pVar = new D.p(C5251c.f43619b);
                    } else if (Z0.e.a(f11, c1597p0.f20276d)) {
                        pVar = new Object();
                    } else if (Z0.e.a(f11, c1597p0.f20275c)) {
                        pVar = new Object();
                    } else {
                        pVar = null;
                    }
                    this.f20250Y = 2;
                    if (AbstractC1553g1.a(c6694e, f10, pVar, this.f20255k0, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
            }
        }
        return jf.y.f36177a;
    }
}
