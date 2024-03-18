package Ae;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class e extends IllegalArgumentException {

    /* renamed from: Y  reason: collision with root package name */
    public final String f832Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Throwable f833Z = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(str, null);
        AbstractC3557B.c0("message", str);
        this.f832Y = str;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f833Z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f832Y;
    }
}
