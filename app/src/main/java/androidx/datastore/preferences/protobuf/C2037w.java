package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2037w implements U {

    /* renamed from: a  reason: collision with root package name */
    public static final C2037w f25124a = new Object();

    @Override // androidx.datastore.preferences.protobuf.U
    public final T a(Class cls) {
        if (AbstractC2040z.class.isAssignableFrom(cls)) {
            try {
                return (T) AbstractC2040z.e(cls.asSubclass(AbstractC2040z.class)).d(3);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean b(Class cls) {
        return AbstractC2040z.class.isAssignableFrom(cls);
    }
}
