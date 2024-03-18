package x8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class t0 extends w0 {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Set f49614Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Set f49615h0;

    public t0(S s10, S s11) {
        this.f49614Z = s10;
        this.f49615h0 = s11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f49614Z.contains(obj) && this.f49615h0.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.f49614Z.containsAll(collection) && this.f49615h0.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f49615h0, this.f49614Z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new T(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f49614Z) {
            if (this.f49615h0.contains(obj)) {
                i10++;
            }
        }
        return i10;
    }
}
