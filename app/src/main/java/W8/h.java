package w8;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class h implements g, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final List f48225Y;

    public h(List list) {
        this.f48225Y = list;
    }

    @Override // w8.g
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f48225Y;
            if (i10 < list.size()) {
                if (!((g) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f48225Y.equals(((h) obj).f48225Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f48225Y.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f48225Y) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
