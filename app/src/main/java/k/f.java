package K;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9317a;

    /* JADX WARN: Type inference failed for: r1v2, types: [K.e, K.a] */
    static {
        d dVar = new d(50);
        f9317a = new a(dVar, dVar, dVar, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [K.e, K.a] */
    public static final e a(float f6) {
        c cVar = new c(f6);
        return new a(cVar, cVar, cVar, cVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [K.e, K.a] */
    public static e b(float f6, float f10) {
        return new a(new c(f6), new c(f10), new c(0), new c(0));
    }
}
