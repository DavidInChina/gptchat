package H9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class o implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7530a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7531b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7532c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7533d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7534e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f7535f;

    public o(boolean z10, boolean z11, List list, String str, boolean z12) {
        AbstractC3557B.c0("conversations", list);
        AbstractC3557B.c0("searchQuery", str);
        this.f7530a = z10;
        this.f7531b = z11;
        this.f7532c = list;
        this.f7533d = str;
        this.f7534e = z12;
        this.f7535f = Ad.l.i1(str, null, list);
    }

    public static o e(o oVar, boolean z10, List list, String str, boolean z11, int i10) {
        boolean z12;
        if ((i10 & 1) != 0) {
            z12 = oVar.f7530a;
        } else {
            z12 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = oVar.f7531b;
        }
        boolean z13 = z10;
        if ((i10 & 4) != 0) {
            list = oVar.f7532c;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            str = oVar.f7533d;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            z11 = oVar.f7534e;
        }
        oVar.getClass();
        AbstractC3557B.c0("conversations", list2);
        AbstractC3557B.c0("searchQuery", str2);
        return new o(z12, z13, list2, str2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f7530a == oVar.f7530a && this.f7531b == oVar.f7531b && AbstractC3557B.K(this.f7532c, oVar.f7532c) && AbstractC3557B.K(this.f7533d, oVar.f7533d) && this.f7534e == oVar.f7534e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.f7530a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = i10 * 31;
        if (this.f7531b) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int v10 = E9.f.v(this.f7533d, AbstractC4194d.s(this.f7532c, (i13 + i11) * 31, 31), 31);
        if (this.f7534e) {
            i12 = 1231;
        }
        return v10 + i12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArchiveState(initialLoading=");
        sb2.append(this.f7530a);
        sb2.append(", hasMore=");
        sb2.append(this.f7531b);
        sb2.append(", conversations=");
        sb2.append(this.f7532c);
        sb2.append(", searchQuery=");
        sb2.append(this.f7533d);
        sb2.append(", memoryAvailable=");
        return AbstractC4194d.w(sb2, this.f7534e, Separators.RPAREN);
    }
}
