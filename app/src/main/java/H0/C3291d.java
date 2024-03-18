package h0;

import Z.AbstractC1732q0;
import Z.AbstractC1748z;
import Z.l1;
import c0.AbstractC2275e;
import e0.C2741d;
import e0.C2743f;
import e0.C2755r;
import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: h0.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3291d extends C2741d implements AbstractC1732q0, Map {

    /* renamed from: i0  reason: collision with root package name */
    public static final C3291d f31684i0 = new C2741d(C2755r.f28710e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [e0.f, h0.c] */
    @Override // e0.C2741d
    public final C2743f a() {
        ?? c2743f = new C2743f(this);
        c2743f.f31683l0 = this;
        return c2743f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c0.e, e0.f, h0.c] */
    @Override // e0.C2741d, c0.f
    public final AbstractC2275e builder() {
        ?? c2743f = new C2743f(this);
        c2743f.f31683l0 = this;
        return c2743f;
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

    @Override // e0.C2741d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AbstractC1748z)) {
            return false;
        }
        return super.containsKey((AbstractC1748z) obj);
    }

    @Override // kf.AbstractC4281f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return super.containsValue((l1) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // e0.C2741d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof AbstractC1748z)) {
            return null;
        }
        return (l1) super.get((AbstractC1748z) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AbstractC1748z)) {
            return obj2;
        }
        return (l1) Map.CC.$default$getOrDefault(this, (AbstractC1748z) obj, (l1) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
