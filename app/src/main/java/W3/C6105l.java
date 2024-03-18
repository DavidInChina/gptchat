package w3;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: w3.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6105l extends O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6108o f47916a;

    public C6105l(C6108o c6108o) {
        this.f47916a = c6108o;
    }

    @Override // w3.O
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        boolean z11;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C6108o c6108o = this.f47916a;
        int computeVerticalScrollRange = c6108o.f47943s.computeVerticalScrollRange();
        int i12 = c6108o.f47942r;
        int i13 = computeVerticalScrollRange - i12;
        int i14 = c6108o.f47925a;
        if (i13 > 0 && i12 >= i14) {
            z10 = true;
        } else {
            z10 = false;
        }
        c6108o.f47944t = z10;
        int computeHorizontalScrollRange = c6108o.f47943s.computeHorizontalScrollRange();
        int i15 = c6108o.f47941q;
        if (computeHorizontalScrollRange - i15 > 0 && i15 >= i14) {
            z11 = true;
        } else {
            z11 = false;
        }
        c6108o.f47945u = z11;
        boolean z12 = c6108o.f47944t;
        if (!z12 && !z11) {
            if (c6108o.f47946v != 0) {
                c6108o.f(0);
                return;
            }
            return;
        }
        if (z12) {
            float f6 = i12;
            c6108o.f47936l = (int) ((((f6 / 2.0f) + computeVerticalScrollOffset) * f6) / computeVerticalScrollRange);
            c6108o.f47935k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (c6108o.f47945u) {
            float f10 = computeHorizontalScrollOffset;
            float f11 = i15;
            c6108o.f47939o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
            c6108o.f47938n = Math.min(i15, (i15 * i15) / computeHorizontalScrollRange);
        }
        int i16 = c6108o.f47946v;
        if (i16 == 0 || i16 == 1) {
            c6108o.f(1);
        }
    }
}
