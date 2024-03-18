package ta;

import Z8.AbstractC1805k0;
import Z8.C0;
import id.AbstractC3557B;
import java.security.MessageDigest;
import jf.C3959i;
import kf.AbstractC4268D;
import nd.C4812a;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: ta.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5715n {

    /* renamed from: h  reason: collision with root package name */
    public static final long f45975h = Df.H.x0(5, Mg.d.f12135j0);

    /* renamed from: a  reason: collision with root package name */
    public final Yg.b f45976a;

    /* renamed from: b  reason: collision with root package name */
    public final Kc.c f45977b;

    /* renamed from: c  reason: collision with root package name */
    public final Lc.e f45978c;

    /* renamed from: d  reason: collision with root package name */
    public final C4812a f45979d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1805k0 f45980e;

    /* renamed from: f  reason: collision with root package name */
    public final Pc.g f45981f = Bi.c.i1(Pc.b.f13928Y);

    /* renamed from: g  reason: collision with root package name */
    public C5711j f45982g;

    static {
        Mg.a aVar = Mg.b.f12127Z;
    }

    public C5715n(Yg.b bVar, Kc.c cVar, Lc.e eVar, C4812a c4812a, AbstractC1805k0 abstractC1805k0) {
        this.f45976a = bVar;
        this.f45977b = cVar;
        this.f45978c = eVar;
        this.f45979d = c4812a;
        this.f45980e = abstractC1805k0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, AbstractC4825e abstractC4825e) {
        C5712k c5712k;
        EnumC5000a enumC5000a;
        int i10;
        Yg.p pVar;
        b0 b0Var;
        C5715n c5715n;
        Object obj;
        Yg.p a5;
        C5715n c5715n2;
        Object obj2;
        String str3;
        String str4;
        Object a10;
        if (abstractC4825e instanceof C5712k) {
            c5712k = (C5712k) abstractC4825e;
            int i11 = c5712k.f45964m0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5712k.f45964m0 = i11 - Integer.MIN_VALUE;
                Object obj3 = c5712k.f45962k0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c5712k.f45964m0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            b0Var = (b0) c5712k.f45959h0;
                            pVar = (Yg.p) c5712k.f45958Z;
                            c5715n = c5712k.f45957Y;
                            com.google.android.gms.internal.play_billing.N.B0(obj3);
                            obj = (Vc.x) obj3;
                            if (!(obj instanceof Vc.w)) {
                                obj = new Vc.w(new C5711j(b0Var, (Kc.e) ((Vc.w) obj).f18565a, pVar));
                            } else if (!(obj instanceof Vc.q) && !(obj instanceof Vc.r)) {
                                throw new RuntimeException();
                            }
                            x8.W.F(c5715n.f45981f, "Generated integrity token in ".concat(Mg.b.m(((Yg.a) c5715n.f45976a).a().b(pVar))), null, 6);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = c5712k.f45961j0;
                    Yg.p pVar2 = c5712k.f45960i0;
                    str3 = (String) c5712k.f45958Z;
                    c5715n2 = c5712k.f45957Y;
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    obj2 = obj3;
                    a5 = pVar2;
                    str2 = (String) c5712k.f45959h0;
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj3);
                    a5 = ((Yg.a) this.f45976a).a();
                    String str5 = this.f45979d.f40276c;
                    c5712k.f45957Y = this;
                    c5712k.f45958Z = str;
                    c5712k.f45959h0 = str2;
                    c5712k.f45960i0 = a5;
                    c5712k.f45961j0 = str5;
                    c5712k.f45964m0 = 1;
                    Object a11 = this.f45978c.a(c5712k);
                    if (a11 == enumC5000a) {
                        return enumC5000a;
                    }
                    c5715n2 = this;
                    obj2 = a11;
                    str3 = str;
                    str4 = str5;
                }
                b0 b0Var2 = new b0(str4, (String) obj2, str2, str3);
                String d10 = md.b.f39132a.d(b0.Companion.serializer(), b0Var2);
                Pc.g gVar = c5715n2.f45981f;
                x8.W.F(gVar, "Generating integrity token for parameters: " + b0Var2, null, 6);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = d10.getBytes(Lg.a.f11131a);
                AbstractC3557B.b0("getBytes(...)", bytes);
                byte[] digest = messageDigest.digest(bytes);
                AbstractC3557B.Z(digest);
                String q32 = kf.q.q3(digest, "", C5705d.f45910i0, 30);
                c5712k.f45957Y = c5715n2;
                c5712k.f45958Z = a5;
                c5712k.f45959h0 = b0Var2;
                c5712k.f45960i0 = null;
                c5712k.f45961j0 = null;
                c5712k.f45964m0 = 2;
                a10 = ((Lc.y) c5715n2.f45977b).a(q32, c5712k, false);
                if (a10 != enumC5000a) {
                    return enumC5000a;
                }
                pVar = a5;
                c5715n = c5715n2;
                obj3 = a10;
                b0Var = b0Var2;
                obj = (Vc.x) obj3;
                if (!(obj instanceof Vc.w)) {
                }
                x8.W.F(c5715n.f45981f, "Generated integrity token in ".concat(Mg.b.m(((Yg.a) c5715n.f45976a).a().b(pVar))), null, 6);
                return obj;
            }
        }
        c5712k = new C5712k(this, abstractC4825e);
        Object obj32 = c5712k.f45962k0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c5712k.f45964m0;
        if (i10 == 0) {
        }
        b0 b0Var22 = new b0(str4, (String) obj2, str2, str3);
        String d102 = md.b.f39132a.d(b0.Companion.serializer(), b0Var22);
        Pc.g gVar2 = c5715n2.f45981f;
        x8.W.F(gVar2, "Generating integrity token for parameters: " + b0Var22, null, 6);
        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
        byte[] bytes2 = d102.getBytes(Lg.a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes2);
        byte[] digest2 = messageDigest2.digest(bytes2);
        AbstractC3557B.Z(digest2);
        String q322 = kf.q.q3(digest2, "", C5705d.f45910i0, 30);
        c5712k.f45957Y = c5715n2;
        c5712k.f45958Z = a5;
        c5712k.f45959h0 = b0Var22;
        c5712k.f45960i0 = null;
        c5712k.f45961j0 = null;
        c5712k.f45964m0 = 2;
        a10 = ((Lc.y) c5715n2.f45977b).a(q322, c5712k, false);
        if (a10 != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, AbstractC4825e abstractC4825e) {
        C5713l c5713l;
        int i10;
        Yg.p pVar;
        Vc.x xVar;
        Boolean bool;
        C5715n c5715n;
        Yg.p pVar2;
        Boolean bool2;
        if (abstractC4825e instanceof C5713l) {
            c5713l = (C5713l) abstractC4825e;
            int i11 = c5713l.f45970k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5713l.f45970k0 = i11 - Integer.MIN_VALUE;
                Object obj = c5713l.f45968i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5713l.f45970k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        bool2 = c5713l.f45967h0;
                        pVar2 = c5713l.f45966Z;
                        c5715n = c5713l.f45965Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    pVar = ((Yg.a) this.f45976a).a();
                    C5711j c5711j = this.f45982g;
                    if (c5711j != null) {
                        bool = Boolean.valueOf(c(c5711j, str, str2));
                    } else {
                        bool = null;
                    }
                    boolean K10 = AbstractC3557B.K(bool, Boolean.TRUE);
                    Pc.g gVar = this.f45981f;
                    if (K10) {
                        x8.W.F(gVar, "Cached integrity token was valid", null, 6);
                        this.f45982g = null;
                        xVar = new Vc.w(c5711j);
                        c5715n = this;
                        long e10 = Mg.b.e(((Yg.a) c5715n.f45976a).a().b(pVar));
                        x8.W.F(c5715n.f45981f, "getToken in " + e10 + " ms", null, 6);
                        c5715n.f45980e.b(C0.f23241c, AbstractC4268D.a1(new C3959i("perceived_latency_ms", new Long(e10)), new C3959i("success", Boolean.valueOf(xVar instanceof Vc.w)), new C3959i("cached", Boolean.valueOf(AbstractC3557B.K(bool, Boolean.TRUE)))));
                        return xVar;
                    }
                    x8.W.F(gVar, "No valid token, generating new integrity token", null, 6);
                    c5713l.f45965Y = this;
                    c5713l.f45966Z = pVar;
                    c5713l.f45967h0 = bool;
                    c5713l.f45970k0 = 1;
                    Object a5 = a(str, str2, c5713l);
                    if (a5 == enumC5000a) {
                        return enumC5000a;
                    }
                    c5715n = this;
                    pVar2 = pVar;
                    obj = a5;
                    bool2 = bool;
                }
                bool = bool2;
                xVar = (Vc.x) obj;
                pVar = pVar2;
                long e102 = Mg.b.e(((Yg.a) c5715n.f45976a).a().b(pVar));
                x8.W.F(c5715n.f45981f, "getToken in " + e102 + " ms", null, 6);
                c5715n.f45980e.b(C0.f23241c, AbstractC4268D.a1(new C3959i("perceived_latency_ms", new Long(e102)), new C3959i("success", Boolean.valueOf(xVar instanceof Vc.w)), new C3959i("cached", Boolean.valueOf(AbstractC3557B.K(bool, Boolean.TRUE)))));
                return xVar;
            }
        }
        c5713l = new C5713l(this, abstractC4825e);
        Object obj2 = c5713l.f45968i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5713l.f45970k0;
        if (i10 == 0) {
        }
        bool = bool2;
        xVar = (Vc.x) obj2;
        pVar = pVar2;
        long e1022 = Mg.b.e(((Yg.a) c5715n.f45976a).a().b(pVar));
        x8.W.F(c5715n.f45981f, "getToken in " + e1022 + " ms", null, 6);
        c5715n.f45980e.b(C0.f23241c, AbstractC4268D.a1(new C3959i("perceived_latency_ms", new Long(e1022)), new C3959i("success", Boolean.valueOf(xVar instanceof Vc.w)), new C3959i("cached", Boolean.valueOf(AbstractC3557B.K(bool, Boolean.TRUE)))));
        return xVar;
    }

    public final boolean c(C5711j c5711j, String str, String str2) {
        b0 b0Var;
        String str3;
        String str4;
        if (Mg.b.c(((Yg.a) this.f45976a).a().b(c5711j.f45955c), f45975h) < 0 && ((str3 = (b0Var = c5711j.f45953a).f45906d) != null ? str != null && AbstractC3557B.K(str3, str) : str == null) && ((str4 = b0Var.f45905c) != null ? str2 != null && AbstractC3557B.K(str4, str2) : str2 == null)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, AbstractC4825e abstractC4825e) {
        C5714m c5714m;
        int i10;
        C5715n c5715n;
        Vc.x xVar;
        C5711j c5711j;
        if (abstractC4825e instanceof C5714m) {
            c5714m = (C5714m) abstractC4825e;
            int i11 = c5714m.f45974i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5714m.f45974i0 = i11 - Integer.MIN_VALUE;
                Object obj = c5714m.f45972Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5714m.f45974i0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c5715n = c5714m.f45971Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C5711j c5711j2 = this.f45982g;
                    if (c5711j2 != null && c(c5711j2, str, str2)) {
                        return yVar;
                    }
                    c5714m.f45971Y = this;
                    c5714m.f45974i0 = 1;
                    obj = a(str, str2, c5714m);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c5715n = this;
                }
                xVar = (Vc.x) obj;
                if (!(xVar instanceof Vc.w)) {
                    c5711j = (C5711j) ((Vc.w) xVar).f18565a;
                } else if (xVar instanceof Vc.r) {
                    x8.W.G(c5715n.f45981f, "Failed to create integrity token", ((Vc.r) xVar).f18561a, 4);
                    return yVar;
                } else if (xVar instanceof Vc.q) {
                    c5711j = null;
                } else {
                    throw new RuntimeException();
                }
                c5715n.f45982g = c5711j;
                return yVar;
            }
        }
        c5714m = new C5714m(this, abstractC4825e);
        Object obj2 = c5714m.f45972Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5714m.f45974i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        xVar = (Vc.x) obj2;
        if (!(xVar instanceof Vc.w)) {
        }
        c5715n.f45982g = c5711j;
        return yVar2;
    }
}
