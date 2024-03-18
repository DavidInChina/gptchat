package id;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2682H;
import dh.C2695d;
import dh.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import y.AbstractC6463a;

@AbstractC1998i
/* loaded from: classes.dex */
public final class x {
    public static final w Companion = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer[] f33131g;

    /* renamed from: a  reason: collision with root package name */
    public final List f33132a;

    /* renamed from: b  reason: collision with root package name */
    public final u f33133b;

    /* renamed from: c  reason: collision with root package name */
    public final List f33134c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33135d;

    /* renamed from: e  reason: collision with root package name */
    public final List f33136e;

    /* renamed from: f  reason: collision with root package name */
    public final int f33137f;

    /* JADX WARN: Type inference failed for: r3v0, types: [id.w, java.lang.Object] */
    static {
        u0 u0Var = u0.f28491a;
        f33131g = new KSerializer[]{new C2695d(new C2682H(u0Var, C3567g.f33094a, 1), 0), null, new C2695d(C3558C.f33085a, 0), null, new C2695d(u0Var, 0), null};
    }

    public x(int i10, List list, u uVar, List list2, int i11, List list3, int i12) {
        Set keySet;
        List list4 = null;
        if (1 == (i10 & 1)) {
            this.f33132a = list;
            this.f33133b = (i10 & 2) == 0 ? new u() : uVar;
            int i13 = i10 & 4;
            List list5 = kf.v.f37483Y;
            if (i13 == 0) {
                this.f33134c = list5;
            } else {
                this.f33134c = list2;
            }
            if ((i10 & 8) == 0) {
                this.f33135d = list.size();
            } else {
                this.f33135d = i11;
            }
            if ((i10 & 16) == 0) {
                Map map = (Map) kf.t.h2(list);
                if (map != null && (keySet = map.keySet()) != null) {
                    list4 = kf.t.K2(keySet);
                }
                this.f33136e = list4 != null ? list4 : list5;
            } else {
                this.f33136e = list3;
            }
            if ((i10 & 32) == 0) {
                this.f33137f = this.f33136e.size();
                return;
            } else {
                this.f33137f = i12;
                return;
            }
        }
        R4.b.e2(i10, 1, v.f33130b);
        throw null;
    }

    public final String a(int i10) {
        String str = (String) kf.t.i2(i10, this.f33136e);
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (AbstractC3557B.K(this.f33132a, xVar.f33132a) && AbstractC3557B.K(this.f33133b, xVar.f33133b) && AbstractC3557B.K(this.f33134c, xVar.f33134c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33134c.hashCode() + AbstractC6463a.f(this.f33133b.f33128a, this.f33132a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SpreadsheetModel(data=" + this.f33132a + ", metadata=" + this.f33133b + ", suggestions=" + this.f33134c + Separators.RPAREN;
    }

    public x(ArrayList arrayList, u uVar, List list) {
        Set keySet;
        AbstractC3557B.c0("metadata", uVar);
        AbstractC3557B.c0("suggestions", list);
        this.f33132a = arrayList;
        this.f33133b = uVar;
        this.f33134c = list;
        this.f33135d = arrayList.size();
        Map map = (Map) kf.t.h2(arrayList);
        List K22 = (map == null || (keySet = map.keySet()) == null) ? null : kf.t.K2(keySet);
        K22 = K22 == null ? kf.v.f37483Y : K22;
        this.f33136e = K22;
        this.f33137f = K22.size();
    }
}
