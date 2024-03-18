package he;

import id.AbstractC3557B;
import java.io.Serializable;

/* renamed from: he.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3416a extends IllegalStateException {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32261Y = 2;

    /* renamed from: Z  reason: collision with root package name */
    public final Serializable f32262Z;

    public /* synthetic */ C3416a() {
        this((Throwable) null);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        switch (this.f32261Y) {
            case 2:
                return (Throwable) this.f32262Z;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f32261Y) {
            case 0:
                return (String) this.f32262Z;
            default:
                return super.getMessage();
        }
    }

    public C3416a(C3418c c3418c) {
        AbstractC3557B.c0("call", c3418c);
        this.f32262Z = "Response already received: " + c3418c;
    }

    public C3416a(String str) {
        super(R.a.r("Cannot resolve type description for ", str));
        this.f32262Z = str;
    }

    public C3416a(Throwable th2) {
        super("Client already closed");
        this.f32262Z = th2;
    }
}
