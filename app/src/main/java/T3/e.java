package T3;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.k;
import io.sentry.android.core.AbstractC3612c;
import v7.s;
import w3.K;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16906Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f16907Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f16908h0;

    public /* synthetic */ e(Object obj, int i10, int i11) {
        this.f16906Y = i11;
        this.f16908h0 = obj;
        this.f16907Z = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16906Y;
        int i11 = this.f16907Z;
        Object obj = this.f16908h0;
        switch (i10) {
            case 0:
                ((SystemForegroundService) obj).f25547j0.cancel(i11);
                return;
            case 1:
                ((s) obj).f(i11);
                return;
            default:
                RecyclerView recyclerView = ((k) obj).f27152h1;
                if (!recyclerView.f25423B0) {
                    K k10 = recyclerView.f25475s0;
                    if (k10 == null) {
                        AbstractC3612c.c("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        k10.v0(recyclerView, i11);
                        return;
                    }
                }
                return;
        }
    }
}
