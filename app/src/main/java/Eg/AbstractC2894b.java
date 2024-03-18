package eg;

import dg.y;
import dg.z;
import java.util.ArrayList;
import kg.C4290b;
import kg.C4294f;
import pg.C5169f;

/* renamed from: eg.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2894b implements z {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f29387a = new ArrayList();

    @Override // dg.z
    public final void a() {
        f((String[]) this.f29387a.toArray(new String[0]));
    }

    @Override // dg.z
    public final void c(Object obj) {
        if (obj instanceof String) {
            this.f29387a.add((String) obj);
        }
    }

    @Override // dg.z
    public final y d(C4290b c4290b) {
        return null;
    }

    public abstract void f(String[] strArr);

    @Override // dg.z
    public final void e(C5169f c5169f) {
    }

    @Override // dg.z
    public final void b(C4290b c4290b, C4294f c4294f) {
    }
}
