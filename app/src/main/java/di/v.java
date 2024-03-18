package di;

import id.AbstractC3557B;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ji.AbstractC4122K;
import ji.AbstractC4137l;
import ji.C4124M;
import ji.C4135j;
import ji.C4138m;

/* loaded from: classes2.dex */
public final class v implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4137l f28657Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f28658Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f28659h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f28660i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f28661j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f28662k0;

    public v(AbstractC4137l abstractC4137l) {
        this.f28657Y = abstractC4137l;
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f28657Y.f();
    }

    @Override // ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        int i10;
        int readInt;
        AbstractC3557B.c0("sink", c4135j);
        do {
            int i11 = this.f28661j0;
            AbstractC4137l abstractC4137l = this.f28657Y;
            if (i11 == 0) {
                abstractC4137l.skip(this.f28662k0);
                this.f28662k0 = 0;
                if ((this.f28659h0 & 4) != 0) {
                    return -1L;
                }
                i10 = this.f28660i0;
                int t10 = Xh.b.t(abstractC4137l);
                this.f28661j0 = t10;
                this.f28658Z = t10;
                int readByte = abstractC4137l.readByte() & 255;
                this.f28659h0 = abstractC4137l.readByte() & 255;
                Logger logger = w.f28663j0;
                if (logger.isLoggable(Level.FINE)) {
                    C4138m c4138m = g.f28579a;
                    logger.fine(g.a(this.f28660i0, this.f28658Z, readByte, this.f28659h0, true));
                }
                readInt = abstractC4137l.readInt() & Integer.MAX_VALUE;
                this.f28660i0 = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long g02 = abstractC4137l.g0(c4135j, Math.min(j6, i11));
                if (g02 == -1) {
                    return -1L;
                }
                this.f28661j0 -= (int) g02;
                return g02;
            }
        } while (readInt == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
