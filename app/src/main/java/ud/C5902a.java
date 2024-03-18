package ud;

import Ag.u;
import Bg.AbstractC0214g;
import Bg.AbstractC0218k;
import Bg.D;
import Bg.d0;
import Bg.o0;
import Df.AbstractC0405d;
import Df.v;
import Gf.C0627b;
import Gf.H;
import Gf.J;
import Gf.q0;
import Gf.r0;
import Gf.y0;
import H0.AbstractC0696o0;
import H0.C0689l;
import Lf.q;
import M3.I;
import Mf.A;
import Mf.AbstractC0997f;
import Mf.AbstractC0999h;
import Mf.AbstractC1001j;
import Mf.AbstractC1002k;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.B;
import Mf.EnumC0998g;
import N0.C1046e;
import Ng.C1059e0;
import Pf.C1156n;
import Pf.G;
import Ve.C;
import Ve.C1519y;
import Ve.E0;
import Ve.H0;
import Yf.C1697i;
import ah.C1995f;
import ah.C1996g;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import bh.C2213c;
import cf.AbstractC2408g;
import df.AbstractC2645j;
import dh.C2675A;
import dh.C2676B;
import dh.C2709k;
import dh.C2715q;
import e4.C2799g;
import fg.C3051t;
import fg.Q;
import id.AbstractC3557B;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import jf.y;
import jh.C4027i3;
import jh.EnumC4047m3;
import kf.t;
import kf.x;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l8.AbstractC4344b;
import livekit.LivekitRtc$SessionDescription;
import livekit.LivekitRtc$SignalRequest;
import livekit.org.webrtc.DataChannel;
import livekit.org.webrtc.IceCandidate;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4831k;
import ng.AbstractC4842i;
import rg.AbstractC5493d;
import s3.z;
import ug.AbstractC5926h;
import wf.AbstractC6216a;
import xg.K;
import yf.AbstractC6583a;
import z.AbstractC6708l;
import ze.AbstractC6848g;
import zg.C6862i;

