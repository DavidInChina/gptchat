package N0;

import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;

/* renamed from: N0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1047f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1046e f12516a = new C1046e("", null, 6);

    public static final ArrayList a(List list, int i10, int i11) {
        if (i10 <= i11) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Object obj = list.get(i12);
                C1045d c1045d = (C1045d) obj;
                if (c(i10, i11, c1045d.f12509b, c1045d.f12510c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                C1045d c1045d2 = (C1045d) arrayList.get(i13);
                arrayList2.add(new C1045d(Math.max(i10, c1045d2.f12509b) - i10, Math.min(i11, c1045d2.f12510c) - i10, c1045d2.f12508a, c1045d2.f12511d));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
    }

    public static final List b(C1046e c1046e, int i10, int i11) {
        List list;
        if (i10 == i11 || (list = c1046e.f12513Z) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= c1046e.f12512Y.length()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C1045d c1045d = (C1045d) obj;
            if (c(i10, i11, c1045d.f12509b, c1045d.f12510c)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1045d c1045d2 = (C1045d) arrayList.get(i13);
            arrayList2.add(new C1045d(c1045d2.f12508a, N.p(c1045d2.f12509b, i10, i11) - i10, N.p(c1045d2.f12510c, i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean c(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (Math.max(i10, i12) < Math.min(i11, i13)) {
            return true;
        }
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if (i12 == i13) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i10 == i11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 == z13) {
                return true;
            }
        }
        if (i12 <= i10 && i11 <= i13) {
            if (i13 != i11) {
                return true;
            }
            if (i10 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i12 == i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
        }
        return false;
    }
}
