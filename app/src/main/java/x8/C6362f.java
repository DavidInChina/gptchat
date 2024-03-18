package x8;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: x8.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6362f implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49552Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Iterator f49553Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f49554h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f49555i0;

    public C6362f(AbstractC6371o abstractC6371o) {
        Iterator it;
        this.f49555i0 = abstractC6371o;
        Collection collection = abstractC6371o.f49587Z;
        this.f49554h0 = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f49553Z = it;
    }

    public final void a() {
        Object obj = this.f49555i0;
        ((AbstractC6371o) obj).r();
        if (((AbstractC6371o) obj).f49587Z == ((Collection) this.f49554h0)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f49552Y;
        Iterator it = this.f49553Z;
        switch (i10) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                a();
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f49552Y;
        Iterator it = this.f49553Z;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f49554h0 = (Collection) entry.getValue();
                return ((C6363g) this.f49555i0).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f49554h0 = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f49552Y;
        Object obj = this.f49555i0;
        Iterator it = this.f49553Z;
        switch (i10) {
            case 0:
                if (((Collection) this.f49554h0) != null) {
                    it.remove();
                    ((C6363g) obj).f49561i0.f49546j0 -= ((Collection) this.f49554h0).size();
                    ((Collection) this.f49554h0).clear();
                    this.f49554h0 = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            case 1:
                Object obj2 = this.f49554h0;
                if (((Map.Entry) obj2) != null) {
                    Collection collection = (Collection) ((Map.Entry) obj2).getValue();
                    it.remove();
                    ((C6365i) obj).f49569h0.f49546j0 -= collection.size();
                    collection.clear();
                    this.f49554h0 = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            default:
                it.remove();
                AbstractC6371o abstractC6371o = (AbstractC6371o) obj;
                AbstractC6359c abstractC6359c = abstractC6371o.f49590j0;
                abstractC6359c.f49546j0--;
                abstractC6371o.s();
                return;
        }
    }

    public C6362f(AbstractC6371o abstractC6371o, ListIterator listIterator) {
        this.f49555i0 = abstractC6371o;
        this.f49554h0 = abstractC6371o.f49587Z;
        this.f49553Z = listIterator;
    }

    public C6362f(C6365i c6365i, Iterator it) {
        this.f49555i0 = c6365i;
        this.f49553Z = it;
    }

    public C6362f(C6363g c6363g) {
        this.f49555i0 = c6363g;
        this.f49553Z = c6363g.f49560h0.entrySet().iterator();
    }
}
