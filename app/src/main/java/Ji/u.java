package ji;

import id.AbstractC3557B;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class u implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public byte f36746Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4116E f36747Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Inflater f36748h0;

    /* renamed from: i0  reason: collision with root package name */
    public final v f36749i0;

    /* renamed from: j0  reason: collision with root package name */
    public final CRC32 f36750j0 = new CRC32();

    public u(AbstractC4122K abstractC4122K) {
        AbstractC3557B.c0("source", abstractC4122K);
        C4116E c4116e = new C4116E(abstractC4122K);
        this.f36747Z = c4116e;
        Inflater inflater = new Inflater(true);
        this.f36748h0 = inflater;
        this.f36749i0 = new v(c4116e, inflater);
    }

    public static void a(int i10, int i11, String str) {
        if (i11 == i10) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f36749i0.close();
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f36747Z.f36671Y.f();
    }

    @Override // ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        C4116E c4116e;
        boolean z10;
        long j10;
        AbstractC3557B.c0("sink", c4135j);
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return 0L;
            }
            byte b10 = this.f36746Y;
            CRC32 crc32 = this.f36750j0;
            C4116E c4116e2 = this.f36747Z;
            if (b10 == 0) {
                c4116e2.J0(10L);
                C4135j c4135j2 = c4116e2.f36672Z;
                byte k10 = c4135j2.k(3L);
                if (((k10 >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    h(0L, 10L, c4116e2.f36672Z);
                }
                a(8075, c4116e2.readShort(), "ID1ID2");
                c4116e2.skip(8L);
                if (((k10 >> 2) & 1) == 1) {
                    c4116e2.J0(2L);
                    if (z10) {
                        h(0L, 2L, c4116e2.f36672Z);
                    }
                    long P = c4135j2.P() & 65535;
                    c4116e2.J0(P);
                    if (z10) {
                        h(0L, P, c4116e2.f36672Z);
                        j10 = P;
                    } else {
                        j10 = P;
                    }
                    c4116e2.skip(j10);
                }
                if (((k10 >> 3) & 1) == 1) {
                    long a5 = c4116e2.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a5 != -1) {
                        if (z10) {
                            c4116e = c4116e2;
                            h(0L, a5 + 1, c4116e2.f36672Z);
                        } else {
                            c4116e = c4116e2;
                        }
                        c4116e.skip(a5 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    c4116e = c4116e2;
                }
                if (((k10 >> 4) & 1) == 1) {
                    long a10 = c4116e.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z10) {
                            h(0L, a10 + 1, c4116e.f36672Z);
                        }
                        c4116e.skip(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    a(c4116e.i(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f36746Y = (byte) 1;
            } else {
                c4116e = c4116e2;
            }
            if (this.f36746Y == 1) {
                long j11 = c4135j.f36721Z;
                long g02 = this.f36749i0.g0(c4135j, j6);
                if (g02 != -1) {
                    h(j11, g02, c4135j);
                    return g02;
                }
                this.f36746Y = (byte) 2;
            }
            if (this.f36746Y == 2) {
                a(c4116e.v0(), (int) crc32.getValue(), "CRC");
                a(c4116e.v0(), (int) this.f36748h0.getBytesWritten(), "ISIZE");
                this.f36746Y = (byte) 3;
                if (c4116e.H()) {
                    return -1L;
                }
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }

    public final void h(long j6, long j10, C4135j c4135j) {
        int i10;
        C4117F c4117f = c4135j.f36720Y;
        AbstractC3557B.Z(c4117f);
        while (true) {
            int i11 = c4117f.f36676c;
            int i12 = c4117f.f36675b;
            if (j6 >= i11 - i12) {
                j6 -= i11 - i12;
                c4117f = c4117f.f36679f;
                AbstractC3557B.Z(c4117f);
            }
        }
        while (j10 > 0) {
            int min = (int) Math.min(c4117f.f36676c - i10, j10);
            this.f36750j0.update(c4117f.f36674a, (int) (c4117f.f36675b + j6), min);
            j10 -= min;
            c4117f = c4117f.f36679f;
            AbstractC3557B.Z(c4117f);
            j6 = 0;
        }
    }
}
