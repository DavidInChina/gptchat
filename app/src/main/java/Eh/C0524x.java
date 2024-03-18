package Eh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: Eh.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524x implements A, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f4813Y = new ArrayList();

    public C0524x(A... aArr) {
        List<A> asList = Arrays.asList(aArr);
        for (A a5 : asList) {
            if (a5 instanceof C0524x) {
                this.f4813Y.addAll(((C0524x) a5).f4813Y);
            } else if (!(a5 instanceof EnumC0526z)) {
                this.f4813Y.add(a5);
            }
        }
    }

    @Override // Eh.A
    public final void a(Class cls) {
        Iterator it = this.f4813Y.iterator();
        while (it.hasNext()) {
            ((A) it.next()).a(cls);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0524x.class == obj.getClass() && this.f4813Y.equals(((C0524x) obj).f4813Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4813Y.hashCode() + (C0524x.class.hashCode() * 31);
    }
}
