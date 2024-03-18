package pc;

/* renamed from: pc.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5137p extends Exception implements r {

    /* renamed from: Y  reason: collision with root package name */
    public final String f43019Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Throwable f43020Z;

    public AbstractC5137p(String str, Throwable th2) {
        this.f43019Y = str;
        this.f43020Z = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43020Z;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f43019Y;
    }
}
