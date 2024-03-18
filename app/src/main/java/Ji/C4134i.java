package ji;

import id.AbstractC3557B;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ji.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4134i extends InputStream {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f36718Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4137l f36719Z;

    public /* synthetic */ C4134i(AbstractC4137l abstractC4137l, int i10) {
        this.f36718Y = i10;
        this.f36719Z = abstractC4137l;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i10 = this.f36718Y;
        AbstractC4137l abstractC4137l = this.f36719Z;
        switch (i10) {
            case 0:
                return (int) Math.min(((C4135j) abstractC4137l).f36721Z, Integer.MAX_VALUE);
            default:
                C4116E c4116e = (C4116E) abstractC4137l;
                if (!c4116e.f36673h0) {
                    return (int) Math.min(c4116e.f36672Z.f36721Z, Integer.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f36718Y) {
            case 0:
                return;
            default:
                ((C4116E) this.f36719Z).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f36718Y;
        AbstractC4137l abstractC4137l = this.f36719Z;
        switch (i10) {
            case 0:
                C4135j c4135j = (C4135j) abstractC4137l;
                if (c4135j.f36721Z <= 0) {
                    return -1;
                }
                return c4135j.readByte() & 255;
            default:
                C4116E c4116e = (C4116E) abstractC4137l;
                if (!c4116e.f36673h0) {
                    C4135j c4135j2 = c4116e.f36672Z;
                    if (c4135j2.f36721Z != 0 || c4116e.f36671Y.g0(c4135j2, 8192L) != -1) {
                        return c4135j2.readByte() & 255;
                    }
                    return -1;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        int i10 = this.f36718Y;
        AbstractC4137l abstractC4137l = this.f36719Z;
        switch (i10) {
            case 0:
                return ((C4135j) abstractC4137l) + ".inputStream()";
            default:
                return ((C4116E) abstractC4137l) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f36718Y;
        AbstractC4137l abstractC4137l = this.f36719Z;
        switch (i12) {
            case 0:
                AbstractC3557B.c0("sink", bArr);
                return ((C4135j) abstractC4137l).read(bArr, i10, i11);
            default:
                AbstractC3557B.c0("data", bArr);
                C4116E c4116e = (C4116E) abstractC4137l;
                if (!c4116e.f36673h0) {
                    AbstractC4127b.b(bArr.length, i10, i11);
                    C4135j c4135j = c4116e.f36672Z;
                    if (c4135j.f36721Z != 0 || c4116e.f36671Y.g0(c4135j, 8192L) != -1) {
                        return c4135j.read(bArr, i10, i11);
                    }
                    return -1;
                }
                throw new IOException("closed");
        }
    }
}
