package H8;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: Y  reason: collision with root package name */
    public long f7480Y;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f7480Y += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f7480Y++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f7480Y += bArr.length;
    }
}
