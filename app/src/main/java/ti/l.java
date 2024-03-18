package ti;

import D1.C0373t;
import K4.J;
import android.gov.nist.core.Separators;
import androidx.lifecycle.D;
import io.sentry.C3636c1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2.C5071y;
import p3.H;
import wi.s;
import wi.y;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final BitSet f46289a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f46290b;

    /* renamed from: c  reason: collision with root package name */
    public final C3636c1 f46291c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f46292d;

    /* renamed from: e  reason: collision with root package name */
    public H f46293e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46294f;

    /* renamed from: g  reason: collision with root package name */
    public int f46295g;

    /* renamed from: h  reason: collision with root package name */
    public d f46296h;

    /* renamed from: i  reason: collision with root package name */
    public C5071y f46297i;

    /* JADX WARN: Multi-variable type inference failed */
    public l(C3636c1 c3636c1) {
        HashMap hashMap = new HashMap();
        b(Arrays.asList(new ui.a(0), new ui.a(1)), hashMap);
        b((List) c3636c1.f34285Z, hashMap);
        this.f46290b = hashMap;
        this.f46291c = c3636c1;
        HashMap hashMap2 = new HashMap();
        this.f46292d = hashMap2;
        hashMap2.put('\\', Collections.singletonList(new Object()));
        hashMap2.put('`', Collections.singletonList(new Object()));
        hashMap2.put('&', Collections.singletonList(new Object()));
        hashMap2.put('<', Arrays.asList(new Object(), new Object()));
        Set<Character> keySet = hashMap.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        this.f46289a = bitSet;
    }

    public static void a(char c10, zi.a aVar, HashMap hashMap) {
        if (((zi.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + Separators.QUOTE);
    }

    public static void b(List list, HashMap hashMap) {
        r rVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zi.a aVar = (zi.a) it.next();
            char d10 = aVar.d();
            char a5 = aVar.a();
            if (d10 == a5) {
                zi.a aVar2 = (zi.a) hashMap.get(Character.valueOf(d10));
                if (aVar2 != null && aVar2.d() == aVar2.a()) {
                    if (aVar2 instanceof r) {
                        rVar = (r) aVar2;
                    } else {
                        r rVar2 = new r(d10);
                        rVar2.e(aVar2);
                        rVar = rVar2;
                    }
                    rVar.e(aVar);
                    hashMap.put(Character.valueOf(d10), rVar);
                } else {
                    a(d10, aVar, hashMap);
                }
            } else {
                a(d10, aVar, hashMap);
                a(a5, aVar, hashMap);
            }
        }
    }

    public static y i(Q3.j jVar) {
        y yVar = new y(jVar.e());
        yVar.g(jVar.f());
        return yVar;
    }

    public final void c(s sVar) {
        s sVar2 = sVar.f48609b;
        if (sVar2 == null) {
            return;
        }
        s sVar3 = sVar.f48610c;
        y yVar = null;
        y yVar2 = null;
        int i10 = 0;
        while (sVar2 != null) {
            if (sVar2 instanceof y) {
                yVar2 = sVar2;
                if (yVar == null) {
                    yVar = yVar2;
                }
                i10 = yVar2.f48620g.length() + i10;
            } else {
                d(yVar, yVar2, i10);
                c(sVar2);
                yVar = null;
                yVar2 = null;
                i10 = 0;
            }
            if (sVar2 == sVar3) {
                break;
            }
            sVar2 = sVar2.f48612e;
        }
        d(yVar, yVar2, i10);
    }

    public final void d(y yVar, y yVar2, int i10) {
        Q3.j jVar;
        if (yVar != null && yVar2 != null && yVar != yVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(yVar.f48620g);
            if (this.f46294f) {
                jVar = new Q3.j(5);
                jVar.a(yVar.d());
            } else {
                jVar = null;
            }
            s sVar = yVar.f48612e;
            s sVar2 = yVar2.f48612e;
            while (sVar != sVar2) {
                sb2.append(((y) sVar).f48620g);
                if (jVar != null) {
                    jVar.a(sVar.d());
                }
                s sVar3 = sVar.f48612e;
                sVar.i();
                sVar = sVar3;
            }
            yVar.f48620g = sb2.toString();
            if (jVar != null) {
                yVar.g(jVar.f());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x020f, code lost:
        if (r5 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0343, code lost:
        if (r6.length() > 999) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e7  */
    /* JADX WARN: Type inference failed for: r5v22, types: [wi.s, wi.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Q3.j jVar, s sVar) {
        List<s> list;
        s sVar2;
        y yVar;
        s sVar3;
        String str;
        String str2;
        String str3;
        char c10;
        k kVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        this.f46293e = new H(jVar.f14418b);
        this.f46294f = !jVar.f().isEmpty();
        this.f46295g = 0;
        String str4 = null;
        this.f46296h = null;
        this.f46297i = null;
        while (true) {
            char m10 = this.f46293e.m();
            if (m10 != 0) {
                char c11 = '\n';
                if (m10 != '\n') {
                    if (m10 != '!') {
                        if (m10 != '[') {
                            if (m10 != ']') {
                                if (!this.f46289a.get(m10)) {
                                    list = Collections.singletonList(f());
                                } else {
                                    List<ui.h> list2 = (List) this.f46292d.get(Character.valueOf(m10));
                                    if (list2 != null) {
                                        C0373t n10 = this.f46293e.n();
                                        for (ui.h hVar : list2) {
                                            ui.i a5 = hVar.a(this);
                                            if (a5 instanceof ui.i) {
                                                s sVar4 = a5.f46832a;
                                                this.f46293e.o(a5.f46833b);
                                                if (this.f46294f && sVar4.d().isEmpty()) {
                                                    H h10 = this.f46293e;
                                                    sVar4.g(h10.e(n10, h10.n()).f());
                                                }
                                                list = Collections.singletonList(sVar4);
                                            } else {
                                                this.f46293e.o(n10);
                                            }
                                        }
                                    }
                                    zi.a aVar = (zi.a) this.f46290b.get(Character.valueOf(m10));
                                    if (aVar != null) {
                                        H h11 = this.f46293e;
                                        int i10 = h11.f42431b;
                                        if (i10 > 0) {
                                            int i11 = i10 - 1;
                                            char charAt = ((xi.d) h11.f42434e).f50076a.charAt(i11);
                                            boolean isLowSurrogate = Character.isLowSurrogate(charAt);
                                            c10 = charAt;
                                            c10 = charAt;
                                            if (isLowSurrogate && i11 > 0) {
                                                char charAt2 = ((xi.d) h11.f42434e).f50076a.charAt(i10 - 2);
                                                c10 = charAt;
                                                if (Character.isHighSurrogate(charAt2)) {
                                                    c10 = Character.toCodePoint(charAt2, charAt);
                                                }
                                            }
                                        } else if (h11.f42430a > 0) {
                                            c10 = '\n';
                                        } else {
                                            c10 = 0;
                                        }
                                        C0373t n11 = this.f46293e.n();
                                        if (this.f46293e.h(m10) < aVar.b()) {
                                            this.f46293e.o(n11);
                                            kVar = str4;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            this.f46293e.o(n11);
                                            while (this.f46293e.k(m10)) {
                                                H h12 = this.f46293e;
                                                arrayList.add(i(h12.e(n11, h12.n())));
                                                n11 = this.f46293e.n();
                                            }
                                            H h13 = this.f46293e;
                                            int i12 = h13.f42431b;
                                            if (i12 < h13.f42432c) {
                                                char charAt3 = ((xi.d) h13.f42434e).f50076a.charAt(i12);
                                                boolean isHighSurrogate = Character.isHighSurrogate(charAt3);
                                                c11 = charAt3;
                                                if (isHighSurrogate) {
                                                    int i13 = h13.f42431b + 1;
                                                    c11 = charAt3;
                                                    if (i13 < h13.f42432c) {
                                                        char charAt4 = ((xi.d) h13.f42434e).f50076a.charAt(i13);
                                                        c11 = charAt3;
                                                        if (Character.isLowSurrogate(charAt4)) {
                                                            c11 = Character.toCodePoint(charAt3, charAt4);
                                                        }
                                                    }
                                                }
                                            } else if (h13.f42430a >= ((List) h13.f42433d).size() - 1) {
                                                c11 = 0;
                                            }
                                            if (c10 != 0 && !J.H(c10)) {
                                                z10 = false;
                                            } else {
                                                z10 = true;
                                            }
                                            if (c10 != 0 && !J.J(c10)) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            if (c11 != 0 && !J.H(c11)) {
                                                z12 = false;
                                            } else {
                                                z12 = true;
                                            }
                                            if (c11 != 0 && !J.J(c11)) {
                                                z13 = false;
                                            } else {
                                                z13 = true;
                                            }
                                            if (!z13 && (!z12 || z11 || z10)) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (!z11 && (!z10 || z13 || z12)) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (m10 == '_') {
                                                if (z14 && (!z15 || z10)) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                if (z15 && (!z14 || z12)) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                            } else {
                                                if (z14 && m10 == aVar.d()) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z15 && m10 == aVar.a()) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                z16 = z18;
                                            }
                                            kVar = new k(arrayList, z16, z17);
                                        }
                                        if (kVar == 0) {
                                            list = str4;
                                        } else {
                                            d dVar = this.f46296h;
                                            boolean z19 = kVar.f46288c;
                                            List list3 = kVar.f46286a;
                                            d dVar2 = new d(list3, m10, z19, kVar.f46287b, dVar);
                                            this.f46296h = dVar2;
                                            d dVar3 = dVar2.f46251f;
                                            if (dVar3 != null) {
                                                dVar3.f46252g = dVar2;
                                            }
                                            list = list3;
                                        }
                                    }
                                    list = Collections.singletonList(f());
                                }
                            } else {
                                C0373t n12 = this.f46293e.n();
                                this.f46293e.j();
                                C0373t n13 = this.f46293e.n();
                                C5071y c5071y = this.f46297i;
                                if (c5071y == null) {
                                    sVar3 = i(this.f46293e.e(n12, n13));
                                } else if (!c5071y.f42357b) {
                                    this.f46297i = (C5071y) c5071y.f42362g;
                                    sVar3 = i(this.f46293e.e(n12, n13));
                                } else {
                                    if (this.f46293e.k('(')) {
                                        this.f46293e.p();
                                        H h14 = this.f46293e;
                                        char m11 = h14.m();
                                        C0373t n14 = h14.n();
                                        if (!J.V(h14)) {
                                            str = str4;
                                        } else {
                                            if (m11 == '<') {
                                                String e10 = h14.e(n14, h14.n()).e();
                                                str3 = e10.substring(1, e10.length() - 1);
                                            } else {
                                                str3 = h14.e(n14, h14.n()).e();
                                            }
                                            str = vi.a.b(str3);
                                        }
                                        if (str == null) {
                                            this.f46293e.o(n13);
                                        } else {
                                            if (this.f46293e.p() >= 1) {
                                                H h15 = this.f46293e;
                                                C0373t n15 = h15.n();
                                                if (h15.f()) {
                                                    char m12 = h15.m();
                                                    char c12 = '\"';
                                                    if (m12 != '\"') {
                                                        c12 = '\'';
                                                        if (m12 != '\'') {
                                                            if (m12 == '(') {
                                                                c12 = ')';
                                                            }
                                                        }
                                                    }
                                                    h15.j();
                                                    if (J.X(h15, c12) && h15.f()) {
                                                        h15.j();
                                                        String e11 = h15.e(n15, h15.n()).e();
                                                        str4 = vi.a.b(e11.substring(1, e11.length() - 1));
                                                        this.f46293e.p();
                                                    }
                                                }
                                                str4 = null;
                                                this.f46293e.p();
                                            } else {
                                                str4 = null;
                                            }
                                            if (!this.f46293e.k(')')) {
                                                this.f46293e.o(n13);
                                            }
                                        }
                                        if (str == null) {
                                            H h16 = this.f46293e;
                                            if (h16.k('[')) {
                                                C0373t n16 = h16.n();
                                                if (J.W(h16)) {
                                                    C0373t n17 = h16.n();
                                                    if (h16.k(']')) {
                                                        str2 = h16.e(n16, n17).e();
                                                    }
                                                }
                                            }
                                            str2 = null;
                                            if (str2 == null) {
                                                this.f46293e.o(n13);
                                            }
                                            if ((str2 == null || str2.isEmpty()) && !c5071y.f42358c) {
                                                str2 = this.f46293e.e((C0373t) c5071y.f42361f, n12).e();
                                            }
                                            if (str2 != null) {
                                                D d10 = (D) this.f46291c.f34286h0;
                                                d10.getClass();
                                                wi.p pVar = (wi.p) d10.f25290b.get(vi.a.a(str2));
                                                if (pVar != null) {
                                                    str = pVar.f48606h;
                                                    str4 = pVar.f48607i;
                                                }
                                            }
                                        }
                                        if (str == null) {
                                            if (c5071y.f42356a) {
                                                ?? sVar5 = new s();
                                                sVar5.f48600g = str;
                                                sVar5.f48601h = str4;
                                                sVar3 = sVar5;
                                            } else {
                                                sVar3 = new wi.o(str, str4);
                                            }
                                            y yVar2 = (y) c5071y.f42359d;
                                            s sVar6 = yVar2.f48612e;
                                            while (sVar6 != null) {
                                                s sVar7 = sVar6.f48612e;
                                                sVar3.c(sVar6);
                                                sVar6 = sVar7;
                                            }
                                            if (this.f46294f) {
                                                H h17 = this.f46293e;
                                                sVar3.g(h17.e((C0373t) c5071y.f42360e, h17.n()).f());
                                            }
                                            g((d) c5071y.f42363h);
                                            c(sVar3);
                                            yVar2.i();
                                            C5071y c5071y2 = (C5071y) this.f46297i.f42362g;
                                            this.f46297i = c5071y2;
                                            if (!c5071y.f42356a) {
                                                while (c5071y2 != null) {
                                                    if (!c5071y2.f42356a) {
                                                        c5071y2.f42357b = false;
                                                    }
                                                    c5071y2 = (C5071y) c5071y2.f42362g;
                                                }
                                            }
                                        } else {
                                            this.f46297i = (C5071y) this.f46297i.f42362g;
                                            this.f46293e.o(n13);
                                            sVar3 = i(this.f46293e.e(n12, n13));
                                        }
                                    }
                                    str4 = null;
                                    str = null;
                                    if (str == null) {
                                    }
                                    if (str == null) {
                                    }
                                }
                                list = Collections.singletonList(sVar3);
                            }
                        } else {
                            C0373t n18 = this.f46293e.n();
                            this.f46293e.j();
                            C0373t n19 = this.f46293e.n();
                            y i14 = i(this.f46293e.e(n18, n19));
                            C5071y c5071y3 = this.f46297i;
                            C5071y c5071y4 = new C5071y(i14, n18, n19, c5071y3, this.f46296h, false);
                            if (c5071y3 != null) {
                                c5071y3.f42358c = true;
                            }
                            this.f46297i = c5071y4;
                            list = Collections.singletonList(i14);
                        }
                    } else {
                        C0373t n20 = this.f46293e.n();
                        this.f46293e.j();
                        if (this.f46293e.k('[')) {
                            C0373t n21 = this.f46293e.n();
                            yVar = i(this.f46293e.e(n20, n21));
                            C5071y c5071y5 = this.f46297i;
                            C5071y c5071y6 = new C5071y(yVar, n20, n21, c5071y5, this.f46296h, true);
                            if (c5071y5 != null) {
                                c5071y5.f42358c = true;
                            }
                            this.f46297i = c5071y6;
                        } else {
                            H h18 = this.f46293e;
                            yVar = i(h18.e(n20, h18.n()));
                        }
                        list = Collections.singletonList(yVar);
                    }
                } else {
                    this.f46293e.j();
                    if (this.f46295g >= 2) {
                        sVar2 = new s();
                    } else {
                        sVar2 = new s();
                    }
                    list = Collections.singletonList(sVar2);
                }
            } else {
                list = null;
            }
            if (list != null) {
                for (s sVar8 : list) {
                    sVar.c(sVar8);
                }
                str4 = null;
            } else {
                g(null);
                c(sVar);
                return;
            }
        }
    }

    public final y f() {
        char m10;
        C0373t n10 = this.f46293e.n();
        this.f46293e.j();
        while (true) {
            m10 = this.f46293e.m();
            if (m10 == 0 || this.f46289a.get(m10)) {
                break;
            }
            this.f46293e.j();
        }
        H h10 = this.f46293e;
        Q3.j e10 = h10.e(n10, h10.n());
        String e11 = e10.e();
        if (m10 == '\n') {
            int length = e11.length() - 1;
            while (true) {
                if (length >= 0) {
                    if (e11.charAt(length) != ' ') {
                        break;
                    }
                    length--;
                } else {
                    length = -1;
                    break;
                }
            }
            int i10 = length + 1;
            this.f46295g = e11.length() - i10;
            e11 = e11.substring(0, i10);
        } else if (m10 == 0) {
            e11 = e11.substring(0, J.f0(e11.length() - 1, 0, e11) + 1);
        }
        y yVar = new y(e11);
        yVar.g(e10.f());
        return yVar;
    }

    public final void g(d dVar) {
        boolean z10;
        List list;
        HashMap hashMap = new HashMap();
        d dVar2 = this.f46296h;
        while (dVar2 != null) {
            d dVar3 = dVar2.f46251f;
            if (dVar3 == dVar) {
                break;
            }
            dVar2 = dVar3;
        }
        while (dVar2 != null) {
            HashMap hashMap2 = this.f46290b;
            char c10 = dVar2.f46247b;
            zi.a aVar = (zi.a) hashMap2.get(Character.valueOf(c10));
            if (dVar2.f46250e && aVar != null) {
                char d10 = aVar.d();
                d dVar4 = dVar2.f46251f;
                int i10 = 0;
                boolean z11 = false;
                while (dVar4 != null && dVar4 != dVar && dVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (dVar4.f46249d && dVar4.f46247b == d10) {
                        i10 = aVar.c(dVar4, dVar2);
                        if (i10 > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    dVar4 = dVar4.f46251f;
                }
                z10 = false;
                if (!z10) {
                    if (!z11) {
                        hashMap.put(Character.valueOf(c10), dVar2.f46251f);
                        if (!dVar2.f46249d) {
                            h(dVar2);
                        }
                    }
                    dVar2 = dVar2.f46252g;
                } else {
                    for (int i11 = 0; i11 < i10; i11++) {
                        List list2 = dVar4.f46246a;
                        ((y) list2.remove(list2.size() - 1)).i();
                    }
                    int i12 = 0;
                    while (true) {
                        list = dVar2.f46246a;
                        if (i12 >= i10) {
                            break;
                        }
                        ((y) list.remove(0)).i();
                        i12++;
                    }
                    d dVar5 = dVar2.f46251f;
                    while (dVar5 != null && dVar5 != dVar4) {
                        d dVar6 = dVar5.f46251f;
                        h(dVar5);
                        dVar5 = dVar6;
                    }
                    if (dVar4.f46246a.size() == 0) {
                        h(dVar4);
                    }
                    if (list.size() == 0) {
                        d dVar7 = dVar2.f46252g;
                        h(dVar2);
                        dVar2 = dVar7;
                    }
                }
            } else {
                dVar2 = dVar2.f46252g;
            }
        }
        while (true) {
            d dVar8 = this.f46296h;
            if (dVar8 != null && dVar8 != dVar) {
                h(dVar8);
            } else {
                return;
            }
        }
    }

    public final void h(d dVar) {
        d dVar2 = dVar.f46251f;
        if (dVar2 != null) {
            dVar2.f46252g = dVar.f46252g;
        }
        d dVar3 = dVar.f46252g;
        if (dVar3 == null) {
            this.f46296h = dVar2;
        } else {
            dVar3.f46251f = dVar2;
        }
    }
}
