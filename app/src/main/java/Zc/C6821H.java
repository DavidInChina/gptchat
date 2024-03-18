package zc;

import Bg.p0;
import Cd.X;
import Mf.AbstractC0994c;
import Sg.C1394f;
import Ve.o0;
import Ve.r0;
import We.C1651b;
import Wh.AbstractC1660e;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import bg.AbstractC2193a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ee.C2885c;
import id.AbstractC3557B;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jh.EnumC4051n2;
import jh.N2;
import kf.AbstractC4276a;
import kf.AbstractC4281f;
import kg.C4291c;
import kg.C4294f;
import livekit.LivekitRtc$AddTrackRequest;
import mc.C4616c;
import me.C4632e;
import pe.AbstractC5152d;
import pf.AbstractC5163j;
import q0.C5251c;
import xe.AbstractC6407L;
import xe.AbstractC6412a;
import xe.AbstractC6435x;
import xe.C6433v;

/* renamed from: zc.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6821H extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f51832Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f51833Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6821H(int i10, Object obj) {
        super(1);
        this.f51832Y = i10;
        this.f51833Z = obj;
    }

    public final void a(Throwable th2) {
        int i10 = this.f51832Y;
        Object obj = this.f51833Z;
        switch (i10) {
            case 10:
                if (th2 != null) {
                    Ad.l.P(((ge.d) obj).f31593Y, null);
                    return;
                }
                return;
            case 11:
            case 15:
            case 16:
            default:
                if (th2 != null) {
                    ((io.ktor.utils.io.jvm.javaio.c) obj).f33492b.resumeWith(com.google.android.gms.internal.play_billing.N.w(th2));
                    return;
                }
                return;
            case 12:
                ((je.c) obj).close();
                return;
            case 13:
                Wh.F f6 = (Wh.F) obj;
                if (f6 != null) {
                    f6.close();
                    return;
                }
                return;
            case 14:
                ((ai.j) ((AbstractC1660e) obj)).d();
                return;
            case 17:
                ((io.ktor.utils.io.t) ((io.ktor.utils.io.u) obj)).j(th2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
        if (r1.length == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0140, code lost:
        if (java.util.Arrays.equals(r1.getParameterTypes(), new java.lang.Class[]{java.lang.String.class}) != false) goto L52;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C1651b c1651b;
        EnumC4051n2 enumC4051n2;
        String str;
        String str2;
        Object obj2;
        C4291c c4291c;
        jf.y yVar = jf.y.f36177a;
        boolean z10 = false;
        int i10 = this.f51832Y;
        kotlin.jvm.internal.F f6 = null;
        Object obj3 = this.f51833Z;
        switch (i10) {
            case 0:
                X x10 = (X) obj;
                AbstractC3557B.c0("$this$setState", x10);
                C4616c c4616c = (C4616c) obj3;
                return X.e(x10, null, null, false, false, false, false, null, null, Hd.b.e(x10.f3038m, null, null, null, null, null, null, null, null, null, 0L, 0L, null, null, null, String.valueOf(c4616c.f39125a), String.valueOf(c4616c.f39126b), c4616c.f39127c.f18526Y, null, null, null, 7929855), 4095);
            case 1:
                Fd.u uVar = (Fd.u) obj;
                AbstractC3557B.c0("$this$setState", uVar);
                return Fd.u.e(uVar, null, ((Fd.i) ((Fd.k) obj3)).f5248a, false, 19);
            case 2:
                AbstractC3557B.c0("$this$setState", (Ec.H) obj);
                Ec.F f10 = (Ec.F) obj3;
                AbstractC3557B.c0("state", f10);
                return new Ec.H(f10);
            case 3:
                pe.f fVar = (pe.f) obj;
                AbstractC3557B.c0("$this$install", fVar);
                AbstractC5152d abstractC5152d = (AbstractC5152d) obj3;
                AbstractC3557B.c0("<set-?>", abstractC5152d);
                fVar.f43101b = abstractC5152d;
                return yVar;
            case 4:
                C4632e c4632e = (C4632e) obj;
                AbstractC3557B.c0("$this$defaultRequest", c4632e);
                Vc.y yVar2 = (Vc.y) obj3;
                String str3 = yVar2.f18567b;
                AbstractC3557B.c0("urlString", str3);
                AbstractC6407L.b(c4632e.f39197b, str3);
                String str4 = yVar2.f18566a;
                AbstractC3557B.c0("content", str4);
                List list = AbstractC6435x.f49956a;
                C6433v c6433v = c4632e.f39196a;
                c6433v.k(SIPHeaderNames.USER_AGENT, str4);
                c6433v.f("OAI-Client-Type", "android");
                String languageTag = Locale.getDefault().toLanguageTag();
                AbstractC3557B.b0("toLanguageTag(...)", languageTag);
                c6433v.f(SIPHeaderNames.ACCEPT_LANGUAGE, languageTag);
                for (Map.Entry entry : yVar2.f18569d.entrySet()) {
                    c6433v.f((String) entry.getKey(), (String) entry.getValue());
                }
                return yVar;
            case 5:
                ((Fd.v) obj3).j(new Fd.i(((Boolean) obj).booleanValue()));
                return yVar;
            case 6:
                byte[] bArr = (byte[]) obj;
                AbstractC3557B.c0("data", bArr);
                Ld.d dVar = (Ld.d) obj3;
                dVar.getClass();
                dVar.f11044a.b(r.f.O(bArr));
                return yVar;
            case 7:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC3557B.c0("mViews", arrayList);
                be.f fVar2 = ((be.g) obj3).f25957b;
                fVar2.addAll(arrayList);
                return fVar2;
            case 8:
                ((Number) obj).intValue();
                de.l lVar = (de.l) obj3;
                List<Number> list2 = lVar.f28243b;
                AbstractC3557B.c0("<this>", list2);
                float f11 = 0.0f;
                for (Number number : list2) {
                    f11 += number.floatValue();
                }
                List list3 = lVar.f28243b;
                return new C2885c(0.0f, f11 - ((Number) kf.t.o2(list3)).floatValue(), ((Number) kf.t.o2(lVar.f28242a)).floatValue(), ((Number) kf.t.o2(list3)).floatValue(), false, false);
            case 9:
                AbstractC3557B.c0("$this$$receiver", (ee.m) obj);
                de.o oVar = (de.o) obj3;
                wf.k kVar = oVar.f28248a;
                if (oVar.f28249b != null) {
                    if (oVar.f28250c != null) {
                        return new C5251c(((C5251c) kVar.invoke(new Object())).f43623a);
                    }
                    AbstractC3557B.C2("pinConfiguration");
                    throw null;
                }
                AbstractC3557B.C2("dimensions");
                throw null;
            case 10:
                a((Throwable) obj);
                return yVar;
            case 11:
                ge.d dVar2 = (ge.d) obj;
                AbstractC3557B.c0("scope", dVar2);
                Fe.a aVar = me.y.f39271a;
                ge.e eVar = ge.e.f31605Y;
                me.x xVar = (me.x) obj3;
                Object obj4 = dVar2.f31604q0.f31607b.get(xVar.getKey());
                AbstractC3557B.Z(obj4);
                Object c10 = xVar.c((wf.k) obj4);
                xVar.a(dVar2, c10);
                ((Fe.b) dVar2.f31602o0.f(aVar, eVar)).e(xVar.getKey(), c10);
                return yVar;
            case 12:
                a((Throwable) obj);
                return yVar;
            case 13:
                a((Throwable) obj);
                return yVar;
            case 14:
                a((Throwable) obj);
                return yVar;
            case 15:
                me.r rVar = (me.r) obj;
                AbstractC3557B.c0("$this$HttpResponseValidator", rVar);
                rVar.f39234c = ((ge.f) obj3).f31612g;
                rVar.f39232a.add(new AbstractC5163j(2, null));
                return yVar;
            case 16:
                ((StringBuilder) obj3).append(AbstractC6412a.a(((Number) obj).byteValue()));
                return yVar;
            case 17:
                a((Throwable) obj);
                return yVar;
            case 18:
                a((Throwable) obj);
                return yVar;
            case 19:
                Te.w wVar = (Te.w) obj;
                AbstractC3557B.c0("event", wVar);
                r0 r0Var = (r0) obj3;
                C1394f c1394f = r0Var.f18872k;
                if (c1394f != null) {
                    Ad.l.O0(c1394f, null, null, new o0(r0Var, wVar, null), 3);
                    return yVar;
                }
                AbstractC3557B.C2("coroutineScope");
                throw null;
            case 20:
                N2 n22 = (N2) obj;
                AbstractC3557B.c0("$this$publishTrackImpl", n22);
                n22.d();
                LivekitRtc$AddTrackRequest.access$13300((LivekitRtc$AddTrackRequest) n22.f27507Z, !c1651b.f20983l);
                n22.d();
                LivekitRtc$AddTrackRequest.access$15500((LivekitRtc$AddTrackRequest) n22.f27507Z, !c1651b.f20984m);
                int i11 = ((C1651b) obj3).f20985n;
                if (i11 != 0) {
                    enumC4051n2 = Xe.v.a(i11);
                } else {
                    enumC4051n2 = EnumC4051n2.MICROPHONE;
                }
                n22.d();
                LivekitRtc$AddTrackRequest.access$13600((LivekitRtc$AddTrackRequest) n22.f27507Z, enumC4051n2);
                return yVar;
            case 21:
                if (obj == ((AbstractC4276a) obj3)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 22:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC3557B.c0("it", entry2);
                AbstractC4281f abstractC4281f = (AbstractC4281f) obj3;
                abstractC4281f.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry2.getKey();
                String str5 = "(this Map)";
                if (key == abstractC4281f) {
                    str = str5;
                } else {
                    str = String.valueOf(key);
                }
                sb2.append(str);
                sb2.append('=');
                Object value = entry2.getValue();
                if (value != abstractC4281f) {
                    str5 = String.valueOf(value);
                }
                sb2.append(str5);
                return sb2.toString();
            case 23:
                String str6 = (String) obj;
                AbstractC3557B.c0("it", str6);
                ((ArrayList) obj3).add(str6);
                return yVar;
            case 24:
                Df.z zVar = (Df.z) obj;
                AbstractC3557B.c0("it", zVar);
                ((kotlin.jvm.internal.F) obj3).getClass();
                Df.A a5 = zVar.f3649a;
                if (a5 == null) {
                    return Separators.STAR;
                }
                Df.w wVar2 = zVar.f3650b;
                if (wVar2 instanceof kotlin.jvm.internal.F) {
                    f6 = (kotlin.jvm.internal.F) wVar2;
                }
                if (f6 == null || (str2 = f6.f(true)) == null) {
                    str2 = String.valueOf(wVar2);
                }
                int ordinal = a5.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return "out ".concat(str2);
                        }
                        throw new RuntimeException();
                    }
                    return "in ".concat(str2);
                }
                return str2;
            case 25:
                Mf.B b10 = (Mf.B) obj;
                AbstractC3557B.c0("module", b10);
                Jf.l j6 = b10.j();
                p0 p0Var = p0.f2146h0;
                return j6.g(((Jf.l) obj3).u());
            case 26:
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (((Sf.q) obj3).f16621a.isEnum()) {
                        String name = method.getName();
                        if (AbstractC3557B.K(name, DiagnosticsEntry.Histogram.VALUES_KEY)) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            AbstractC3557B.b0("getParameterTypes(...)", parameterTypes);
                            break;
                        } else if (AbstractC3557B.K(name, "valueOf")) {
                            break;
                        }
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 27:
                AbstractC3557B.c0("it", (AbstractC0994c) obj);
                return Boolean.valueOf(Uf.Q.f17797j.containsKey(L4.a.f0((Pf.T) obj3)));
            case 28:
                C4291c c4291c2 = (C4291c) obj;
                AbstractC3557B.Z(c4291c2);
                Map map = ((Uf.H) obj3).f17763b;
                AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, map);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry3 : map.entrySet()) {
                    C4291c c4291c3 = (C4291c) entry3.getKey();
                    if (!AbstractC3557B.K(c4291c2, c4291c3)) {
                        AbstractC3557B.c0("packageName", c4291c3);
                        if (c4291c2.d()) {
                            c4291c = null;
                        } else {
                            c4291c = c4291c2.e();
                        }
                        if (AbstractC3557B.K(c4291c, c4291c3)) {
                        }
                    }
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
                if (!(!linkedHashMap.isEmpty())) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                if (!it.hasNext()) {
                    obj2 = null;
                } else {
                    obj2 = it.next();
                    if (it.hasNext()) {
                        int length = R4.b.c2((C4291c) ((Map.Entry) obj2).getKey(), c4291c2).b().length();
                        do {
                            Object next = it.next();
                            int length2 = R4.b.c2((C4291c) ((Map.Entry) next).getKey(), c4291c2).b().length();
                            if (length > length2) {
                                obj2 = next;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                }
                Map.Entry entry4 = (Map.Entry) obj2;
                if (entry4 == null) {
                    return null;
                }
                return entry4.getValue();
            default:
                AbstractC2193a abstractC2193a = (AbstractC2193a) obj;
                AbstractC3557B.c0("annotation", abstractC2193a);
                C4294f c4294f = Vf.c.f18943a;
                Xf.d dVar3 = (Xf.d) obj3;
                return Vf.c.b(dVar3.f21978Y, abstractC2193a, dVar3.f21980h0);
        }
    }
}
