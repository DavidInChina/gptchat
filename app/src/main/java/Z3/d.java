package z3;

import Lg.n;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC4194d;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f51577a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f51578b;

    /* renamed from: c  reason: collision with root package name */
    public final List f51579c;

    /* renamed from: d  reason: collision with root package name */
    public final List f51580d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z10, List list, List list2) {
        AbstractC3557B.c0("columns", list);
        AbstractC3557B.c0("orders", list2);
        this.f51577a = str;
        this.f51578b = z10;
        this.f51579c = list;
        this.f51580d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list2.add("ASC");
            }
        }
        this.f51580d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f51578b != dVar.f51578b || !AbstractC3557B.K(this.f51579c, dVar.f51579c) || !AbstractC3557B.K(this.f51580d, dVar.f51580d)) {
            return false;
        }
        String str = this.f51577a;
        boolean I22 = n.I2(str, "index_", false);
        String str2 = dVar.f51577a;
        if (I22) {
            return n.I2(str2, "index_", false);
        }
        return AbstractC3557B.K(str, str2);
    }

    public final int hashCode() {
        int i10;
        String str = this.f51577a;
        if (n.I2(str, "index_", false)) {
            i10 = -1184239155;
        } else {
            i10 = str.hashCode();
        }
        return this.f51580d.hashCode() + AbstractC4194d.s(this.f51579c, ((i10 * 31) + (this.f51578b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return "Index{name='" + this.f51577a + "', unique=" + this.f51578b + ", columns=" + this.f51579c + ", orders=" + this.f51580d + "'}";
    }
}
