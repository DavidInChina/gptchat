package h0;

import Z.AbstractC1748z;
import Z.l1;
import e0.C2741d;
import e0.C2743f;
import e0.C2755r;

/* renamed from: h0.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3290c extends C2743f {

    /* renamed from: l0  reason: collision with root package name */
    public C3291d f31683l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [g0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [e0.d] */
    /* renamed from: c */
    public final C3291d f() {
        C2755r c2755r = this.f28693h0;
        C3291d c3291d = this.f31683l0;
        C2755r c2755r2 = c3291d.f28686Y;
        C3291d c3291d2 = c3291d;
        if (c2755r != c2755r2) {
            this.f28692Z = new Object();
            c3291d2 = new C2741d(this.f28693h0, this.f28696k0);
        }
        this.f31683l0 = c3291d2;
        return c3291d2;
    }

    @Override // e0.C2743f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AbstractC1748z)) {
            return false;
        }
        return super.containsKey((AbstractC1748z) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof l1)) {
            return false;
        }
        return super.containsValue((l1) obj);
    }

    @Override // e0.C2743f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof AbstractC1748z)) {
            return null;
        }
        return (l1) super.get((AbstractC1748z) obj);
    }

    @Override // e0.C2743f, java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AbstractC1748z)) {
            return obj2;
        }
        l1 l1Var = (l1) obj2;
        return (l1) get((AbstractC1748z) obj);
    }

    @Override // e0.C2743f, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof AbstractC1748z)) {
            return null;
        }
        return (l1) super.remove((AbstractC1748z) obj);
    }
}
