package K5;

import id.AbstractC3557B;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedList f9483Y = new LinkedList();

    /* renamed from: Z  reason: collision with root package name */
    public volatile h6.a f9484Z;

    public b() {
        h6.a aVar = h6.a.f31918h0;
        this.f9484Z = aVar;
    }

    @Override // K5.a
    public final h6.a B() {
        return this.f9484Z;
    }

    @Override // K5.a
    public final synchronized void C() {
        h6.a aVar = h6.a.f31916Y;
        synchronized (this) {
            if (aVar == this.f9484Z) {
                return;
            }
            h6.a aVar2 = this.f9484Z;
            this.f9484Z = aVar;
            for (h6.b bVar : this.f9483Y) {
                bVar.a(aVar2);
            }
        }
    }

    @Override // K5.a
    public final synchronized void d(h6.b bVar) {
        AbstractC3557B.c0("callback", bVar);
        this.f9483Y.add(bVar);
    }

    @Override // K5.a
    public final synchronized void f() {
        this.f9483Y.clear();
    }

    @Override // K5.a
    public final synchronized void x(h6.b bVar) {
        AbstractC3557B.c0("callback", bVar);
        this.f9483Y.remove(bVar);
    }
}
