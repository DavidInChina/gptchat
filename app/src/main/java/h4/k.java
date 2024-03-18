package h4;

import id.AbstractC3557B;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends InputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31889Y;

    /* renamed from: Z  reason: collision with root package name */
    public final InputStream f31890Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f31891h0;

    public k(InputStream inputStream, int i10) {
        this.f31889Y = i10;
        if (i10 != 1) {
            this.f31890Z = inputStream;
            this.f31891h0 = 1073741824;
            return;
        }
        AbstractC3557B.c0("delegate", inputStream);
        this.f31890Z = inputStream;
        this.f31891h0 = 1073741824;
    }

    public final void a(int i10) {
        switch (this.f31889Y) {
            case 0:
                if (i10 == -1) {
                    this.f31891h0 = 0;
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    this.f31891h0 = 0;
                    return;
                }
                return;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f31889Y) {
            case 0:
                return this.f31891h0;
            default:
                return this.f31891h0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i10 = this.f31889Y;
        InputStream inputStream = this.f31890Z;
        switch (i10) {
            case 0:
                inputStream.close();
                return;
            default:
                inputStream.close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f31889Y;
        InputStream inputStream = this.f31890Z;
        switch (i10) {
            case 0:
                int read = inputStream.read();
                a(read);
                return read;
            default:
                int read2 = inputStream.read();
                a(read2);
                return read2;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        int i10 = this.f31889Y;
        InputStream inputStream = this.f31890Z;
        switch (i10) {
            case 0:
                return inputStream.skip(j6);
            default:
                return inputStream.skip(j6);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int i10 = this.f31889Y;
        InputStream inputStream = this.f31890Z;
        switch (i10) {
            case 0:
                int read = inputStream.read(bArr);
                a(read);
                return read;
            default:
                AbstractC3557B.c0("b", bArr);
                int read2 = inputStream.read(bArr);
                a(read2);
                return read2;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f31889Y;
        InputStream inputStream = this.f31890Z;
        switch (i12) {
            case 0:
                int read = inputStream.read(bArr, i10, i11);
                a(read);
                return read;
            default:
                AbstractC3557B.c0("b", bArr);
                int read2 = inputStream.read(bArr, i10, i11);
                a(read2);
                return read2;
        }
    }
}
