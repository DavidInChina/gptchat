package le;

import id.AbstractC3557B;
import java.net.ConnectException;

/* renamed from: le.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4434a extends ConnectException {

    /* renamed from: Y  reason: collision with root package name */
    public final Throwable f38299Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4434a(String str, Throwable th2) {
        super(str);
        AbstractC3557B.c0("message", str);
        this.f38299Y = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f38299Y;
    }
}
