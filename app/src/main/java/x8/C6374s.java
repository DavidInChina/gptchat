package x8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x8.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6374s extends AbstractCollection {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49608Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6375t f49609Z;

    public C6374s(AbstractC6375t abstractC6375t, int i10) {
        this.f49608Y = i10;
        if (i10 != 1) {
            this.f49609Z = abstractC6375t;
        } else {
            this.f49609Z = abstractC6375t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f49608Y) {
            case 0:
                ((AbstractC6359c) this.f49609Z).b();
                return;
            default:
                f();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f49608Y) {
            case 0:
                Iterator it = ((C6381z) this.f49609Z.a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return r(obj);
        }
    }

    public final void f() {
        ((AbstractC6359c) this.f49609Z).b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f49608Y;
        AbstractC6375t abstractC6375t = this.f49609Z;
        switch (i10) {
            case 0:
                AbstractC6359c abstractC6359c = (AbstractC6359c) abstractC6375t;
                abstractC6359c.getClass();
                return new C6360d(abstractC6359c, 0);
            default:
                AbstractC6359c abstractC6359c2 = (AbstractC6359c) abstractC6375t;
                abstractC6359c2.getClass();
                return new C6360d(abstractC6359c2, 1);
        }
    }

    public final boolean r(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f49609Z.a().get(key);
        if (collection == null || !collection.contains(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f49608Y) {
            case 1:
                return s(obj);
            default:
                return super.remove(obj);
        }
    }

    public final boolean s(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f49609Z.a().get(key);
        if (collection == null || !collection.remove(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f49608Y) {
            case 0:
                return ((AbstractC6359c) this.f49609Z).f49546j0;
            default:
                return y();
        }
    }

    public final int y() {
        return ((AbstractC6359c) this.f49609Z).f49546j0;
    }
}
