package E0;

import G0.AbstractC0579h;
import H0.C0714y;

/* loaded from: classes.dex */
public final class I implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J f4010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4011b;

    public I(J j6, Object obj) {
        this.f4010a = j6;
        this.f4011b = obj;
    }

    @Override // E0.l0
    public final int a() {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f4010a.f4021o0.get(this.f4011b);
        if (aVar != null) {
            return aVar.o().size();
        }
        return 0;
    }

    @Override // E0.l0
    public final void b(int i10, long j6) {
        J j10 = this.f4010a;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) j10.f4021o0.get(this.f4011b);
        if (aVar != null && aVar.S()) {
            int size = aVar.o().size();
            if (i10 >= 0 && i10 < size) {
                if (!aVar.T()) {
                    androidx.compose.ui.node.a aVar2 = j10.f4012Y;
                    aVar2.f24853q0 = true;
                    ((C0714y) AbstractC0579h.C(aVar)).p((androidx.compose.ui.node.a) aVar.o().get(i10), j6);
                    aVar2.f24853q0 = false;
                    return;
                }
                throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
            }
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
        }
    }

    @Override // E0.l0
    public final void dispose() {
        J j6 = this.f4010a;
        j6.d();
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) j6.f4021o0.remove(this.f4011b);
        if (aVar != null) {
            if (j6.f4026t0 > 0) {
                androidx.compose.ui.node.a aVar2 = j6.f4012Y;
                int indexOf = aVar2.r().indexOf(aVar);
                int size = aVar2.r().size();
                int i10 = j6.f4026t0;
                if (indexOf >= size - i10) {
                    j6.f4025s0++;
                    j6.f4026t0 = i10 - 1;
                    int size2 = (aVar2.r().size() - j6.f4026t0) - j6.f4025s0;
                    aVar2.f24853q0 = true;
                    aVar2.d0(indexOf, size2, 1);
                    aVar2.f24853q0 = false;
                    j6.c(size2);
                    return;
                }
                throw new IllegalStateException("Item is not in pre-composed item range".toString());
            }
            throw new IllegalStateException("No pre-composed items to dispose".toString());
        }
    }
}
