package androidx.glance.appwidget.protobuf;

/* loaded from: classes2.dex */
public final class K implements Q {

    /* renamed from: a  reason: collision with root package name */
    public Q[] f25163a;

    @Override // androidx.glance.appwidget.protobuf.Q
    public final P a(Class cls) {
        Q[] qArr;
        for (Q q10 : this.f25163a) {
            if (q10.b(cls)) {
                return q10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.Q
    public final boolean b(Class cls) {
        for (Q q10 : this.f25163a) {
            if (q10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
