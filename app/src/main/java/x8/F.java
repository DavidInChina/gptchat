package x8;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class F extends j0 implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Comparator[] f49512Y;

    public F(C6376u c6376u, C6376u c6376u2) {
        this.f49512Y = new Comparator[]{c6376u, c6376u2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f49512Y;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i10].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            return Arrays.equals(this.f49512Y, ((F) obj).f49512Y);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f49512Y);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f49512Y);
        StringBuilder sb2 = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb2.append("Ordering.compound(");
        sb2.append(arrays);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
