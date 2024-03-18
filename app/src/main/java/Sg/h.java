package Sg;

import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class h extends RuntimeException {

    /* renamed from: Y  reason: collision with root package name */
    public final transient AbstractC4831k f16654Y;

    public h(AbstractC4831k abstractC4831k) {
        this.f16654Y = abstractC4831k;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f16654Y.toString();
    }
}
