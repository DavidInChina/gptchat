package bb;

import Uc.C1422g;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import android.gov.nist.javax.sip.header.ParameterNames;
import cb.C2334C;
import cb.C2350T;
import cb.C2353W;
import com.openai.experiment.ExperimentKey;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import x9.C6383b;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class F0 extends n0 {

    /* renamed from: j  reason: collision with root package name */
    public final Va.e f25710j;

    /* renamed from: k  reason: collision with root package name */
    public final com.openai.experiment.t f25711k;

    /* renamed from: l  reason: collision with root package name */
    public final Qg.F0 f25712l;

    public F0(Va.e eVar, com.openai.experiment.t tVar) {
        super(new m0(kf.v.f37483Y, null, new H0((wd.o0) null, 3), null));
        this.f25710j = eVar;
        this.f25711k = tVar;
        Qg.F0 c10 = Qg.s0.c("");
        this.f25712l = c10;
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new o0(this, null), 3);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new q0(this, null), 3);
        L4.a.E0(L4.a.I0(new r0(this, null), new M1.w(L4.a.h0(c10, 400L), 24)), AbstractC4828h.Q(this));
        L4.a.E0(L4.a.I0(new s0(this, null), new M1.w(c10, 25)), AbstractC4828h.Q(this));
    }

    public static final m0 m(F0 f02, m0 m0Var, C2353W c2353w, wf.k kVar) {
        C2353W c2353w2;
        l0 l0Var;
        C2353W c2353w3;
        f02.getClass();
        List list = m0Var.f25872a;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (true) {
            c2353w2 = null;
            if (!it.hasNext()) {
                break;
            }
            H0 h02 = (H0) it.next();
            C2350T c2350t = h02.f25722c;
            if (c2350t != null) {
                c2353w2 = c2350t.f26486a;
            }
            if (AbstractC3557B.K(c2353w2, c2353w)) {
                h02 = (H0) kVar.invoke(h02);
            }
            arrayList.add(h02);
        }
        l0 l0Var2 = m0Var.f25875d;
        if (l0Var2 != null) {
            H0 h03 = l0Var2.f25869b;
            C2350T c2350t2 = h03.f25722c;
            if (c2350t2 != null) {
                c2353w3 = c2350t2.f26486a;
            } else {
                c2353w3 = null;
            }
            if (AbstractC3557B.K(c2353w3, c2353w)) {
                h03 = (H0) kVar.invoke(h03);
            }
            String str = l0Var2.f25868a;
            AbstractC3557B.c0("query", str);
            AbstractC3557B.c0("category", h03);
            String str2 = l0Var2.f25870c;
            AbstractC3557B.c0(ParameterNames.ID, str2);
            l0Var = new l0(str, h03, str2);
        } else {
            l0Var = null;
        }
        H0 h04 = m0Var.f25874c;
        C2350T c2350t3 = h04.f25722c;
        if (c2350t3 != null) {
            c2353w2 = c2350t3.f26486a;
        }
        if (AbstractC3557B.K(c2353w2, c2353w)) {
            h04 = (H0) kVar.invoke(h04);
        }
        return m0.e(m0Var, arrayList, null, h04, l0Var, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(F0 f02, C2350T c2350t, AbstractC4825e abstractC4825e) {
        t0 t0Var;
        int i10;
        wd.v0 v0Var;
        f02.getClass();
        if (abstractC4825e instanceof t0) {
            t0Var = (t0) abstractC4825e;
            int i11 = t0Var.f25903j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t0Var.f25903j0 = i11 - Integer.MIN_VALUE;
                Object obj = t0Var.f25901h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = t0Var.f25903j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2350t = t0Var.f25900Z;
                        f02 = t0Var.f25899Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (c2350t.f26488c != null) {
                        f02.l(new u0(f02, c2350t, 0));
                        t0Var.f25899Y = f02;
                        t0Var.f25900Z = c2350t;
                        t0Var.f25903j0 = 1;
                        obj = ((Ya.r) f02.f25710j).j(c2350t, t0Var);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    C2350T c2350t2 = (C2350T) ((wd.u0) v0Var).f48468a;
                    AbstractC1805k0 a5 = AbstractC1809m0.a();
                    Z8.E e10 = Z8.E.f23244c;
                    C3959i[] c3959iArr = new C3959i[2];
                    String str = c2350t.f26486a.f26493a;
                    if (str == null) {
                        str = "";
                    }
                    c3959iArr[0] = new C3959i("cutId", str);
                    c3959iArr[1] = new C3959i("count", new Integer(c2350t2.f26487b.size()));
                    a5.b(e10, AbstractC4268D.a1(c3959iArr));
                    f02.l(new v0(f02, c2350t, c2350t2, 0));
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    f02.g(new Ad.q(q0Var));
                    f02.l(new w0(f02, c2350t, q0Var, 0));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        t0Var = new t0(f02, abstractC4825e);
        Object obj2 = t0Var.f25901h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = t0Var.f25903j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(F0 f02, String str, AbstractC4825e abstractC4825e) {
        A0 a02;
        int i10;
        wd.v0 v0Var;
        f02.getClass();
        if (abstractC4825e instanceof A0) {
            a02 = (A0) abstractC4825e;
            int i11 = a02.f25684j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a02.f25684j0 = i11 - Integer.MIN_VALUE;
                Object obj = a02.f25682h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = a02.f25684j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str = a02.f25681Z;
                        f02 = a02.f25680Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    f02.l(new B0(str, 0));
                    a02.f25680Y = f02;
                    a02.f25681Z = str;
                    a02.f25684j0 = 1;
                    obj = ((Ya.r) f02.f25710j).m(str, null, a02);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    C2350T c2350t = (C2350T) ((wd.u0) v0Var).f48468a;
                    AbstractC1809m0.a().b(Z8.H.f23250c, AbstractC4268D.a1(new C3959i("query", str), new C3959i("count", new Integer(c2350t.f26487b.size()))));
                    f02.l(new Ra.l(str, 3, c2350t));
                } else if (v0Var instanceof wd.q0) {
                    f02.l(C2170j.f25848r0);
                    f02.g(new Ad.q((wd.q0) v0Var));
                } else if (v0Var instanceof wd.p0) {
                    f02.l(C2170j.f25849s0);
                } else {
                    throw new RuntimeException();
                }
                return jf.y.f36177a;
            }
        }
        a02 = new A0(f02, abstractC4825e);
        Object obj2 = a02.f25682h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = a02.f25684j0;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(F0 f02, C2350T c2350t, AbstractC4825e abstractC4825e) {
        C0 c02;
        int i10;
        wd.v0 v0Var;
        String str;
        f02.getClass();
        if (abstractC4825e instanceof C0) {
            c02 = (C0) abstractC4825e;
            int i11 = c02.f25692j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c02.f25692j0 = i11 - Integer.MIN_VALUE;
                Object obj = c02.f25690h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c02.f25692j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c2350t = c02.f25689Z;
                        f02 = c02.f25688Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    l0 l0Var = ((m0) f02.f808e.getValue()).f25875d;
                    if (l0Var != null) {
                        str = l0Var.f25868a;
                    } else {
                        str = null;
                    }
                    if (c2350t.f26488c != null && str != null) {
                        f02.l(new u0(f02, c2350t, 1));
                        c02.f25688Y = f02;
                        c02.f25689Z = c2350t;
                        c02.f25692j0 = 1;
                        obj = ((Ya.r) f02.f25710j).m(str, c2350t, c02);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return yVar;
                }
                v0Var = (wd.v0) obj;
                if (!(v0Var instanceof wd.u0)) {
                    C2350T c2350t2 = (C2350T) ((wd.u0) v0Var).f48468a;
                    AbstractC1805k0 a5 = AbstractC1809m0.a();
                    Z8.E e10 = Z8.E.f23244c;
                    C3959i[] c3959iArr = new C3959i[2];
                    String str2 = c2350t.f26486a.f26493a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c3959iArr[0] = new C3959i("cutId", str2);
                    c3959iArr[1] = new C3959i("count", new Integer(c2350t2.f26487b.size()));
                    a5.b(e10, AbstractC4268D.a1(c3959iArr));
                    f02.l(new v0(f02, c2350t, c2350t2, 1));
                } else if (v0Var instanceof wd.q0) {
                    wd.q0 q0Var = (wd.q0) v0Var;
                    f02.g(new Ad.q(q0Var));
                    f02.l(new w0(f02, c2350t, q0Var, 1));
                } else if (!(v0Var instanceof wd.p0)) {
                    throw new RuntimeException();
                }
                return yVar;
            }
        }
        c02 = new C0(f02, abstractC4825e);
        Object obj2 = c02.f25690h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c02.f25692j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        v0Var = (wd.v0) obj2;
        if (!(v0Var instanceof wd.u0)) {
        }
        return yVar2;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        String str;
        T t10 = (T) iVar;
        AbstractC3557B.c0("intent", t10);
        String str2 = null;
        if (t10 instanceof Q) {
            h(new x0(this, t10, null));
            return;
        }
        String str3 = "";
        if (t10 instanceof N) {
            AbstractC1805k0 a5 = AbstractC1809m0.a();
            Z8.I i10 = Z8.I.f23252c;
            C2350T c2350t = ((N) t10).f25736a;
            if (c2350t != null) {
                str2 = c2350t.f26489d;
            }
            if (str2 != null) {
                str3 = str2;
            }
            a5.c(i10, str3);
            l(new C6383b(29, t10));
        } else if (t10 instanceof P) {
            P p10 = (P) t10;
            AbstractC1805k0 a10 = AbstractC1809m0.a();
            Z8.O o10 = Z8.O.f23264c;
            C3959i[] c3959iArr = new C3959i[2];
            C2334C c2334c = p10.f25739b;
            c3959iArr[0] = new C3959i("gizmo_id", c2334c.f26438a);
            String str4 = p10.f25738a.f26493a;
            if (str4 != null) {
                str3 = str4;
            }
            c3959iArr[1] = new C3959i("section", str3);
            a10.b(o10, AbstractC4268D.a1(c3959iArr));
            boolean c10 = ((com.openai.experiment.G) this.f25711k).c(ExperimentKey.GizmoReviewsEnabled.INSTANCE);
            String str5 = c2334c.f26438a;
            if (c10) {
                str = Uc.y.f17703l.p1(str5);
            } else if (!c10) {
                str = C1422g.q1(str5, null);
            } else {
                throw new RuntimeException();
            }
            g(new Ad.p(str));
        } else if (t10 instanceof S) {
            h(new y0(this, t10, null));
        } else if (t10 instanceof O) {
            h(new z0(this, t10, null));
        } else {
            throw new RuntimeException();
        }
    }
}
