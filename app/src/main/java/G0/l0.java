package G0;

import id.AbstractC3557B;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class l0 implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final l0 f5810Y = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
        int e02 = AbstractC3557B.e0(aVar2.f24852p0, aVar.f24852p0);
        if (e02 == 0) {
            return AbstractC3557B.e0(aVar.hashCode(), aVar2.hashCode());
        }
        return e02;
    }
}
