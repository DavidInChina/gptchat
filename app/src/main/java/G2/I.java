package g2;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class I extends CancellationException {

    /* renamed from: Y  reason: collision with root package name */
    public final String f31042Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f31043Z;

    public I(String str, int i10) {
        super(str);
        this.f31042Y = str;
        this.f31043Z = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f31042Y;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeoutCancellationException(");
        sb2.append(this.f31042Y);
        sb2.append(", ");
        return AbstractC2469q0.j(sb2, this.f31043Z, ')');
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
