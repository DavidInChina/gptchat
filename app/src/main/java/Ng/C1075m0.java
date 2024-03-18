package Ng;

import id.AbstractC3557B;
import java.util.concurrent.CancellationException;

/* renamed from: Ng.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075m0 extends CancellationException implements AbstractC1089x {

    /* renamed from: Y  reason: collision with root package name */
    public final transient AbstractC1073l0 f12959Y;

    public C1075m0(String str, Throwable th2, AbstractC1073l0 abstractC1073l0) {
        super(str);
        this.f12959Y = abstractC1073l0;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // Ng.AbstractC1089x
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1075m0) {
                C1075m0 c1075m0 = (C1075m0) obj;
                if (!AbstractC3557B.K(c1075m0.getMessage(), getMessage()) || !AbstractC3557B.K(c1075m0.f12959Y, this.f12959Y) || !AbstractC3557B.K(c1075m0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i10;
        String message = getMessage();
        AbstractC3557B.Z(message);
        int hashCode = (this.f12959Y.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f12959Y;
    }
}
