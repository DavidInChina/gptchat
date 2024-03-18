package w;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: w.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6059f extends C6049A implements Map, j$.util.Map {

    /* renamed from: i0  reason: collision with root package name */
    public C6054a f47581i0;

    /* renamed from: j0  reason: collision with root package name */
    public C6056c f47582j0;

    /* renamed from: k0  reason: collision with root package name */
    public C6058e f47583k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6059f(C6059f c6059f) {
        super(0);
        if (c6059f != null) {
            int i10 = c6059f.f47560h0;
            b(this.f47560h0 + i10);
            if (this.f47560h0 == 0) {
                if (i10 > 0) {
                    kf.q.V2(0, 0, i10, c6059f.f47558Y, this.f47558Y);
                    kf.q.W2(0, 0, i10 << 1, c6059f.f47559Z, this.f47559Z);
                    this.f47560h0 = i10;
                    return;
                }
                return;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                put(c6059f.g(i11), c6059f.j(i11));
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // w.C6049A, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // w.C6049A, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C6054a c6054a = this.f47581i0;
        if (c6054a == null) {
            C6054a c6054a2 = new C6054a(this, 0);
            this.f47581i0 = c6054a2;
            return c6054a2;
        }
        return c6054a;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // w.C6049A, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean k(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C6056c c6056c = this.f47582j0;
        if (c6056c == null) {
            C6056c c6056c2 = new C6056c(this);
            this.f47582j0 = c6056c2;
            return c6056c2;
        }
        return c6056c;
    }

    public final boolean l(Collection collection) {
        int i10 = this.f47560h0;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i10 != this.f47560h0) {
            return true;
        }
        return false;
    }

    public final boolean m(Collection collection) {
        int i10 = this.f47560h0;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(g(i11))) {
                h(i11);
            }
        }
        if (i10 != this.f47560h0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        b(map.size() + this.f47560h0);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // w.C6049A, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        C6058e c6058e = this.f47583k0;
        if (c6058e == null) {
            C6058e c6058e2 = new C6058e(this);
            this.f47583k0 = c6058e2;
            return c6058e2;
        }
        return c6058e;
    }
}
