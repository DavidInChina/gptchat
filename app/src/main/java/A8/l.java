package a8;

import D1.AbstractC0374u;
import D1.H0;
import D1.J0;
import Df.H;
import Z.C1745x0;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import s1.C5523e;
import s3.C5547J;

/* loaded from: classes2.dex */
public final class l implements AbstractC0374u {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C1745x0 f24014Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5547J f24015Z;

    public l(C1745x0 c1745x0, C5547J c5547j) {
        this.f24014Y = c1745x0;
        this.f24015Z = c5547j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r6 != false) goto L34;
     */
    @Override // D1.AbstractC0374u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J0 e(View view, J0 j02) {
        boolean z10;
        int i10;
        C5547J c5547j = this.f24015Z;
        int i11 = c5547j.f45241a;
        int i12 = c5547j.f45243c;
        int i13 = c5547j.f45244d;
        C1745x0 c1745x0 = this.f24014Y;
        c1745x0.getClass();
        H0 h02 = j02.f3232a;
        C5523e f6 = h02.f(7);
        C5523e f10 = h02.f(32);
        ((BottomSheetBehavior) c1745x0.f22768b).f27067w = f6.f45107b;
        boolean b02 = H.b0(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c1745x0.f22768b;
        if (bottomSheetBehavior.f27059o) {
            bottomSheetBehavior.f27066v = j02.a();
            paddingBottom = ((BottomSheetBehavior) c1745x0.f22768b).f27066v + i13;
        }
        BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) c1745x0.f22768b;
        boolean z11 = bottomSheetBehavior2.f27060p;
        int i14 = f6.f45106a;
        if (z11) {
            if (b02) {
                i10 = i12;
            } else {
                i10 = i11;
            }
            paddingLeft = i10 + i14;
        }
        boolean z12 = bottomSheetBehavior2.f27061q;
        int i15 = f6.f45108c;
        if (z12) {
            if (!b02) {
                i11 = i12;
            }
            paddingRight = i11 + i15;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = (BottomSheetBehavior) c1745x0.f22768b;
        boolean z13 = true;
        if (bottomSheetBehavior3.f27063s && marginLayoutParams.leftMargin != i14) {
            marginLayoutParams.leftMargin = i14;
            z10 = true;
        } else {
            z10 = false;
        }
        if (bottomSheetBehavior3.f27064t && marginLayoutParams.rightMargin != i15) {
            marginLayoutParams.rightMargin = i15;
        } else {
            z13 = z10;
        }
        if (bottomSheetBehavior3.f27065u) {
            int i16 = marginLayoutParams.topMargin;
            int i17 = f6.f45107b;
            if (i16 != i17) {
                marginLayoutParams.topMargin = i17;
                view.setLayoutParams(marginLayoutParams);
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                boolean z14 = c1745x0.f22767a;
                if (z14) {
                    ((BottomSheetBehavior) c1745x0.f22768b).f27057m = f10.f45109d;
                }
                BottomSheetBehavior bottomSheetBehavior4 = (BottomSheetBehavior) c1745x0.f22768b;
                if (bottomSheetBehavior4.f27059o || z14) {
                    bottomSheetBehavior4.I();
                }
                return j02;
            }
        }
    }
}
