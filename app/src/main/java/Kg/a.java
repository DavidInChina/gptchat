package Kg;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f9811a;

    public a(k kVar) {
        this.f9811a = new AtomicReference(kVar);
    }

    @Override // Kg.k
    public final Iterator iterator() {
        k kVar = (k) this.f9811a.getAndSet(null);
        if (kVar != null) {
            return kVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
