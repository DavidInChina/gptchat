package Qh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Qh.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1225c extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final List f14991a;

    public C1225c(ArrayList arrayList) {
        this.f14991a = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // Qh.AbstractC1233k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Object obj) {
        Iterable iterable = (Iterable) obj;
        boolean z10 = iterable instanceof Collection;
        List list = this.f14991a;
        if (z10 && ((Collection) iterable).size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Object obj2 : iterable) {
            if (!it.hasNext() || !((AbstractC1234l) it.next()).a(obj2)) {
                return false;
            }
            while (r5.hasNext()) {
            }
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1225c.class != obj.getClass()) {
            return false;
        }
        if (!this.f14991a.equals(((C1225c) obj).f14991a)) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return this.f14991a.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("containing(");
        boolean z10 = true;
        for (Object obj : this.f14991a) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(obj);
        }
        sb2.append(')');
        return sb2.toString();
    }
}
