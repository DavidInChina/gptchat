package x8;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: x8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6359c extends AbstractC6375t implements Serializable {

    /* renamed from: i0  reason: collision with root package name */
    public transient Map f49545i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient int f49546j0;

    @Override // x8.AbstractC6375t
    public final C6363g a() {
        C6363g c6363g;
        C6363g c6363g2 = this.f49613h0;
        if (c6363g2 == null) {
            g0 g0Var = (g0) this;
            Map map = g0Var.f49545i0;
            if (map instanceof NavigableMap) {
                c6363g = new C6366j(g0Var, (NavigableMap) g0Var.f49545i0);
            } else if (map instanceof SortedMap) {
                c6363g = new C6369m(g0Var, (SortedMap) g0Var.f49545i0);
            } else {
                c6363g = new C6363g(g0Var, g0Var.f49545i0);
            }
            c6363g2 = c6363g;
            this.f49613h0 = c6363g2;
        }
        return c6363g2;
    }

    public final void b() {
        for (Collection collection : this.f49545i0.values()) {
            collection.clear();
        }
        this.f49545i0.clear();
        this.f49546j0 = 0;
    }

    public final boolean c(Double d10, Integer num) {
        Collection collection = (Collection) this.f49545i0.get(d10);
        if (collection == null) {
            List list = (List) ((g0) this).f49562k0.get();
            if (list.add(num)) {
                this.f49546j0++;
                this.f49545i0.put(d10, list);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(num)) {
            this.f49546j0++;
            return true;
        } else {
            return false;
        }
    }

    @Override // x8.AbstractC6375t
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
