package H9;

import A.C0039q0;
import Qg.F0;
import ca.C2311c;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import java.util.ArrayList;
import nd.AbstractC4816e;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import wd.EnumC6181c;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class x extends p {

    /* renamed from: j  reason: collision with root package name */
    public final m f7560j;

    /* renamed from: k  reason: collision with root package name */
    public final Ea.a f7561k;

    public x(m mVar, Ea.a aVar, AbstractC4816e abstractC4816e) {
        super(new o(true, true, kf.v.f37483Y, "", false));
        this.f7560j = mVar;
        this.f7561k = aVar;
        k(q.f7536Z, mVar.f7526c);
        k(q.f7537h0, ((xc.e) abstractC4816e).a(EnumC6181c.f48389l0, ExperimentKey.MemoryExperienceEnabled.INSTANCE));
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new s(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(x xVar, AbstractC4825e abstractC4825e) {
        t tVar;
        int i10;
        v0 v0Var;
        xVar.getClass();
        if (abstractC4825e instanceof t) {
            tVar = (t) abstractC4825e;
            int i11 = tVar.f7549i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                tVar.f7549i0 = i11 - Integer.MIN_VALUE;
                Object obj = tVar.f7547Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = tVar.f7549i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        xVar = tVar.f7546Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    tVar.f7546Y = xVar;
                    tVar.f7549i0 = 1;
                    m mVar = xVar.f7560j;
                    if (mVar.f7527d) {
                        obj = new u0(Boolean.TRUE);
                    } else {
                        obj = mVar.a(tVar);
                    }
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (v0) obj;
                if (!(v0Var instanceof u0)) {
                    xVar.l(new J.c(2, ((Boolean) ((u0) v0Var).f48468a).booleanValue()));
                } else if (v0Var instanceof q0) {
                    xVar.f(new C0722d((q0) v0Var));
                } else if (!(v0Var instanceof p0)) {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        tVar = new t(xVar, abstractC4825e);
        Object obj2 = tVar.f7547Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = tVar.f7549i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (!(v0Var instanceof u0)) {
        }
        return jf.y.f36177a;
    }

    public static final void n(x xVar, v0 v0Var, C2311c c2311c) {
        xVar.getClass();
        if (v0Var instanceof u0) {
            jf.y yVar = (jf.y) ((u0) v0Var).f48468a;
            m mVar = xVar.f7560j;
            mVar.getClass();
            AbstractC3557B.c0("conversation", c2311c);
            F0 f02 = mVar.f7525b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) f02.getValue()) {
                if (!AbstractC3557B.K(((C2311c) obj).f26374a, c2311c.f26374a)) {
                    arrayList.add(obj);
                }
            }
            f02.setValue(arrayList);
        } else if (v0Var instanceof q0) {
            xVar.f(new C0722d((q0) v0Var));
        } else if (!(v0Var instanceof p0)) {
            throw new RuntimeException();
        }
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        k kVar = (k) iVar;
        AbstractC3557B.c0("intent", kVar);
        if (kVar instanceof h) {
            l(new C0039q0(((h) kVar).f7517a, 9));
        } else if (kVar instanceof g) {
            h(new u(this, null));
        } else if (kVar instanceof j) {
            h(new v(this, kVar, null));
        } else if (kVar instanceof f) {
            h(new w(this, kVar, null));
        } else if (kVar instanceof i) {
            f(new C0721c(Uc.N.f17621k.o1()));
        }
    }
}
