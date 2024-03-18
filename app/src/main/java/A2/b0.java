package A2;

import java.nio.ByteBuffer;
import q2.C5262b;
import q2.C5263c;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class b0 extends q2.f {

    /* renamed from: i  reason: collision with root package name */
    public int f528i;

    /* renamed from: j  reason: collision with root package name */
    public int f529j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f530k;

    /* renamed from: l  reason: collision with root package name */
    public int f531l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f532m;

    /* renamed from: n  reason: collision with root package name */
    public int f533n;

    /* renamed from: o  reason: collision with root package name */
    public long f534o;

    @Override // q2.f, q2.AbstractC5264d
    public final ByteBuffer c() {
        int i10;
        if (super.g() && (i10 = this.f533n) > 0) {
            l(i10).put(this.f532m, 0, this.f533n).flip();
            this.f533n = 0;
        }
        return super.c();
    }

    @Override // q2.AbstractC5264d
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f531l);
        this.f534o += min / this.f43667b.f43665d;
        this.f531l -= min;
        byteBuffer.position(position + min);
        if (this.f531l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f533n + i11) - this.f532m.length;
        ByteBuffer l10 = l(length);
        int i12 = AbstractC5530A.i(length, 0, this.f533n);
        l10.put(this.f532m, 0, i12);
        int i13 = AbstractC5530A.i(length - i12, 0, i11);
        byteBuffer.limit(byteBuffer.position() + i13);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i14 = i11 - i13;
        int i15 = this.f533n - i12;
        this.f533n = i15;
        byte[] bArr = this.f532m;
        System.arraycopy(bArr, i12, bArr, 0, i15);
        byteBuffer.get(this.f532m, this.f533n, i14);
        this.f533n += i14;
        l10.flip();
    }

    @Override // q2.f, q2.AbstractC5264d
    public final boolean g() {
        if (super.g() && this.f533n == 0) {
            return true;
        }
        return false;
    }

    @Override // q2.f
    public final C5262b h(C5262b c5262b) {
        if (c5262b.f43664c == 2) {
            this.f530k = true;
            if (this.f528i == 0 && this.f529j == 0) {
                return C5262b.f43661e;
            }
            return c5262b;
        }
        throw new C5263c(c5262b);
    }

    @Override // q2.f
    public final void i() {
        if (this.f530k) {
            this.f530k = false;
            int i10 = this.f529j;
            int i11 = this.f43667b.f43665d;
            this.f532m = new byte[i10 * i11];
            this.f531l = this.f528i * i11;
        }
        this.f533n = 0;
    }

    @Override // q2.f
    public final void j() {
        int i10;
        if (this.f530k) {
            if (this.f533n > 0) {
                this.f534o += i10 / this.f43667b.f43665d;
            }
            this.f533n = 0;
        }
    }

    @Override // q2.f
    public final void k() {
        this.f532m = AbstractC5530A.f45136f;
    }
}
