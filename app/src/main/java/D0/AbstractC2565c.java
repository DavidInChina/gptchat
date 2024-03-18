package d0;

import c0.AbstractC2274d;
import c0.C2271a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kf.AbstractC4280e;

/* renamed from: d0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2565c extends AbstractC4280e implements AbstractC2274d {
    @Override // kf.AbstractC4276a, java.util.Collection, java.util.List, c0.AbstractC2274d
    public AbstractC2274d addAll(Collection collection) {
        f builder = builder();
        builder.addAll(collection);
        return builder.y();
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // kf.AbstractC4276a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection<Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // kf.AbstractC4280e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final List subList(int i10, int i11) {
        return new C2271a(this, i10, i11);
    }
}
