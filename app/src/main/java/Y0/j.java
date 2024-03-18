package Y0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f22031b = new j(0);

    /* renamed from: c  reason: collision with root package name */
    public static final j f22032c = new j(1);

    /* renamed from: d  reason: collision with root package name */
    public static final j f22033d = new j(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f22034a;

    public j(int i10) {
        this.f22034a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.f22034a == ((j) obj).f22034a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22034a;
    }

    public final String toString() {
        int i10 = this.f22034a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return android.gov.nist.core.a.n(new StringBuilder("TextDecoration["), Gi.e.w(arrayList, ", ", null, 62), ']');
    }
}
