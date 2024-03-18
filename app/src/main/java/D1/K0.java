package D1;

import a1.C1915c;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class K0 extends P5.c {

    /* renamed from: Z  reason: collision with root package name */
    public final Window f3233Z;

    /* renamed from: h0  reason: collision with root package name */
    public final F4.a f3234h0;

    public K0(Window window, F4.a aVar) {
        super(3);
        this.f3233Z = window;
        this.f3234h0 = aVar;
    }

    @Override // P5.c
    public final void P() {
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((8 & i10) != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 8) {
                            ((C1915c) this.f3234h0.f5033Z).w();
                        }
                    } else {
                        Q(2);
                    }
                } else {
                    Q(4);
                    this.f3233Z.clearFlags(1024);
                }
            }
        }
    }

    public final void Q(int i10) {
        View decorView = this.f3233Z.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}
