package e0;

import java.util.NoSuchElementException;
import xf.AbstractC6441d;

/* renamed from: e0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2740c extends C2739b implements AbstractC6441d {

    /* renamed from: h0  reason: collision with root package name */
    public final C2746i f28683h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f28684i0;

    public C2740c(C2746i c2746i, Object obj, Object obj2) {
        super(obj, obj2);
        this.f28683h0 = c2746i;
        this.f28684i0 = obj2;
    }

    @Override // e0.C2739b, java.util.Map.Entry
    public final Object getValue() {
        return this.f28684i0;
    }

    @Override // e0.C2739b, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10;
        Object obj2 = this.f28684i0;
        this.f28684i0 = obj;
        C2744g c2744g = this.f28683h0.f28702Y;
        C2743f c2743f = c2744g.f28697i0;
        Object obj3 = this.f28681Y;
        if (c2743f.containsKey(obj3)) {
            boolean z10 = c2744g.f28690h0;
            if (z10) {
                if (z10) {
                    AbstractC2756s abstractC2756s = c2744g.f28688Y[c2744g.f28689Z];
                    Object obj4 = abstractC2756s.f28715Y[abstractC2756s.f28717h0];
                    c2743f.put(obj3, obj);
                    if (obj4 != null) {
                        i10 = obj4.hashCode();
                    } else {
                        i10 = 0;
                    }
                    c2744g.c(i10, c2743f.f28693h0, obj4, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                c2743f.put(obj3, obj);
            }
            c2744g.f28700l0 = c2743f.f28695j0;
        }
        return obj2;
    }
}
