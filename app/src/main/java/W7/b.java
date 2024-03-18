package W7;

import a8.h;
import a8.i;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class b extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f20754h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f20755i;

    public /* synthetic */ b(int i10, Object obj) {
        this.f20754h = i10;
        this.f20755i = obj;
    }

    @Override // P4.a
    public final void r0(int i10) {
        switch (this.f20754h) {
            case 0:
                return;
            default:
                i iVar = (i) this.f20755i;
                iVar.f24008d = true;
                h hVar = (h) iVar.f24009e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.v();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // P4.a
    public final void s0(Typeface typeface, boolean z10) {
        CharSequence charSequence;
        int i10 = this.f20754h;
        Object obj = this.f20755i;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                f fVar = chip.f27106l0;
                if (fVar.f20775I1) {
                    charSequence = fVar.f20776J0;
                } else {
                    charSequence = chip.getText();
                }
                chip.setText(charSequence);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z10) {
                    i iVar = (i) obj;
                    iVar.f24008d = true;
                    h hVar = (h) iVar.f24009e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.v();
                        fVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
