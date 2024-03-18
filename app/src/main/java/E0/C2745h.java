package e0;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2745h extends AbstractC2738a {

    /* renamed from: Y  reason: collision with root package name */
    public final C2743f f28701Y;

    public C2745h(C2743f c2743f) {
        this.f28701Y = c2743f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f28701Y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2746i(this.f28701Y);
    }

    @Override // kf.AbstractC4285j
    public final int r() {
        C2743f c2743f = this.f28701Y;
        c2743f.getClass();
        return c2743f.f28696k0;
    }
}
