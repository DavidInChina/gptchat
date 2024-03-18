package S7;

import Gi.e;
import android.view.View;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends N {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f16194g;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f16194g = bottomSheetBehavior;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final boolean C0(View view, int i10) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.f16194g;
        int i11 = bottomSheetBehavior.f27030L;
        if (i11 == 1 || bottomSheetBehavior.f27042a0) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.f27039Y == i10) {
            WeakReference weakReference = bottomSheetBehavior.f27036V;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f27035U;
        if (weakReference2 == null || weakReference2.get() != view) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int c0() {
        BottomSheetBehavior bottomSheetBehavior = this.f16194g;
        if (bottomSheetBehavior.f27027I) {
            return bottomSheetBehavior.T;
        }
        return bottomSheetBehavior.f27025G;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int h(View view, int i10) {
        return view.getLeft();
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void h0(int i10) {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f16194g;
            if (bottomSheetBehavior.f27029K) {
                bottomSheetBehavior.C(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int i(View view, int i10) {
        return e.q(i10, this.f16194g.x(), c0());
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void i0(View view, int i10, int i11) {
        this.f16194g.u(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f27023E)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (java.lang.Math.abs(r7 - r4.f27023E) < java.lang.Math.abs(r7 - r4.f27025G)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        if (java.lang.Math.abs(r7 - r4.f27022D) < java.lang.Math.abs(r7 - r4.f27025G)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
        if (r7 < java.lang.Math.abs(r7 - r4.f27025G)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.f27025G)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r7 > r4.f27023E) goto L43;
     */
    @Override // com.google.android.gms.internal.play_billing.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(View view, float f6, float f10) {
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        int i11 = 6;
        BottomSheetBehavior bottomSheetBehavior = this.f16194g;
        if (i10 < 0) {
            if (!bottomSheetBehavior.f27043b) {
                int top = view.getTop();
                System.currentTimeMillis();
            }
            i11 = 3;
        } else if (bottomSheetBehavior.f27027I && bottomSheetBehavior.D(view, f10)) {
            if (Math.abs(f6) >= Math.abs(f10) || f10 <= bottomSheetBehavior.f27047d) {
                if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.T) / 2) {
                    if (!bottomSheetBehavior.f27043b) {
                    }
                    i11 = 3;
                }
            }
            i11 = 5;
        } else if (f10 != 0.0f && Math.abs(f6) <= Math.abs(f10)) {
            if (!bottomSheetBehavior.f27043b) {
                int top2 = view.getTop();
            }
            i11 = 4;
        } else {
            int top3 = view.getTop();
            if (!bottomSheetBehavior.f27043b) {
                int i12 = bottomSheetBehavior.f27023E;
                if (top3 < i12) {
                }
            }
        }
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.E(view, i11, true);
    }
}
