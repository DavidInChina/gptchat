package u8;

/* renamed from: u8.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5855e implements AbstractC5857g {

    /* renamed from: h0  reason: collision with root package name */
    public static final Object f46488h0 = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public volatile AbstractC5857g f46489Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile Object f46490Z;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u8.g, u8.e] */
    public static AbstractC5857g b(AbstractC5856f abstractC5856f) {
        if (abstractC5856f instanceof C5855e) {
            return abstractC5856f;
        }
        ?? obj = new Object();
        obj.f46490Z = f46488h0;
        obj.f46489Y = abstractC5856f;
        return obj;
    }

    @Override // u8.AbstractC5857g
    public final Object a() {
        Object obj = this.f46490Z;
        Object obj2 = f46488h0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f46490Z;
                    if (obj == obj2) {
                        obj = this.f46489Y.a();
                        Object obj3 = this.f46490Z;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f46490Z = obj;
                        this.f46489Y = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
