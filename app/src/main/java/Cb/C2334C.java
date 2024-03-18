package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import dh.C2695d;
import dh.u0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;
import wd.C6190g0;

@AbstractC1998i
/* renamed from: cb.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334C {

    /* renamed from: a  reason: collision with root package name */
    public final String f26438a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26439b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26440c;

    /* renamed from: d  reason: collision with root package name */
    public final String f26441d;

    /* renamed from: e  reason: collision with root package name */
    public final String f26442e;

    /* renamed from: f  reason: collision with root package name */
    public final C2373n f26443f;

    /* renamed from: g  reason: collision with root package name */
    public final List f26444g;

    /* renamed from: h  reason: collision with root package name */
    public final C2367h f26445h;

    /* renamed from: i  reason: collision with root package name */
    public final String f26446i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f26447j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f26448k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f26449l;

    /* renamed from: m  reason: collision with root package name */
    public final Long f26450m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f26451n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f26452o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f26453p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f26454q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f26455r;

    /* renamed from: s  reason: collision with root package name */
    public final String f26456s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f26457t;

    /* renamed from: u  reason: collision with root package name */
    public final String f26458u;

    /* renamed from: v  reason: collision with root package name */
    public final List f26459v;

    /* renamed from: w  reason: collision with root package name */
    public final List f26460w;

    /* renamed from: x  reason: collision with root package name */
    public final List f26461x;

    /* renamed from: y  reason: collision with root package name */
    public final Sc.u f26462y;

    /* renamed from: z  reason: collision with root package name */
    public final EnumC2370k f26463z;
    public static final C2359b Companion = new Object();

    /* renamed from: A  reason: collision with root package name */
    public static final KSerializer[] f26436A = {null, null, null, null, null, null, new C2695d(C2371l.f26526a, 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C2695d(C2377r.f26546a, 0), new C2695d(u0.f28491a, 0), new C2695d(C2361c.f26507a, 0), null, EnumC2370k.Companion.serializer()};

    /* renamed from: B  reason: collision with root package name */
    public static final C2334C f26437B = new C2334C("gizmoId", "Dall\u00b7e", "Let me turn your imagination into imagery", "Joey Flynn", (String) null, (C2373n) null, (List) null, new C2367h(null), (String) null, true, false, false, (Long) 100000L, false, false, false, false, false, (String) null, false, (ArrayList) null, (List) null, (ArrayList) null, (Sc.u) null, (EnumC2370k) null, 67079280);

    public C2334C(int i10, String str, String str2, String str3, String str4, String str5, C2373n c2373n, List list, C2367h c2367h, String str6, boolean z10, boolean z11, boolean z12, Long l10, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str7, boolean z18, String str8, List list2, List list3, List list4, Sc.u uVar, EnumC2370k enumC2370k) {
        if (3 == (i10 & 3)) {
            this.f26438a = str;
            this.f26439b = str2;
            if ((i10 & 4) == 0) {
                this.f26440c = null;
            } else {
                this.f26440c = str3;
            }
            if ((i10 & 8) == 0) {
                this.f26441d = null;
            } else {
                this.f26441d = str4;
            }
            if ((i10 & 16) == 0) {
                this.f26442e = null;
            } else {
                this.f26442e = str5;
            }
            if ((i10 & 32) == 0) {
                this.f26443f = null;
            } else {
                this.f26443f = c2373n;
            }
            int i11 = i10 & 64;
            kf.v vVar = kf.v.f37483Y;
            if (i11 == 0) {
                this.f26444g = vVar;
            } else {
                this.f26444g = list;
            }
            this.f26445h = (i10 & 128) == 0 ? new C2367h(null) : c2367h;
            if ((i10 & 256) == 0) {
                this.f26446i = null;
            } else {
                this.f26446i = str6;
            }
            if ((i10 & 512) == 0) {
                this.f26447j = false;
            } else {
                this.f26447j = z10;
            }
            if ((i10 & 1024) == 0) {
                this.f26448k = false;
            } else {
                this.f26448k = z11;
            }
            if ((i10 & 2048) == 0) {
                this.f26449l = false;
            } else {
                this.f26449l = z12;
            }
            if ((i10 & 4096) == 0) {
                this.f26450m = null;
            } else {
                this.f26450m = l10;
            }
            if ((i10 & 8192) == 0) {
                this.f26451n = false;
            } else {
                this.f26451n = z13;
            }
            if ((i10 & 16384) == 0) {
                this.f26452o = false;
            } else {
                this.f26452o = z14;
            }
            if ((32768 & i10) == 0) {
                this.f26453p = false;
            } else {
                this.f26453p = z15;
            }
            if ((65536 & i10) == 0) {
                this.f26454q = false;
            } else {
                this.f26454q = z16;
            }
            if ((131072 & i10) == 0) {
                this.f26455r = false;
            } else {
                this.f26455r = z17;
            }
            if ((262144 & i10) == 0) {
                this.f26456s = null;
            } else {
                this.f26456s = str7;
            }
            if ((524288 & i10) == 0) {
                this.f26457t = false;
            } else {
                this.f26457t = z18;
            }
            if ((1048576 & i10) == 0) {
                this.f26458u = null;
            } else {
                this.f26458u = str8;
            }
            if ((2097152 & i10) == 0) {
                this.f26459v = vVar;
            } else {
                this.f26459v = list2;
            }
            if ((4194304 & i10) == 0) {
                this.f26460w = vVar;
            } else {
                this.f26460w = list3;
            }
            if ((8388608 & i10) == 0) {
                this.f26461x = vVar;
            } else {
                this.f26461x = list4;
            }
            if ((16777216 & i10) == 0) {
                this.f26462y = null;
            } else {
                this.f26462y = uVar;
            }
            if ((i10 & 33554432) == 0) {
                this.f26463z = null;
                return;
            } else {
                this.f26463z = enumC2370k;
                return;
            }
        }
        R4.b.e2(i10, 3, C2357a.f26504b);
        throw null;
    }

    public static C2334C a(C2334C c2334c, boolean z10) {
        String str = c2334c.f26438a;
        String str2 = c2334c.f26439b;
        String str3 = c2334c.f26440c;
        String str4 = c2334c.f26441d;
        String str5 = c2334c.f26442e;
        C2373n c2373n = c2334c.f26443f;
        List list = c2334c.f26444g;
        C2367h c2367h = c2334c.f26445h;
        String str6 = c2334c.f26446i;
        boolean z11 = c2334c.f26447j;
        boolean z12 = c2334c.f26448k;
        boolean z13 = c2334c.f26449l;
        Long l10 = c2334c.f26450m;
        boolean z14 = c2334c.f26451n;
        boolean z15 = c2334c.f26452o;
        boolean z16 = c2334c.f26453p;
        boolean z17 = c2334c.f26454q;
        String str7 = c2334c.f26456s;
        boolean z18 = c2334c.f26457t;
        String str8 = c2334c.f26458u;
        List list2 = c2334c.f26459v;
        List list3 = c2334c.f26460w;
        List list4 = c2334c.f26461x;
        Sc.u uVar = c2334c.f26462y;
        EnumC2370k enumC2370k = c2334c.f26463z;
        c2334c.getClass();
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("name", str2);
        AbstractC3557B.c0("socials", list);
        AbstractC3557B.c0(ParameterNames.ICON, c2367h);
        AbstractC3557B.c0("tools", list2);
        AbstractC3557B.c0("starterPrompts", list3);
        AbstractC3557B.c0("commands", list4);
        return new C2334C(str, str2, str3, str4, str5, c2373n, list, c2367h, str6, z11, z12, z13, l10, z14, z15, z16, z17, z10, str7, z18, str8, list2, list3, list4, uVar, enumC2370k);
    }

    public final boolean b() {
        EnumC2383x enumC2383x;
        C2382w c2382w;
        List<C2379t> list = this.f26459v;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C2379t c2379t : list) {
            C2332A c2332a = c2379t.f26551c;
            if (c2332a != null && (c2382w = c2332a.f26426c) != null) {
                enumC2383x = c2382w.f26555a;
            } else {
                enumC2383x = null;
            }
            if (enumC2383x == EnumC2383x.f26556Y) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        List<C2379t> list = this.f26459v;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C2379t c2379t : list) {
            if (c2379t.f26550b == EnumC2333B.f26431i0) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (!this.f26452o && !this.f26453p && !this.f26454q) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2334C)) {
            return false;
        }
        C2334C c2334c = (C2334C) obj;
        if (!AbstractC3557B.K(this.f26438a, c2334c.f26438a) || !AbstractC3557B.K(this.f26439b, c2334c.f26439b) || !AbstractC3557B.K(this.f26440c, c2334c.f26440c) || !AbstractC3557B.K(this.f26441d, c2334c.f26441d) || !AbstractC3557B.K(this.f26442e, c2334c.f26442e) || !AbstractC3557B.K(this.f26443f, c2334c.f26443f) || !AbstractC3557B.K(this.f26444g, c2334c.f26444g) || !AbstractC3557B.K(this.f26445h, c2334c.f26445h)) {
            return false;
        }
        String str = this.f26446i;
        String str2 = c2334c.f26446i;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        if (this.f26447j == c2334c.f26447j && this.f26448k == c2334c.f26448k && this.f26449l == c2334c.f26449l && AbstractC3557B.K(this.f26450m, c2334c.f26450m) && this.f26451n == c2334c.f26451n && this.f26452o == c2334c.f26452o && this.f26453p == c2334c.f26453p && this.f26454q == c2334c.f26454q && this.f26455r == c2334c.f26455r && AbstractC3557B.K(this.f26456s, c2334c.f26456s) && this.f26457t == c2334c.f26457t && AbstractC3557B.K(this.f26458u, c2334c.f26458u) && AbstractC3557B.K(this.f26459v, c2334c.f26459v) && AbstractC3557B.K(this.f26460w, c2334c.f26460w) && AbstractC3557B.K(this.f26461x, c2334c.f26461x) && AbstractC3557B.K(this.f26462y, c2334c.f26462y) && this.f26463z == c2334c.f26463z) {
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
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int v10 = E9.f.v(this.f26439b, this.f26438a.hashCode() * 31, 31);
        int i27 = 0;
        String str = this.f26440c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i28 = (v10 + i10) * 31;
        String str2 = this.f26441d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i29 = (i28 + i11) * 31;
        String str3 = this.f26442e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i30 = (i29 + i12) * 31;
        C2373n c2373n = this.f26443f;
        if (c2373n == null) {
            i13 = 0;
        } else {
            i13 = c2373n.hashCode();
        }
        int hashCode = (this.f26445h.hashCode() + AbstractC4194d.s(this.f26444g, (i30 + i13) * 31, 31)) * 31;
        String str4 = this.f26446i;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i31 = (hashCode + i14) * 31;
        int i32 = 1237;
        if (this.f26447j) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i33 = (i31 + i15) * 31;
        if (this.f26448k) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i34 = (i33 + i16) * 31;
        if (this.f26449l) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i35 = (i34 + i17) * 31;
        Long l10 = this.f26450m;
        if (l10 == null) {
            i18 = 0;
        } else {
            i18 = l10.hashCode();
        }
        int i36 = (i35 + i18) * 31;
        if (this.f26451n) {
            i19 = 1231;
        } else {
            i19 = 1237;
        }
        int i37 = (i36 + i19) * 31;
        if (this.f26452o) {
            i20 = 1231;
        } else {
            i20 = 1237;
        }
        int i38 = (i37 + i20) * 31;
        if (this.f26453p) {
            i21 = 1231;
        } else {
            i21 = 1237;
        }
        int i39 = (i38 + i21) * 31;
        if (this.f26454q) {
            i22 = 1231;
        } else {
            i22 = 1237;
        }
        int i40 = (i39 + i22) * 31;
        if (this.f26455r) {
            i23 = 1231;
        } else {
            i23 = 1237;
        }
        int i41 = (i40 + i23) * 31;
        String str5 = this.f26456s;
        if (str5 == null) {
            i24 = 0;
        } else {
            i24 = str5.hashCode();
        }
        int i42 = (i41 + i24) * 31;
        if (this.f26457t) {
            i32 = 1231;
        }
        int i43 = (i42 + i32) * 31;
        String str6 = this.f26458u;
        if (str6 == null) {
            i25 = 0;
        } else {
            i25 = str6.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f26461x, AbstractC4194d.s(this.f26460w, AbstractC4194d.s(this.f26459v, (i43 + i25) * 31, 31), 31), 31);
        Sc.u uVar = this.f26462y;
        if (uVar == null) {
            i26 = 0;
        } else {
            i26 = uVar.hashCode();
        }
        int i44 = (s10 + i26) * 31;
        EnumC2370k enumC2370k = this.f26463z;
        if (enumC2370k != null) {
            i27 = enumC2370k.hashCode();
        }
        return i44 + i27;
    }

    public final String toString() {
        String str;
        String a5 = wd.O.a(this.f26438a);
        String str2 = this.f26446i;
        if (str2 == null) {
            str = "null";
        } else {
            str = C6190g0.b(str2);
        }
        StringBuilder s10 = android.gov.nist.core.a.s("Gizmo(id=", a5, ", name=");
        s10.append(this.f26439b);
        s10.append(", description=");
        s10.append(this.f26440c);
        s10.append(", author=");
        s10.append(this.f26441d);
        s10.append(", website=");
        s10.append(this.f26442e);
        s10.append(", primarySocial=");
        s10.append(this.f26443f);
        s10.append(", socials=");
        s10.append(this.f26444g);
        s10.append(", icon=");
        s10.append(this.f26445h);
        s10.append(", model=");
        s10.append(str);
        s10.append(", reportable=");
        s10.append(this.f26447j);
        s10.append(", reviewable=");
        s10.append(this.f26448k);
        s10.append(", acceptsFeedback=");
        s10.append(this.f26449l);
        s10.append(", lastInteractionTime=");
        s10.append(this.f26450m);
        s10.append(", usesFunctionCalls=");
        s10.append(this.f26451n);
        s10.append(", noLongerAvailable=");
        s10.append(this.f26452o);
        s10.append(", workspaceDisabled=");
        s10.append(this.f26453p);
        s10.append(", memoryDisabled=");
        s10.append(this.f26454q);
        s10.append(", pinned=");
        s10.append(this.f26455r);
        s10.append(", conversationCount=");
        s10.append(this.f26456s);
        s10.append(", thirdParty=");
        s10.append(this.f26457t);
        s10.append(", privacyLabel=");
        s10.append(this.f26458u);
        s10.append(", tools=");
        s10.append(this.f26459v);
        s10.append(", starterPrompts=");
        s10.append(this.f26460w);
        s10.append(", commands=");
        s10.append(this.f26461x);
        s10.append(", productFeatures=");
        s10.append(this.f26462y);
        s10.append(", shareRecipient=");
        s10.append(this.f26463z);
        s10.append(Separators.RPAREN);
        return s10.toString();
    }

    public C2334C(String str, String str2, String str3, String str4, String str5, C2373n c2373n, List list, C2367h c2367h, String str6, boolean z10, boolean z11, boolean z12, Long l10, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str7, boolean z18, String str8, List list2, List list3, List list4, Sc.u uVar, EnumC2370k enumC2370k) {
        AbstractC3557B.c0("name", str2);
        AbstractC3557B.c0("socials", list);
        AbstractC3557B.c0(ParameterNames.ICON, c2367h);
        AbstractC3557B.c0("tools", list2);
        AbstractC3557B.c0("starterPrompts", list3);
        AbstractC3557B.c0("commands", list4);
        this.f26438a = str;
        this.f26439b = str2;
        this.f26440c = str3;
        this.f26441d = str4;
        this.f26442e = str5;
        this.f26443f = c2373n;
        this.f26444g = list;
        this.f26445h = c2367h;
        this.f26446i = str6;
        this.f26447j = z10;
        this.f26448k = z11;
        this.f26449l = z12;
        this.f26450m = l10;
        this.f26451n = z13;
        this.f26452o = z14;
        this.f26453p = z15;
        this.f26454q = z16;
        this.f26455r = z17;
        this.f26456s = str7;
        this.f26457t = z18;
        this.f26458u = str8;
        this.f26459v = list2;
        this.f26460w = list3;
        this.f26461x = list4;
        this.f26462y = uVar;
        this.f26463z = enumC2370k;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2334C(String str, String str2, String str3, String str4, String str5, C2373n c2373n, List list, C2367h c2367h, String str6, boolean z10, boolean z11, boolean z12, Long l10, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String str7, boolean z18, ArrayList arrayList, List list2, ArrayList arrayList2, Sc.u uVar, EnumC2370k enumC2370k, int i10) {
        this(str, str2, str3, str4, r8, r9, r1 != 0 ? r3 : list, c2367h, str6, z10, (i10 & 1024) != 0 ? false : z11, (i10 & 2048) != 0 ? false : z12, l10, z13, z14, (32768 & i10) != 0 ? false : z15, (65536 & i10) != 0 ? false : z16, (131072 & i10) != 0 ? false : z17, (262144 & i10) != 0 ? null : str7, (524288 & i10) != 0 ? false : z18, (String) null, (2097152 & i10) != 0 ? r3 : arrayList, (4194304 & i10) != 0 ? r3 : list2, (8388608 & i10) != 0 ? r3 : arrayList2, (16777216 & i10) != 0 ? null : uVar, (i10 & 33554432) != 0 ? null : enumC2370k);
        String str8 = (i10 & 16) != 0 ? null : str5;
        C2373n c2373n2 = (i10 & 32) != 0 ? null : c2373n;
        int i11 = i10 & 64;
        kf.v vVar = kf.v.f37483Y;
    }
}
