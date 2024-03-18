package k1;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class s extends c {

    /* renamed from: n0  reason: collision with root package name */
    public boolean f36954n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f36955o0;

    @Override // k1.c
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f36946b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f36954n0 = true;
                } else if (index == 13) {
                    this.f36955o0 = true;
                }
            }
        }
    }

    public abstract void h(i1.g gVar, int i10, int i11);

    @Override // k1.c, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f36954n0 || this.f36955o0) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f36775i0; i10++) {
                View view = (View) constraintLayout.f24870h0.get(this.f36774h0[i10]);
                if (view != null) {
                    if (this.f36954n0) {
                        view.setVisibility(visibility);
                    }
                    if (this.f36955o0 && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        c();
    }
}
