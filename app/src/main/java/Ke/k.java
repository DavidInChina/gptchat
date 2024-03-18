package ke;

import Fe.u;
import Ng.AbstractC1073l0;
import Ng.AbstractC1085t;
import Ng.C1059e0;
import Ng.C1071k0;
import Ng.C1072l;
import Ng.C1079o0;
import Ng.G;
import S0.x;
import S8.C1368l;
import Wh.B;
import Wh.D;
import Wh.E;
import Wh.F;
import Wh.w;
import Wh.y;
import Wh.z;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import j$.util.DesugarCollections;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import jf.C3963m;
import jh.H1;
import jh.L1;
import ji.AbstractC4137l;
import l8.AbstractC4344b;
import me.O;
import me.P;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4831k;
import of.EnumC5000a;
import q1.AbstractC5260f;
import te.C5761e;
import te.C5764h;
import ud.C5902a;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6396A;
import xe.C6397B;
import xe.C6398C;
import xe.C6417f;
import xe.C6433v;
import zc.C6821H;
import ze.AbstractC6844c;
import ze.AbstractC6845d;
import ze.AbstractC6846e;
import ze.AbstractC6847f;
import ze.AbstractC6848g;

/* loaded from: classes2.dex */
public final class k extends je.d {

    /* renamed from: o0  reason: collision with root package name */
    public static final C3963m f37403o0 = R4.b.D1(f.f37383Y);

    /* renamed from: j0  reason: collision with root package name */
    public final d f37404j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Set f37405k0 = R4.b.X1(P.f39182d, se.e.f45556a);

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC4831k f37406l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AbstractC4831k f37407m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Map f37408n0;

    /* JADX WARN: Type inference failed for: r0v2, types: [ke.g, kotlin.jvm.internal.j] */
    public k(d dVar) {
        this.f37404j0 = dVar;
        Map synchronizedMap = DesugarCollections.synchronizedMap(new Fe.r(new kotlin.jvm.internal.j(1, this, k.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0)));
        AbstractC3557B.b0("synchronizedMap(LRUCache\u2026upplier, close, maxSize))", synchronizedMap);
        this.f37408n0 = synchronizedMap;
        AbstractC4829i abstractC4829i = super.i().get(C1071k0.f12951Y);
        AbstractC3557B.Z(abstractC4829i);
        AbstractC4831k Q02 = AbstractC4344b.Q0(new C1079o0((AbstractC1073l0) abstractC4829i), new x(2));
        this.f37406l0 = Q02;
        this.f37407m0 = super.i().plus(Q02);
        Ad.l.N0(C1059e0.f12936Y, super.i(), G.f12869h0, new e(this, null));
    }

