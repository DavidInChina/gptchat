package v2;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5969h f47079Y;

    /* renamed from: Z  reason: collision with root package name */
    public final l f47080Z;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f47082i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f47083j0 = false;

    /* renamed from: h0  reason: collision with root package name */
    public final byte[] f47081h0 = new byte[1];

    public j(D d10, l lVar) {
        this.f47079Y = d10;
        this.f47080Z = lVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f47083j0) {
            this.f47079Y.close();
            this.f47083j0 = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f47081h0;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        Gi.e.n(!this.f47083j0);
        boolean z10 = this.f47082i0;
        AbstractC5969h abstractC5969h = this.f47079Y;
        if (!z10) {
            abstractC5969h.a(this.f47080Z);
            this.f47082i0 = true;
        }
        int read = abstractC5969h.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
