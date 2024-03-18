package j0;

import java.util.Set;
import xf.AbstractC6443f;

/* loaded from: classes.dex */
public abstract class r implements Set, AbstractC6443f {

    /* renamed from: Y  reason: collision with root package name */
    public final x f35929Y;

    public r(x xVar) {
        this.f35929Y = xVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f35929Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f35929Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f35929Y.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
