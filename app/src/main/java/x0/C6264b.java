package x0;

import M3.H;
import android.view.View;

/* renamed from: x0.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6264b implements AbstractC6263a {

    /* renamed from: a  reason: collision with root package name */
    public final View f48624a;

    public C6264b(View view) {
        this.f48624a = view;
    }

    public final void a(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.f48624a;
        if (z10) {
            view.performHapticFeedback(0);
        } else if (i10 == H.f11535i) {
            view.performHapticFeedback(9);
        }
    }
}
