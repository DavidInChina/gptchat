package q;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class G0 implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f43291Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N0 f43292Z;

    public /* synthetic */ G0(N0 n02, int i10) {
        this.f43291Y = i10;
        this.f43292Z = n02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43291Y;
        N0 n02 = this.f43292Z;
        switch (i10) {
            case 1:
                A0 a02 = n02.f43323h0;
                if (a02 != null) {
                    a02.setListSelectionHidden(true);
                    a02.requestLayout();
                    return;
                }
                return;
            default:
                A0 a03 = n02.f43323h0;
                if (a03 != null) {
                    WeakHashMap weakHashMap = D1.Z.f3247a;
                    if (D1.K.b(a03) && n02.f43323h0.getCount() > n02.f43323h0.getChildCount() && n02.f43323h0.getChildCount() <= n02.f43333r0) {
                        n02.f43320E0.setInputMethodMode(2);
                        n02.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
