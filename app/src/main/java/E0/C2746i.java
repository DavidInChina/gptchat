package e0;

import java.util.Iterator;
import java.util.Map;
import xf.AbstractC6438a;

/* renamed from: e0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2746i implements Iterator, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final C2744g f28702Y;

    public C2746i(C2743f c2743f) {
        AbstractC2756s[] abstractC2756sArr = new AbstractC2756s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC2756sArr[i10] = new C2759v(this);
        }
        this.f28702Y = new C2744g(c2743f, abstractC2756sArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28702Y.f28690h0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f28702Y.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f28702Y.remove();
    }
}
