package pc;

import Qg.AbstractC1206i;
import Qg.F0;
import Qg.s0;
import android.app.Activity;
import com.openai.experiment.ExperimentKey;
import com.revenuecat.purchases.Purchases;
import id.AbstractC3557B;
import java.util.List;
import java.util.Set;
import ld.C4428a;
import nf.AbstractC4825e;
import nf.C4833m;
import of.EnumC5000a;
import q1.AbstractC5260f;
import rc.C5463l;
import rc.C5472v;
import wd.C6189g;
import wd.C6205s;
import wd.EnumC6181c;
import wd.n0;
import wd.q0;
import wd.u0;
import wd.v0;

/* renamed from: pc.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5144x {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5126e f43043a;

    /* renamed from: b  reason: collision with root package name */
    public final xd.b f43044b;

    /* renamed from: c  reason: collision with root package name */
    public final xd.a f43045c;

    /* renamed from: d  reason: collision with root package name */
    public final com.openai.experiment.t f43046d;

    /* renamed from: e  reason: collision with root package name */
    public final F0 f43047e;

    /* renamed from: f  reason: collision with root package name */
    public final F0 f43048f;

    /* renamed from: g  reason: collision with root package name */
    public final F0 f43049g;

    public C5144x(AbstractC5126e abstractC5126e, xd.b bVar, xd.a aVar, com.openai.experiment.t tVar, C4428a c4428a) {
        this.f43043a = abstractC5126e;
        this.f43044b = bVar;
        this.f43045c = aVar;
        this.f43046d = tVar;
        F0 c10 = s0.c(new T(false, null, 15));
        this.f43047e = c10;
        this.f43048f = c10;
        F0 c11 = s0.c(wd.m0.f48443a);
        this.f43049g = c11;
        L4.a.E0(new Ia.j(new AbstractC1206i[]{((qc.i) abstractC5126e).f44057d, ((C5472v) bVar).f44936f, c11}, 10, new C5140t(this, null)), c4428a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C5144x c5144x, AbstractC4825e abstractC4825e) {
        C5141u c5141u;
        int i10;
        C5144x c5144x2;
        C6205s c6205s;
        C6189g c6189g;
        Set set;
        c5144x.getClass();
        if (abstractC4825e instanceof C5141u) {
            c5141u = (C5141u) abstractC4825e;
            int i11 = c5141u.f43034j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5141u.f43034j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5141u.f43032h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5141u.f43034j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5144x = c5141u.f43031Z;
                    c5144x2 = c5141u.f43030Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    AbstractC1206i abstractC1206i = ((C5472v) c5144x.f43044b).f44936f;
                    c5141u.f43030Y = c5144x;
                    c5141u.f43031Z = c5144x;
                    c5141u.f43034j0 = 1;
                    obj = L4.a.m0(abstractC1206i, c5141u);
                    if (obj != enumC5000a) {
                        c5144x2 = c5144x;
                    } else {
                        return enumC5000a;
                    }
                }
                c6205s = (C6205s) obj;
                c5144x.getClass();
                if (c6205s != null && !c6205s.e() && (((c6189g = c6205s.f48457a) == null || !c6189g.a()) && c6189g != null && (set = c6189g.f48415f) != null && !set.contains(EnumC6181c.f48385h0))) {
                    if (((com.openai.experiment.G) c5144x.f43046d).c(ExperimentKey.SubscriptionsEnabled.INSTANCE)) {
                        AbstractC5126e abstractC5126e = c5144x2.f43043a;
                        c5141u.f43030Y = null;
                        c5141u.f43031Z = null;
                        c5141u.f43034j0 = 2;
                        qc.i iVar = (qc.i) abstractC5126e;
                        iVar.getClass();
                        C4833m c4833m = new C4833m(AbstractC5260f.z(c5141u));
                        Purchases.Companion companion = Purchases.Companion;
                        if (!companion.isConfigured()) {
                            c4833m.resumeWith(Boolean.FALSE);
                        } else {
                            Purchases.Companion.canMakePayments$default(companion, iVar.f44054a, null, new qc.f(c4833m), 2, null);
                        }
                        obj = c4833m.b();
                        if (obj == enumC5000a) {
                            com.google.android.gms.internal.play_billing.N.k0(c5141u);
                        }
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return obj;
                    }
                }
                return Boolean.FALSE;
            }
        }
        c5141u = new C5141u(c5144x, abstractC4825e);
        Object obj2 = c5141u.f43032h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5141u.f43034j0;
        if (i10 == 0) {
        }
        c6205s = (C6205s) obj2;
        c5144x.getClass();
        if (c6205s != null) {
            if (((com.openai.experiment.G) c5144x.f43046d).c(ExperimentKey.SubscriptionsEnabled.INSTANCE)) {
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C5142v c5142v;
        int i10;
        C5144x c5144x;
        v0 v0Var;
        if (abstractC4825e instanceof C5142v) {
            c5142v = (C5142v) abstractC4825e;
            int i11 = c5142v.f43038i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5142v.f43038i0 = i11 - Integer.MIN_VALUE;
                Object obj = c5142v.f43036Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5142v.f43038i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c5144x = c5142v.f43035Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f43049g.setValue(wd.m0.f48443a);
                    c5142v.f43035Y = this;
                    c5142v.f43038i0 = 1;
                    obj = ((qc.i) this.f43043a).a(c5142v);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5144x = this;
                }
                v0Var = (v0) obj;
                if (v0Var instanceof q0) {
                    q0 q0Var = (q0) v0Var;
                    F0 f02 = c5144x.f43049g;
                    AbstractC3557B.c0("error", q0Var);
                    f02.setValue(new wd.l0(q0Var));
                }
                if (v0Var instanceof u0) {
                    c5144x.f43049g.setValue(new n0((List) ((u0) v0Var).f48468a));
                }
                return jf.y.f36177a;
            }
        }
        c5142v = new C5142v(this, abstractC4825e);
        Object obj2 = c5142v.f43036Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5142v.f43038i0;
        if (i10 == 0) {
        }
        v0Var = (v0) obj2;
        if (v0Var instanceof q0) {
        }
        if (v0Var instanceof u0) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Activity activity, String str, AbstractC4825e abstractC4825e) {
        C5143w c5143w;
        int i10;
        r rVar;
        C5144x c5144x;
        r rVar2;
        if (abstractC4825e instanceof C5143w) {
            c5143w = (C5143w) abstractC4825e;
            int i11 = c5143w.f43042i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5143w.f43042i0 = i11 - Integer.MIN_VALUE;
                Object obj = c5143w.f43040Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5143w.f43042i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            rVar = (r) c5143w.f43039Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return rVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5144x = (C5144x) c5143w.f43039Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c5143w.f43039Y = this;
                    c5143w.f43042i0 = 1;
                    obj = ((qc.i) this.f43043a).b(activity, str, c5143w);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5144x = this;
                }
                rVar2 = (r) obj;
                if (!(rVar2 instanceof C5138q)) {
                    xd.a aVar = c5144x.f43045c;
                    c5143w.f43039Y = rVar2;
                    c5143w.f43042i0 = 2;
                    if (((C5463l) aVar).f(c5143w) == enumC5000a) {
                        return enumC5000a;
                    }
                    rVar = rVar2;
                    return rVar;
                }
                return rVar2;
            }
        }
        c5143w = new C5143w(this, abstractC4825e);
        Object obj2 = c5143w.f43040Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5143w.f43042i0;
        if (i10 == 0) {
        }
        rVar2 = (r) obj2;
        if (!(rVar2 instanceof C5138q)) {
        }
    }
}
