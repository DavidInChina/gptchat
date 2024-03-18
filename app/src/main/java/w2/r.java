package w2;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class r extends BufferedOutputStream {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f47718Y;

    public final void a(OutputStream outputStream) {
        Gi.e.n(this.f47718Y);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f47718Y = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th2;
        this.f47718Y = true;
        try {
            flush();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        if (th2 == null) {
            return;
        }
        int i10 = AbstractC5530A.f45131a;
        throw th2;
    }
}
