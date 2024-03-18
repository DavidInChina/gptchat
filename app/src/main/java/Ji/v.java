package ji;

import id.AbstractC3557B;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class v implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4137l f36751Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Inflater f36752Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f36753h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f36754i0;

    public v(C4116E c4116e, Inflater inflater) {
        this.f36751Y = c4116e;
        this.f36752Z = inflater;
    }

    public final long a(C4135j c4135j, long j6) {
        Inflater inflater = this.f36752Z;
        AbstractC3557B.c0("sink", c4135j);
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (!this.f36754i0) {
                if (i10 == 0) {
                    return 0L;
                }
                try {
                    C4117F d02 = c4135j.d0(1);
                    int min = (int) Math.min(j6, 8192 - d02.f36676c);
                    boolean needsInput = inflater.needsInput();
                    AbstractC4137l abstractC4137l = this.f36751Y;
                    if (needsInput && !abstractC4137l.H()) {
                        C4117F c4117f = abstractC4137l.d().f36720Y;
                        AbstractC3557B.Z(c4117f);
                        int i11 = c4117f.f36676c;
                        int i12 = c4117f.f36675b;
                        int i13 = i11 - i12;
                        this.f36753h0 = i13;
                        inflater.setInput(c4117f.f36674a, i12, i13);
                    }
                    int inflate = inflater.inflate(d02.f36674a, d02.f36676c, min);
                    int i14 = this.f36753h0;
                    if (i14 != 0) {
                        int remaining = i14 - inflater.getRemaining();
                        this.f36753h0 -= remaining;
                        abstractC4137l.skip(remaining);
                    }
                    if (inflate > 0) {
                        d02.f36676c += inflate;
                        long j10 = inflate;
                        c4135j.f36721Z += j10;
                        return j10;
                    }
                    if (d02.f36675b == d02.f36676c) {
                        c4135j.f36720Y = d02.a();
                        AbstractC4118G.a(d02);
                    }
                    return 0L;
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36754i0) {
            return;
        }
        this.f36752Z.end();
        this.f36754i0 = true;
        this.f36751Y.close();
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f36751Y.f();
    }

    @Override // ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        do {
            long a5 = a(c4135j, j6);
            if (a5 > 0) {
                return a5;
            }
            Inflater inflater = this.f36752Z;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f36751Y.H());
        throw new EOFException("source exhausted prematurely");
    }

    public v(AbstractC4122K abstractC4122K, Inflater inflater) {
        this(R4.b.J(abstractC4122K), inflater);
    }
}
