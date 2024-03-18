package androidx.glance.appwidget.protobuf;

/* renamed from: androidx.glance.appwidget.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2060u implements Q {

    /* renamed from: a  reason: collision with root package name */
    public static final C2060u f25275a = new Object();

    @Override // androidx.glance.appwidget.protobuf.Q
    public final P a(Class cls) {
        if (AbstractC2063x.class.isAssignableFrom(cls)) {
            try {
                return (P) AbstractC2063x.e(cls.asSubclass(AbstractC2063x.class)).d(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // androidx.glance.appwidget.protobuf.Q
    public final boolean b(Class cls) {
        return AbstractC2063x.class.isAssignableFrom(cls);
    }
}
