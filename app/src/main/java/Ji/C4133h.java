package ji;

import id.AbstractC3557B;
import java.io.Closeable;
import java.util.Arrays;

/* renamed from: ji.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4133h implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public C4135j f36711Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f36712Z;

    /* renamed from: h0  reason: collision with root package name */
    public C4117F f36713h0;

    /* renamed from: j0  reason: collision with root package name */
    public byte[] f36715j0;

    /* renamed from: i0  reason: collision with root package name */
    public long f36714i0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public int f36716k0 = -1;

    /* renamed from: l0  reason: collision with root package name */
    public int f36717l0 = -1;

    public final void a(long j6) {
        C4135j c4135j = this.f36711Y;
        if (c4135j != null) {
            if (this.f36712Z) {
                long j10 = c4135j.f36721Z;
                int i10 = (j6 > j10 ? 1 : (j6 == j10 ? 0 : -1));
                if (i10 <= 0) {
                    if (j6 >= 0) {
                        long j11 = j10 - j6;
                        while (true) {
                            if (j11 <= 0) {
                                break;
                            }
                            C4117F c4117f = c4135j.f36720Y;
                            AbstractC3557B.Z(c4117f);
                            C4117F c4117f2 = c4117f.f36680g;
                            AbstractC3557B.Z(c4117f2);
                            int i11 = c4117f2.f36676c;
                            long j12 = i11 - c4117f2.f36675b;
                            if (j12 <= j11) {
                                c4135j.f36720Y = c4117f2.a();
                                AbstractC4118G.a(c4117f2);
                                j11 -= j12;
                            } else {
                                c4117f2.f36676c = i11 - ((int) j11);
                                break;
                            }
                        }
                        this.f36713h0 = null;
                        this.f36714i0 = j6;
                        this.f36715j0 = null;
                        this.f36716k0 = -1;
                        this.f36717l0 = -1;
                    } else {
                        throw new IllegalArgumentException(android.gov.nist.core.a.f("newSize < 0: ", j6).toString());
                    }
                } else if (i10 > 0) {
                    long j13 = j6 - j10;
                    int i12 = 1;
                    boolean z10 = true;
                    for (long j14 = 0; j13 > j14; j14 = 0) {
                        C4117F d02 = c4135j.d0(i12);
                        int min = (int) Math.min(j13, 8192 - d02.f36676c);
                        int i13 = d02.f36676c + min;
                        d02.f36676c = i13;
                        j13 -= min;
                        if (z10) {
                            this.f36713h0 = d02;
                            this.f36714i0 = j10;
                            this.f36715j0 = d02.f36674a;
                            this.f36716k0 = i13 - min;
                            this.f36717l0 = i13;
                            z10 = false;
                        }
                        i12 = 1;
                    }
                }
                c4135j.f36721Z = j6;
                return;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f36711Y != null) {
            this.f36711Y = null;
            this.f36713h0 = null;
            this.f36714i0 = -1L;
            this.f36715j0 = null;
            this.f36716k0 = -1;
            this.f36717l0 = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }

    public final int h(long j6) {
        int i10;
        long j10;
        C4135j c4135j = this.f36711Y;
        if (c4135j != null) {
            int i11 = (j6 > (-1L) ? 1 : (j6 == (-1L) ? 0 : -1));
            if (i11 >= 0 && j6 <= (c4135j.f36721Z)) {
                if (i11 != 0 && i10 != 0) {
                    C4117F c4117f = c4135j.f36720Y;
                    C4117F c4117f2 = this.f36713h0;
                    long j11 = 0;
                    if (c4117f2 != null) {
                        long j12 = this.f36714i0 - (this.f36716k0 - c4117f2.f36675b);
                        if (j12 > j6) {
                            j10 = j12;
                            c4117f2 = c4117f;
                            c4117f = c4117f2;
                        } else {
                            j11 = j12;
                        }
                    } else {
                        c4117f2 = c4117f;
                    }
                    if (j10 - j6 > j6 - j11) {
                        while (true) {
                            AbstractC3557B.Z(c4117f2);
                            long j13 = (c4117f2.f36676c - c4117f2.f36675b) + j11;
                            if (j6 < j13) {
                                break;
                            }
                            c4117f2 = c4117f2.f36679f;
                            j11 = j13;
                        }
                    } else {
                        while (j10 > j6) {
                            AbstractC3557B.Z(c4117f);
                            c4117f = c4117f.f36680g;
                            AbstractC3557B.Z(c4117f);
                            j10 -= c4117f.f36676c - c4117f.f36675b;
                        }
                        c4117f2 = c4117f;
                        j11 = j10;
                    }
                    if (this.f36712Z) {
                        AbstractC3557B.Z(c4117f2);
                        if (c4117f2.f36677d) {
                            byte[] bArr = c4117f2.f36674a;
                            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                            AbstractC3557B.b0("copyOf(...)", copyOf);
                            C4117F c4117f3 = new C4117F(copyOf, c4117f2.f36675b, c4117f2.f36676c, false, true);
                            if (c4135j.f36720Y == c4117f2) {
                                c4135j.f36720Y = c4117f3;
                            }
                            c4117f2.b(c4117f3);
                            C4117F c4117f4 = c4117f3.f36680g;
                            AbstractC3557B.Z(c4117f4);
                            c4117f4.a();
                            c4117f2 = c4117f3;
                        }
                    }
                    this.f36713h0 = c4117f2;
                    this.f36714i0 = j6;
                    AbstractC3557B.Z(c4117f2);
                    this.f36715j0 = c4117f2.f36674a;
                    int i12 = c4117f2.f36675b + ((int) (j6 - j11));
                    this.f36716k0 = i12;
                    int i13 = c4117f2.f36676c;
                    this.f36717l0 = i13;
                    return i13 - i12;
                }
                this.f36713h0 = null;
                this.f36714i0 = j6;
                this.f36715j0 = null;
                this.f36716k0 = -1;
                this.f36717l0 = -1;
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j6 + " > size=" + c4135j.f36721Z);
        }
        throw new IllegalStateException("not attached to a buffer".toString());
    }
}
