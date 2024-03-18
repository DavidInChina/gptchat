package Me;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends i {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c() {
        super(r0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ne.c.f12795i;
        g gVar = b.f12027a;
        AbstractC3557B.c0("pool", gVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            append(0, 4, "null");
        } else {
            append(0, charSequence.length(), charSequence);
        }
        return this;
    }

    /* renamed from: m */
    public final c append(int i10, int i11, CharSequence charSequence) {
        c cVar;
        if (charSequence == null) {
            cVar = append(i10, i11, "null");
        } else {
            N.E0(this, charSequence, i10, i11, Lg.a.f11131a);
            cVar = this;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder", cVar);
        return cVar;
    }

    public final d p() {
        int i10 = (this.f12044j0 - this.f12046l0) + this.f12047m0;
        Ne.c j6 = j();
        if (j6 == null) {
            return d.f12028m0;
        }
        return new d(j6, i10, this.f12040Y);
    }

    public final String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        int i10 = this.f12044j0;
        int i11 = 3;
        if (this.f12045k0 - i10 >= 3) {
            ByteBuffer byteBuffer = this.f12043i0;
            if (c10 >= 0 && c10 < '\u0080') {
                byteBuffer.put(i10, (byte) c10);
                i11 = 1;
            } else if ('\u0080' <= c10 && c10 < '\u0800') {
                byteBuffer.put(i10, (byte) (((c10 >> 6) & 31) | 192));
                byteBuffer.put(i10 + 1, (byte) ((c10 & '?') | 128));
                i11 = 2;
            } else if ('\u0800' <= c10 && c10 < 0) {
                byteBuffer.put(i10, (byte) (((c10 >> '\f') & 15) | 224));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) ((c10 & '?') | 128));
            } else if (0 > c10 || c10 >= 0) {
                AbstractC3557B.h2(c10);
                throw null;
            } else {
                byteBuffer.put(i10, (byte) (((c10 >> 18) & 7) | 240));
                byteBuffer.put(i10 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                byteBuffer.put(i10 + 2, (byte) (((c10 >> 6) & 63) | 128));
                byteBuffer.put(i10 + 3, (byte) ((c10 & '?') | 128));
                i11 = 4;
            }
            this.f12044j0 = i10 + i11;
        } else {
            Ne.c i12 = i(3);
            try {
                ByteBuffer byteBuffer2 = i12.f12021a;
                int i13 = i12.f12023c;
                if (c10 >= 0 && c10 < '\u0080') {
                    byteBuffer2.put(i13, (byte) c10);
                    i11 = 1;
                } else if ('\u0080' <= c10 && c10 < '\u0800') {
                    byteBuffer2.put(i13, (byte) (((c10 >> 6) & 31) | 192));
                    byteBuffer2.put(i13 + 1, (byte) ((c10 & '?') | 128));
                    i11 = 2;
                } else if ('\u0800' <= c10 && c10 < 0) {
                    byteBuffer2.put(i13, (byte) (((c10 >> '\f') & 15) | 224));
                    byteBuffer2.put(i13 + 1, (byte) (((c10 >> 6) & 63) | 128));
                    byteBuffer2.put(i13 + 2, (byte) ((c10 & '?') | 128));
                } else if (0 > c10 || c10 >= 0) {
                    AbstractC3557B.h2(c10);
                    throw null;
                } else {
                    byteBuffer2.put(i13, (byte) (((c10 >> 18) & 7) | 240));
                    byteBuffer2.put(i13 + 1, (byte) (((c10 >> '\f') & 63) | 128));
                    byteBuffer2.put(i13 + 2, (byte) (((c10 >> 6) & 63) | 128));
                    byteBuffer2.put(i13 + 3, (byte) ((c10 & '?') | 128));
                    i11 = 4;
                }
                i12.a(i11);
                if (i11 >= 0) {
                    a();
                } else {
                    throw new IllegalStateException("The returned value shouldn't be negative".toString());
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
        return this;
    }
}
