package I8;

/* loaded from: classes.dex */
public final class m extends L8.t {

    /* renamed from: a  reason: collision with root package name */
    public E f8105a;

    @Override // I8.E
    public final Object b(P8.b bVar) {
        E e10 = this.f8105a;
        if (e10 != null) {
            return e10.b(bVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        E e10 = this.f8105a;
        if (e10 != null) {
            e10.c(cVar, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // L8.t
    public final E d() {
        E e10 = this.f8105a;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
