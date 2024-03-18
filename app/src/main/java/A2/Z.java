package A2;

import Kd.C0831g;
import Kd.C0832h;
import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import q2.C5262b;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class Z extends q2.f {

    /* renamed from: i  reason: collision with root package name */
    public final Y f525i;

    public Z(C0832h c0832h) {
        this.f525i = c0832h;
    }

    @Override // q2.AbstractC5264d
    public final void e(ByteBuffer byteBuffer) {
        int i10;
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            return;
        }
        int i11 = AbstractC5530A.f45131a;
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        C0832h c0832h = (C0832h) this.f525i;
        c0832h.getClass();
        AbstractC3557B.c0("buffer", order);
        if (c0832h.f9744c != 0) {
            int remaining2 = order.remaining();
            int i12 = c0832h.f9745d;
            int max = Math.max(1, remaining2 / i12);
            int i13 = remaining2 / max;
            ArrayList arrayList = new ArrayList();
            int i14 = c0832h.f9744c / i12;
            for (int i15 = 0; i15 < max; i15++) {
                if (i15 == max - 1) {
                    i10 = order.remaining();
                } else {
                    i10 = i13;
                }
                byte[] bArr = new byte[i10];
                order.get(bArr);
                arrayList.add(bArr);
            }
            Ad.l.O0(c0832h.f9742a, null, null, new C0831g(arrayList, c0832h, i14, null), 3);
        }
        l(remaining).put(byteBuffer).flip();
    }

    @Override // q2.f
    public final void i() {
        m();
    }

    @Override // q2.f
    public final void j() {
        m();
    }

    @Override // q2.f
    public final void k() {
        m();
    }

    public final void m() {
        if (a()) {
            C5262b c5262b = this.f43667b;
            int i10 = c5262b.f43662a;
            int i11 = c5262b.f43663b;
            int i12 = c5262b.f43664c;
            ((C0832h) this.f525i).f9744c = i10;
        }
    }

    @Override // q2.f
    public final C5262b h(C5262b c5262b) {
        return c5262b;
    }
}
