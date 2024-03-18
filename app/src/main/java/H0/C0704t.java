package H0;

import D1.C0343c;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: H0.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0704t extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0714y f7039i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.node.a f7040j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C0714y f7041k0;

    public C0704t(C0714y c0714y, androidx.compose.ui.node.a aVar, C0714y c0714y2) {
        this.f7039i0 = c0714y;
        this.f7040j0 = aVar;
        this.f7041k0 = c0714y2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r0.intValue() == r7.getSemanticsOwner().a().f10424g) goto L12;
     */
    @Override // D1.C0343c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, E1.p pVar) {
        Integer num;
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        C0714y c0714y = this.f7039i0;
        if (c0714y.f7127t0.z()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C0702s c0702s = C0702s.f7023Z;
        androidx.compose.ui.node.a aVar = this.f7040j0;
        androidx.compose.ui.node.a u02 = R4.b.u0(aVar, c0702s);
        if (u02 != null) {
            num = Integer.valueOf(u02.f24843Z);
        } else {
            num = null;
        }
        if (num != null) {
        }
        num = -1;
        int intValue = num.intValue();
        pVar.f4119b = intValue;
        C0714y c0714y2 = this.f7041k0;
        accessibilityNodeInfo.setParent(c0714y2, intValue);
        int i10 = aVar.f24843Z;
        O o10 = c0714y.f7127t0;
        Integer num2 = (Integer) o10.f6806J0.get(Integer.valueOf(i10));
        if (num2 != null) {
            int intValue2 = num2.intValue();
            c1.l w10 = Q.w(c0714y.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (w10 != null) {
                accessibilityNodeInfo.setTraversalBefore(w10);
            } else {
                accessibilityNodeInfo.setTraversalBefore(c0714y2, intValue2);
            }
            C0714y.a(c0714y, i10, accessibilityNodeInfo, o10.f6808L0);
        }
        Integer num3 = (Integer) o10.f6807K0.get(Integer.valueOf(i10));
        if (num3 != null) {
            int intValue3 = num3.intValue();
            c1.l w11 = Q.w(c0714y.getAndroidViewsHandler$ui_release(), num3.intValue());
            if (w11 != null) {
                accessibilityNodeInfo.setTraversalAfter(w11);
            } else {
                accessibilityNodeInfo.setTraversalAfter(c0714y2, intValue3);
            }
            C0714y.a(c0714y, i10, accessibilityNodeInfo, o10.f6809M0);
        }
    }
}
