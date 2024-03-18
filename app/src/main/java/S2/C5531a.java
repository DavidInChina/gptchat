package s2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: s2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5531a extends OutputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final FileOutputStream f45144Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f45145Z = false;

    public C5531a(File file) {
        this.f45144Y = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.f45144Y;
        if (this.f45145Z) {
            return;
        }
        this.f45145Z = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e10) {
            p.h("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f45144Y.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f45144Y.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f45144Y.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f45144Y.write(bArr, i10, i11);
    }
}
