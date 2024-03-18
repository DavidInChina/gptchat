package android.javax.sip;

/* loaded from: classes.dex */
public final class g extends Exception {

    /* renamed from: Y  reason: collision with root package name */
    public Throwable f24332Y = null;

    public g(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f24332Y;
    }
}
