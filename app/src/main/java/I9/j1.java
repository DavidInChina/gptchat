package I9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import cb.C2334C;
import cb.C2362c0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import k6.AbstractC4194d;
import l8.AbstractC4344b;
import wd.C6168C;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class j1 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8383a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8384b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8385c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8386d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8387e;

    /* renamed from: f  reason: collision with root package name */
    public final String f8388f;

    /* renamed from: g  reason: collision with root package name */
    public final List f8389g;

    /* renamed from: h  reason: collision with root package name */
    public final C2362c0 f8390h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8391i;

    /* renamed from: j  reason: collision with root package name */
    public final String f8392j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8393k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8394l;

    /* renamed from: m  reason: collision with root package name */
    public final zd.n f8395m;

    /* renamed from: n  reason: collision with root package name */
    public final Set f8396n;

    /* renamed from: o  reason: collision with root package name */
    public final Set f8397o;

    /* renamed from: p  reason: collision with root package name */
    public final Set f8398p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8399q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8400r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8401s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8402t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f8403u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f8404v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kf.v] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public j1(boolean z10, boolean z11, boolean z12, boolean z13, String str, String str2, List list, C2362c0 c2362c0, boolean z14, String str3, boolean z15, boolean z16, zd.n nVar, Set set, Set set2, Set set3, boolean z17) {
        boolean z18;
        boolean z19;
        ?? r82;
        boolean z20;
        Object obj;
        l1 l1Var;
        int indexOf;
        boolean z21;
        boolean z22;
        List list2;
        AbstractC3557B.c0("conversations", list);
        AbstractC3557B.c0("searchQuery", str3);
        AbstractC3557B.c0("inProgressRename", set);
        AbstractC3557B.c0("inProgressArchive", set2);
        AbstractC3557B.c0("inProgressDelete", set3);
        this.f8383a = z10;
        this.f8384b = z11;
        this.f8385c = z12;
        this.f8386d = z13;
        this.f8387e = str;
        this.f8388f = str2;
        this.f8389g = list;
        this.f8390h = c2362c0;
        this.f8391i = z14;
        this.f8392j = str3;
        this.f8393k = z15;
        this.f8394l = z16;
        this.f8395m = nVar;
        this.f8396n = set;
        this.f8397o = set2;
        this.f8398p = set3;
        this.f8399q = z17;
        if (nVar != null && !nVar.f51982a) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.f8400r = z18;
        if ((nVar != null && !nVar.f51982a) || c2362c0 != null) {
            z19 = true;
        } else {
            z19 = false;
        }
        this.f8401s = z19;
        this.f8402t = list.isEmpty();
        if (c2362c0 != null && (list2 = c2362c0.f26510a) != null) {
            r82 = new ArrayList();
            for (Object obj2 : list2) {
                C2334C c2334c = (C2334C) obj2;
                AbstractC3557B.c0("<this>", c2334c);
                if (Lg.n.Z1(c2334c.f26439b, str3, true)) {
                    r82.add(obj2);
                }
            }
        } else {
            r82 = 0;
        }
        r82 = r82 == 0 ? kf.v.f37483Y : r82;
        new l1(r82.size() - 4, r82.subList(Math.min(r82.size(), 4), r82.size()));
        if (str == null && str2 == null) {
            z20 = true;
        } else {
            z20 = false;
        }
        List F02 = AbstractC4344b.F0(new C0765k(z20));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(r82, 10));
        int i10 = 0;
        for (Object obj3 : r82) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                C2334C c2334c2 = (C2334C) obj3;
                String str4 = c2334c2.f26438a;
                if (str2 == null) {
                    z21 = false;
                } else {
                    z21 = AbstractC3557B.K(str4, str2);
                }
                if (r82.size() <= 5 || i10 < 4 || z15) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                arrayList.add(new C0773o(c2334c2, z21, z22, i10));
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        ArrayList M22 = kf.t.M2(arrayList);
        ListIterator listIterator = M22.listIterator(M22.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                AbstractC0775p abstractC0775p = (AbstractC0775p) obj;
                if ((abstractC0775p instanceof C0773o) && ((C0773o) abstractC0775p).f8421a.f26455r) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC0775p abstractC0775p2 = (AbstractC0775p) obj;
        if (abstractC0775p2 != null && (indexOf = M22.indexOf(abstractC0775p2)) < M22.size() - 1) {
            M22.add(indexOf + 1, C0771n.f8419a);
        }
        this.f8403u = kf.t.d2(kf.t.x2(!z16 ? null : C0767l.f8409a, kf.t.x2(!z15 ? null : k1.f8408a, kf.t.x2((r82.size() <= 5 || z15) ? null : l1Var, kf.t.w2(M22, F02)))));
        List list3 = this.f8389g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list3) {
            C2311c c2311c = (C2311c) obj4;
            if (c2311c.f26375b != null && !c2311c.f26386m) {
                arrayList2.add(obj4);
            }
        }
        this.f8404v = kf.t.w2(Ad.l.i1(this.f8392j, this.f8387e, arrayList2), this.f8403u);
    }

    public static j1 e(j1 j1Var, boolean z10, boolean z11, boolean z12, List list, C2362c0 c2362c0, boolean z13, String str, boolean z14, zd.n nVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, boolean z15, int i10) {
        boolean z16;
        boolean z17;
        boolean z18;
        List list2;
        C2362c0 c2362c02;
        boolean z19;
        String str2;
        boolean z20;
        zd.n nVar2;
        Set set;
        Set set2;
        boolean z21;
        Set set3;
        boolean z22;
        if ((i10 & 1) != 0) {
            z16 = j1Var.f8383a;
        } else {
            z16 = z10;
        }
        if ((i10 & 2) != 0) {
            z17 = j1Var.f8384b;
        } else {
            z17 = z11;
        }
        if ((i10 & 4) != 0) {
            z18 = j1Var.f8385c;
        } else {
            z18 = z12;
        }
        boolean z23 = j1Var.f8386d;
        String str3 = j1Var.f8387e;
        String str4 = j1Var.f8388f;
        if ((i10 & 64) != 0) {
            list2 = j1Var.f8389g;
        } else {
            list2 = list;
        }
        if ((i10 & 128) != 0) {
            c2362c02 = j1Var.f8390h;
        } else {
            c2362c02 = c2362c0;
        }
        if ((i10 & 256) != 0) {
            z19 = j1Var.f8391i;
        } else {
            z19 = z13;
        }
        if ((i10 & 512) != 0) {
            str2 = j1Var.f8392j;
        } else {
            str2 = str;
        }
        if ((i10 & 1024) != 0) {
            z20 = j1Var.f8393k;
        } else {
            z20 = z14;
        }
        boolean z24 = j1Var.f8394l;
        if ((i10 & 4096) != 0) {
            nVar2 = j1Var.f8395m;
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 8192) != 0) {
            set = j1Var.f8396n;
        } else {
            set = linkedHashSet;
        }
        if ((i10 & 16384) != 0) {
            set2 = j1Var.f8397o;
        } else {
            set2 = linkedHashSet2;
        }
        if ((i10 & 32768) != 0) {
            z21 = z24;
            set3 = j1Var.f8398p;
        } else {
            z21 = z24;
            set3 = linkedHashSet3;
        }
        if ((i10 & 65536) != 0) {
            z22 = j1Var.f8399q;
        } else {
            z22 = z15;
        }
        j1Var.getClass();
        AbstractC3557B.c0("conversations", list2);
        AbstractC3557B.c0("searchQuery", str2);
        AbstractC3557B.c0("inProgressRename", set);
        AbstractC3557B.c0("inProgressArchive", set2);
        AbstractC3557B.c0("inProgressDelete", set3);
        Set set4 = set3;
        return new j1(z16, z17, z18, z23, str3, str4, list2, c2362c02, z19, str2, z20, z21, nVar2, set, set2, set4, z22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (this.f8383a != j1Var.f8383a || this.f8384b != j1Var.f8384b || this.f8385c != j1Var.f8385c || this.f8386d != j1Var.f8386d) {
            return false;
        }
        String str = this.f8387e;
        String str2 = j1Var.f8387e;
        if (str != null ? !(str2 != null && AbstractC3557B.K(str, str2)) : str2 != null) {
            return false;
        }
        String str3 = this.f8388f;
        String str4 = j1Var.f8388f;
        if (str3 != null ? !(str4 != null && AbstractC3557B.K(str3, str4)) : str4 != null) {
            return false;
        }
        if (AbstractC3557B.K(this.f8389g, j1Var.f8389g) && AbstractC3557B.K(this.f8390h, j1Var.f8390h) && this.f8391i == j1Var.f8391i && AbstractC3557B.K(this.f8392j, j1Var.f8392j) && this.f8393k == j1Var.f8393k && this.f8394l == j1Var.f8394l && AbstractC3557B.K(this.f8395m, j1Var.f8395m) && AbstractC3557B.K(this.f8396n, j1Var.f8396n) && AbstractC3557B.K(this.f8397o, j1Var.f8397o) && AbstractC3557B.K(this.f8398p, j1Var.f8398p) && this.f8399q == j1Var.f8399q) {
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
        int i20 = 1237;
        if (this.f8383a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i21 = i10 * 31;
        if (this.f8384b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i22 = (i21 + i11) * 31;
        if (this.f8385c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i23 = (i22 + i12) * 31;
        if (this.f8386d) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i24 = (i23 + i13) * 31;
        int i25 = 0;
        String str = this.f8387e;
        if (str == null) {
            i14 = 0;
        } else {
            i14 = str.hashCode();
        }
        int i26 = (i24 + i14) * 31;
        String str2 = this.f8388f;
        if (str2 == null) {
            i15 = 0;
        } else {
            i15 = str2.hashCode();
        }
        int s10 = AbstractC4194d.s(this.f8389g, (i26 + i15) * 31, 31);
        C2362c0 c2362c0 = this.f8390h;
        if (c2362c0 == null) {
            i16 = 0;
        } else {
            i16 = c2362c0.hashCode();
        }
        int i27 = (s10 + i16) * 31;
        if (this.f8391i) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int v10 = E9.f.v(this.f8392j, (i27 + i17) * 31, 31);
        if (this.f8393k) {
            i18 = 1231;
        } else {
            i18 = 1237;
        }
        int i28 = (v10 + i18) * 31;
        if (this.f8394l) {
            i19 = 1231;
        } else {
            i19 = 1237;
        }
        int i29 = (i28 + i19) * 31;
        zd.n nVar = this.f8395m;
        if (nVar != null) {
            i25 = nVar.hashCode();
        }
        int hashCode = this.f8396n.hashCode();
        int hashCode2 = (this.f8398p.hashCode() + ((this.f8397o.hashCode() + ((hashCode + ((i29 + i25) * 31)) * 31)) * 31)) * 31;
        if (this.f8399q) {
            i20 = 1231;
        }
        return hashCode2 + i20;
    }

    public final String toString() {
        String str;
        String str2 = "null";
        String str3 = this.f8387e;
        if (str3 == null) {
            str = str2;
        } else {
            str = C6168C.a(str3);
        }
        String str4 = this.f8388f;
        if (str4 != null) {
            str2 = wd.O.a(str4);
        }
        StringBuilder sb2 = new StringBuilder("HistoryState(initialLoading=");
        sb2.append(this.f8383a);
        sb2.append(", refreshLoading=");
        sb2.append(this.f8384b);
        sb2.append(", pagingLoading=");
        sb2.append(this.f8385c);
        sb2.append(", searchPreselected=");
        sb2.append(this.f8386d);
        sb2.append(", savedStateConversationId=");
        sb2.append(str);
        sb2.append(", savedStateGizmoId=");
        sb2.append(str2);
        sb2.append(", conversations=");
        sb2.append(this.f8389g);
        sb2.append(", gizmos=");
        sb2.append(this.f8390h);
        sb2.append(", hasMore=");
        sb2.append(this.f8391i);
        sb2.append(", searchQuery=");
        sb2.append(this.f8392j);
        sb2.append(", expandedGizmosList=");
        sb2.append(this.f8393k);
        sb2.append(", gizmoStoreEnabled=");
        sb2.append(this.f8394l);
        sb2.append(", userSettings=");
        sb2.append(this.f8395m);
        sb2.append(", inProgressRename=");
        sb2.append(this.f8396n);
        sb2.append(", inProgressArchive=");
        sb2.append(this.f8397o);
        sb2.append(", inProgressDelete=");
        sb2.append(this.f8398p);
        sb2.append(", memoryAvailable=");
        return AbstractC4194d.w(sb2, this.f8399q, Separators.RPAREN);
    }
}
