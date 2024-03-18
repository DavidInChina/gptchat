package H0;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class M implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Comparator f6776Y;

    public M(Comparator comparator) {
        this.f6776Y = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.f6776Y.compare(obj, obj2);
        if (compare == 0) {
            return androidx.compose.ui.node.a.f24829O0.compare(((L0.o) obj).f10420c, ((L0.o) obj2).f10420c);
        }
        return compare;
    }
}
