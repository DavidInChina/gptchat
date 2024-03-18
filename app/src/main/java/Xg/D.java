package xg;

import Mf.V;
import hg.AbstractC3428g;
import hg.C3430i;
import kg.C4291c;

/* loaded from: classes2.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC3428g f49967a;

    /* renamed from: b  reason: collision with root package name */
    public final C3430i f49968b;

    /* renamed from: c  reason: collision with root package name */
    public final V f49969c;

    public D(AbstractC3428g abstractC3428g, C3430i c3430i, V v10) {
        this.f49967a = abstractC3428g;
        this.f49968b = c3430i;
        this.f49969c = v10;
    }

    public abstract C4291c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
