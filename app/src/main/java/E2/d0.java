package E2;

import java.io.IOException;
import java.util.Arrays;
import v2.AbstractC5969h;

/* loaded from: classes2.dex */
public final class d0 implements I2.k {

    /* renamed from: a  reason: collision with root package name */
    public final long f4308a = C0484p.f4392b.getAndIncrement();

    /* renamed from: b  reason: collision with root package name */
    public final v2.l f4309b;

    /* renamed from: c  reason: collision with root package name */
    public final v2.D f4310c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f4311d;

    public d0(AbstractC5969h abstractC5969h, v2.l lVar) {
        this.f4309b = lVar;
        this.f4310c = new v2.D(abstractC5969h);
    }

    @Override // I2.k
    public final void a() {
        int i10;
        byte[] bArr;
        v2.D d10 = this.f4310c;
        d10.f47042b = 0L;
        try {
            d10.a(this.f4309b);
            do {
                i10 = (int) d10.f47042b;
                byte[] bArr2 = this.f4311d;
                if (bArr2 == null) {
                    this.f4311d = new byte[1024];
                } else if (i10 == bArr2.length) {
                    this.f4311d = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                bArr = this.f4311d;
            } while (d10.read(bArr, i10, bArr.length - i10) != -1);
            try {
                d10.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            try {
                d10.close();
            } catch (IOException unused2) {
            }
            throw th2;
        }
    }

    @Override // I2.k
    public final void b() {
    }
}
