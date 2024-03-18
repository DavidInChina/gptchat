package io.sentry.instrumentation.file;

import U3.n;
import V1.C1464e;
import io.sentry.L0;
import io.sentry.S;
import io.sentry.r1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class d extends FileInputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final FileInputStream f34382Y;

    /* renamed from: Z  reason: collision with root package name */
    public final b f34383Z;

    public d(File file) {
        this(a(file, null));
    }

    public static n a(File file, FileInputStream fileInputStream) {
        S s10;
        S s11;
        if (io.sentry.util.d.f34775a) {
            s10 = L0.c().v();
        } else {
            s10 = L0.c().q();
        }
        if (s10 != null) {
            s11 = s10.p("file.read");
        } else {
            s11 = null;
        }
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new n(file, s11, fileInputStream, L0.c().s());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34383Z.a(this.f34382Y);
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read() {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f34383Z.c(new C1464e(this, 24, atomicInteger));
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final long skip(long j6) {
        return ((Long) this.f34383Z.c(new z2.g(this, j6, 3))).longValue();
    }

    public d(n nVar, FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f34383Z = new b((S) nVar.f17427Z, (File) nVar.f17426Y, (r1) nVar.f17429i0);
        this.f34382Y = (FileInputStream) nVar.f17428h0;
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return ((Integer) this.f34383Z.c(new C1464e(this, 23, bArr))).intValue();
    }

    public d(n nVar) {
        try {
            super(((FileInputStream) nVar.f17428h0).getFD());
            this.f34383Z = new b((S) nVar.f17427Z, (File) nVar.f17426Y, (r1) nVar.f17429i0);
            this.f34382Y = (FileInputStream) nVar.f17428h0;
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return ((Integer) this.f34383Z.c(new c(this, bArr, i10, i11, 0))).intValue();
    }
}
