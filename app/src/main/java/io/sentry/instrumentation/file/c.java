package io.sentry.instrumentation.file;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34377Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ byte[] f34378Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f34379h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f34380i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Closeable f34381j0;

    public /* synthetic */ c(Closeable closeable, byte[] bArr, int i10, int i11, int i12) {
        this.f34377Y = i12;
        this.f34381j0 = closeable;
        this.f34378Z = bArr;
        this.f34379h0 = i10;
        this.f34380i0 = i11;
    }

    @Override // io.sentry.instrumentation.file.a
    public final Object call() {
        int i10 = this.f34377Y;
        int i11 = this.f34380i0;
        int i12 = this.f34379h0;
        byte[] bArr = this.f34378Z;
        Closeable closeable = this.f34381j0;
        switch (i10) {
            case 0:
                return Integer.valueOf(((d) closeable).f34382Y.read(bArr, i12, i11));
            default:
                ((e) closeable).f34384Y.write(bArr, i12, i11);
                return Integer.valueOf(i11);
        }
    }
}
