package io.sentry.instrumentation.file;

import V.B;
import V1.C1464e;
import i8.C3493k;
import io.sentry.L0;
import io.sentry.S;
import io.sentry.r1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class e extends FileOutputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final FileOutputStream f34384Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f34385Z;

    public e(B b10) {
        try {
            super(((FileOutputStream) b10.f17897d).getFD());
            this.f34385Z = new b((S) b10.f17896c, (File) b10.f17895b, (r1) b10.f17898e);
            this.f34384Y = (FileOutputStream) b10.f17897d;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    public static B a(File file, boolean z10, FileOutputStream fileOutputStream) {
        S s10;
        S s11;
        if (io.sentry.util.d.f34775a) {
            s10 = L0.c().v();
        } else {
            s10 = L0.c().q();
        }
        if (s10 != null) {
            s11 = s10.p("file.write");
        } else {
            s11 = null;
        }
        S s12 = s11;
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z10);
        }
        return new B(file, z10, s12, fileOutputStream, L0.c().s());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34385Z.a(this.f34384Y);
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(int i10) {
        this.f34385Z.c(new C3493k(i10, this));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f34385Z.c(new C1464e(this, 25, bArr));
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f34385Z.c(new c(this, bArr, i10, i11, 1));
    }
}
