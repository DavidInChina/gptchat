package f0;

import c0.g;
import e0.C2741d;
import g0.C3135b;
import id.AbstractC3557B;
import java.util.Iterator;
import kf.AbstractC4286k;

/* renamed from: f0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2931b extends AbstractC4286k implements g {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2931b f29515i0;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f29516Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f29517Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C2741d f29518h0;

    static {
        C3135b c3135b = C3135b.f31015a;
        C2741d c2741d = C2741d.f28685h0;
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", c2741d);
        f29515i0 = new C2931b(c3135b, c3135b, c2741d);
    }

    public C2931b(Object obj, Object obj2, C2741d c2741d) {
        this.f29516Y = obj;
        this.f29517Z = obj2;
        this.f29518h0 = c2741d;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f29518h0.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2932c(this.f29516Y, this.f29518h0);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        C2741d c2741d = this.f29518h0;
        c2741d.getClass();
        return c2741d.f28687Z;
    }
}
