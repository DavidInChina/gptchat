package C3;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes2.dex */
public final class d extends RuntimeException {

    /* renamed from: Y  reason: collision with root package name */
    public final int f2648Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Throwable f2649Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, Throwable th2) {
        super(th2);
        AbstractC2469q0.q("callbackName", i10);
        this.f2648Y = i10;
        this.f2649Z = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2649Z;
    }
}
