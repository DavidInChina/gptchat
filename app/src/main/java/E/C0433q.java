package A2;

import java.nio.ByteBuffer;
import q2.C5262b;
import q2.C5263c;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class X extends q2.f {

    /* renamed from: i  reason: collision with root package name */
    public final long f513i = 150000;

    /* renamed from: j  reason: collision with root package name */
    public final long f514j = 20000;

    /* renamed from: k  reason: collision with root package name */
    public final short f515k = 1024;

    /* renamed from: l  reason: collision with root package name */
    public int f516l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f517m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f518n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f519o;

    /* renamed from: p  reason: collision with root package name */
    public int f520p;

    /* renamed from: q  reason: collision with root package name */
    public int f521q;

    /* renamed from: r  reason: collision with root package name */
    public int f522r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f523s;

    /* renamed from: t  reason: collision with root package name */
    public long f524t;

    public X() {
        byte[] bArr = AbstractC5530A.f45136f;
        this.f518n = bArr;
        this.f519o = bArr;
    }

    @Override // q2.f, q2.AbstractC5264d
    public final boolean a() {
        return this.f517m;
    }

    @Override // q2.AbstractC5264d
    public final void e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f43672g.hasRemaining()) {
            int i10 = this.f520p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int m10 = m(byteBuffer);
                        byteBuffer.limit(m10);
                        this.f524t += byteBuffer.remaining() / this.f516l;
                        o(byteBuffer, this.f519o, this.f522r);
                        if (m10 < limit) {
                            n(this.f522r, this.f519o);
                            this.f520p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int m11 = m(byteBuffer);
                    int position2 = m11 - byteBuffer.position();
                    byte[] bArr = this.f518n;
                    int length = bArr.length;
                    int i11 = this.f521q;
                    int i12 = length - i11;
                    if (m11 < limit2 && position2 < i12) {
                        n(i11, bArr);
                        this.f521q = 0;
                        this.f520p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f518n, this.f521q, min);
                        int i13 = this.f521q + min;
                        this.f521q = i13;
                        byte[] bArr2 = this.f518n;
                        if (i13 == bArr2.length) {
                            if (this.f523s) {
                                n(this.f522r, bArr2);
                                this.f524t += (this.f521q - (this.f522r * 2)) / this.f516l;
                            } else {
                                this.f524t += (i13 - this.f522r) / this.f516l;
                            }
                            o(byteBuffer, this.f518n, this.f521q);
                            this.f521q = 0;
                            this.f520p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f518n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f515k) {
                            int i14 = this.f516l;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f520p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    l(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f523s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // q2.f
    public final C5262b h(C5262b c5262b) {
        if (c5262b.f43664c == 2) {
            if (!this.f517m) {
                return C5262b.f43661e;
            }
            return c5262b;
        }
        throw new C5263c(c5262b);
    }

    @Override // q2.f
    public final void i() {
        if (this.f517m) {
            C5262b c5262b = this.f43667b;
            int i10 = c5262b.f43665d;
            this.f516l = i10;
            int i11 = c5262b.f43662a;
            int i12 = ((int) ((this.f513i * i11) / 1000000)) * i10;
            if (this.f518n.length != i12) {
                this.f518n = new byte[i12];
            }
            int i13 = ((int) ((this.f514j * i11) / 1000000)) * i10;
            this.f522r = i13;
            if (this.f519o.length != i13) {
                this.f519o = new byte[i13];
            }
        }
        this.f520p = 0;
        this.f524t = 0L;
        this.f521q = 0;
        this.f523s = false;
    }

    @Override // q2.f
    public final void j() {
        int i10 = this.f521q;
        if (i10 > 0) {
            n(i10, this.f518n);
            this.f521q = 0;
            this.f520p = 0;
        }
        if (!this.f523s) {
            this.f524t += this.f522r / this.f516l;
        }
    }

    @Override // q2.f
    public final void k() {
        this.f517m = false;
        this.f522r = 0;
        byte[] bArr = AbstractC5530A.f45136f;
        this.f518n = bArr;
        this.f519o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f515k) {
                int i10 = this.f516l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(int i10, byte[] bArr) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f523s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f522r);
        int i11 = this.f522r - min;
        System.arraycopy(bArr, i10 - i11, this.f519o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f519o, i11, min);
    }
}
