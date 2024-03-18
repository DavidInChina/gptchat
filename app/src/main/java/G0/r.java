package G0;

import id.AbstractC3557B;
import java.util.Map;
import java.util.TreeSet;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5818a = false;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3957g f5819b = R4.b.C1(EnumC3958h.f36153Z, C0582k.f5799h0);

    /* renamed from: c  reason: collision with root package name */
    public final z0 f5820c = new TreeSet(new C0588q(0));

    public final void a(androidx.compose.ui.node.a aVar) {
        if (aVar.S()) {
            if (this.f5818a) {
                AbstractC3957g abstractC3957g = this.f5819b;
                Integer num = (Integer) ((Map) abstractC3957g.getValue()).get(aVar);
                if (num == null) {
                    ((Map) abstractC3957g.getValue()).put(aVar, Integer.valueOf(aVar.f24852p0));
                } else {
                    if (num.intValue() != aVar.f24852p0) {
                        throw new IllegalStateException("invalid node depth".toString());
                    }
                }
            }
            this.f5820c.add(aVar);
            return;
        }
        throw new IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
    }

    public final boolean b(androidx.compose.ui.node.a aVar) {
        boolean contains = this.f5820c.contains(aVar);
        if (this.f5818a && contains != ((Map) this.f5819b.getValue()).containsKey(aVar)) {
            throw new IllegalStateException("inconsistency in TreeSet".toString());
        }
        return contains;
    }

    public final boolean c(androidx.compose.ui.node.a aVar) {
        Integer num;
        if (aVar.S()) {
            boolean remove = this.f5820c.remove(aVar);
            if (this.f5818a) {
                Integer num2 = (Integer) ((Map) this.f5819b.getValue()).remove(aVar);
                if (remove) {
                    num = Integer.valueOf(aVar.f24852p0);
                } else {
                    num = null;
                }
                if (!AbstractC3557B.K(num2, num)) {
                    throw new IllegalStateException("invalid node depth".toString());
                }
            }
            return remove;
        }
        throw new IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
    }

    public final String toString() {
        return this.f5820c.toString();
    }
}
