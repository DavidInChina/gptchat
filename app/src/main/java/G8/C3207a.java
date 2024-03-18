package g8;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import n.AbstractC4694e;

/* renamed from: g8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3207a extends AbstractC4694e {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31305Y;

    /* renamed from: Z  reason: collision with root package name */
    public final SideSheetBehavior f31306Z;

    public /* synthetic */ C3207a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f31305Y = i10;
        this.f31306Z = sideSheetBehavior;
    }

    public final float r(int i10) {
        switch (this.f31305Y) {
            case 0:
                float t10 = t();
                return (i10 - t10) / (s() - t10);
            default:
                float t11 = t();
                return (t11 - i10) / (t11 - s());
        }
    }

    public final int s() {
        int i10 = this.f31305Y;
        SideSheetBehavior sideSheetBehavior = this.f31306Z;
        switch (i10) {
            case 0:
                return Math.max(0, sideSheetBehavior.f27241n + sideSheetBehavior.f27242o);
            default:
                return Math.max(0, (t() - sideSheetBehavior.f27239l) - sideSheetBehavior.f27242o);
        }
    }

    public final int t() {
        int i10 = this.f31305Y;
        SideSheetBehavior sideSheetBehavior = this.f31306Z;
        switch (i10) {
            case 0:
                return (-sideSheetBehavior.f27239l) - sideSheetBehavior.f27242o;
            default:
                return sideSheetBehavior.f27240m;
        }
    }

    public final boolean u(float f6) {
        switch (this.f31305Y) {
            case 0:
                if (f6 <= 0.0f) {
                    return false;
                }
                return true;
            default:
                if (f6 >= 0.0f) {
                    return false;
                }
                return true;
        }
    }

    public final boolean v(View view) {
        switch (this.f31305Y) {
            case 0:
                if (view.getRight() >= (s() - t()) / 2) {
                    return false;
                }
                return true;
            default:
                if (view.getLeft() <= (s() + t()) / 2) {
                    return false;
                }
                return true;
        }
    }

    public final boolean w(float f6, float f10) {
        int i10 = this.f31305Y;
        SideSheetBehavior sideSheetBehavior = this.f31306Z;
        switch (i10) {
            case 0:
                if (Math.abs(f6) <= Math.abs(f10)) {
                    return false;
                }
                float abs = Math.abs(f6);
                sideSheetBehavior.getClass();
                if (abs <= 500) {
                    return false;
                }
                return true;
            default:
                if (Math.abs(f6) <= Math.abs(f10)) {
                    return false;
                }
                float abs2 = Math.abs(f6);
                sideSheetBehavior.getClass();
                if (abs2 <= 500) {
                    return false;
                }
                return true;
        }
    }

    public final boolean x(View view, float f6) {
        int i10 = this.f31305Y;
        SideSheetBehavior sideSheetBehavior = this.f31306Z;
        switch (i10) {
            case 0:
                if (Math.abs((f6 * sideSheetBehavior.f27238k) + view.getLeft()) <= 0.5f) {
                    return false;
                }
                return true;
            default:
                if (Math.abs((f6 * sideSheetBehavior.f27238k) + view.getRight()) <= 0.5f) {
                    return false;
                }
                return true;
        }
    }
}
