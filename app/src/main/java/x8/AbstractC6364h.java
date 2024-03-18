package x8;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x8.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6364h implements Iterator {

    /* renamed from: Y  reason: collision with root package name */
    public final Iterator f49563Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f49564Z = null;

    /* renamed from: h0  reason: collision with root package name */
    public Collection f49565h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public Iterator f49566i0 = V.f49537Y;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49567j0;

    public AbstractC6364h(AbstractC6359c abstractC6359c) {
        this.f49567j0 = abstractC6359c;
        this.f49563Y = abstractC6359c.f49545i0.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f49563Y.hasNext() && !this.f49566i0.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f49566i0.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f49563Y.next();
            this.f49564Z = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f49565h0 = collection;
            this.f49566i0 = collection.iterator();
        }
        Object obj = this.f49564Z;
        Object next = this.f49566i0.next();
        switch (((C6360d) this).f49548k0) {
            case 0:
                return next;
            default:
                return new J(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f49566i0.remove();
        Collection collection = this.f49565h0;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f49563Y.remove();
        }
        AbstractC6359c abstractC6359c = this.f49567j0;
        abstractC6359c.f49546j0--;
    }
}
