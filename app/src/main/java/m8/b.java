package m8;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: h0  reason: collision with root package name */
    public static final Object f38967h0 = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public volatile c f38968Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile Object f38969Z;

    /* JADX WARN: Type inference failed for: r0v1, types: [m8.c, java.lang.Object, m8.b] */
    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        ?? obj = new Object();
        obj.f38969Z = f38967h0;
        obj.f38968Y = cVar;
        return obj;
    }

    @Override // m8.c
    public final Object g() {
        Object obj = this.f38969Z;
        Object obj2 = f38967h0;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f38969Z;
                    if (obj == obj2) {
                        obj = this.f38968Y.g();
                        Object obj3 = this.f38969Z;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f38969Z = obj;
                        this.f38968Y = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
