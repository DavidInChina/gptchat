package Qh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Qh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1226d extends AbstractC1233k {

    /* renamed from: a  reason: collision with root package name */
    public final int f14992a = 0;

    @Override // Qh.AbstractC1233k
    public final boolean d(Object obj) {
        Iterable iterable = (Iterable) obj;
        boolean z10 = iterable instanceof Collection;
        int i10 = this.f14992a;
        if (z10) {
            if (((Collection) iterable).size() == i10) {
                return true;
            }
        } else {
            Iterator it = iterable.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                it.next();
                i11++;
            }
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @Override // Qh.AbstractC1233k
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1226d.class != obj.getClass()) {
            return false;
        }
        if (this.f14992a != ((C1226d) obj).f14992a) {
            return false;
        }
        return true;
    }

    @Override // Qh.AbstractC1233k
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f14992a;
    }

    public final String toString() {
        return AbstractC2469q0.j(new StringBuilder("ofSize("), this.f14992a, ')');
    }
}
