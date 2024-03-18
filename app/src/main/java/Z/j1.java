package Z;

import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class j1 implements Iterable, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final N0 f22651Y;

    public j1(N0 n02, S s10) {
        this.f22651Y = n02;
        s10.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i1(this.f22651Y, null);
    }
}
