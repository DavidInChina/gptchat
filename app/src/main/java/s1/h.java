package S1;

import Q1.l;
import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class h extends P5.c {

    /* renamed from: Z  reason: collision with root package name */
    public final g f16079Z;

    public h(TextView textView) {
        super(11);
        this.f16079Z = new g(textView);
    }

    @Override // P5.c
    public final InputFilter[] D(InputFilter[] inputFilterArr) {
        if (!l.c()) {
            return inputFilterArr;
        }
        return this.f16079Z.D(inputFilterArr);
    }

    @Override // P5.c
    public final void K(boolean z10) {
        if (!l.c()) {
            return;
        }
        this.f16079Z.K(z10);
    }

    @Override // P5.c
    public final void N(boolean z10) {
        boolean z11 = !l.c();
        g gVar = this.f16079Z;
        if (z11) {
            gVar.f16078i0 = z10;
        } else {
            gVar.N(z10);
        }
    }
}
