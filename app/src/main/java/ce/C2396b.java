package ce;

/* renamed from: ce.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2396b implements AbstractC2400f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f26595c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile AbstractC2400f f26596a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f26597b;

    /* JADX WARN: Type inference failed for: r0v1, types: [ce.f, ce.b, java.lang.Object] */
    public static AbstractC2400f a(AbstractC2400f abstractC2400f) {
        if (abstractC2400f instanceof C2396b) {
            return abstractC2400f;
        }
        ?? obj = new Object();
        obj.f26597b = f26595c;
        obj.f26596a = abstractC2400f;
        return obj;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f26597b;
        Object obj2 = f26595c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f26597b;
                    if (obj == obj2) {
                        obj = this.f26596a.get();
                        Object obj3 = this.f26597b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f26597b = obj;
                        this.f26596a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
