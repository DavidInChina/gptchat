package ce;

/* renamed from: ce.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2398d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f26598a;

    public C2398d(Object obj) {
        this.f26598a = obj;
    }

    public static C2398d a(Object obj) {
        if (obj != null) {
            return new C2398d(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p000if.a
    public final Object get() {
        return this.f26598a;
    }
}
