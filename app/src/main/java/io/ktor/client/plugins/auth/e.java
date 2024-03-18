package io.ktor.client.plugins.auth;

import Lg.n;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import jf.C3959i;
import jf.y;
import kf.t;
import kf.v;
import kotlin.jvm.internal.B;
import me.U;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;
import te.C5760d;
import wf.o;
import xe.AbstractC6432u;
import xe.AbstractC6435x;
import xe.C6398C;
import xe.C6428q;
import ye.C6582b;
import ye.EnumC6581a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class e extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public B f33342Y;

    /* renamed from: Z  reason: collision with root package name */
    public HashSet f33343Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f33344h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33345i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ U f33346j0;

    /* renamed from: k0  reason: collision with root package name */
    public /* synthetic */ C5760d f33347k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ h f33348l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f33348l0 = hVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = new e(this.f33348l0, (AbstractC4825e) obj3);
        eVar.f33346j0 = (U) obj;
        eVar.f33347k0 = (C5760d) obj2;
        return eVar.invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0296, code lost:
        throw new Ae.e("Expected closing quote'\"' in parameter");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03a7, code lost:
        throw new Ae.e(android.gov.nist.core.a.e("Expected delimiter , at position ", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0418, code lost:
        throw new Ae.e("Invalid authScheme value: it should be token, can't be blank");
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Type inference failed for: r3v31, types: [kotlin.jvm.internal.B, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x0593 -> B:199:0x0597). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a;
        char c10;
        B b10;
        e eVar;
        boolean z10;
        HashSet hashSet;
        U u10;
        C5760d c5760d;
        B b11;
        U u11;
        C5760d c5760d2;
        HashSet hashSet2;
        Yc.d dVar;
        Object obj2;
        HashSet hashSet3;
        B b12;
        C3418c c3418c;
        U u12;
        C5760d c5760d3;
        EnumC5000a enumC5000a2;
        C3959i c3959i;
        Object obj3;
        ArrayList arrayList;
        HashSet hashSet4;
        B b13;
        C3418c c3418c2;
        U u13;
        C5760d c5760d4;
        EnumC5000a enumC5000a3;
        List list;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        int i11;
        boolean z11;
        Lg.g gVar;
        int i12;
        int i13;
        Integer b14;
        Object obj4;
        e eVar2 = this;
        EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
        int i14 = eVar2.f33345i0;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        HashSet hashSet5 = eVar2.f33343Z;
                        B b15 = eVar2.f33342Y;
                        C5760d c5760d5 = eVar2.f33347k0;
                        U u14 = eVar2.f33346j0;
                        N.B0(obj);
                        eVar = eVar2;
                        z10 = true;
                        char c11 = 3;
                        c10 = 2;
                        b10 = (B) eVar2.f33344h0;
                        enumC5000a = enumC5000a4;
                        Object obj5 = obj;
                        hashSet = hashSet5;
                        u10 = u14;
                        B b16 = b15;
                        b10.f37622Y = obj5;
                        c5760d = c5760d5;
                        b11 = b16;
                        eVar2 = eVar;
                        enumC5000a4 = enumC5000a;
                        if (AbstractC3557B.K(((C3418c) b11.f37622Y).d().f(), C6398C.f49832n0)) {
                            i.f33362a.c("Received 401 for " + ((C3418c) b11.f37622Y).c().O());
                            g gVar2 = h.f33356b;
                            C3418c c3418c3 = (C3418c) b11.f37622Y;
                            AbstractC6432u a5 = c3418c3.d().a();
                            List list2 = AbstractC6435x.f49956a;
                            List c12 = a5.c(SIPHeaderNames.WWW_AUTHENTICATE);
                            List<ye.d> list3 = v.f37483Y;
                            if (c12 != null) {
                                ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(c12, 10));
                                Iterator it2 = c12.iterator();
                                B b17 = b11;
                                loop0: while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    Set set = ye.e.f50905a;
                                    AbstractC3557B.c0("headerValue", str);
                                    ArrayList arrayList5 = new ArrayList();
                                    int i15 = 0;
                                    B b18 = b17;
                                    while (i15 != -1) {
                                        int c13 = ye.e.c(i15, str);
                                        int i16 = c13;
                                        while (i16 < str.length() && ye.e.a(str.charAt(i16))) {
                                            i16++;
                                        }
                                        String M22 = n.M2(str, N.D0(c13, i16));
                                        if (n.n2(M22)) {
                                            break loop0;
                                        }
                                        int c14 = ye.e.c(i16, str);
                                        EnumC6581a enumC6581a = EnumC6581a.f50899Y;
                                        Integer b19 = ye.e.b(arrayList5, new C6582b(M22, list3, enumC6581a), c14, str);
                                        if (b19 != null) {
                                            i15 = b19.intValue();
                                            c5760d4 = c5760d;
                                            u13 = u10;
                                            hashSet4 = hashSet;
                                            b13 = b18;
                                            c3418c2 = c3418c3;
                                            it = it2;
                                            enumC5000a3 = enumC5000a4;
                                            arrayList2 = arrayList5;
                                            list = list3;
                                        } else {
                                            int c15 = ye.e.c(c14, str);
                                            it = it2;
                                            while (true) {
                                                if (c15 < str.length()) {
                                                    char charAt = str.charAt(c15);
                                                    list = list3;
                                                    if (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && !AbstractC5260f.B(charAt))) {
                                                        if (!ye.e.f50906b.contains(Character.valueOf(charAt))) {
                                                            break;
                                                        }
                                                    }
                                                    c15++;
                                                    list3 = list;
                                                } else {
                                                    list = list3;
                                                    break;
                                                }
                                            }
                                            while (c15 < str.length() && str.charAt(c15) == '=') {
                                                c15++;
                                            }
                                            int c16 = ye.e.c(c15, str);
                                            String obj6 = n.U2(n.M2(str, N.D0(c14, c16))).toString();
                                            if (obj6.length() > 0 && (b14 = ye.e.b(arrayList5, new ye.c(M22, obj6), c16, str)) != null) {
                                                c5760d4 = c5760d;
                                                u13 = u10;
                                                hashSet4 = hashSet;
                                                b13 = b18;
                                                c3418c2 = c3418c3;
                                                i15 = b14.intValue();
                                                enumC5000a3 = enumC5000a4;
                                                arrayList2 = arrayList5;
                                            } else {
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                B b20 = b18;
                                                while (c14 > 0 && c14 < str.length()) {
                                                    int c17 = ye.e.c(c14, str);
                                                    enumC5000a3 = enumC5000a4;
                                                    int i17 = c17;
                                                    while (i17 < str.length() && ye.e.a(str.charAt(i17))) {
                                                        i17++;
                                                    }
                                                    String M23 = n.M2(str, N.D0(c17, i17));
                                                    int c18 = ye.e.c(i17, str);
                                                    c5760d4 = c5760d;
                                                    if (c18 == str.length() || str.charAt(c18) != '=') {
                                                        u13 = u10;
                                                        hashSet4 = hashSet;
                                                        b13 = b20;
                                                        c3418c2 = c3418c3;
                                                        arrayList3 = arrayList5;
                                                        arrayList = arrayList4;
                                                        i10 = c14;
                                                    } else {
                                                        int c19 = ye.e.c(c18 + 1, str);
                                                        if (str.charAt(c19) == '\"') {
                                                            int i18 = c19 + 1;
                                                            i10 = i18;
                                                            boolean z12 = false;
                                                            while (true) {
                                                                if (i10 < str.length()) {
                                                                    i13 = i18;
                                                                    if (str.charAt(i10) == '\"' && !z12) {
                                                                        break;
                                                                    }
                                                                    if (!z12 && str.charAt(i10) == '\\') {
                                                                        z12 = true;
                                                                    } else {
                                                                        z12 = false;
                                                                    }
                                                                    i10++;
                                                                    i18 = i13;
                                                                } else {
                                                                    i13 = i18;
                                                                    break;
                                                                }
                                                            }
                                                            if (i10 == str.length()) {
                                                                break loop0;
                                                            }
                                                            i11 = i13;
                                                            z11 = true;
                                                        } else {
                                                            i10 = c19;
                                                            while (true) {
                                                                if (i10 < str.length()) {
                                                                    i12 = c19;
                                                                    if (str.charAt(i10) == ' ' || str.charAt(i10) == ',') {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    c19 = i12;
                                                                } else {
                                                                    i12 = c19;
                                                                    break;
                                                                }
                                                            }
                                                            i11 = i12;
                                                            z11 = false;
                                                        }
                                                        String M24 = n.M2(str, N.D0(i11, i10));
                                                        u13 = u10;
                                                        if (z11) {
                                                            Lg.i iVar = ye.e.f50908d;
                                                            iVar.getClass();
                                                            Matcher matcher = iVar.f11153Y.matcher(M24);
                                                            AbstractC3557B.b0("matcher(...)", matcher);
                                                            if (!matcher.find(0)) {
                                                                gVar = null;
                                                            } else {
                                                                gVar = new Lg.g(matcher, M24);
                                                            }
                                                            if (gVar == null) {
                                                                M24 = M24.toString();
                                                            } else {
                                                                int length = M24.length();
                                                                Lg.g gVar3 = gVar;
                                                                StringBuilder sb2 = new StringBuilder(length);
                                                                hashSet4 = hashSet;
                                                                b13 = b20;
                                                                Lg.g gVar4 = gVar3;
                                                                c3418c2 = c3418c3;
                                                                int i19 = 0;
                                                                while (true) {
                                                                    Matcher matcher2 = gVar4.f11148a;
                                                                    arrayList = arrayList4;
                                                                    arrayList3 = arrayList5;
                                                                    sb2.append((CharSequence) M24, i19, N.D0(matcher2.start(), matcher2.end()).f3106Y);
                                                                    String group = matcher2.group();
                                                                    AbstractC3557B.b0("group(...)", group);
                                                                    sb2.append((CharSequence) Lg.o.a3(1, group));
                                                                    i19 = N.D0(matcher2.start(), matcher2.end()).f3107Z + 1;
                                                                    gVar4 = gVar4.b();
                                                                    if (i19 >= length || gVar4 == null) {
                                                                        break;
                                                                    }
                                                                    arrayList4 = arrayList;
                                                                    arrayList5 = arrayList3;
                                                                }
                                                                if (i19 < length) {
                                                                    sb2.append((CharSequence) M24, i19, length);
                                                                }
                                                                String sb3 = sb2.toString();
                                                                AbstractC3557B.b0("toString(...)", sb3);
                                                                M24 = sb3;
                                                                linkedHashMap.put(M23, M24);
                                                                if (z11) {
                                                                    i10++;
                                                                }
                                                            }
                                                        }
                                                        hashSet4 = hashSet;
                                                        b13 = b20;
                                                        c3418c2 = c3418c3;
                                                        arrayList3 = arrayList5;
                                                        arrayList = arrayList4;
                                                        linkedHashMap.put(M23, M24);
                                                        if (z11) {
                                                        }
                                                    }
                                                    if (i10 == c14) {
                                                        break;
                                                    }
                                                    int c20 = ye.e.c(i10, str);
                                                    if (c20 == str.length()) {
                                                        c14 = -1;
                                                    } else if (str.charAt(c20) != ',') {
                                                        break loop0;
                                                    } else {
                                                        c14 = ye.e.c(c20 + 1, str);
                                                    }
                                                    enumC5000a4 = enumC5000a3;
                                                    c5760d = c5760d4;
                                                    u10 = u13;
                                                    c3418c3 = c3418c2;
                                                    b20 = b13;
                                                    hashSet = hashSet4;
                                                    arrayList4 = arrayList;
                                                    arrayList5 = arrayList3;
                                                }
                                                c5760d4 = c5760d;
                                                u13 = u10;
                                                hashSet4 = hashSet;
                                                b13 = b20;
                                                c3418c2 = c3418c3;
                                                enumC5000a3 = enumC5000a4;
                                                arrayList3 = arrayList5;
                                                arrayList = arrayList4;
                                                Set<Map.Entry> entrySet = linkedHashMap.entrySet();
                                                ArrayList arrayList6 = new ArrayList(AbstractC6583a.H1(entrySet, 10));
                                                for (Map.Entry entry : entrySet) {
                                                    arrayList6.add(new C6428q((String) entry.getKey(), (String) entry.getValue()));
                                                }
                                                arrayList2 = arrayList3;
                                                arrayList2.add(new C6582b(M22, arrayList6, enumC6581a));
                                                i15 = c14;
                                                arrayList5 = arrayList2;
                                                it2 = it;
                                                list3 = list;
                                                enumC5000a4 = enumC5000a3;
                                                c5760d = c5760d4;
                                                u10 = u13;
                                                c3418c3 = c3418c2;
                                                b18 = b13;
                                                hashSet = hashSet4;
                                                arrayList4 = arrayList;
                                            }
                                        }
                                        arrayList = arrayList4;
                                        arrayList5 = arrayList2;
                                        it2 = it;
                                        list3 = list;
                                        enumC5000a4 = enumC5000a3;
                                        c5760d = c5760d4;
                                        u10 = u13;
                                        c3418c3 = c3418c2;
                                        b18 = b13;
                                        hashSet = hashSet4;
                                        arrayList4 = arrayList;
                                    }
                                    arrayList4.add(arrayList5);
                                    c5760d = c5760d;
                                    u10 = u10;
                                    b17 = b18;
                                }
                                c5760d3 = c5760d;
                                u12 = u10;
                                hashSet3 = hashSet;
                                b12 = b17;
                                c3418c = c3418c3;
                                enumC5000a2 = enumC5000a4;
                                list3 = AbstractC6583a.I1(arrayList4);
                            } else {
                                c5760d3 = c5760d;
                                u12 = u10;
                                hashSet3 = hashSet;
                                b12 = b11;
                                c3418c = c3418c3;
                                enumC5000a2 = enumC5000a4;
                            }
                            if (list3.isEmpty()) {
                                z10 = true;
                                if (hashSet3.size() == 1) {
                                    c3959i = new C3959i(t.e2(hashSet3), null);
                                    if (c3959i != null) {
                                        Ei.a aVar = i.f33362a;
                                        StringBuilder sb4 = new StringBuilder("Can not find auth provider for ");
                                        B b21 = b12;
                                        sb4.append(((C3418c) b21.f37622Y).c().O());
                                        aVar.c(sb4.toString());
                                        return b21.f37622Y;
                                    }
                                    B b22 = b12;
                                    Yc.d dVar2 = (Yc.d) c3959i.f36155Y;
                                    ye.d dVar3 = (ye.d) c3959i.f36156Z;
                                    i.f33362a.c("Using provider " + dVar2 + " for " + ((C3418c) b22.f37622Y).c().O());
                                    HashSet hashSet6 = hashSet3;
                                    hashSet6.remove(dVar2);
                                    eVar = this;
                                    U u15 = u12;
                                    eVar.f33346j0 = u15;
                                    C5760d c5760d6 = c5760d3;
                                    eVar.f33347k0 = c5760d6;
                                    eVar.f33342Y = b22;
                                    eVar.f33343Z = hashSet6;
                                    eVar.f33344h0 = dVar2;
                                    c10 = 2;
                                    eVar.f33345i0 = 2;
                                    obj2 = g.d(h.f33356b, (C3418c) b22.f37622Y, dVar2, c5760d6, eVar);
                                    enumC5000a = enumC5000a2;
                                    if (obj2 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    hashSet2 = hashSet6;
                                    u11 = u15;
                                    c5760d2 = c5760d6;
                                    b10 = b22;
                                    dVar = dVar2;
                                    if (((Boolean) obj2).booleanValue()) {
                                        return b10.f37622Y;
                                    }
                                    g gVar5 = h.f33356b;
                                    C3418c c3418c4 = (C3418c) b10.f37622Y;
                                    eVar.f33346j0 = u11;
                                    eVar.f33347k0 = c5760d2;
                                    eVar.f33342Y = b10;
                                    eVar.f33343Z = hashSet2;
                                    eVar.f33344h0 = b10;
                                    c11 = 3;
                                    eVar.f33345i0 = 3;
                                    obj5 = g.b(gVar5, u11, c3418c4, dVar, c5760d2, this);
                                    if (obj5 == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    b16 = b10;
                                    hashSet = hashSet2;
                                    c5760d5 = c5760d2;
                                    u10 = u11;
                                    b10.f37622Y = obj5;
                                    c5760d = c5760d5;
                                    b11 = b16;
                                    eVar2 = eVar;
                                    enumC5000a4 = enumC5000a;
                                    if (AbstractC3557B.K(((C3418c) b11.f37622Y).d().f(), C6398C.f49832n0)) {
                                        return b11.f37622Y;
                                    }
                                }
                            } else {
                                z10 = true;
                            }
                            if (list3.isEmpty()) {
                                i.f33362a.c("401 response " + c3418c.c().O() + " has no or empty \"WWW-Authenticate\" header. Can not add or refresh token");
                            } else {
                                for (ye.d dVar4 : list3) {
                                    Iterator it3 = hashSet3.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj3 = it3.next();
                                            ((Yc.d) obj3).getClass();
                                            AbstractC3557B.c0("auth", dVar4);
                                            if (AbstractC3557B.K(dVar4.f50904a, "Bearer")) {
                                                break;
                                            }
                                        } else {
                                            obj3 = null;
                                            break;
                                        }
                                    }
                                    Yc.d dVar5 = (Yc.d) obj3;
                                    if (dVar5 != null) {
                                        c3959i = new C3959i(dVar5, dVar4);
                                        continue;
                                    } else {
                                        c3959i = null;
                                        continue;
                                    }
                                    if (c3959i != null) {
                                        break;
                                    }
                                }
                            }
                            c3959i = null;
                            if (c3959i != null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    HashSet hashSet7 = eVar2.f33343Z;
                    B b23 = eVar2.f33342Y;
                    C5760d c5760d7 = eVar2.f33347k0;
                    U u16 = eVar2.f33346j0;
                    N.B0(obj);
                    hashSet2 = hashSet7;
                    c5760d2 = c5760d7;
                    u11 = u16;
                    eVar = eVar2;
                    z10 = true;
                    c10 = 2;
                    obj2 = obj;
                    dVar = (Yc.d) eVar2.f33344h0;
                    b10 = b23;
                    enumC5000a = enumC5000a4;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                }
            } else {
                c5760d = eVar2.f33347k0;
                u10 = eVar2.f33346j0;
                N.B0(obj);
                obj4 = obj;
            }
        } else {
            N.B0(obj);
            u10 = eVar2.f33346j0;
            c5760d = eVar2.f33347k0;
            eVar2.f33346j0 = u10;
            eVar2.f33347k0 = c5760d;
            eVar2.f33345i0 = 1;
            obj4 = u10.a(c5760d, eVar2);
            if (obj4 == enumC5000a4) {
                return enumC5000a4;
            }
        }
        C3418c c3418c5 = (C3418c) obj4;
        if (!AbstractC3557B.K(c3418c5.d().f(), C6398C.f49832n0)) {
            return c3418c5;
        }
        if (c3418c5.c().h().a(h.f33357c)) {
            return c3418c5;
        }
        ?? obj7 = new Object();
        obj7.f37622Y = c3418c5;
        hashSet = new HashSet(eVar2.f33348l0.f33361a);
        b11 = obj7;
        if (AbstractC3557B.K(((C3418c) b11.f37622Y).d().f(), C6398C.f49832n0)) {
        }
    }
}
