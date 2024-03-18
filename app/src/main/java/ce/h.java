package ce;

/* loaded from: classes.dex */
public final class h implements AbstractC2400f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f26602c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile AbstractC2400f f26603a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f26604b;

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f26604b;
        if (obj == f26602c) {
            AbstractC2400f abstractC2400f = this.f26603a;
            if (abstractC2400f == null) {
                return this.f26604b;
            }
            Object obj2 = abstractC2400f.get();
            this.f26604b = obj2;
            this.f26603a = null;
            return obj2;
        }
        return obj;
    }
}
