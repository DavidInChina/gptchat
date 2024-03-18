package e0;

import c0.AbstractC2273c;
import java.util.Iterator;
import kf.AbstractC4286k;

/* renamed from: e0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2752o extends AbstractC4286k implements AbstractC2273c {

    /* renamed from: Y  reason: collision with root package name */
    public final C2741d f28706Y;

    public C2752o(C2741d c2741d) {
        this.f28706Y = c2741d;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28706Y.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2755r c2755r = this.f28706Y.f28686Y;
        AbstractC2756s[] abstractC2756sArr = new AbstractC2756s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC2756sArr[i10] = new AbstractC2756s();
        }
        return new AbstractC2742e(c2755r, abstractC2756sArr);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        C2741d c2741d = this.f28706Y;
        c2741d.getClass();
        return c2741d.f28687Z;
    }
}
