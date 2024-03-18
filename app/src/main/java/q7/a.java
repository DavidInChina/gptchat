package Q7;

import D1.C0343c;
import E1.o;
import E1.p;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes2.dex */
public final class a extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f14453i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f14454j0;

    public /* synthetic */ a(int i10, Object obj) {
        this.f14453i0 = i10;
        this.f14454j0 = obj;
    }

    @Override // D1.C0343c
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f14453i0) {
            case 2:
                super.d(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f14454j0).f27212k0);
                return;
            default:
                super.d(view, accessibilityEvent);
                return;
        }
    }

    @Override // D1.C0343c
    public final void e(View view, p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        int i10 = this.f14453i0;
        Object obj = this.f14454j0;
        switch (i10) {
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i11 = MaterialButtonToggleGroup.f27087r0;
                materialButtonToggleGroup.getClass();
                int i12 = -1;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i13) == view) {
                                i12 = i14;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                                    i14++;
                                }
                                i13++;
                            }
                        }
                    }
                }
                pVar.k(o.a(0, 1, i12, 1, ((MaterialButton) view).f27084v0));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f27213l0);
                accessibilityNodeInfo.setChecked(checkableImageButton.f27212k0);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).f27218E0);
                return;
        }
    }
}
