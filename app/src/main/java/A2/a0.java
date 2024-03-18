package A2;

import java.nio.ByteBuffer;
import q2.C5262b;
import q2.C5263c;

/* loaded from: classes2.dex */
public final class a0 extends q2.f {

    /* renamed from: i  reason: collision with root package name */
    public static final int f526i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f526i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // q2.AbstractC5264d
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f43667b.f43664c;
        if (i11 != 536870912) {
            if (i11 != 805306368) {
                if (i11 != 1342177280) {
                    if (i11 == 1610612736) {
                        byteBuffer2 = l(i10);
                        while (position < limit) {
                            m((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    byteBuffer2 = l((i10 / 3) * 4);
                    while (position < limit) {
                        m(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), byteBuffer2);
                        position += 3;
                    }
                }
            } else {
                byteBuffer2 = l(i10);
                while (position < limit) {
                    m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                    position += 4;
                }
            }
        } else {
            byteBuffer2 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override // q2.f
    public final C5262b h(C5262b c5262b) {
        int i10 = c5262b.f43664c;
        if (i10 != 536870912 && i10 != 1342177280 && i10 != 805306368 && i10 != 1610612736 && i10 != 4) {
            throw new C5263c(c5262b);
        }
        if (i10 != 4) {
            return new C5262b(c5262b.f43662a, c5262b.f43663b, 4);
        }
        return C5262b.f43661e;
    }
}
