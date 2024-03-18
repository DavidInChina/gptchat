package K4;

import id.AbstractC3557B;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: K4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823k {

    /* renamed from: a  reason: collision with root package name */
    public final Set f9441a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0823k(int i10) {
        this(new HashSet());
        if (i10 == 1) {
        } else if (i10 != 2) {
            this.f9441a = new HashSet();
        } else {
            this.f9441a = new LinkedHashSet();
        }
    }

    public final synchronized void a(Wh.G g10) {
        AbstractC3557B.c0("route", g10);
        this.f9441a.remove(g10);
    }

    public C0823k(HashSet hashSet) {
        this.f9441a = hashSet;
    }
}
