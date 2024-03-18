package Cb;

import id.AbstractC3557B;
import java.util.Locale;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.s0;
import wd.u0;

/* loaded from: classes.dex */
public final class M extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f2890Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2891Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ S f2892h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(S s10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f2892h0 = s10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        M m10 = new M(this.f2892h0, abstractC4825e);
        m10.f2891Z = obj;
        return m10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        F f6;
        Vc.x xVar;
        Object obj2;
        Yg.r J02;
        Object obj3;
        Ng.K k10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f2890Y;
        S s10 = this.f2892h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        f6 = (F) this.f2891Z;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return new u0(f6);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                xVar = (Vc.x) this.f2891Z;
                obj2 = obj;
                Vc.x xVar2 = (Vc.x) obj2;
                if (!(xVar instanceof Vc.w) && (xVar2 instanceof Vc.w)) {
                    Vc.w wVar = (Vc.w) xVar2;
                    boolean z10 = !AbstractC3557B.K(((Fb.l) wVar.f18565a).f5156a, Boolean.TRUE);
                    Object obj4 = wVar.f18565a;
                    boolean z11 = !AbstractC3557B.K(((Fb.l) obj4).f5158c, Boolean.FALSE);
                    Fb.l lVar = (Fb.l) obj4;
                    String str = lVar.f5159d;
                    String str2 = lVar.f5157b;
                    if (str2 == null) {
                        str2 = Locale.getDefault().getCountry();
                    }
                    String str3 = str2;
                    AbstractC3557B.Z(str3);
                    Yg.p pVar = ((Fb.l) obj4).f5160e;
                    if (pVar != null) {
                        Yg.w.Companion.getClass();
                        J02 = P4.a.M0(pVar, Yg.v.a()).a();
                    } else {
                        J02 = Bi.c.J0();
                    }
                    F f10 = new F(z10, z11, str, str3, J02, ((Fb.c) ((Vc.w) xVar).f18565a).f5142a);
                    K k11 = new K(f10, 0);
                    this.f2891Z = f10;
                    this.f2890Y = 3;
                    if (s10.e(k11, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    f6 = f10;
                    return new u0(f6);
                }
                return new s0(0, new IllegalStateException("Failed to fetch onboarding config"));
            }
            k10 = (Ng.K) this.f2891Z;
            com.google.android.gms.internal.play_billing.N.B0(obj);
            obj3 = obj;
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            k10 = Ad.l.L((Ng.F) this.f2891Z, null, new L(s10, null), 3);
            U u10 = s10.f2909b;
            this.f2891Z = k10;
            this.f2890Y = 1;
            obj3 = u10.f2914a.a(this);
            if (obj3 == enumC5000a) {
                return enumC5000a;
            }
        }
        xVar = (Vc.x) obj3;
        this.f2891Z = xVar;
        this.f2890Y = 2;
        obj2 = k10.f0(this);
        if (obj2 == enumC5000a) {
            return enumC5000a;
        }
        Vc.x xVar22 = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
        return new s0(0, new IllegalStateException("Failed to fetch onboarding config"));
    }
}
