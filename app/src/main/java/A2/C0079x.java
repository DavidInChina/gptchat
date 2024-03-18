package A2;

import java.nio.ByteBuffer;
import q2.C5262b;
import q2.C5263c;

/* renamed from: A2.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0079x extends q2.f {

    /* renamed from: i  reason: collision with root package name */
    public int[] f635i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f636j;

    @Override // q2.AbstractC5264d
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = this.f636j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f43667b.f43665d) * this.f43668c.f43665d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f43667b.f43665d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // q2.f
    public final C5262b h(C5262b c5262b) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f635i;
        if (iArr == null) {
            return C5262b.f43661e;
        }
        if (c5262b.f43664c == 2) {
            int length = iArr.length;
            int i10 = c5262b.f43663b;
            if (i10 != length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new C5263c(c5262b);
                }
            }
            if (z10) {
                return new C5262b(c5262b.f43662a, iArr.length, 2);
            }
            return C5262b.f43661e;
        }
        throw new C5263c(c5262b);
    }

    @Override // q2.f
    public final void i() {
        this.f636j = this.f635i;
    }

    @Override // q2.f
    public final void k() {
        this.f636j = null;
        this.f635i = null;
    }
}
