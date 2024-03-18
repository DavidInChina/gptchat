package p2;

import Z.C1745x0;
import android.os.Bundle;
import java.util.ArrayList;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class U implements AbstractC5057j {

    /* renamed from: Z  reason: collision with root package name */
    public static final String f41938Z = Integer.toString(0, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final C5064q f41939Y;

    static {
        new C1745x0(1).b();
        int i10 = AbstractC5530A.f45131a;
    }

    public U(C5064q c5064q) {
        this.f41939Y = c5064q;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            C5064q c5064q = this.f41939Y;
            if (i10 < c5064q.f42219a.size()) {
                arrayList.add(Integer.valueOf(c5064q.a(i10)));
                i10++;
            } else {
                bundle.putIntegerArrayList(f41938Z, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        return this.f41939Y.equals(((U) obj).f41939Y);
    }

    public final int hashCode() {
        return this.f41939Y.hashCode();
    }
}
