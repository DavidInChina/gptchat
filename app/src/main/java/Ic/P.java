package ic;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jc.C3942j;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class P implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f32961a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32962b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f32963c;

    /* renamed from: d  reason: collision with root package name */
    public final List f32964d;

    /* renamed from: e  reason: collision with root package name */
    public final String f32965e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f32966f;

    /* renamed from: g  reason: collision with root package name */
    public final List f32967g;

    /* renamed from: h  reason: collision with root package name */
    public final C2334C f32968h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f32969i;

    public P(Boolean bool, boolean z10, boolean z11, List list, String str, boolean z12, List list2, C2334C c2334c) {
        AbstractC3557B.c0("memories", list);
        AbstractC3557B.c0("query", str);
        AbstractC3557B.c0("gizmos", list2);
        this.f32961a = bool;
        this.f32962b = z10;
        this.f32963c = z11;
        this.f32964d = list;
        this.f32965e = str;
        this.f32966f = z12;
        this.f32967g = list2;
        this.f32968h = c2334c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Lg.n.Z1(((C3942j) obj).f36112b, this.f32965e, true)) {
                arrayList.add(obj);
            }
        }
        this.f32969i = arrayList;
    }

    public static P e(P p10, Boolean bool, boolean z10, boolean z11, List list, String str, boolean z12, List list2, C2334C c2334c, int i10) {
        Boolean bool2;
        boolean z13;
        boolean z14;
        List list3;
        String str2;
        boolean z15;
        List list4;
        C2334C c2334c2;
        if ((i10 & 1) != 0) {
            bool2 = p10.f32961a;
        } else {
            bool2 = bool;
        }
        if ((i10 & 2) != 0) {
            z13 = p10.f32962b;
        } else {
            z13 = z10;
        }
        if ((i10 & 4) != 0) {
            z14 = p10.f32963c;
        } else {
            z14 = z11;
        }
        if ((i10 & 8) != 0) {
            list3 = p10.f32964d;
        } else {
            list3 = list;
        }
        if ((i10 & 16) != 0) {
            str2 = p10.f32965e;
        } else {
            str2 = str;
        }
        if ((i10 & 32) != 0) {
            z15 = p10.f32966f;
        } else {
            z15 = z12;
        }
        if ((i10 & 64) != 0) {
            list4 = p10.f32967g;
        } else {
            list4 = list2;
        }
        if ((i10 & 128) != 0) {
            c2334c2 = p10.f32968h;
        } else {
            c2334c2 = c2334c;
        }
        p10.getClass();
        AbstractC3557B.c0("memories", list3);
        AbstractC3557B.c0("query", str2);
        AbstractC3557B.c0("gizmos", list4);
        return new P(bool2, z13, z14, list3, str2, z15, list4, c2334c2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (AbstractC3557B.K(this.f32961a, p10.f32961a) && this.f32962b == p10.f32962b && this.f32963c == p10.f32963c && AbstractC3557B.K(this.f32964d, p10.f32964d) && AbstractC3557B.K(this.f32965e, p10.f32965e) && this.f32966f == p10.f32966f && AbstractC3557B.K(this.f32967g, p10.f32967g) && AbstractC3557B.K(this.f32968h, p10.f32968h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        Boolean bool = this.f32961a;
        if (bool == null) {
            i10 = 0;
        } else {
            i10 = bool.hashCode();
        }
        int i14 = i10 * 31;
        int i15 = 1237;
        if (this.f32962b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i16 = (i14 + i11) * 31;
        if (this.f32963c) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int v10 = E9.f.v(this.f32965e, AbstractC4194d.s(this.f32964d, (i16 + i12) * 31, 31), 31);
        if (this.f32966f) {
            i15 = 1231;
        }
        int s10 = AbstractC4194d.s(this.f32967g, (v10 + i15) * 31, 31);
        C2334C c2334c = this.f32968h;
        if (c2334c != null) {
            i13 = c2334c.hashCode();
        }
        return s10 + i13;
    }

    public final String toString() {
        return "ViewMemoryState(memoryActive=" + this.f32961a + ", initialLoading=" + this.f32962b + ", refreshing=" + this.f32963c + ", memories=" + this.f32964d + ", query=" + this.f32965e + ", clearingMemory=" + this.f32966f + ", gizmos=" + this.f32967g + ", selectedGizmo=" + this.f32968h + Separators.RPAREN;
    }
}
