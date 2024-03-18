package G0;

/* renamed from: G0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0580i implements p0.i {

    /* renamed from: a  reason: collision with root package name */
    public static final C0580i f5788a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f5789b;

    @Override // p0.i
    public final boolean a() {
        Boolean bool = f5789b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written".toString());
    }

    @Override // p0.i
    public final void b(boolean z10) {
        f5789b = Boolean.valueOf(z10);
    }
}
