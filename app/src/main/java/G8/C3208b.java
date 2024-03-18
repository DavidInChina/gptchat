package g8;

import Gi.e;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: g8.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3208b extends N {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f31307g;

    public C3208b(SideSheetBehavior sideSheetBehavior) {
        this.f31307g = sideSheetBehavior;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final boolean C0(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f31307g;
        if (sideSheetBehavior.f27235h == 1 || (weakReference = sideSheetBehavior.f27243p) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int b0(View view) {
        SideSheetBehavior sideSheetBehavior = this.f31307g;
        return sideSheetBehavior.f27239l + sideSheetBehavior.f27242o;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int h(View view, int i10) {
        int i11;
        int i12;
        SideSheetBehavior sideSheetBehavior = this.f31307g;
        C3207a c3207a = sideSheetBehavior.f27228a;
        switch (c3207a.f31305Y) {
            case 0:
                i11 = -c3207a.f31306Z.f27239l;
                break;
            default:
                i11 = c3207a.s();
                break;
        }
        C3207a c3207a2 = sideSheetBehavior.f27228a;
        int i13 = c3207a2.f31305Y;
        SideSheetBehavior sideSheetBehavior2 = c3207a2.f31306Z;
        switch (i13) {
            case 0:
                i12 = sideSheetBehavior2.f27242o;
                break;
            default:
                i12 = sideSheetBehavior2.f27240m;
                break;
        }
        return e.q(i10, i11, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void h0(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f31307g;
            if (sideSheetBehavior.f27234g) {
                sideSheetBehavior.r(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final int i(View view, int i10) {
        return view.getTop();
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void i0(View view, int i10, int i11) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f31307g;
        WeakReference weakReference = sideSheetBehavior.f27244q;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            C3207a c3207a = sideSheetBehavior.f27228a;
            int left = view.getLeft();
            int right = view.getRight();
            int i12 = c3207a.f31305Y;
            SideSheetBehavior sideSheetBehavior2 = c3207a.f31306Z;
            switch (i12) {
                case 0:
                    if (left <= sideSheetBehavior2.f27240m) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i13 = sideSheetBehavior2.f27240m;
                    if (left <= i13) {
                        marginLayoutParams.rightMargin = i13 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f27248u;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.f27228a.r(i10);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                AbstractC2469q0.p(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (java.lang.Math.abs(r6 - r0.f27228a.s()) < java.lang.Math.abs(r6 - r0.f27228a.t())) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r0.f27228a.v(r5) == false) goto L17;
     */
    @Override // com.google.android.gms.internal.play_billing.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(View view, float f6, float f10) {
        SideSheetBehavior sideSheetBehavior = this.f31307g;
        int i10 = 3;
        if (!sideSheetBehavior.f27228a.u(f6)) {
            if (sideSheetBehavior.f27228a.x(view, f6)) {
                if (!sideSheetBehavior.f27228a.w(f6, f10)) {
                }
                i10 = 5;
            } else {
                if (f6 == 0.0f || Math.abs(f6) <= Math.abs(f10)) {
                    int left = view.getLeft();
                }
                i10 = 5;
            }
        }
        sideSheetBehavior.t(view, i10, true);
    }
}
