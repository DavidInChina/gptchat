package ld;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class h extends Throwable {

    /* renamed from: Y  reason: collision with root package name */
    public final String f38288Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Throwable f38289Z = null;

    public h(String str) {
        AbstractC3557B.c0("message", str);
        this.f38288Y = str;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f38289Z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f38288Y;
    }
}
