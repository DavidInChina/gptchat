package r1;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p2.C5052e;
import y2.C6516c;
import y2.C6518e;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44300Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f44301Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f44302h0;

    public /* synthetic */ m(Object obj, int i10, int i11) {
        this.f44300Y = i11;
        this.f44302h0 = obj;
        this.f44301Z = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f44300Y;
        int i11 = this.f44301Z;
        Object obj = this.f44302h0;
        switch (i10) {
            case 0:
                ((AbstractC5355b) obj).e(i11);
                return;
            case 1:
                C6518e c6518e = ((C6516c) obj).f50522b;
                c6518e.getClass();
                boolean z10 = true;
                if (i11 != -3 && i11 != -2) {
                    if (i11 != -1) {
                        if (i11 != 1) {
                            android.gov.nist.core.a.v("Unknown focus change type: ", i11, "AudioFocusManager");
                            return;
                        }
                        c6518e.d(1);
                        c6518e.b(1);
                        return;
                    }
                    c6518e.b(-1);
                    c6518e.a();
                    return;
                }
                if (i11 != -2) {
                    C5052e c5052e = c6518e.f50558d;
                    if (c5052e == null || c5052e.f42011Y != 1) {
                        z10 = false;
                    }
                    if (!z10) {
                        c6518e.d(3);
                        return;
                    }
                }
                c6518e.b(0);
                c6518e.d(2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f27243p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i11, false);
                    return;
                }
                return;
        }
    }
}
