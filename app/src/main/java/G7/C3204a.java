package g7;

/* renamed from: g7.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3204a implements p000if.a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f31301c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile p000if.a f31302a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f31303b;

    /* JADX WARN: Type inference failed for: r0v1, types: [if.a, java.lang.Object, g7.a] */
    public static p000if.a a(AbstractC3205b abstractC3205b) {
        if (abstractC3205b instanceof C3204a) {
            return abstractC3205b;
        }
        ?? obj = new Object();
        obj.f31303b = f31301c;
        obj.f31302a = abstractC3205b;
        return obj;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f31303b;
        Object obj2 = f31301c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f31303b;
                    if (obj == obj2) {
                        obj = this.f31302a.get();
                        Object obj3 = this.f31303b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f31303b = obj;
                        this.f31302a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
