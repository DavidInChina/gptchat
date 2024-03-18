package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import cb.C2332A;
import cb.C2334C;
import cb.C2364e;
import cb.C2367h;
import cb.C2373n;
import cb.C2379t;
import cb.C2382w;
import cb.EnumC2333B;
import cb.EnumC2370k;
import cb.EnumC2376q;
import cb.EnumC2383x;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6190g0;
import yf.AbstractC6583a;

@AbstractC1998i
/* renamed from: Za.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1863o {
    public static final C1849h Companion = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer[] f23584k = {null, null, null, null, null, new C2695d(dh.u0.f28491a, 0), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    public final String f23585a;

    /* renamed from: b  reason: collision with root package name */
    public final C1855k f23586b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23587c;

    /* renamed from: d  reason: collision with root package name */
    public final C1839c f23588d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23589e;

    /* renamed from: f  reason: collision with root package name */
    public final List f23590f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f23591g;

    /* renamed from: h  reason: collision with root package name */
    public final Boolean f23592h;

    /* renamed from: i  reason: collision with root package name */
    public final C1861n f23593i;

    /* renamed from: j  reason: collision with root package name */
    public final String f23594j;

    public C1863o(int i10, String str, C1855k c1855k, String str2, C1839c c1839c, String str3, List list, Long l10, Boolean bool, C1861n c1861n, String str4) {
        if (991 == (i10 & 991)) {
            this.f23585a = str;
            this.f23586b = c1855k;
            this.f23587c = str2;
            this.f23588d = c1839c;
            this.f23589e = str3;
            if ((i10 & 32) == 0) {
                this.f23590f = kf.v.f37483Y;
            } else {
                this.f23590f = list;
            }
            this.f23591g = l10;
            this.f23592h = bool;
            this.f23593i = c1861n;
            this.f23594j = str4;
            return;
        }
        R4.b.e2(i10, 991, C1841d.f23548b);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.ArrayList] */
    public final C2334C a(List list, Rc.o oVar) {
        String str;
        String str2;
        C2373n c2373n;
        ?? r13;
        boolean z10;
        boolean z11;
        String str3;
        Sc.u uVar;
        EnumC2370k enumC2370k;
        EnumC2370k enumC2370k2;
        boolean z12;
        boolean z13;
        boolean z14;
        C2332A c2332a;
        C2382w c2382w;
        EnumC2383x enumC2383x;
        Boolean bool;
        List list2;
        String str4;
        AbstractC3557B.c0("tools", list);
        String str5 = this.f23585a;
        AbstractC3557B.c0("value", str5);
        C1855k c1855k = this.f23586b;
        String str6 = c1855k.f23569b;
        C1839c c1839c = this.f23588d;
        if (c1839c != null) {
            str = c1839c.f23539a;
        } else {
            str = null;
        }
        if (c1839c != null) {
            str2 = c1839c.f23540b;
        } else {
            str2 = null;
        }
        if (c1839c != null && c1839c.f23540b != null) {
            String str7 = c1839c.f23539a;
            if (str7 == null) {
                str4 = "";
            } else {
                str4 = str7;
            }
            EnumC2376q W6 = A7.b.W(c1839c.f23541c);
            String str8 = c1839c.f23540b;
            c2373n = new C2373n(str4, str8, str8, W6, false);
        } else {
            c2373n = null;
        }
        if (c1839c != null && (list2 = c1839c.f23543e) != null) {
            r13 = new ArrayList(AbstractC6583a.H1(list2, 10));
            for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                C1869r0 c1869r0 = (C1869r0) it.next();
                c1869r0.getClass();
                C1866p0 c1866p0 = c1869r0.f23608d;
                r13.add(new C2373n(c1866p0.f23597a, c1869r0.f23606b, c1866p0.f23599c, A7.b.W(c1869r0.f23605a), c1869r0.f23607c));
            }
        } else {
            r13 = 0;
        }
        kf.v vVar = kf.v.f37483Y;
        kf.v vVar2 = r13;
        if (r13 == 0) {
            vVar2 = vVar;
        }
        C2367h c2367h = new C2367h(c1855k.f23570c);
        List list3 = c1855k.f23572e;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list3, 10));
        Iterator it2 = list3.iterator();
        kf.v vVar3 = vVar2;
        while (it2.hasNext()) {
            C1847g c1847g = (C1847g) it2.next();
            arrayList.add(new C2364e(c1847g.f23557a, c1847g.f23558b, c1847g.f23559c));
            it2 = it2;
            vVar3 = vVar3;
        }
        kf.v vVar4 = vVar3;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = c1855k.f23571d.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                Iterator it4 = it3;
                if (Lg.n.I2((String) next, Separators.SLASH, false)) {
                    arrayList2.add(next);
                }
                it3 = it4;
            }
            arrayList = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                String str9 = (String) it5.next();
                String str10 = (String) kf.t.h2(Lg.n.G2(str9, new String[]{Separators.SP}));
                if (str10 == null) {
                    str10 = "";
                }
                arrayList.add(new C2364e(str10, Lg.n.U2(Lg.n.B2(str9, str10, "")).toString(), vVar));
            }
        }
        ArrayList arrayList3 = arrayList;
        String str11 = this.f23587c;
        if (str11 == null) {
            C6190g0.Companion.getClass();
            str11 = "text-davinci-002-render-sha";
        }
        String str12 = str11;
        List list4 = this.f23590f;
        boolean contains = list4.contains("reportable");
        boolean z15 = !list4.contains("unreviewable");
        if (c1839c != null && (bool = c1839c.f23542d) != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        boolean contains2 = list4.contains("uses_function_calls");
        boolean contains3 = list4.contains("pinned");
        Boolean bool2 = this.f23592h;
        if (bool2 != null) {
            z11 = bool2.booleanValue();
        } else {
            z11 = false;
        }
        C1861n c1861n = this.f23593i;
        if (c1861n != null) {
            str3 = c1861n.f23581a;
        } else {
            str3 = null;
        }
        boolean contains4 = list4.contains("workspace_disabled");
        boolean contains5 = list4.contains("memory_disabled");
        boolean contains6 = list4.contains("third_party");
        ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            C1846f0 c1846f0 = (C1846f0) it6.next();
            String str13 = c1846f0.f23553a;
            EnumC2333B V12 = A7.b.V1(c1846f0.f23554b);
            C1858l0 c1858l0 = c1846f0.f23555c;
            Iterator it7 = it6;
            if (c1858l0 != null) {
                C1852i0 c1852i0 = c1858l0.f23577c;
                if (c1852i0 != null) {
                    z14 = z10;
                    z13 = z15;
                    if (AbstractC3557B.K(c1852i0.f23564a, "oauth")) {
                        enumC2383x = EnumC2383x.f26556Y;
                    } else {
                        enumC2383x = EnumC2383x.f26557Z;
                    }
                    c2382w = new C2382w(enumC2383x);
                } else {
                    z13 = z15;
                    z14 = z10;
                    c2382w = null;
                }
                z12 = contains;
                c2332a = new C2332A(c1858l0.f23575a, c1858l0.f23576b, c2382w, c1858l0.f23578d);
            } else {
                z12 = contains;
                z13 = z15;
                z14 = z10;
                c2332a = null;
            }
            arrayList4.add(new C2379t(str13, V12, c2332a));
            it6 = it7;
            z10 = z14;
            z15 = z13;
            contains = z12;
        }
        boolean z16 = contains;
        boolean z17 = z15;
        boolean z18 = z10;
        if (oVar != null) {
            uVar = oVar.a();
        } else {
            uVar = null;
        }
        EnumC2370k.Companion.getClass();
        String str14 = this.f23594j;
        if (str14 != null) {
            switch (str14.hashCode()) {
                case -314497661:
                    if (str14.equals("private")) {
                        enumC2370k2 = EnumC2370k.f26521Z;
                        enumC2370k = enumC2370k2;
                        break;
                    }
                    break;
                case 3321850:
                    if (str14.equals("link")) {
                        enumC2370k2 = EnumC2370k.f26524j0;
                        enumC2370k = enumC2370k2;
                        break;
                    }
                    break;
                case 300911179:
                    if (str14.equals("marketplace")) {
                        enumC2370k2 = EnumC2370k.f26523i0;
                        enumC2370k = enumC2370k2;
                        break;
                    }
                    break;
                case 1108864149:
                    if (str14.equals("workspace")) {
                        enumC2370k2 = EnumC2370k.f26522h0;
                        enumC2370k = enumC2370k2;
                        break;
                    }
                    break;
            }
            return new C2334C(str5, c1855k.f23568a, str6, str, str2, c2373n, vVar4, c2367h, str12, z16, z17, z18, this.f23591g, contains2, z11, contains4, contains5, contains3, str3, contains6, arrayList4, c1855k.f23571d, arrayList3, uVar, enumC2370k, 1048576);
        }
        enumC2370k = null;
        return new C2334C(str5, c1855k.f23568a, str6, str, str2, c2373n, vVar4, c2367h, str12, z16, z17, z18, this.f23591g, contains2, z11, contains4, contains5, contains3, str3, contains6, arrayList4, c1855k.f23571d, arrayList3, uVar, enumC2370k, 1048576);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1863o)) {
            return false;
        }
        C1863o c1863o = (C1863o) obj;
        if (AbstractC3557B.K(this.f23585a, c1863o.f23585a) && AbstractC3557B.K(this.f23586b, c1863o.f23586b) && AbstractC3557B.K(this.f23587c, c1863o.f23587c) && AbstractC3557B.K(this.f23588d, c1863o.f23588d) && AbstractC3557B.K(this.f23589e, c1863o.f23589e) && AbstractC3557B.K(this.f23590f, c1863o.f23590f) && AbstractC3557B.K(this.f23591g, c1863o.f23591g) && AbstractC3557B.K(this.f23592h, c1863o.f23592h) && AbstractC3557B.K(this.f23593i, c1863o.f23593i) && AbstractC3557B.K(this.f23594j, c1863o.f23594j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int hashCode = (this.f23586b.hashCode() + (this.f23585a.hashCode() * 31)) * 31;
        int i16 = 0;
        String str = this.f23587c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i17 = (hashCode + i10) * 31;
        C1839c c1839c = this.f23588d;
        if (c1839c == null) {
            i11 = 0;
        } else {
            i11 = c1839c.hashCode();
        }
        int i18 = (i17 + i11) * 31;
        String str2 = this.f23589e;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f23590f, (i18 + i12) * 31, 31);
        Long l10 = this.f23591g;
        if (l10 == null) {
            i13 = 0;
        } else {
            i13 = l10.hashCode();
        }
        int i19 = (s10 + i13) * 31;
        Boolean bool = this.f23592h;
        if (bool == null) {
            i14 = 0;
        } else {
            i14 = bool.hashCode();
        }
        int i20 = (i19 + i14) * 31;
        C1861n c1861n = this.f23593i;
        if (c1861n == null) {
            i15 = 0;
        } else {
            i15 = c1861n.hashCode();
        }
        int i21 = (i20 + i15) * 31;
        String str3 = this.f23594j;
        if (str3 != null) {
            i16 = str3.hashCode();
        }
        return i21 + i16;
    }

    public final String toString() {
        return "ApiGizmo(id=" + this.f23585a + ", display=" + this.f23586b + ", model=" + this.f23587c + ", author=" + this.f23588d + ", instructions=" + this.f23589e + ", tags=" + this.f23590f + ", lastInteractionTime=" + this.f23591g + ", noLongerAvailable=" + this.f23592h + ", vanityMetrics=" + this.f23593i + ", shareRecipient=" + this.f23594j + Separators.RPAREN;
    }
}
