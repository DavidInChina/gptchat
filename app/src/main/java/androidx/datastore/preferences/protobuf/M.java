package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class M implements U {

    /* renamed from: a  reason: collision with root package name */
    public U[] f24996a;

    @Override // androidx.datastore.preferences.protobuf.U
    public final T a(Class cls) {
        U[] uArr;
        for (U u10 : this.f24996a) {
            if (u10.b(cls)) {
                return u10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean b(Class cls) {
        for (U u10 : this.f24996a) {
            if (u10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
