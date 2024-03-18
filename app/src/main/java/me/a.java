package Me;

import K4.J;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f12021a;

    /* renamed from: b  reason: collision with root package name */
    public int f12022b;

    /* renamed from: c  reason: collision with root package name */
    public int f12023c;

    /* renamed from: d  reason: collision with root package name */
    public int f12024d;

    /* renamed from: e  reason: collision with root package name */
    public int f12025e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12026f;

    public a(ByteBuffer byteBuffer) {
        AbstractC3557B.c0("memory", byteBuffer);
        this.f12021a = byteBuffer;
        this.f12025e = byteBuffer.limit();
        this.f12026f = byteBuffer.limit();
    }

    public final void a(int i10) {
        int i11 = this.f12023c;
        int i12 = i11 + i10;
        if (i10 >= 0 && i12 <= this.f12025e) {
            this.f12023c = i12;
        } else {
            AbstractC5260f.i(i10, this.f12025e - i11);
            throw null;
        }
    }

    public final void b(int i10) {
        int i11 = this.f12025e;
        int i12 = this.f12023c;
        if (i10 >= i12) {
            if (i10 >= i11) {
                if (i10 == i11) {
                    this.f12023c = i10;
                    return;
                } else {
                    AbstractC5260f.i(i10 - i12, i11 - i12);
                    throw null;
                }
            }
            this.f12023c = i10;
            return;
        }
        AbstractC5260f.i(i10 - i12, i11 - i12);
        throw null;
    }

    public final void c(int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = this.f12022b;
        int i12 = i11 + i10;
        if (i10 >= 0 && i12 <= this.f12023c) {
            this.f12022b = i12;
        } else {
            AbstractC5260f.o(i10, this.f12023c - i11);
            throw null;
        }
    }

    public final void d(int i10) {
        if (i10 >= 0) {
            if (i10 <= this.f12022b) {
                this.f12022b = i10;
                if (this.f12024d > i10) {
                    this.f12024d = i10;
                    return;
                }
                return;
            }
            StringBuilder q10 = android.gov.nist.core.a.q("newReadPosition shouldn't be ahead of the read position: ", i10, " > ");
            q10.append(this.f12022b);
            throw new IllegalArgumentException(q10.toString().toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("newReadPosition shouldn't be negative: ", i10).toString());
    }

    public final void e() {
        int i10 = this.f12026f;
        int i11 = i10 - 8;
        int i12 = this.f12023c;
        if (i11 >= i12) {
            this.f12025e = i11;
        } else if (i11 >= 0) {
            if (i11 >= this.f12024d) {
                if (this.f12022b == i12) {
                    this.f12025e = i11;
                    this.f12022b = i11;
                    this.f12023c = i11;
                    return;
                }
                throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (this.f12023c - this.f12022b) + " content bytes at offset " + this.f12022b);
            }
            throw new IllegalArgumentException(android.gov.nist.core.a.l(new StringBuilder("End gap 8 is too big: there are already "), this.f12024d, " bytes reserved in the beginning"));
        } else {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("End gap 8 is too big: capacity is ", i10));
        }
    }

    public final void f(int i10) {
        int i11 = this.f12024d;
        this.f12022b = i11;
        this.f12023c = i11;
        this.f12025e = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Buffer[0x");
        int hashCode = hashCode();
        J.j(16);
        String num = Integer.toString(hashCode, 16);
        AbstractC3557B.b0("toString(this, checkRadix(radix))", num);
        sb2.append(num);
        sb2.append("](");
        sb2.append(this.f12023c - this.f12022b);
        sb2.append(" used, ");
        sb2.append(this.f12025e - this.f12023c);
        sb2.append(" free, ");
        int i10 = this.f12024d;
        int i11 = this.f12025e;
        int i12 = this.f12026f;
        sb2.append((i12 - i11) + i10);
        sb2.append(" reserved of ");
        return AbstractC2469q0.j(sb2, i12, ')');
    }
}
