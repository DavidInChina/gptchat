package pc;

import Qg.F0;
import com.revenuecat.purchases.Purchases;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.B0;
import wd.C6189g;
import wd.C6205s;
import wd.o0;

/* renamed from: pc.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5140t extends AbstractC5163j implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public B0 f43024Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f43025Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f43026h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f43027i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f43028j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C5144x f43029k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5140t(C5144x c5144x, AbstractC4825e abstractC4825e) {
        super(4, abstractC4825e);
        this.f43029k0 = c5144x;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        C5140t c5140t = new C5140t(this.f43029k0, (AbstractC4825e) obj4);
        c5140t.f43026h0 = (C5125d) obj;
        c5140t.f43027i0 = (C6205s) obj2;
        c5140t.f43028j0 = (o0) obj3;
        return c5140t.invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        o0 o0Var;
        Qg.l0 l0Var;
        C6189g c6189g;
        B0 b02;
        B0 b03;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f43025Z;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b02 = this.f43024Y;
            c6189g = (C6189g) this.f43028j0;
            l0Var = (Qg.l0) this.f43027i0;
            o0Var = (o0) this.f43026h0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
            l0Var.setValue(new T(c6189g, b02, ((Boolean) obj).booleanValue(), o0Var));
            return yVar;
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        C6205s c6205s = (C6205s) this.f43027i0;
        o0 o0Var2 = (o0) this.f43028j0;
        String str = ((C5125d) this.f43026h0).f42973a;
        String a5 = c6205s.a();
        B0 b04 = null;
        C5144x c5144x = this.f43029k0;
        if (str != null ? a5 != null && AbstractC3557B.K(str, a5) : a5 == null) {
            F0 f02 = c5144x.f43047e;
            c6189g = c6205s.f48457a;
            if (c6189g != null && (b03 = c6189g.f48412c) != null && b03.f48320e) {
                b04 = b03;
            }
            this.f43026h0 = o0Var2;
            this.f43027i0 = f02;
            this.f43028j0 = c6189g;
            this.f43024Y = b04;
            this.f43025Z = 1;
            Object a10 = C5144x.a(c5144x, this);
            if (a10 == enumC5000a) {
                return enumC5000a;
            }
            o0Var = o0Var2;
            b02 = b04;
            l0Var = f02;
            obj = a10;
            l0Var.setValue(new T(c6189g, b02, ((Boolean) obj).booleanValue(), o0Var));
            return yVar;
        }
        c5144x.f43047e.setValue(new T(false, null, 15));
        String a11 = c6205s.a();
        this.f43026h0 = null;
        this.f43027i0 = null;
        this.f43025Z = 2;
        qc.i iVar = (qc.i) c5144x.f43043a;
        iVar.getClass();
        if (a11 != null) {
            Purchases.Companion companion = Purchases.Companion;
            boolean isConfigured = companion.isConfigured();
            qc.d dVar = iVar.f44055b;
            if (!isConfigured) {
                companion.configureInCustomEntitlementsComputationMode(iVar.f44054a, "goog_DPguJtknNxbQBStStwhWGRsghUw", a11);
                companion.getSharedInstance().setUpdatedCustomerInfoListener(dVar);
            } else if (!AbstractC3557B.K(companion.getSharedInstance().getAppUserID(), a11)) {
                companion.getSharedInstance().switchUser(a11);
                companion.getSharedInstance().setUpdatedCustomerInfoListener(dVar);
            }
            iVar.f44056c.setValue(new C5125d(a11, 2));
        }
        Object b10 = c5144x.b(this);
        if (b10 != enumC5000a) {
            b10 = yVar;
        }
        if (b10 == enumC5000a) {
            return enumC5000a;
        }
        return yVar;
    }
}
