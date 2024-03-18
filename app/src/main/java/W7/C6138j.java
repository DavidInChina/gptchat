package w7;

/* renamed from: w7.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6138j {

    /* renamed from: b  reason: collision with root package name */
    public static C6138j f48173b;

    /* renamed from: c  reason: collision with root package name */
    public static final C6139k f48174c = new C6139k(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public C6139k f48175a;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, w7.j] */
    public static synchronized C6138j a() {
        C6138j c6138j;
        synchronized (C6138j.class) {
            try {
                if (f48173b == null) {
                    f48173b = new Object();
                }
                c6138j = f48173b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6138j;
    }
}
