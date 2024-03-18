package e0;

import c0.AbstractC2273c;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import kf.AbstractC4286k;

/* renamed from: e0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2750m extends AbstractC4286k implements AbstractC2273c {

    /* renamed from: Y  reason: collision with root package name */
    public final C2741d f28705Y;

    public C2750m(C2741d c2741d) {
        this.f28705Y = c2741d;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        C2741d c2741d = this.f28705Y;
        Object obj2 = c2741d.get(key);
        if (obj2 != null) {
            return AbstractC3557B.K(obj2, entry.getValue());
        }
        if (entry.getValue() != null || !c2741d.containsKey(entry.getKey())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2755r c2755r = this.f28705Y.f28686Y;
        AbstractC2756s[] abstractC2756sArr = new AbstractC2756s[8];
        for (int i10 = 0; i10 < 8; i10++) {
            abstractC2756sArr[i10] = new AbstractC2756s();
        }
        return new AbstractC2742e(c2755r, abstractC2756sArr);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        C2741d c2741d = this.f28705Y;
        c2741d.getClass();
        return c2741d.f28687Z;
    }
}
