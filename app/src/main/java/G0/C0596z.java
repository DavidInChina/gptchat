package G0;

import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;

/* renamed from: G0.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0596z {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.compose.ui.node.a f5848a;

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f5849b = AbstractC4828h.Z(null, o1.f22665a);

    public C0596z(androidx.compose.ui.node.a aVar) {
        this.f5848a = aVar;
    }

    public final E0.N a() {
        E0.N n10 = (E0.N) this.f5849b.getValue();
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }
}
