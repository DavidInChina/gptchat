package w3;

import D1.C0343c;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class a0 extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final RecyclerView f47824i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Z f47825j0;

    public a0(RecyclerView recyclerView) {
        this.f47824i0 = recyclerView;
        Z z10 = this.f47825j0;
        if (z10 != null) {
            this.f47825j0 = z10;
        } else {
            this.f47825j0 = new Z(this);
        }
    }

    @Override // D1.C0343c
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f47824i0.K()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().R(accessibilityEvent);
            }
        }
    }

    @Override // D1.C0343c
    public final void e(View view, E1.p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f47824i0;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            K layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f47753b;
            i3.g gVar = recyclerView2.f25455i0;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f47753b.canScrollHorizontally(-1)) {
                pVar.a(8192);
                pVar.m(true);
            }
            if (layoutManager.f47753b.canScrollVertically(1) || layoutManager.f47753b.canScrollHorizontally(1)) {
                pVar.a(4096);
                pVar.m(true);
            }
            V v10 = recyclerView2.g1;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.H(gVar, v10), layoutManager.x(gVar, v10), false, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[ADDED_TO_REGION] */
    @Override // D1.C0343c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(View view, int i10, Bundle bundle) {
        int i11;
        int i12;
        if (super.h(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f47824i0;
        if (recyclerView.K() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        K layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f47753b;
        i3.g gVar = recyclerView2.f25455i0;
        if (i10 != 4096) {
            if (i10 != 8192) {
                i11 = 0;
                i12 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    i12 = -((layoutManager.f47766o - layoutManager.E()) - layoutManager.B());
                } else {
                    i12 = 0;
                }
                if (layoutManager.f47753b.canScrollHorizontally(-1)) {
                    i11 = -((layoutManager.f47765n - layoutManager.C()) - layoutManager.D());
                }
                i11 = 0;
            }
            if (i12 != 0 && i11 == 0) {
                return false;
            }
            layoutManager.f47753b.b0(i11, i12, true);
            return true;
        }
        if (recyclerView2.canScrollVertically(1)) {
            i12 = (layoutManager.f47766o - layoutManager.E()) - layoutManager.B();
        } else {
            i12 = 0;
        }
        if (layoutManager.f47753b.canScrollHorizontally(1)) {
            i11 = (layoutManager.f47765n - layoutManager.C()) - layoutManager.D();
            if (i12 != 0) {
            }
            layoutManager.f47753b.b0(i11, i12, true);
            return true;
        }
        i11 = 0;
        if (i12 != 0) {
        }
        layoutManager.f47753b.b0(i11, i12, true);
        return true;
    }
}
