package Mb;

import Uc.C1431p;
import Uc.C1434t;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1789c0;
import Z8.C1810n;
import Z8.C1812o;
import android.content.Context;
import android.content.Intent;
import b9.C2134c;
import b9.C2135d;
import b9.C2136e;
import b9.C2137f;
import b9.C2138g;
import b9.EnumC2132a;
import c9.AbstractC2307a;
import com.openai.chatgpt.R;
import com.openai.experiment.ExperimentKey;
import f9.C2958j;
import id.AbstractC3557B;
import jf.C3959i;
import m.AbstractActivityC4532l;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import u7.C5848d;
import wd.EnumC6206t;

/* renamed from: Mb.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954g extends AbstractC0949d0 {

    /* renamed from: q  reason: collision with root package name */
    public static final Intent f11933q;

    /* renamed from: j  reason: collision with root package name */
    public final EnumC6206t f11934j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC2307a f11935k;

    /* renamed from: l  reason: collision with root package name */
    public final p9.s f11936l;

    /* renamed from: m  reason: collision with root package name */
    public final Kc.b f11937m;

    /* renamed from: n  reason: collision with root package name */
    public final Lc.e f11938n;

    /* renamed from: o  reason: collision with root package name */
    public final com.openai.experiment.t f11939o;

    /* renamed from: p  reason: collision with root package name */
    public final Ng.D0 f11940p = Ad.l.O0(AbstractC4828h.Q(this), null, null, new C0946c(this, null), 3);

    static {
        Intent intent = new Intent();
        A7.b.G0(intent, "https://help.openai.com/en/articles/8261897-chatgpt-android-app-sign-in-error-something-went-wrong-with-code-17-error");
        f11933q = intent;
    }

    public C0954g(EnumC6206t enumC6206t, AbstractC2307a abstractC2307a, p9.s sVar, Kc.b bVar, Lc.e eVar, com.openai.experiment.t tVar) {
        super(new C0951e0(false, null, false));
        this.f11934j = enumC6206t;
        this.f11935k = abstractC2307a;
        this.f11936l = sVar;
        this.f11937m = bVar;
        this.f11938n = eVar;
        this.f11939o = tVar;
        AbstractC1809m0.a().b(C1789c0.f23336c, kf.w.f37484Y);
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new C0944b(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(C0954g c0954g, AbstractC4825e abstractC4825e) {
        C0950e c0950e;
        int i10;
        wd.v0 v0Var;
        Object obj;
        String str;
        c0954g.getClass();
        if (abstractC4825e instanceof C0950e) {
            c0950e = (C0950e) abstractC4825e;
            int i11 = c0950e.f11913i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0950e.f11913i0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c0950e.f11911Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0950e.f11913i0;
                Kc.d dVar = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c0954g = c0950e.f11910Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj2);
                            v0Var = (wd.v0) obj2;
                            if (v0Var instanceof wd.q0) {
                                Throwable th2 = ((wd.q0) v0Var).f48450a;
                                if (th2 instanceof Kc.d) {
                                    dVar = (Kc.d) th2;
                                }
                                if (dVar != null) {
                                    c0954g.f(new W(dVar.f9625Y));
                                }
                            }
                            return v0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0954g = c0950e.f11910Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    nd.m mVar = (nd.m) obj2;
                    if (mVar != null) {
                        obj = mVar.f40292a;
                    } else {
                        obj = null;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    c0950e.f11910Y = c0954g;
                    c0950e.f11913i0 = 1;
                    obj = ((Lc.s) c0954g.f11937m).c(true, c0950e);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    return new wd.u0(new nd.m(str));
                }
                Kc.b bVar = c0954g.f11937m;
                c0950e.f11910Y = c0954g;
                c0950e.f11913i0 = 2;
                obj2 = ((Lc.s) bVar).b(true, c0950e);
                if (obj2 == enumC5000a) {
                    return enumC5000a;
                }
                v0Var = (wd.v0) obj2;
                if (v0Var instanceof wd.q0) {
                }
                return v0Var;
            }
        }
        c0950e = new C0950e(c0954g, abstractC4825e);
        Object obj22 = c0950e.f11911Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0950e.f11913i0;
        Kc.d dVar2 = null;
        if (i10 == 0) {
        }
        str = (String) obj;
        if (str == null) {
        }
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC0947c0 abstractC0947c0 = (AbstractC0947c0) iVar;
        AbstractC3557B.c0("intent", abstractC0947c0);
        if (abstractC0947c0 instanceof C0945b0) {
            f(new X(((C0945b0) abstractC0947c0).f11902a));
        } else if (abstractC0947c0 instanceof C0943a0) {
            f(new U(C1434t.f17696k.o1()));
        } else if (abstractC0947c0 instanceof Z) {
            f(new U(C1431p.f17692k.o1()));
        }
    }

    @Override // Mb.AbstractC0949d0
    public final void m(AbstractActivityC4532l abstractActivityC4532l) {
        AbstractC3557B.c0("activity", abstractActivityC4532l);
        EnumC2132a enumC2132a = ((C0951e0) this.f808e.getValue()).f11915b;
        if (enumC2132a == null) {
            return;
        }
        boolean c10 = ((com.openai.experiment.G) this.f11939o).c(ExperimentKey.BrowserLoginAllowlist.INSTANCE);
        AbstractC1805k0 a5 = AbstractC1809m0.a();
        C1810n c1810n = C1810n.f23389c;
        AbstractC2307a.f26366b.getClass();
        a5.b(c1810n, P4.a.o0(new C3959i("connection", C5848d.c(enumC2132a))));
        Ad.l.O0(AbstractC4828h.Q(this), null, null, new C0948d(this, abstractActivityC4532l, enumC2132a, c10, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, android.content.Context, java.util.Map, b9.a, Mb.g, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Context context, EnumC2132a enumC2132a, String str, String str2, boolean z10, AbstractC4825e abstractC4825e) {
        C0952f c0952f;
        EnumC5000a enumC5000a;
        int i10;
        String str3;
        String str4;
        EnumC2132a enumC2132a2;
        Context context2;
        C0954g c0954g;
        boolean z11;
        ?? r02;
        wd.v0 v0Var;
        String str5;
        C0954g c0954g2;
        String str6;
        String str7;
        EnumC2132a enumC2132a3;
        Context context3;
        Object obj;
        AbstractC2307a abstractC2307a;
        boolean z12;
        Object b10;
        Context context4 = context;
        EnumC2132a enumC2132a4 = enumC2132a;
        String str8 = str;
        String str9 = str2;
        if (abstractC4825e instanceof C0952f) {
            c0952f = (C0952f) abstractC4825e;
            int i11 = c0952f.f11930s0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0952f.f11930s0 = i11 - Integer.MIN_VALUE;
                Object obj2 = c0952f.f11928q0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c0952f.f11930s0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                com.google.android.gms.internal.play_billing.N.B0(obj2);
                                return jf.y.f36177a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z11 = c0952f.f11927p0;
                        String str10 = c0952f.f11921j0;
                        String str11 = c0952f.f11920i0;
                        EnumC2132a enumC2132a5 = c0952f.f11919h0;
                        Context context5 = c0952f.f11918Z;
                        C0954g c0954g3 = c0952f.f11917Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        str3 = str10;
                        str4 = str11;
                        enumC2132a2 = enumC2132a5;
                        r02 = 0;
                        context2 = context5;
                        c0954g = c0954g3;
                        v0Var = (wd.v0) obj2;
                        if (!(v0Var instanceof wd.u0)) {
                            jf.y yVar = (jf.y) ((wd.u0) v0Var).f48468a;
                            c0954g.l(C0942a.f11882k0);
                        } else if (v0Var instanceof wd.q0) {
                            wd.q0 q0Var = (wd.q0) v0Var;
                            AbstractC1805k0 a5 = AbstractC1809m0.a();
                            C1812o c1812o = C1812o.f23395c;
                            AbstractC2307a.f26366b.getClass();
                            a5.b(c1812o, P4.a.o0(new C3959i("connection", C5848d.c(enumC2132a2))));
                            if ((q0Var.f48450a instanceof C2134c) && z11) {
                                x8.W.W(Pc.e.a(), "Browser unavailable, retrying without allowlist", r02, r02, 6);
                                c0952f.f11917Y = r02;
                                c0952f.f11918Z = r02;
                                c0952f.f11919h0 = r02;
                                c0952f.f11920i0 = r02;
                                c0952f.f11921j0 = r02;
                                c0952f.f11930s0 = 3;
                                if (c0954g.o(context2, enumC2132a2, str4, str3, false, c0952f) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } else {
                                c0954g.l(C0942a.f11883l0);
                                p9.s sVar = c0954g.f11936l;
                                AbstractC3557B.c0("resolver", sVar);
                                EnumC6206t enumC6206t = c0954g.f11934j;
                                AbstractC3557B.c0("appType", enumC6206t);
                                Throwable th2 = q0Var.f48450a;
                                if (th2 instanceof C2138g) {
                                    AbstractC3557B.a0("null cannot be cast to non-null type com.openai.auth.AuthError.WebAuthFailed", th2);
                                    str5 = ((C2138g) th2).f25664Y;
                                    if (str5 == null || str5.length() == 0) {
                                        str5 = ((C2958j) sVar).a(R.string.login_generic_error);
                                    }
                                } else if (th2 instanceof C2136e) {
                                    str5 = ((C2958j) sVar).a(R.string.login_save_failed);
                                } else if (th2 instanceof C2135d) {
                                    str5 = ((C2958j) sVar).a(R.string.login_restore_failed);
                                } else if (th2 instanceof C2134c) {
                                    str5 = ((C2958j) sVar).a(R.string.login_browser_app_not_available);
                                } else if (th2 instanceof C2137f) {
                                    str5 = ((C2958j) sVar).a(R.string.login_generic_error);
                                } else {
                                    str5 = A7.b.G1(q0Var, sVar, enumC6206t);
                                }
                                c0954g.f(new V(str5, 0, 14));
                            }
                        } else if (v0Var instanceof wd.p0) {
                            c0954g.l(C0942a.f11884m0);
                        } else {
                            throw new RuntimeException();
                        }
                        return jf.y.f36177a;
                    }
                    boolean z13 = c0952f.f11927p0;
                    String str12 = c0952f.f11926o0;
                    String str13 = c0952f.f11925n0;
                    EnumC2132a enumC2132a6 = c0952f.f11924m0;
                    Context context6 = c0952f.f11923l0;
                    AbstractC2307a abstractC2307a2 = c0952f.f11922k0;
                    String str14 = c0952f.f11921j0;
                    String str15 = c0952f.f11920i0;
                    EnumC2132a enumC2132a7 = c0952f.f11919h0;
                    Context context7 = c0952f.f11918Z;
                    C0954g c0954g4 = c0952f.f11917Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    z12 = z13;
                    context4 = context7;
                    c0954g2 = c0954g4;
                    obj = obj2;
                    str6 = str12;
                    enumC2132a4 = enumC2132a7;
                    str7 = str13;
                    str8 = str15;
                    enumC2132a3 = enumC2132a6;
                    str9 = str14;
                    context3 = context6;
                    abstractC2307a = abstractC2307a2;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj2);
                    l(C0942a.f11881j0);
                    c0952f.f11917Y = this;
                    c0952f.f11918Z = context4;
                    c0952f.f11919h0 = enumC2132a4;
                    c0952f.f11920i0 = str8;
                    c0952f.f11921j0 = str9;
                    AbstractC2307a abstractC2307a3 = this.f11935k;
                    c0952f.f11922k0 = abstractC2307a3;
                    c0952f.f11923l0 = context4;
                    c0952f.f11924m0 = enumC2132a4;
                    c0952f.f11925n0 = str8;
                    c0952f.f11926o0 = str9;
                    c0952f.f11927p0 = z10;
                    c0952f.f11930s0 = 1;
                    obj = this.f11938n.a(c0952f);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c0954g2 = this;
                    context3 = context4;
                    enumC2132a3 = enumC2132a4;
                    str7 = str8;
                    str6 = str9;
                    abstractC2307a = abstractC2307a3;
                    z12 = z10;
                }
                c0952f.f11917Y = c0954g2;
                c0952f.f11918Z = context4;
                c0952f.f11919h0 = enumC2132a4;
                c0952f.f11920i0 = str8;
                c0952f.f11921j0 = str9;
                c0952f.f11922k0 = null;
                c0952f.f11923l0 = null;
                c0952f.f11924m0 = null;
                c0952f.f11925n0 = null;
                c0952f.f11926o0 = null;
                c0952f.f11927p0 = z12;
                c0952f.f11930s0 = 2;
                C0954g c0954g5 = c0954g2;
                r02 = 0;
                b10 = abstractC2307a.b(context3, enumC2132a3, str7, str6, (String) obj, z12, c0952f);
                if (b10 != enumC5000a) {
                    return enumC5000a;
                }
                context2 = context4;
                enumC2132a2 = enumC2132a4;
                str4 = str8;
                str3 = str9;
                z11 = z12;
                obj2 = b10;
                c0954g = c0954g5;
                v0Var = (wd.v0) obj2;
                if (!(v0Var instanceof wd.u0)) {
                }
                return jf.y.f36177a;
            }
        }
        c0952f = new C0952f(this, abstractC4825e);
        Object obj22 = c0952f.f11928q0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c0952f.f11930s0;
        if (i10 == 0) {
        }
        c0952f.f11917Y = c0954g2;
        c0952f.f11918Z = context4;
        c0952f.f11919h0 = enumC2132a4;
        c0952f.f11920i0 = str8;
        c0952f.f11921j0 = str9;
        c0952f.f11922k0 = null;
        c0952f.f11923l0 = null;
        c0952f.f11924m0 = null;
        c0952f.f11925n0 = null;
        c0952f.f11926o0 = null;
        c0952f.f11927p0 = z12;
        c0952f.f11930s0 = 2;
        C0954g c0954g52 = c0954g2;
        r02 = 0;
        b10 = abstractC2307a.b(context3, enumC2132a3, str7, str6, (String) obj, z12, c0952f);
        if (b10 != enumC5000a) {
        }
    }
}
