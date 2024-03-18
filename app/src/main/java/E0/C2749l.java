package e0;

import java.util.Iterator;
import kf.AbstractC4282g;

/* renamed from: e0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2749l extends AbstractC4282g {

    /* renamed from: Y  reason: collision with root package name */
    public final C2743f f28704Y;

    public C2749l(C2743f c2743f) {
        this.f28704Y = c2743f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f28704Y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28704Y.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        AbstractC2756s[] abstractC2756sArr = new AbstractC2756s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC2756sArr[i10] = new AbstractC2756s();
        }
        return new C2744g(this.f28704Y, abstractC2756sArr);
    }

    @Override // kf.AbstractC4282g
    public final int r() {
        C2743f c2743f = this.f28704Y;
        c2743f.getClass();
        return c2743f.f28696k0;
    }
}
