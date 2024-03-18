package E2;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import s2.AbstractC5530A;
import x2.C6268c;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final I2.d f4235a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4236b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.u f4237c = new s2.u(32);

    /* renamed from: d  reason: collision with root package name */
    public S f4238d;

    /* renamed from: e  reason: collision with root package name */
    public S f4239e;

    /* renamed from: f  reason: collision with root package name */
    public S f4240f;

    /* renamed from: g  reason: collision with root package name */
    public long f4241g;

    public T(I2.d dVar) {
        this.f4235a = dVar;
        int i10 = dVar.f7963b;
        this.f4236b = i10;
        S s10 = new S(0L, i10);
        this.f4238d = s10;
        this.f4239e = s10;
        this.f4240f = s10;
    }

    public static S c(S s10, long j6, ByteBuffer byteBuffer, int i10) {
        while (j6 >= s10.f4232b) {
            s10 = (S) s10.f4234d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (s10.f4232b - j6));
            byteBuffer.put(((I2.a) s10.f4233c).f7957a, s10.a(j6), min);
            i10 -= min;
            j6 += min;
            if (j6 == s10.f4232b) {
                s10 = (S) s10.f4234d;
            }
        }
        return s10;
    }

    public static S d(S s10, long j6, byte[] bArr, int i10) {
        while (j6 >= s10.f4232b) {
            s10 = (S) s10.f4234d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (s10.f4232b - j6));
            System.arraycopy(((I2.a) s10.f4233c).f7957a, s10.a(j6), bArr, i10 - i11, min);
            i11 -= min;
            j6 += min;
            if (j6 == s10.f4232b) {
                s10 = (S) s10.f4234d;
            }
        }
        return s10;
    }

    public static S e(S s10, x2.h hVar, U u10, s2.u uVar) {
        boolean z10;
        if (hVar.g(1073741824)) {
            long j6 = u10.f4243b;
            int i10 = 1;
            uVar.C(1);
            S d10 = d(s10, j6, uVar.f45193a, 1);
            long j10 = j6 + 1;
            byte b10 = uVar.f45193a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            x2.d dVar = hVar.f48640i0;
            byte[] bArr = dVar.f48629a;
            if (bArr == null) {
                dVar.f48629a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            s10 = d(d10, j10, dVar.f48629a, i11);
            long j11 = j10 + i11;
            if (z10) {
                uVar.C(2);
                s10 = d(s10, j11, uVar.f45193a, 2);
                j11 += 2;
                i10 = uVar.z();
            }
            int[] iArr = dVar.f48632d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f48633e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                uVar.C(i12);
                s10 = d(s10, j11, uVar.f45193a, i12);
                j11 += i12;
                uVar.F(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = uVar.z();
                    iArr2[i13] = uVar.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = u10.f4242a - ((int) (j11 - u10.f4243b));
            }
            L2.F f6 = u10.f4244c;
            int i14 = AbstractC5530A.f45131a;
            byte[] bArr2 = f6.f10530b;
            byte[] bArr3 = dVar.f48629a;
            dVar.f48634f = i10;
            dVar.f48632d = iArr;
            dVar.f48633e = iArr2;
            dVar.f48630b = bArr2;
            dVar.f48629a = bArr3;
            int i15 = f6.f10529a;
            dVar.f48631c = i15;
            int i16 = f6.f10531c;
            dVar.f48635g = i16;
            int i17 = f6.f10532d;
            dVar.f48636h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f48637i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (AbstractC5530A.f45131a >= 24) {
                C6268c c6268c = dVar.f48638j;
                c6268c.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = c6268c.f48628b;
                pattern.set(i16, i17);
                c6268c.f48627a.setPattern(pattern);
            }
            long j12 = u10.f4243b;
            int i18 = (int) (j11 - j12);
            u10.f4243b = j12 + i18;
            u10.f4242a -= i18;
        }
        if (hVar.g(268435456)) {
            uVar.C(4);
            S d11 = d(s10, u10.f4243b, uVar.f45193a, 4);
            int x10 = uVar.x();
            u10.f4243b += 4;
            u10.f4242a -= 4;
            hVar.k(x10);
            S c10 = c(d11, u10.f4243b, hVar.f48641j0, x10);
            u10.f4243b += x10;
            int i19 = u10.f4242a - x10;
            u10.f4242a = i19;
            ByteBuffer byteBuffer = hVar.f48644m0;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                hVar.f48644m0.clear();
            } else {
                hVar.f48644m0 = ByteBuffer.allocate(i19);
            }
            return c(c10, u10.f4243b, hVar.f48644m0, u10.f4242a);
        }
        hVar.k(u10.f4242a);
        return c(s10, u10.f4243b, hVar.f48641j0, u10.f4242a);
    }

    public final void a(long j6) {
        S s10;
        if (j6 == -1) {
            return;
        }
        while (true) {
            s10 = this.f4238d;
            if (j6 < s10.f4232b) {
                break;
            }
            I2.d dVar = this.f4235a;
            I2.a aVar = (I2.a) s10.f4233c;
            synchronized (dVar) {
                I2.a[] aVarArr = dVar.f7967f;
                int i10 = dVar.f7966e;
                dVar.f7966e = i10 + 1;
                aVarArr[i10] = aVar;
                dVar.f7965d--;
                dVar.notifyAll();
            }
            S s11 = this.f4238d;
            s11.f4233c = null;
            s11.f4234d = null;
            this.f4238d = (S) s11.f4234d;
        }
        if (this.f4239e.f4231a < s10.f4231a) {
            this.f4239e = s10;
        }
    }

    public final int b(int i10) {
        I2.a aVar;
        S s10 = this.f4240f;
        if (((I2.a) s10.f4233c) == null) {
            I2.d dVar = this.f4235a;
            synchronized (dVar) {
                try {
                    int i11 = dVar.f7965d + 1;
                    dVar.f7965d = i11;
                    int i12 = dVar.f7966e;
                    if (i12 > 0) {
                        I2.a[] aVarArr = dVar.f7967f;
                        int i13 = i12 - 1;
                        dVar.f7966e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f7967f[dVar.f7966e] = null;
                    } else {
                        I2.a aVar2 = new I2.a(0, new byte[dVar.f7963b]);
                        I2.a[] aVarArr2 = dVar.f7967f;
                        if (i11 > aVarArr2.length) {
                            dVar.f7967f = (I2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            S s11 = new S(this.f4240f.f4232b, this.f4236b);
            s10.f4233c = aVar;
            s10.f4234d = s11;
        }
        return Math.min(i10, (int) (this.f4240f.f4232b - this.f4241g));
    }
}
