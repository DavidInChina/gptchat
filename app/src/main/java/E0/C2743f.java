package e0;

import c0.AbstractC2275e;
import g0.C3135b;
import id.AbstractC3557B;
import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kf.AbstractC4284i;

/* renamed from: e0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2743f extends AbstractC4284i implements AbstractC2275e, Map {

    /* renamed from: Y  reason: collision with root package name */
    public C2741d f28691Y;

    /* renamed from: Z  reason: collision with root package name */
    public C3135b f28692Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public C2755r f28693h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f28694i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f28695j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f28696k0;

    /* JADX WARN: Type inference failed for: r0v0, types: [g0.b, java.lang.Object] */
    public C2743f(C2741d c2741d) {
        this.f28691Y = c2741d;
        this.f28693h0 = c2741d.f28686Y;
        c2741d.getClass();
        this.f28696k0 = c2741d.f28687Z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g0.b, java.lang.Object] */
    /* renamed from: a */
    public C2741d f() {
        C2755r c2755r = this.f28693h0;
        C2741d c2741d = this.f28691Y;
        if (c2755r != c2741d.f28686Y) {
            this.f28692Z = new Object();
            c2741d = new C2741d(this.f28693h0, this.f28696k0);
        }
        this.f28691Y = c2741d;
        return c2741d;
    }

    public final void b(int i10) {
        this.f28696k0 = i10;
        this.f28695j0++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f28693h0 = C2755r.f28710e;
        b(0);
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

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        int i10;
        C2755r c2755r = this.f28693h0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return c2755r.d(i10, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int i10;
        C2755r c2755r = this.f28693h0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return c2755r.g(i10, obj, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        this.f28694i0 = null;
        C2755r c2755r = this.f28693h0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        this.f28693h0 = c2755r.l(i10, obj, obj2, 0, this);
        return this.f28694i0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [g0.a, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        C2741d c2741d;
        C2743f c2743f;
        C2741d c2741d2 = null;
        if (map instanceof C2741d) {
            c2741d = (C2741d) map;
        } else {
            c2741d = null;
        }
        if (c2741d == null) {
            if (map instanceof C2743f) {
                c2743f = (C2743f) map;
            } else {
                c2743f = null;
            }
            if (c2743f != null) {
                c2741d2 = c2743f.f();
            }
        } else {
            c2741d2 = c2741d;
        }
        if (c2741d2 != null) {
            ?? obj = new Object();
            obj.f31014a = 0;
            int i10 = this.f28696k0;
            C2755r c2755r = this.f28693h0;
            C2755r c2755r2 = c2741d2.f28686Y;
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", c2755r2);
            this.f28693h0 = c2755r.m(c2755r2, 0, obj, this);
            int i11 = (c2741d2.f28687Z + i10) - obj.f31014a;
            if (i10 != i11) {
                b(i11);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f28694i0 = null;
        C2755r n10 = this.f28693h0.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n10 == null) {
            n10 = C2755r.f28710e;
        }
        this.f28693h0 = n10;
        return this.f28694i0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f28696k0;
        C2755r o10 = this.f28693h0.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o10 == null) {
            o10 = C2755r.f28710e;
        }
        this.f28693h0 = o10;
        return i10 != this.f28696k0;
    }
}
