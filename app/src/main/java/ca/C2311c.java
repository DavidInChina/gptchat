package ca;

import Z8.AbstractC1809m0;
import Z8.E0;
import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import dh.C2682H;
import dh.C2695d;
import dh.u0;
import fa.AbstractC2965B;
import fa.C2969F;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kotlinx.serialization.KSerializer;
import l8.AbstractC4344b;
import r9.y;
import wd.C6168C;
import wd.C6178a0;
import wd.C6182c0;
import wd.C6190g0;
import y.AbstractC6463a;

@AbstractC1998i
/* renamed from: ca.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2311c {
    public static final C2310b Companion = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static final KSerializer[] f26373p = {null, null, null, null, null, null, new C2682H(C6178a0.f48382a, P9.d.f13881a, 1), null, null, new C2695d(u0.f28491a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final String f26374a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26375b;

    /* renamed from: c  reason: collision with root package name */
    public final Yg.p f26376c;

    /* renamed from: d  reason: collision with root package name */
    public final Yg.p f26377d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26378e;

    /* renamed from: f  reason: collision with root package name */
    public final String f26379f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f26380g;

    /* renamed from: h  reason: collision with root package name */
    public final String f26381h;

    /* renamed from: i  reason: collision with root package name */
    public final String f26382i;

    /* renamed from: j  reason: collision with root package name */
    public final List f26383j;

    /* renamed from: k  reason: collision with root package name */
    public final List f26384k;

    /* renamed from: l  reason: collision with root package name */
    public final EnumC2320l f26385l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f26386m;

    /* renamed from: n  reason: collision with root package name */
    public final Qa.e f26387n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f26388o;

    public C2311c(int i10, String str, String str2, Yg.p pVar, Yg.p pVar2, String str3, String str4, Map map, String str5, String str6, List list, boolean z10) {
        boolean z11 = true;
        if (13 == (i10 & 13)) {
            this.f26374a = str;
            if ((i10 & 2) == 0) {
                this.f26375b = null;
            } else {
                this.f26375b = str2;
            }
            this.f26376c = pVar;
            this.f26377d = pVar2;
            if ((i10 & 16) == 0) {
                this.f26378e = null;
            } else {
                this.f26378e = str3;
            }
            if ((i10 & 32) == 0) {
                this.f26379f = null;
            } else {
                this.f26379f = str4;
            }
            this.f26380g = (i10 & 64) == 0 ? kf.w.f37484Y : map;
            if ((i10 & 128) == 0) {
                this.f26381h = null;
            } else {
                this.f26381h = str5;
            }
            if ((i10 & 256) == 0) {
                this.f26382i = null;
            } else {
                this.f26382i = str6;
            }
            if ((i10 & 512) == 0) {
                this.f26383j = null;
            } else {
                this.f26383j = list;
            }
            this.f26384k = kf.v.f37483Y;
            this.f26385l = EnumC2320l.f26400h0;
            this.f26386m = false;
            C6182c0.Companion.getClass();
            String uuid = UUID.randomUUID().toString();
            AbstractC3557B.b0("toString(...)", uuid);
            C6190g0.Companion.getClass();
            Qa.e eVar = new Qa.e(AbstractC4344b.F0(y.n(y.V(str, uuid, "text-davinci-002-render-sha"))));
            this.f26387n = eVar;
            int i11 = eVar.f14549c;
            if (i11 > 100) {
                AbstractC1809m0.a().b(E0.f23245c, AbstractC4268D.a1(new C3959i(ParameterNames.ID, new C6168C(str)), new C3959i("size", Integer.valueOf(i11))));
            }
            if ((i10 & 1024) != 0) {
                this.f26388o = z10;
                return;
            }
            String str7 = this.f26379f;
            this.f26388o = (str7 == null || Lg.n.n2(str7) || AbstractC3557B.K(this.f26379f, "New chat")) ? false : z11;
            return;
        }
        R4.b.e2(i10, 13, C2309a.f26372b);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    public static C2311c a(C2311c c2311c, String str, String str2, Yg.p pVar, String str3, String str4, Map map, ArrayList arrayList, EnumC2320l enumC2320l, Qa.e eVar, int i10) {
        String str5;
        String str6;
        Yg.p pVar2;
        String str7;
        String str8;
        Map map2;
        ArrayList arrayList2;
        EnumC2320l enumC2320l2;
        Qa.e eVar2;
        if ((i10 & 1) != 0) {
            str5 = c2311c.f26374a;
        } else {
            str5 = str;
        }
        if ((i10 & 2) != 0) {
            str6 = c2311c.f26375b;
        } else {
            str6 = str2;
        }
        Yg.p pVar3 = c2311c.f26376c;
        if ((i10 & 8) != 0) {
            pVar2 = c2311c.f26377d;
        } else {
            pVar2 = pVar;
        }
        if ((i10 & 16) != 0) {
            str7 = c2311c.f26378e;
        } else {
            str7 = str3;
        }
        if ((i10 & 32) != 0) {
            str8 = c2311c.f26379f;
        } else {
            str8 = str4;
        }
        if ((i10 & 64) != 0) {
            map2 = c2311c.f26380g;
        } else {
            map2 = map;
        }
        String str9 = c2311c.f26381h;
        String str10 = c2311c.f26382i;
        List list = c2311c.f26383j;
        if ((i10 & 1024) != 0) {
            arrayList2 = c2311c.f26384k;
        } else {
            arrayList2 = arrayList;
        }
        if ((i10 & 2048) != 0) {
            enumC2320l2 = c2311c.f26385l;
        } else {
            enumC2320l2 = enumC2320l;
        }
        boolean z10 = c2311c.f26386m;
        if ((i10 & 8192) != 0) {
            eVar2 = c2311c.f26387n;
        } else {
            eVar2 = eVar;
        }
        c2311c.getClass();
        AbstractC3557B.c0(ParameterNames.ID, str5);
        AbstractC3557B.c0("modificationDate", pVar2);
        AbstractC3557B.c0("moderationResults", map2);
        AbstractC3557B.c0("uiElements", arrayList2);
        AbstractC3557B.c0("messageLoadingStatus", enumC2320l2);
        AbstractC3557B.c0("messageTree", eVar2);
        return new C2311c(str5, str6, pVar3, pVar2, str7, str8, map2, str9, str10, list, arrayList2, enumC2320l2, z10, eVar2);
    }

    public final Qa.h b() {
        C6182c0 c6182c0;
        String str = this.f26378e;
        if (str != null) {
            c6182c0 = new C6182c0(str);
        } else {
            c6182c0 = null;
        }
        Qa.e eVar = this.f26387n;
        Qa.h f6 = eVar.f(c6182c0);
        if (f6 == null) {
            return (Qa.h) kf.t.o2(eVar.b(eVar.f14547a));
        }
        return f6;
    }

    public final Yg.p c() {
        Yg.p pVar = ((C2969F) b().f14557d).f30016i;
        if (pVar == null) {
            return this.f26377d;
        }
        return pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2311c)) {
            return false;
        }
        C2311c c2311c = (C2311c) obj;
        if (!AbstractC3557B.K(this.f26374a, c2311c.f26374a)) {
            return false;
        }
        String str = this.f26375b;
        String str2 = c2311c.f26375b;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f26376c, c2311c.f26376c) || !AbstractC3557B.K(this.f26377d, c2311c.f26377d)) {
            return false;
        }
        String str3 = this.f26378e;
        String str4 = c2311c.f26378e;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (!AbstractC3557B.K(this.f26379f, c2311c.f26379f) || !AbstractC3557B.K(this.f26380g, c2311c.f26380g)) {
            return false;
        }
        String str5 = this.f26381h;
        String str6 = c2311c.f26381h;
        if (str5 != null ? !(str6 != null && AbstractC3557B.K(str5, str6)) : str6 != null) {
            return false;
        }
        String str7 = this.f26382i;
        String str8 = c2311c.f26382i;
        if (str7 != null ? !(str8 != null && AbstractC3557B.K(str7, str8)) : str8 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f26383j, c2311c.f26383j) && AbstractC3557B.K(this.f26384k, c2311c.f26384k) && this.f26385l == c2311c.f26385l && this.f26386m == c2311c.f26386m && AbstractC3557B.K(this.f26387n, c2311c.f26387n)) {
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
        int i16;
        int hashCode = this.f26374a.hashCode() * 31;
        int i17 = 0;
        String str = this.f26375b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i18 = (hashCode + i10) * 31;
        Yg.p pVar = this.f26376c;
        if (pVar == null) {
            i11 = 0;
        } else {
            i11 = pVar.f22419Y.hashCode();
        }
        int hashCode2 = (this.f26377d.f22419Y.hashCode() + ((i18 + i11) * 31)) * 31;
        String str2 = this.f26378e;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i19 = (hashCode2 + i12) * 31;
        String str3 = this.f26379f;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int f6 = AbstractC6463a.f(this.f26380g, (i19 + i13) * 31, 31);
        String str4 = this.f26381h;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i20 = (f6 + i14) * 31;
        String str5 = this.f26382i;
        if (str5 == null) {
            i15 = 0;
        } else {
            i15 = str5.hashCode();
        }
        int i21 = (i20 + i15) * 31;
        List list = this.f26383j;
        if (list != null) {
            i17 = list.hashCode();
        }
        int hashCode3 = (this.f26385l.hashCode() + AbstractC4194d.s(this.f26384k, (i21 + i17) * 31, 31)) * 31;
        if (this.f26386m) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        return this.f26387n.f14548b.hashCode() + ((hashCode3 + i16) * 31);
    }

    public final String toString() {
        String str;
        AbstractC2965B abstractC2965B = ((C2969F) b().f14557d).f30015h;
        String a5 = C6168C.a(this.f26374a);
        String str2 = this.f26375b;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6168C.a(str2);
        }
        StringBuilder t10 = android.gov.nist.core.a.t("Conversation(id = ", a5, ", remoteId = ", str, ", currentMessage = ");
        t10.append(abstractC2965B);
        t10.append(Separators.RPAREN);
        return t10.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2311c(String str, String str2, Yg.p pVar, Yg.p pVar2, String str3, String str4, LinkedHashMap linkedHashMap, String str5, boolean z10, Qa.e eVar, int i10) {
        this(str, r5, pVar, pVar2, r8, r9, r10, null, r12, null, r14, r15, r16, r17);
        Qa.e eVar2;
        String str6 = (i10 & 2) != 0 ? null : str2;
        String str7 = (i10 & 16) != 0 ? null : str3;
        String str8 = (i10 & 32) != 0 ? null : str4;
        Map map = (i10 & 64) != 0 ? kf.w.f37484Y : linkedHashMap;
        String str9 = (i10 & 256) != 0 ? null : str5;
        kf.v vVar = kf.v.f37483Y;
        EnumC2320l enumC2320l = EnumC2320l.f26400h0;
        boolean z11 = (i10 & 4096) != 0 ? false : z10;
        if ((i10 & 8192) != 0) {
            C6182c0.Companion.getClass();
            String uuid = UUID.randomUUID().toString();
            AbstractC3557B.b0("toString(...)", uuid);
            C6190g0.Companion.getClass();
            eVar2 = new Qa.e(AbstractC4344b.F0(y.n(y.V(str, uuid, "text-davinci-002-render-sha"))));
        } else {
            eVar2 = eVar;
        }
    }

    public C2311c(String str, String str2, Yg.p pVar, Yg.p pVar2, String str3, String str4, Map map, String str5, String str6, List list, List list2, EnumC2320l enumC2320l, boolean z10, Qa.e eVar) {
        boolean z11 = true;
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("modificationDate", pVar2);
        AbstractC3557B.c0("moderationResults", map);
        AbstractC3557B.c0("uiElements", list2);
        AbstractC3557B.c0("messageLoadingStatus", enumC2320l);
        AbstractC3557B.c0("messageTree", eVar);
        this.f26374a = str;
        this.f26375b = str2;
        this.f26376c = pVar;
        this.f26377d = pVar2;
        this.f26378e = str3;
        this.f26379f = str4;
        this.f26380g = map;
        this.f26381h = str5;
        this.f26382i = str6;
        this.f26383j = list;
        this.f26384k = list2;
        this.f26385l = enumC2320l;
        this.f26386m = z10;
        this.f26387n = eVar;
        int i10 = eVar.f14549c;
        if (i10 > 100) {
            AbstractC1809m0.a().b(E0.f23245c, AbstractC4268D.a1(new C3959i(ParameterNames.ID, new C6168C(str)), new C3959i("size", Integer.valueOf(i10))));
        }
        this.f26388o = (str4 == null || Lg.n.n2(str4) || AbstractC3557B.K(str4, "New chat")) ? false : z11;
    }
}
