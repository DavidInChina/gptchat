package q;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class L0 implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N0 f43311a;

    public L0(N0 n02) {
        this.f43311a = n02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            N0 n02 = this.f43311a;
            if (n02.f43320E0.getInputMethodMode() != 2 && n02.f43320E0.getContentView() != null) {
                Handler handler = n02.f43316A0;
                G0 g02 = n02.f43338w0;
                handler.removeCallbacks(g02);
                g02.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }
}
