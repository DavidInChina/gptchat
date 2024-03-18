package ii;

import Df.H;
import id.AbstractC3557B;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import ji.AbstractC4137l;
import ji.C4133h;
import ji.C4135j;
import ji.C4138m;
import k6.AbstractC4194d;

/* renamed from: ii.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3594i implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f33297Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC4137l f33298Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC3593h f33299h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f33300i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f33301j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f33302k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f33303l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f33304m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f33305n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f33306o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f33307p0;

    /* renamed from: q0  reason: collision with root package name */
    public final C4135j f33308q0 = new Object();

    /* renamed from: r0  reason: collision with root package name */
    public final C4135j f33309r0 = new Object();

    /* renamed from: s0  reason: collision with root package name */
    public C3586a f33310s0;

    /* renamed from: t0  reason: collision with root package name */
    public final byte[] f33311t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C4133h f33312u0;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ji.j] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, ji.j] */
    public C3594i(boolean z10, AbstractC4137l abstractC4137l, C3591f c3591f, boolean z11, boolean z12) {
        byte[] bArr;
        AbstractC3557B.c0("source", abstractC4137l);
        AbstractC3557B.c0("frameCallback", c3591f);
        this.f33297Y = z10;
        this.f33298Z = abstractC4137l;
        this.f33299h0 = c3591f;
        this.f33300i0 = z11;
        this.f33301j0 = z12;
        C4133h c4133h = null;
        if (z10) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f33311t0 = bArr;
        this.f33312u0 = !z10 ? new C4133h() : c4133h;
    }

    public final void a() {
        String str;
        short s10;
        String str2;
        long j6 = this.f33304m0;
        if (j6 > 0) {
            this.f33298Z.K0(this.f33308q0, j6);
            if (!this.f33297Y) {
                C4135j c4135j = this.f33308q0;
                C4133h c4133h = this.f33312u0;
                AbstractC3557B.Z(c4133h);
                c4135j.F(c4133h);
                this.f33312u0.h(0L);
                C4133h c4133h2 = this.f33312u0;
                byte[] bArr = this.f33311t0;
                AbstractC3557B.Z(bArr);
                H.B0(c4133h2, bArr);
                this.f33312u0.close();
            }
        }
        switch (this.f33303l0) {
            case 8:
                C4135j c4135j2 = this.f33308q0;
                long j10 = c4135j2.f36721Z;
                if (j10 != 1) {
                    if (j10 == 0) {
                        str = "";
                        s10 = 1005;
                    } else {
                        s10 = c4135j2.readShort();
                        str = this.f33308q0.V();
                        if (s10 >= 1000 && s10 < 5000) {
                            if ((1004 <= s10 && s10 < 1007) || (1015 <= s10 && s10 < 3000)) {
                                str2 = AbstractC4194d.v("Code ", s10, " is reserved and may not be used.");
                            } else {
                                str2 = null;
                            }
                        } else {
                            str2 = android.gov.nist.core.a.e("Code must be in range [1000,5000): ", s10);
                        }
                        if (str2 != null) {
                            throw new ProtocolException(str2);
                        }
                    }
                    ((C3591f) this.f33299h0).f(s10, str);
                    this.f33302k0 = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                AbstractC3593h abstractC3593h = this.f33299h0;
                C4135j c4135j3 = this.f33308q0;
                ((C3591f) abstractC3593h).g(c4135j3.q(c4135j3.f36721Z));
                return;
            case 10:
                AbstractC3593h abstractC3593h2 = this.f33299h0;
                C4135j c4135j4 = this.f33308q0;
                C4138m q10 = c4135j4.q(c4135j4.f36721Z);
                C3591f c3591f = (C3591f) abstractC3593h2;
                synchronized (c3591f) {
                    AbstractC3557B.c0("payload", q10);
                    c3591f.f33290w = false;
                }
                return;
            default:
                int i10 = this.f33303l0;
                byte[] bArr2 = Xh.b.f21996a;
                String hexString = Integer.toHexString(i10);
                AbstractC3557B.b0("toHexString(this)", hexString);
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C3586a c3586a = this.f33310s0;
        if (c3586a != null) {
            c3586a.close();
        }
    }

    public final void h() {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        if (!this.f33302k0) {
            AbstractC4137l abstractC4137l = this.f33298Z;
            long h10 = abstractC4137l.f().h();
            abstractC4137l.f().b();
            try {
                byte readByte = abstractC4137l.readByte();
                byte[] bArr = Xh.b.f21996a;
                abstractC4137l.f().g(h10, TimeUnit.NANOSECONDS);
                int i10 = readByte & 15;
                this.f33303l0 = i10;
                boolean z14 = false;
                if ((readByte & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f33305n0 = z10;
                if ((readByte & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f33306o0 = z11;
                if (z11 && !z10) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 != 1 && i10 != 2) {
                    if (z12) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z12) {
                        if (this.f33300i0) {
                            z13 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z13 = false;
                    }
                    this.f33307p0 = z13;
                }
                if ((readByte & 32) == 0) {
                    if ((readByte & 16) == 0) {
                        byte readByte2 = abstractC4137l.readByte();
                        if ((readByte2 & 128) != 0) {
                            z14 = true;
                        }
                        boolean z15 = this.f33297Y;
                        if (z14 == z15) {
                            if (z15) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j6 = readByte2 & Byte.MAX_VALUE;
                        this.f33304m0 = j6;
                        if (j6 == 126) {
                            this.f33304m0 = abstractC4137l.readShort() & 65535;
                        } else if (j6 == 127) {
                            long readLong = abstractC4137l.readLong();
                            this.f33304m0 = readLong;
                            if (readLong < 0) {
                                StringBuilder sb2 = new StringBuilder("Frame length 0x");
                                String hexString = Long.toHexString(this.f33304m0);
                                AbstractC3557B.b0("toHexString(this)", hexString);
                                sb2.append(hexString);
                                sb2.append(" > 0x7FFFFFFFFFFFFFFF");
                                throw new ProtocolException(sb2.toString());
                            }
                        }
                        if (this.f33306o0 && this.f33304m0 > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z14) {
                            byte[] bArr2 = this.f33311t0;
                            AbstractC3557B.Z(bArr2);
                            abstractC4137l.readFully(bArr2);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th2) {
                abstractC4137l.f().g(h10, TimeUnit.NANOSECONDS);
                throw th2;
            }
        }
        throw new IOException("closed");
    }
}
