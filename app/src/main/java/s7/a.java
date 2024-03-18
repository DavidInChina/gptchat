package S7;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import f8.f;
import f8.g;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16193b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f16192a = i10;
        this.f16193b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f16192a;
        Object obj = this.f16193b;
        switch (i10) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = ((BottomSheetBehavior) obj).f27053i;
                if (gVar != null) {
                    f fVar = gVar.f29688Y;
                    if (fVar.f29674j != floatValue) {
                        fVar.f29674j = floatValue;
                        gVar.f29692j0 = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).f27328y1.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
