package L1;

import D1.H;
import D1.Z;
import E1.p;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class a extends J0.a {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ b f10476Z;

    public a(b bVar) {
        this.f10476Z = bVar;
    }

    @Override // J0.a
    public final p E(int i10) {
        return new p(AccessibilityNodeInfo.obtain(this.f10476Z.o(i10).f4118a));
    }

    @Override // J0.a
    public final p L(int i10) {
        int i11;
        b bVar = this.f10476Z;
        if (i10 == 2) {
            i11 = bVar.f10487p0;
        } else {
            i11 = bVar.f10488q0;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return E(i11);
    }

    @Override // J0.a
    public final boolean O(int i10, int i11, Bundle bundle) {
        int i12;
        b bVar = this.f10476Z;
        View view = bVar.f10485n0;
        if (i10 != -1) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    boolean z11 = false;
                    if (i11 != 64) {
                        if (i11 != 128) {
                            W7.d dVar = (W7.d) bVar;
                            if (i11 != 16) {
                                return false;
                            }
                            Chip chip = dVar.f20757v0;
                            if (i10 == 0) {
                                return chip.performClick();
                            }
                            if (i10 != 1) {
                                return false;
                            }
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f27109o0;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                z11 = true;
                            }
                            if (chip.f27120z0) {
                                chip.f27119y0.r(1, 1);
                                return z11;
                            }
                            return z11;
                        }
                        if (bVar.f10487p0 == i10) {
                            bVar.f10487p0 = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.r(i10, 65536);
                            return z10;
                        }
                        z10 = false;
                        return z10;
                    }
                    AccessibilityManager accessibilityManager = bVar.f10484m0;
                    if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f10487p0) != i10) {
                        if (i12 != Integer.MIN_VALUE) {
                            bVar.f10487p0 = Integer.MIN_VALUE;
                            bVar.f10485n0.invalidate();
                            bVar.r(i12, 65536);
                        }
                        bVar.f10487p0 = i10;
                        view.invalidate();
                        bVar.r(i10, 32768);
                        return z10;
                    }
                    z10 = false;
                    return z10;
                }
                return bVar.k(i10);
            }
            return bVar.q(i10);
        }
        WeakHashMap weakHashMap = Z.f3247a;
        return H.j(view, i11, bundle);
    }
}
