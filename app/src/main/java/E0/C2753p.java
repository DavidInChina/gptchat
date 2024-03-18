package e0;

import java.util.Iterator;
import kf.AbstractC4276a;

/* renamed from: e0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2753p extends AbstractC4276a {

    /* renamed from: Y  reason: collision with root package name */
    public final C2741d f28707Y;

    public C2753p(C2741d c2741d) {
        this.f28707Y = c2741d;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f28707Y.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2755r c2755r = this.f28707Y.f28686Y;
        AbstractC2756s[] abstractC2756sArr = new AbstractC2756s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC2756sArr[i10] = new AbstractC2756s();
        }
        return new AbstractC2742e(c2755r, abstractC2756sArr);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        C2741d c2741d = this.f28707Y;
        c2741d.getClass();
        return c2741d.f28687Z;
    }
}
