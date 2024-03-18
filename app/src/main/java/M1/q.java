package M1;

import id.AbstractC3557B;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class q extends OutputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final FileOutputStream f11455Y;

    public q(io.sentry.instrumentation.file.e eVar) {
        this.f11455Y = eVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f11455Y.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        AbstractC3557B.c0("b", bArr);
        this.f11455Y.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("bytes", bArr);
        this.f11455Y.write(bArr, i10, i11);
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f11455Y.write(i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
