package bb;

import android.gov.nist.core.Separators;
import cb.C2350T;
import cb.C2353W;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class m0 implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final List f25872a;

    /* renamed from: b  reason: collision with root package name */
    public final C2353W f25873b;

    /* renamed from: c  reason: collision with root package name */
    public final H0 f25874c;

    /* renamed from: d  reason: collision with root package name */
    public final l0 f25875d;

    /* renamed from: e  reason: collision with root package name */
    public final H0 f25876e;

    public m0(List list, C2353W c2353w, H0 h02, l0 l0Var) {
        H0 h03;
        Object obj;
        C2353W c2353w2;
        C2353W c2353w3;
        AbstractC3557B.c0("categories", list);
        AbstractC3557B.c0("userGizmosCategory", h02);
        this.f25872a = list;
        this.f25873b = c2353w;
        this.f25874c = h02;
        this.f25875d = l0Var;
        Iterator it = list.iterator();
        while (true) {
            h03 = null;
            if (it.hasNext()) {
                obj = it.next();
                C2350T c2350t = ((H0) obj).f25722c;
                if (c2350t != null) {
                    c2353w3 = c2350t.f26486a;
                } else {
                    c2353w3 = null;
                }
                if (AbstractC3557B.K(c2353w3, this.f25873b)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        H0 h04 = (H0) obj;
        if (h04 == null) {
            H0 h05 = this.f25874c;
            C2350T c2350t2 = h05.f25722c;
            if (c2350t2 != null) {
                c2353w2 = c2350t2.f26486a;
            } else {
                c2353w2 = null;
            }
            if (AbstractC3557B.K(c2353w2, this.f25873b)) {
                h03 = h05;
            }
        } else {
            h03 = h04;
        }
        this.f25876e = h03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static m0 e(m0 m0Var, ArrayList arrayList, C2353W c2353w, H0 h02, l0 l0Var, int i10) {
        ArrayList arrayList2 = arrayList;
        if ((i10 & 1) != 0) {
            arrayList2 = m0Var.f25872a;
        }
        if ((i10 & 2) != 0) {
            c2353w = m0Var.f25873b;
        }
        if ((i10 & 4) != 0) {
            h02 = m0Var.f25874c;
        }
        if ((i10 & 8) != 0) {
            l0Var = m0Var.f25875d;
        }
        m0Var.getClass();
        AbstractC3557B.c0("categories", arrayList2);
        AbstractC3557B.c0("userGizmosCategory", h02);
        return new m0(arrayList2, c2353w, h02, l0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (AbstractC3557B.K(this.f25872a, m0Var.f25872a) && AbstractC3557B.K(this.f25873b, m0Var.f25873b) && AbstractC3557B.K(this.f25874c, m0Var.f25874c) && AbstractC3557B.K(this.f25875d, m0Var.f25875d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f25872a.hashCode() * 31;
        int i11 = 0;
        C2353W c2353w = this.f25873b;
        if (c2353w == null) {
            i10 = 0;
        } else {
            i10 = c2353w.hashCode();
        }
        int hashCode2 = (this.f25874c.hashCode() + ((hashCode + i10) * 31)) * 31;
        l0 l0Var = this.f25875d;
        if (l0Var != null) {
            i11 = l0Var.hashCode();
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        return "GizmoStoreState(categories=" + this.f25872a + ", selectedCategoryInfo=" + this.f25873b + ", userGizmosCategory=" + this.f25874c + ", searchState=" + this.f25875d + Separators.RPAREN;
    }
}
