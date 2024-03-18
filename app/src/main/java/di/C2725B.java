package di;

import id.AbstractC3557B;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ji.AbstractC4136k;
import ji.C4135j;

/* renamed from: di.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2725B implements Closeable {

    /* renamed from: l0  reason: collision with root package name */
    public static final Logger f28529l0 = Logger.getLogger(g.class.getName());

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4136k f28530Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f28531Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4135j f28532h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f28533i0 = 16384;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f28534j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C2731e f28535k0;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ji.j] */
    public C2725B(AbstractC4136k abstractC4136k, boolean z10) {
        this.f28530Y = abstractC4136k;
        this.f28531Z = z10;
        ?? obj = new Object();
        this.f28532h0 = obj;
        this.f28535k0 = new C2731e(obj);
    }

    public final synchronized void F(int i10, long j6) {
        if (!this.f28534j0) {
            if (j6 != 0 && j6 <= 2147483647L) {
                i(i10, 4, 8, 0);
                this.f28530Y.y((int) j6);
                this.f28530Y.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void O(int i10, long j6) {
        int i11;
        while (j6 > 0) {
            long min = Math.min(this.f28533i0, j6);
            j6 -= min;
            int i12 = (int) min;
            if (j6 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            i(i10, i12, 9, i11);
            this.f28530Y.o(this.f28532h0, min);
        }
    }

    public final synchronized void a(E e10) {
        int i10;
        try {
            AbstractC3557B.c0("peerSettings", e10);
            if (!this.f28534j0) {
                int i11 = this.f28533i0;
                int i12 = e10.f28540a;
                if ((i12 & 32) != 0) {
                    i11 = e10.f28541b[5];
                }
                this.f28533i0 = i11;
                int i13 = -1;
                if ((i12 & 2) != 0) {
                    i10 = e10.f28541b[1];
                } else {
                    i10 = -1;
                }
                if (i10 != -1) {
                    C2731e c2731e = this.f28535k0;
                    if ((i12 & 2) != 0) {
                        i13 = e10.f28541b[1];
                    }
                    c2731e.getClass();
                    int min = Math.min(i13, 16384);
                    int i14 = c2731e.f28572e;
                    if (i14 != min) {
                        if (min < i14) {
                            c2731e.f28570c = Math.min(c2731e.f28570c, min);
                        }
                        c2731e.f28571d = true;
                        c2731e.f28572e = min;
                        int i15 = c2731e.f28576i;
                        if (min < i15) {
                            if (min == 0) {
                                kf.q.d3(0, r6.length, null, c2731e.f28573f);
                                c2731e.f28574g = c2731e.f28573f.length - 1;
                                c2731e.f28575h = 0;
                                c2731e.f28576i = 0;
                            } else {
                                c2731e.a(i15 - min);
                            }
                        }
                    }
                }
                i(0, 0, 4, 1);
                this.f28530Y.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f28534j0 = true;
        this.f28530Y.close();
    }

    public final synchronized void flush() {
        if (!this.f28534j0) {
            this.f28530Y.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(boolean z10, int i10, C4135j c4135j, int i11) {
        if (!this.f28534j0) {
            i(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                AbstractC3557B.Z(c4135j);
                this.f28530Y.o(c4135j, i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f28529l0;
        if (logger.isLoggable(level)) {
            logger.fine(g.a(i10, i11, i12, i13, false));
        }
        if (i11 <= this.f28533i0) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                byte[] bArr = Xh.b.f21996a;
                AbstractC4136k abstractC4136k = this.f28530Y;
                AbstractC3557B.c0("<this>", abstractC4136k);
                abstractC4136k.I((i11 >>> 16) & 255);
                abstractC4136k.I((i11 >>> 8) & 255);
                abstractC4136k.I(i11 & 255);
                abstractC4136k.I(i12 & 255);
                abstractC4136k.I(i13 & 255);
                abstractC4136k.y(i10 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.e("reserved bit set: ", i10).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f28533i0 + ": " + i11).toString());
    }

    public final synchronized void j(int i10, EnumC2728b enumC2728b, byte[] bArr) {
        try {
            if (!this.f28534j0) {
                if (enumC2728b.f28550Y != -1) {
                    boolean z10 = false;
                    i(0, bArr.length + 8, 7, 0);
                    this.f28530Y.y(i10);
                    this.f28530Y.y(enumC2728b.f28550Y);
                    if (bArr.length == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        this.f28530Y.z0(bArr);
                    }
                    this.f28530Y.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void k(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        if (!this.f28534j0) {
            this.f28535k0.d(arrayList);
            long j6 = this.f28532h0.f36721Z;
            long min = Math.min(this.f28533i0, j6);
            int i12 = (j6 > min ? 1 : (j6 == min ? 0 : -1));
            if (i12 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (z10) {
                i11 |= 1;
            }
            i(i10, (int) min, 1, i11);
            this.f28530Y.o(this.f28532h0, min);
            if (i12 > 0) {
                O(i10, j6 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void m(int i10, int i11, boolean z10) {
        if (!this.f28534j0) {
            i(0, 8, 6, z10 ? 1 : 0);
            this.f28530Y.y(i10);
            this.f28530Y.y(i11);
            this.f28530Y.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void p(int i10, EnumC2728b enumC2728b) {
        AbstractC3557B.c0("errorCode", enumC2728b);
        if (!this.f28534j0) {
            if (enumC2728b.f28550Y != -1) {
                i(i10, 4, 3, 0);
                this.f28530Y.y(enumC2728b.f28550Y);
                this.f28530Y.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void r(E e10) {
        int i10;
        try {
            AbstractC3557B.c0("settings", e10);
            if (!this.f28534j0) {
                i(0, Integer.bitCount(e10.f28540a) * 6, 4, 0);
                for (int i11 = 0; i11 < 10; i11++) {
                    if (((1 << i11) & e10.f28540a) != 0) {
                        if (i11 != 4) {
                            if (i11 != 7) {
                                i10 = i11;
                            } else {
                                i10 = 4;
                            }
                        } else {
                            i10 = 3;
                        }
                        this.f28530Y.v(i10);
                        this.f28530Y.y(e10.f28541b[i11]);
                    }
                }
                this.f28530Y.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