/* renamed from: ud.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5902a extends o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46677Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f46678Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f46679h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5902a(Object obj, int i10, Object obj2) {
        super(0);
        this.f46677Y = i10;
        this.f46678Z = obj;
        this.f46679h0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.serialization.descriptors.SerialDescriptor] */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlinx.serialization.descriptors.SerialDescriptor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dh.A, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor] */
    public final SerialDescriptor a() {
        int i10 = this.f46677Y;
        Object obj = this.f46679h0;
        Object obj2 = this.f46678Z;
        switch (i10) {
            case 27:
                return Ad.l.O((String) obj2, C2213c.f25985b, new SerialDescriptor[0], new C1995f((C1996g) obj, 1));
            default:
                C2676B c2676b = (C2676B) obj2;
                ?? r02 = (SerialDescriptor) c2676b.f28379d;
                if (r02 == 0) {
                    Enum[] enumArr = (Enum[]) c2676b.f28378c;
                    r02 = new C2675A((String) obj, enumArr.length);
                    for (Enum r52 : enumArr) {
                        r02.k(r52.name(), false);
                    }
                }
                return r02;
        }
    }

    public final D c() {
        int i10 = this.f46677Y;
        Object obj = this.f46679h0;
        Object obj2 = this.f46678Z;
        switch (i10) {
            case 14:
                q qVar = (q) obj2;
                v[] vVarArr = q.f11113i;
                B b10 = qVar.g().f11093a;
                Lf.g.f11084d.getClass();
                return R4.b.v0(b10, Lf.g.f11088h, new U3.i((u) obj, qVar.g().f11093a)).n();
            default:
                D n10 = ((z) obj2).d().j().i(((Vf.b) obj).f18939a).n();
                AbstractC3557B.b0("getDefaultType(...)", n10);
                return n10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0243 A[SYNTHETIC] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo122invoke() {
        boolean z10;
        ArrayList arrayList;
        Collection collection;
        String str;
        y yVar = y.f36177a;
        int i10 = this.f46677Y;
        Object obj = this.f46679h0;
        Object obj2 = this.f46678Z;
        switch (i10) {
            case 0:
                mo122invoke();
                return yVar;
            case 1:
                mo122invoke();
                return yVar;
            case 2:
                return R4.b.r2(C1059e0.f12936Y, (AbstractC4831k) obj2, false, new ke.l((AbstractC6848g) obj, null)).f33364Z;
            case 3:
                C1519y c1519y = (C1519y) obj2;
                if (c1519y.f18921c.getRemoteDescription() != null && !c1519y.f18923e) {
                    z10 = c1519y.f18921c.addIceCandidate((IceCandidate) obj);
                } else {
                    z10 = c1519y.f18922d.add((IceCandidate) obj);
                }
                return Boolean.valueOf(z10);
            case 4:
                if (!((C1519y) obj2).f18926h.get()) {
                    return ((AbstractC6216a) obj).mo122invoke();
                }
                return null;
            case 5:
                mo122invoke();
                return yVar;
            case 6:
                mo122invoke();
                return yVar;
            case 7:
                wf.k kVar = ((H0) obj2).f18665c;
                if (kVar == null) {
                    return null;
                }
                kVar.invoke((DataChannel) obj);
                return yVar;
            case 8:
                mo122invoke();
                return yVar;
            case 9:
                J j6 = (J) obj2;
                H h10 = j6.f6346l0;
                String str2 = (String) obj;
                h10.getClass();
                AbstractC3557B.c0("name", str2);
                String str3 = j6.f6347m0;
                AbstractC3557B.c0("signature", str3);
                if (AbstractC3557B.K(str2, "<init>")) {
                    collection = t.K2(h10.j());
                    arrayList = new ArrayList();
                    for (Object obj3 : collection) {
                        AbstractC1002k abstractC1002k = (AbstractC1002k) obj3;
                        if (abstractC1002k.v()) {
                            AbstractC1001j mo20k = abstractC1002k.mo20k();
                            AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                            if (AbstractC4842i.c(mo20k)) {
                                String F10 = y0.c(abstractC1002k).F();
                                if (Lg.n.I2(F10, "constructor-impl", false) && Lg.n.c2(F10, ")V", false)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(Lg.n.w2(TokenNames.f24320V, F10));
                                    AbstractC1001j mo20k2 = abstractC1002k.mo20k();
                                    AbstractC3557B.b0("getContainingDeclaration(...)", mo20k2);
                                    C4290b f6 = AbstractC5493d.f(mo20k2);
                                    AbstractC3557B.Z(f6);
                                    String c10 = f6.c();
                                    AbstractC3557B.b0("asString(...)", c10);
                                    sb2.append(jg.b.b(c10));
                                    str = sb2.toString();
                                    if (!AbstractC3557B.K(str, str3)) {
                                        arrayList.add(obj3);
                                    }
                                } else {
                                    throw new IllegalArgumentException(("Invalid signature of " + abstractC1002k + ": " + F10).toString());
                                }
                            }
                        }
                        str = y0.c(abstractC1002k).F();
                        if (!AbstractC3557B.K(str, str3)) {
                        }
                    }
                } else {
                    collection = h10.k(C4294f.e(str2));
                    arrayList = new ArrayList();
                    for (Object obj4 : collection) {
                        if (AbstractC3557B.K(y0.c((AbstractC1013w) obj4).F(), str3)) {
                            arrayList.add(obj4);
                        }
                    }
                }
                if (arrayList.size() != 1) {
                    String m22 = t.m2(collection, Separators.RETURN, null, null, C0627b.f6391n0, 30);
                    StringBuilder t10 = android.gov.nist.core.a.t("Function '", str2, "' (JVM signature: ", str3, ") not resolved in ");
                    t10.append(h10);
                    t10.append(':');
                    t10.append(m22.length() == 0 ? " no members found" : Separators.RETURN.concat(m22));
                    throw new Lc.l(t10.toString(), 3);
                }
                return (AbstractC1013w) t.B2(arrayList);
            case 10:
                return mo122invoke();
            case 11:
                StringBuilder sb3 = new StringBuilder();
                sb3.append('@');
                sb3.append(((Class) obj2).getCanonicalName());
                t.l2(((Map) obj).entrySet(), sb3, ", ", Separators.LPAREN, Separators.RPAREN, Hf.e.f7713Z, 48);
                String sb4 = sb3.toString();
                AbstractC3557B.b0("toString(...)", sb4);
                return sb4;
            case 12:
                Lf.g gVar = (Lf.g) obj2;
                wf.k kVar2 = gVar.f11090b;
                B b10 = gVar.f11089a;
                u uVar = (u) obj;
                C1156n c1156n = new C1156n((AbstractC1003l) kVar2.invoke(b10), Lf.g.f11087g, A.f12054j0, EnumC0998g.f12085Z, AbstractC4344b.F0(b10.j().e()), uVar);
                c1156n.x0(new AbstractC5926h(uVar, c1156n), x.f37485Y, null);
                return c1156n;
            case 13:
                Lf.j jVar = (Lf.j) obj2;
                G k10 = jVar.k();
                AbstractC3557B.b0("getBuiltInsModule(...)", k10);
                return new q(k10, (u) obj, new zc.u(27, jVar));
            case 14:
                return c();
            case 15:
                C1697i c1697i = (C1697i) obj2;
                c1697i.getClass();
                z zVar = c1697i.f22347p0;
                Xf.a aVar = (Xf.a) zVar.f45394a;
                aVar.getClass();
                z zVar2 = new z(new Xf.a(aVar.f21952a, aVar.f21953b, aVar.f21954c, aVar.f21955d, aVar.f21956e, aVar.f21957f, aVar.f21959h, aVar.f21960i, aVar.f21961j, aVar.f21962k, aVar.f21963l, aVar.f21964m, aVar.f21965n, aVar.f21966o, aVar.f21967p, aVar.f21968q, aVar.f21969r, aVar.f21970s, aVar.f21971t, aVar.f21972u, aVar.f21973v, aVar.f21974w), (Xf.i) zVar.f45395b, (AbstractC3957g) zVar.f45396c);
                AbstractC1003l mo20k3 = c1697i.mo20k();
                AbstractC3557B.b0("getContainingDeclaration(...)", mo20k3);
                return new C1697i(zVar2, mo20k3, c1697i.f22345n0, (AbstractC0997f) obj);
            case 16:
            default:
                return a();
            case 17:
                return c();
            case 18:
                switch (i10) {
                    case 18:
                        z zVar3 = (z) obj2;
                        Nf.i annotations = ((AbstractC0999h) obj).getAnnotations();
                        AbstractC3557B.c0("<this>", zVar3);
                        AbstractC3557B.c0("additionalAnnotations", annotations);
                        return ((Xf.a) zVar3.f45394a).f21968q.b((Uf.z) ((AbstractC3957g) zVar3.f45397d).getValue(), annotations);
                    default:
                        z zVar4 = (z) obj2;
                        Nf.i iVar = (Nf.i) obj;
                        AbstractC3557B.c0("<this>", zVar4);
                        AbstractC3557B.c0("additionalAnnotations", iVar);
                        return ((Xf.a) zVar4.f45394a).f21968q.b((Uf.z) ((AbstractC3957g) zVar4.f45397d).getValue(), iVar);
                }
            case 19:
                switch (i10) {
                    case 18:
                        z zVar5 = (z) obj2;
                        Nf.i annotations2 = ((AbstractC0999h) obj).getAnnotations();
                        AbstractC3557B.c0("<this>", zVar5);
                        AbstractC3557B.c0("additionalAnnotations", annotations2);
                        return ((Xf.a) zVar5.f45394a).f21968q.b((Uf.z) ((AbstractC3957g) zVar5.f45397d).getValue(), annotations2);
                    default:
                        z zVar6 = (z) obj2;
                        Nf.i iVar2 = (Nf.i) obj;
                        AbstractC3557B.c0("<this>", zVar6);
                        AbstractC3557B.c0("additionalAnnotations", iVar2);
                        return ((Xf.a) zVar6.f45394a).f21968q.b((Uf.z) ((AbstractC3957g) zVar6.f45397d).getValue(), iVar2);
                }
            case 20:
                return new Yf.q(((Xf.e) obj2).f21982a, (Sf.A) obj);
            case 21:
                Rf.b bVar = ((Xf.a) ((z) obj2).f45394a).f21953b;
                C4291c c4291c = ((Yf.v) obj).f22390o.f14010j0;
                bVar.getClass();
                AbstractC3557B.c0("packageFqName", c4291c);
                return null;
            case 22:
                return mo122invoke();
            case 23:
                return mo122invoke();
            case 24:
                return mo122invoke();
            case 25:
                return ((Cg.i) obj2).a((Eg.f) ((Bg.B) obj).f2060h0.mo122invoke());
            case 26:
                return mo122invoke();
            case 27:
                return a();
            case 28:
                return new C2709k((KSerializer) ((C2715q) obj2).f28480b.invoke((AbstractC0405d) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final List mo122invoke() {
        Df.z zVar;
        kf.v<o0> vVar = kf.v.f37483Y;
        int i10 = this.f46677Y;
        Object obj = this.f46679h0;
        Object obj2 = this.f46678Z;
        switch (i10) {
            case 10:
                r0 r0Var = (r0) obj2;
                List w02 = r0Var.f6460Y.w0();
                if (w02.isEmpty()) {
                    return vVar;
                }
                int i11 = 0;
                AbstractC3957g C12 = R4.b.C1(EnumC3958h.f36152Y, new q0(r0Var, 0));
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj;
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(w02, 10));
                for (Object obj3 : w02) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC4344b.d1();
                        throw null;
                    }
                    d0 d0Var = (d0) obj3;
                    if (d0Var.c()) {
                        zVar = Df.z.f3648c;
                    } else {
                        Bg.A type = d0Var.getType();
                        AbstractC3557B.b0("getType(...)", type);
                        r0 r0Var2 = new r0(type, abstractC6216a == null ? null : new C2799g(r0Var, i11, C12));
                        int ordinal = d0Var.b().ordinal();
                        if (ordinal == 0) {
                            Df.z zVar2 = Df.z.f3648c;
                            zVar = Cf.h.h(r0Var2);
                        } else if (ordinal == 1) {
                            zVar = new Df.z(Df.A.f3619Z, r0Var2);
                        } else if (ordinal == 2) {
                            zVar = new Df.z(Df.A.f3620h0, r0Var2);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    arrayList.add(zVar);
                    i11 = i12;
                }
                return arrayList;
            case 22:
                I i13 = ((K) obj2).f49979a;
                return ((xg.m) i13.f11536a).f50014e.g((Q) obj, i13.f11537b);
            case 23:
                C6862i c6862i = (C6862i) obj2;
                return t.K2(((xg.m) c6862i.f52045q0.f11536a).f50014e.c(c6862i.f52036B0, (C3051t) obj));
            case 24:
                ((AbstractC0214g) obj2).getClass();
                List l10 = ((AbstractC0218k) obj).l();
                Q1.u uVar = Cg.j.f3128a;
                AbstractC3557B.c0("<this>", null);
                AbstractC3557B.c0("types", l10);
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(l10, 10));
                Iterator it = l10.iterator();
                if (!it.hasNext()) {
                    return arrayList2;
                }
                Bg.A a5 = (Bg.A) it.next();
                throw null;
            default:
                ?? r12 = (List) ((Cg.l) obj2).f3139e.getValue();
                if (r12 != 0) {
                    vVar = r12;
                }
                Cg.i iVar = (Cg.i) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(vVar, 10));
                for (o0 o0Var : vVar) {
                    arrayList3.add(o0Var.D0(iVar));
                }
                return arrayList3;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        String str;
        int i10 = this.f46677Y;
        boolean z10 = true;
        boolean z11 = false;
        Object obj = this.f46678Z;
        Object obj2 = this.f46679h0;
        switch (i10) {
            case 0:
                ((C0689l) ((AbstractC0696o0) obj)).a((C1046e) obj2);
                return;
            case 1:
                Vd.g gVar = (Vd.g) obj;
                File b10 = gVar.b();
                if (!b10.exists()) {
                    b10.createNewFile();
                    byte[] bytes = "{\"batch\":[".getBytes(Lg.a.f11131a);
                    AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
                    gVar.e(b10, bytes);
                    z11 = true;
                }
                if (b10.length() > 475000) {
                    Vd.g.a(gVar);
                    b10 = gVar.b();
                    b10.createNewFile();
                    byte[] bytes2 = "{\"batch\":[".getBytes(Lg.a.f11131a);
                    AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes2);
                    gVar.e(b10, bytes2);
                } else {
                    z10 = z11;
                }
                if (!z10) {
                    str = Separators.COMMA;
                } else {
                    str = "";
                }
                StringBuilder p10 = android.gov.nist.core.a.p(str);
                p10.append((String) obj2);
                byte[] bytes3 = p10.toString().getBytes(Lg.a.f11131a);
                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes3);
                gVar.e(b10, bytes3);
                return;
            case 2:
            case 3:
            case 4:
            default:
                IceCandidate iceCandidate = (IceCandidate) obj2;
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                    Objects.toString(iceCandidate);
                    Mi.a.e(new Object[0]);
                }
                ((H0) obj).f18664b.q(iceCandidate, EnumC4047m3.SUBSCRIBER);
                return;
            case 5:
                IceCandidate iceCandidate2 = (IceCandidate) obj;
                if (iceCandidate2 == null) {
                    return;
                }
                AbstractC2408g.Companion.getClass();
                if (AbstractC6708l.b(1, 7) >= 0 && Mi.a.d() > 0) {
                    iceCandidate2.toString();
                    Mi.a.e(new Object[0]);
                }
                ((C) obj2).f18616b.q(iceCandidate2, EnumC4047m3.PUBLISHER);
                return;
            case 6:
                E0 e02 = ((C) obj).f18616b;
                SessionDescription sessionDescription = (SessionDescription) obj2;
                e02.getClass();
                AbstractC3557B.c0("offer", sessionDescription);
                LivekitRtc$SessionDescription a5 = AbstractC2645j.a(sessionDescription);
                C4027i3 newBuilder = LivekitRtc$SignalRequest.newBuilder();
                newBuilder.d();
                LivekitRtc$SignalRequest.access$200((LivekitRtc$SignalRequest) newBuilder.f27507Z, a5);
                e02.s((LivekitRtc$SignalRequest) newBuilder.b());
                return;
        }
    }
}
