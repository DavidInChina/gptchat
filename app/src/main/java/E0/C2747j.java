package e0;

import java.util.Iterator;
import kf.AbstractC4285j;

/* renamed from: e0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2747j extends AbstractC4285j {

    /* renamed from: Y  reason: collision with root package name */
    public final C2743f f28703Y;

    public C2747j(C2743f c2743f) {
        this.f28703Y = c2743f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f28703Y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f28703Y.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC2756s[] abstractC2756sArr = new AbstractC2756s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC2756sArr[i10] = new AbstractC2756s();
        }
        return new C2744g(this.f28703Y, abstractC2756sArr);
    }

    @Override // kf.AbstractC4285j
    public final int r() {
        C2743f c2743f = this.f28703Y;
        c2743f.getClass();
        return c2743f.f28696k0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2743f c2743f = this.f28703Y;
        if (c2743f.containsKey(obj)) {
            c2743f.remove(obj);
            return true;
        }
        return false;
    }
}