    public static C5764h a(D d10, He.b bVar, Object obj, AbstractC4831k abstractC4831k) {
        C6397B c6397b;
        C6397B c6397b2;
        C6398C c6398c = new C6398C(d10.f21133i0, d10.f21132h0);
        Wh.x xVar = d10.f21131Z;
        AbstractC3557B.c0("<this>", xVar);
        int ordinal = xVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    c6397b = C6397B.f49818d;
                    if (ordinal != 3 && ordinal != 4) {
                        if (ordinal == 5) {
                            c6397b2 = C6397B.f49822h;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    Wh.q qVar = d10.f21135k0;
                    AbstractC3557B.c0("<this>", qVar);
                    return new C5764h(c6398c, bVar, new q(qVar), c6397b, obj, abstractC4831k);
                }
                c6397b2 = C6397B.f49821g;
            } else {
                c6397b2 = C6397B.f49819e;
            }
        } else {
            c6397b2 = C6397B.f49820f;
        }
        c6397b = c6397b2;
        Wh.q qVar2 = d10.f21135k0;
        AbstractC3557B.c0("<this>", qVar2);
        return new C5764h(c6398c, bVar, new q(qVar2), c6397b, obj, abstractC4831k);
    }

    @Override // je.d, je.c
    public final Set K() {
        return this.f37405k0;
    }

    @Override // je.d, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        AbstractC4829i abstractC4829i = this.f37406l0.get(C1071k0.f12951Y);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.CompletableJob", abstractC4829i);
        ((C1079o0) ((AbstractC1085t) abstractC4829i)).q0();
    }

    @Override // je.d, Ng.F
    public final AbstractC4831k i() {
        return this.f37407m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(C5761e c5761e, AbstractC4825e abstractC4825e) {
        h hVar;
        int i10;
        C5761e c5761e2;
        k kVar;
        Jb.c cVar;
        AbstractC6432u abstractC6432u;
        C6417f b10;
        String str;
        Long a5;
        String str2;
        C6396A c6396a;
        B b11;
        w wVar;
        if (abstractC4825e instanceof h) {
            hVar = (h) abstractC4825e;
            int i11 = hVar.f37388j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f37388j0 = i11 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj = hVar2.f37386h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = hVar2.f37388j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                N.B0(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj);
                        return obj;
                    }
                    C5761e c5761e3 = hVar2.f37385Z;
                    k kVar2 = hVar2.f37384Y;
                    N.B0(obj);
                    c5761e2 = c5761e3;
                    kVar = kVar2;
                } else {
                    N.B0(obj);
                    hVar2.f37384Y = this;
                    hVar2.f37385Z = c5761e;
                    hVar2.f37388j0 = 1;
                    Set set = je.l.f36140a;
                    AbstractC4829i abstractC4829i = hVar2.getContext().get(je.i.f36134Z);
                    AbstractC3557B.Z(abstractC4829i);
                    AbstractC4831k abstractC4831k = ((je.i) abstractC4829i).f36135Y;
                    if (abstractC4831k == enumC5000a) {
                        return enumC5000a;
                    }
                    c5761e2 = c5761e;
                    obj = abstractC4831k;
                    kVar = this;
                }
                AbstractC4831k abstractC4831k2 = (AbstractC4831k) obj;
                y yVar = new y();
                yVar.g(c5761e2.f46131a.f49865h);
                cVar = new Jb.c(15, yVar);
                Set set2 = je.l.f36140a;
                abstractC6432u = c5761e2.f46133c;
                AbstractC3557B.c0("requestHeaders", abstractC6432u);
                AbstractC6848g abstractC6848g = c5761e2.f46134d;
                AbstractC3557B.c0("content", abstractC6848g);
                Oc.c cVar2 = new Oc.c(abstractC6432u, 10, abstractC6848g);
                C6433v c6433v = new C6433v();
                cVar2.invoke(c6433v);
                c6433v.n().d(new C1368l(cVar, 12));
                List list = AbstractC6435x.f49956a;
                if (abstractC6432u.e(SIPHeaderNames.USER_AGENT) == null && abstractC6848g.c().e(SIPHeaderNames.USER_AGENT) == null) {
                    boolean z10 = u.f5364a;
                    cVar.invoke(SIPHeaderNames.USER_AGENT, "Ktor client");
                }
                b10 = abstractC6848g.b();
                if ((b10 != null || (str = b10.toString()) == null) && (str = abstractC6848g.c().e(SIPHeaderNames.CONTENT_TYPE)) == null) {
                    str = abstractC6432u.e(SIPHeaderNames.CONTENT_TYPE);
                }
                a5 = abstractC6848g.a();
                if ((a5 != null || (str2 = a5.toString()) == null) && (str2 = abstractC6848g.c().e(SIPHeaderNames.CONTENT_LENGTH)) == null) {
                    str2 = abstractC6432u.e(SIPHeaderNames.CONTENT_LENGTH);
                }
                if (str != null) {
                    cVar.invoke(SIPHeaderNames.CONTENT_TYPE, str);
                }
                if (str2 != null) {
                    cVar.invoke(SIPHeaderNames.CONTENT_LENGTH, str2);
                }
                c6396a = c5761e2.f46132b;
                if (!U3.f.i0(c6396a.f49817a)) {
                    AbstractC3557B.c0("callContext", abstractC4831k2);
                    if (abstractC6848g instanceof AbstractC6844c) {
                        byte[] e10 = ((AbstractC6844c) abstractC6848g).e();
                        int i12 = B.f21116a;
                        Pattern pattern = Wh.u.f21259c;
                        b11 = H1.k(0, e10.length, L1.p(String.valueOf(abstractC6848g.b())), e10);
                    } else if (abstractC6848g instanceof AbstractC6846e) {
                        b11 = new s(abstractC6848g.a(), new zc.u(10, abstractC6848g));
                    } else if (abstractC6848g instanceof AbstractC6847f) {
                        b11 = new s(abstractC6848g.a(), new C5902a(abstractC4831k2, 2, abstractC6848g));
                    } else if (abstractC6848g instanceof AbstractC6845d) {
                        int i13 = B.f21116a;
                        b11 = H1.k(0, 0, null, new byte[0]);
                    } else {
                        throw new N7.a(abstractC6848g);
                    }
                } else {
                    b11 = null;
                }
                yVar.e(c6396a.f49817a, b11);
                z b12 = yVar.b();
                Map map = kVar.f37408n0;
                O o10 = P.f39182d;
                wVar = (w) map.get(c5761e2.a());
                if (wVar == null) {
                    if (abstractC6848g instanceof se.f) {
                        hVar2.f37384Y = null;
                        hVar2.f37385Z = null;
                        hVar2.f37388j0 = 2;
                        obj = kVar.m(wVar, b12, abstractC4831k2, hVar2);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        return obj;
                    }
                    hVar2.f37384Y = null;
                    hVar2.f37385Z = null;
                    hVar2.f37388j0 = 3;
                    obj = kVar.k(wVar, b12, abstractC4831k2, c5761e2, hVar2);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    return obj;
                }
                throw new IllegalStateException("OkHttpClient can't be constructed because HttpTimeout plugin is not installed".toString());
            }
        }
        hVar = new h(this, abstractC4825e);
        h hVar22 = hVar;
        Object obj2 = hVar22.f37386h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = hVar22.f37388j0;
        if (i10 == 0) {
        }
        AbstractC4831k abstractC4831k22 = (AbstractC4831k) obj2;
        y yVar2 = new y();
        yVar2.g(c5761e2.f46131a.f49865h);
        cVar = new Jb.c(15, yVar2);
        Set set22 = je.l.f36140a;
        abstractC6432u = c5761e2.f46133c;
        AbstractC3557B.c0("requestHeaders", abstractC6432u);
        AbstractC6848g abstractC6848g2 = c5761e2.f46134d;
        AbstractC3557B.c0("content", abstractC6848g2);
        Oc.c cVar22 = new Oc.c(abstractC6432u, 10, abstractC6848g2);
        C6433v c6433v2 = new C6433v();
        cVar22.invoke(c6433v2);
        c6433v2.n().d(new C1368l(cVar, 12));
        List list2 = AbstractC6435x.f49956a;
        if (abstractC6432u.e(SIPHeaderNames.USER_AGENT) == null) {
            boolean z102 = u.f5364a;
            cVar.invoke(SIPHeaderNames.USER_AGENT, "Ktor client");
        }
        b10 = abstractC6848g2.b();
        if (b10 != null) {
        }
        str = abstractC6432u.e(SIPHeaderNames.CONTENT_TYPE);
        a5 = abstractC6848g2.a();
        if (a5 != null) {
        }
        str2 = abstractC6432u.e(SIPHeaderNames.CONTENT_LENGTH);
        if (str != null) {
        }
        if (str2 != null) {
        }
        c6396a = c5761e2.f46132b;
        if (!U3.f.i0(c6396a.f49817a)) {
        }
        yVar2.e(c6396a.f49817a, b11);
        z b122 = yVar2.b();
        Map map2 = kVar.f37408n0;
        O o102 = P.f39182d;
        wVar = (w) map2.get(c5761e2.a());
        if (wVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(w wVar, z zVar, AbstractC4831k abstractC4831k, C5761e c5761e, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        k kVar;
        He.b bVar;
        F f6;
        AbstractC4137l abstractC4137l;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f37395l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f37395l0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f37393j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f37395l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        bVar = iVar.f37392i0;
                        c5761e = iVar.f37391h0;
                        abstractC4831k = iVar.f37390Z;
                        kVar = iVar.f37389Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Calendar calendar = Calendar.getInstance(He.a.f7667a, Locale.ROOT);
                    AbstractC3557B.Z(calendar);
                    He.b b10 = He.a.b(calendar, null);
                    iVar.f37389Y = this;
                    iVar.f37390Z = abstractC4831k;
                    iVar.f37391h0 = c5761e;
                    iVar.f37392i0 = b10;
                    iVar.f37395l0 = 1;
                    C1072l c1072l = new C1072l(1, AbstractC5260f.z(iVar));
                    c1072l.u();
                    ai.j b11 = wVar.b(zVar);
                    b11.e(new C4262a(c5761e, c1072l));
                    c1072l.w(new C6821H(14, b11));
                    Object t10 = c1072l.t();
                    if (t10 == enumC5000a) {
                        N.k0(iVar);
                    }
                    if (t10 == enumC5000a) {
                        return enumC5000a;
                    }
                    kVar = this;
                    obj = t10;
                    bVar = b10;
                }
                D d10 = (D) obj;
                f6 = d10.f21136l0;
                AbstractC4829i abstractC4829i = abstractC4831k.get(C1071k0.f12951Y);
                AbstractC3557B.Z(abstractC4829i);
                ((AbstractC1073l0) abstractC4829i).V(new C6821H(13, f6));
                if (f6 != null || (abstractC4137l = ((E) f6).f21146h0) == null || (r11 = R4.b.r2(C1059e0.f12936Y, abstractC4831k, false, new m(abstractC4137l, abstractC4831k, c5761e, null)).f33364Z) == null) {
                    io.ktor.utils.io.x.f33593a.getClass();
                    Object obj2 = (io.ktor.utils.io.x) io.ktor.utils.io.w.f33592b.getValue();
                }
                kVar.getClass();
                return a(d10, bVar, obj2, abstractC4831k);
            }
        }
        iVar = new i(this, abstractC4825e);
        Object obj3 = iVar.f37393j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f37395l0;
        if (i10 == 0) {
        }
        D d102 = (D) obj3;
        f6 = d102.f21136l0;
        AbstractC4829i abstractC4829i2 = abstractC4831k.get(C1071k0.f12951Y);
        AbstractC3557B.Z(abstractC4829i2);
        ((AbstractC1073l0) abstractC4829i2).V(new C6821H(13, f6));
        if (f6 != null) {
        }
        io.ktor.utils.io.x.f33593a.getClass();
        Object obj22 = (io.ktor.utils.io.x) io.ktor.utils.io.w.f33592b.getValue();
        kVar.getClass();
        return a(d102, bVar, obj22, abstractC4831k);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(w wVar, z zVar, AbstractC4831k abstractC4831k, AbstractC4825e abstractC4825e) {
        j jVar;
        int i10;
        He.b bVar;
        o oVar;
        k kVar;
        if (abstractC4825e instanceof j) {
            jVar = (j) abstractC4825e;
            int i11 = jVar.f37402l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f37402l0 = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f37400j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = jVar.f37402l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        oVar = jVar.f37399i0;
                        bVar = jVar.f37398h0;
                        abstractC4831k = jVar.f37397Z;
                        kVar = jVar.f37396Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Calendar calendar = Calendar.getInstance(He.a.f7667a, Locale.ROOT);
                    AbstractC3557B.Z(calendar);
                    He.b b10 = He.a.b(calendar, null);
                    this.f37404j0.getClass();
                    o oVar2 = new o(wVar, wVar, zVar, abstractC4831k);
                    oVar2.f37430h0.b0(oVar2);
                    jVar.f37396Y = this;
                    jVar.f37397Z = abstractC4831k;
                    jVar.f37398h0 = b10;
                    jVar.f37399i0 = oVar2;
                    jVar.f37402l0 = 1;
                    Object z10 = oVar2.f37431i0.z(jVar);
                    if (z10 == enumC5000a) {
                        return enumC5000a;
                    }
                    kVar = this;
                    bVar = b10;
                    obj = z10;
                    oVar = oVar2;
                }
                kVar.getClass();
                return a((D) obj, bVar, oVar, abstractC4831k);
            }
        }
        jVar = new j(this, abstractC4825e);
        Object obj2 = jVar.f37400j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = jVar.f37402l0;
        if (i10 == 0) {
        }
        kVar.getClass();
        return a((D) obj2, bVar, oVar, abstractC4831k);
    }
}
