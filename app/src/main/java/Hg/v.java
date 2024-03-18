package Hg;

import Bg.N;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class v extends AbstractC0728a {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f7794Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7795Z;

    public v(int i10, N n10) {
        this.f7794Y = n10;
        this.f7795Z = i10;
    }

    @Override // Hg.AbstractC0728a
    public final Object get(int i10) {
        if (i10 == this.f7795Z) {
            return this.f7794Y;
        }
        return null;
    }

    @Override // Hg.AbstractC0728a, java.lang.Iterable
    public final Iterator iterator() {
        return new u(0, this);
    }

    @Override // Hg.AbstractC0728a
    public final int r() {
        return 1;
    }

    @Override // Hg.AbstractC0728a
    public final void s(int i10, Object obj) {
        throw new IllegalStateException();
    }
}
