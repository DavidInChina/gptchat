package x8;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class v0 extends u0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f49618Y).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f49618Y.iterator();
        it.getClass();
        w8.g gVar = this.f49619Z;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, x8.u0] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new u0(((SortedSet) this.f49618Y).headSet(obj), this.f49619Z);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f49618Y;
        while (true) {
            Object last = sortedSet.last();
            if (this.f49619Z.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, x8.u0] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new u0(((SortedSet) this.f49618Y).subSet(obj, obj2), this.f49619Z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, x8.u0] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new u0(((SortedSet) this.f49618Y).tailSet(obj), this.f49619Z);
    }
}
