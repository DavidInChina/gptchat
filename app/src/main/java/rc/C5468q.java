package rc;

import Qg.F0;
import java.util.Map;
import jf.C3959i;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6189g;
import wd.C6195j;
import wd.C6200m;
import wd.q0;
import wd.u0;
import wd.v0;

/* renamed from: rc.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5468q extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44916Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44917Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5472v f44918h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5468q(C5472v c5472v, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44918h0 = c5472v;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5468q c5468q = new C5468q(this.f44918h0, abstractC4825e);
        c5468q.f44917Z = obj;
        return c5468q;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5468q) create((C3959i) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44916Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C3959i c3959i = (C3959i) this.f44917Z;
            v0 v0Var = (v0) c3959i.f36155Y;
            v0 v0Var2 = (v0) c3959i.f36156Z;
            boolean z10 = v0Var instanceof u0;
            C5472v c5472v = this.f44918h0;
            if (z10 && (v0Var2 instanceof u0)) {
                C6200m c6200m = (C6200m) ((u0) v0Var2).f48468a;
                c6200m.getClass();
                C6195j c6195j = new C6195j(C6200m.f48440d);
                Map map = c6200m.f48441a;
                C6189g c6189g = (C6189g) map.get(c6195j);
                if (c6189g == null) {
                    c6189g = (C6189g) map.get(kf.t.f2(c6200m.f48442b));
                }
                if (c6189g != null) {
                    F0 f02 = c5472v.f44938h;
                    String str = c6189g.f48410a;
                    f02.setValue(new C6195j(str));
                    C6.a aVar = new C6.a(v0Var, v0Var2, str);
                    this.f44916Y = 1;
                    if (c5472v.f44931a.b(aVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (v0Var instanceof q0) {
                F0 f03 = c5472v.f44937g;
                this.f44916Y = 2;
                f03.setValue(v0Var);
                if (yVar == enumC5000a) {
                    return enumC5000a;
                }
            } else if (v0Var2 instanceof q0) {
                F0 f04 = c5472v.f44937g;
                this.f44916Y = 3;
                f04.setValue(v0Var2);
                if (yVar == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return yVar;
    }
}
