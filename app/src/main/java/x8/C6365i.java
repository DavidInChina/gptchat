package x8;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x8.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6365i extends w0 {

    /* renamed from: Z  reason: collision with root package name */
    public final Map f49568Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49569h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6365i(AbstractC6359c abstractC6359c, Map map) {
        super(0);
        this.f49569h0 = abstractC6359c;
        map.getClass();
        this.f49568Z = map;
    }

    @Override // x8.w0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C6362f c6362f = (C6362f) iterator();
        while (c6362f.hasNext()) {
            c6362f.next();
            c6362f.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f49568Z.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f49568Z.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f49568Z.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f49568Z.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f49568Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6362f(this, this.f49568Z.entrySet().iterator());
    }

    @Override // x8.w0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f49568Z.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f49569h0.f49546j0 -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f49568Z.size();
    }
}
