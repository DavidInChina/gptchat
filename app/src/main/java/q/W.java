package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.openai.chatgpt.R;
import l.AbstractC4308a;
import p.ViewTreeObserver$OnGlobalLayoutListenerC5029e;

/* loaded from: classes.dex */
public final class W extends Spinner {

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f43363p0 = {16843505};

    /* renamed from: i0  reason: collision with root package name */
    public final Context f43365i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C5218k f43366j0;

    /* renamed from: k0  reason: collision with root package name */
    public SpinnerAdapter f43367k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f43368l0;

    /* renamed from: m0  reason: collision with root package name */
    public final V f43369m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f43370n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Rect f43371o0 = new Rect();

    /* renamed from: h0  reason: collision with root package name */
    public final r f43364h0 = new r(this);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        Throwable th2;
        Exception e10;
        TypedArray typedArray;
        p1.a(this, getContext());
        int[] iArr = AbstractC4308a.f37685v;
        U3.u I10 = U3.u.I(context, attributeSet, iArr, R.attr.spinnerStyle, 0);
        int z10 = I10.z(4, 0);
        if (z10 != 0) {
            this.f43365i0 = new androidx.appcompat.view.f(context, z10);
        } else {
            this.f43365i0 = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f43363p0, R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i10 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e10);
                }
            } catch (Throwable th3) {
                th2 = th3;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th2;
            }
        } catch (Exception e12) {
            e10 = e12;
            typedArray = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (typedArray2 != null) {
            }
            throw th2;
        }
        typedArray.recycle();
        if (i10 != 0) {
            if (i10 == 1) {
                T t10 = new T(this, this.f43365i0, attributeSet);
                U3.u I11 = U3.u.I(this.f43365i0, attributeSet, iArr, R.attr.spinnerStyle, 0);
                this.f43370n0 = ((TypedArray) I11.f17493h0).getLayoutDimension(3, -2);
                t10.j(I11.t(1));
                t10.f43354I0 = I10.A(2);
                I11.N();
                this.f43369m0 = t10;
                this.f43366j0 = new C5218k(this, this, t10, 1);
            }
        } else {
            P p10 = new P(this);
            this.f43369m0 = p10;
            p10.f43344h0 = I10.A(2);
        }
        CharSequence[] textArray = ((TypedArray) I10.f17493h0).getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        I10.N();
        this.f43368l0 = true;
        SpinnerAdapter spinnerAdapter = this.f43367k0;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f43367k0 = null;
        }
        this.f43364h0.e(attributeSet, R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f43371o0;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f43364h0;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        V v10 = this.f43369m0;
        if (v10 != null) {
            return v10.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        V v10 = this.f43369m0;
        if (v10 != null) {
            return v10.n();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f43369m0 != null) {
            return this.f43370n0;
        }
        return super.getDropDownWidth();
    }

    public final V getInternalPopup() {
        return this.f43369m0;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        V v10 = this.f43369m0;
        if (v10 != null) {
            return v10.e();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f43365i0;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        V v10 = this.f43369m0;
        if (v10 != null) {
            return v10.d();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f43364h0;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f43364h0;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V v10 = this.f43369m0;
        if (v10 != null && v10.a()) {
            v10.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f43369m0 != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        U u10 = (U) parcelable;
        super.onRestoreInstanceState(u10.getSuperState());
        if (u10.f43361Y && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC5029e(2, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, q.U] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        V v10 = this.f43369m0;
        if (v10 != null && v10.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseSavedState.f43361Y = z10;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C5218k c5218k = this.f43366j0;
        if (c5218k != null && c5218k.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        V v10 = this.f43369m0;
        if (v10 != null) {
            if (!v10.a()) {
                this.f43369m0.m(N.b(this), N.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f43364h0;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f43364h0;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        V v10 = this.f43369m0;
        if (v10 != null) {
            v10.l(i10);
            v10.c(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        V v10 = this.f43369m0;
        if (v10 != null) {
            v10.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f43369m0 != null) {
            this.f43370n0 = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        V v10 = this.f43369m0;
        if (v10 != null) {
            v10.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(kotlin.jvm.internal.m.u(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        V v10 = this.f43369m0;
        if (v10 != null) {
            v10.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f43364h0;
        if (rVar != null) {
            rVar.j(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f43364h0;
        if (rVar != null) {
            rVar.k(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [q.Q, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f43368l0) {
            this.f43367k0 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        V v10 = this.f43369m0;
        if (v10 == 0) {
            return;
        }
        Context context = this.f43365i0;
        if (context == null) {
            context = getContext();
        }
        Resources.Theme theme = context.getTheme();
        ?? obj = new Object();
        obj.f43346Y = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            obj.f43347Z = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            O.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }
        v10.o(obj);
    }
}
