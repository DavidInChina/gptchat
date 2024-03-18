package com.google.android.material.appbar;

import A7.b;
import D1.H;
import D1.N;
import D1.Z;
import G0.C0588q;
import O7.a;
import a8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.openai.chatgpt.R;
import f8.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k8.AbstractC4203a;
import p.o;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: d1  reason: collision with root package name */
    public static final ImageView.ScaleType[] f26998d1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: Y0  reason: collision with root package name */
    public Integer f26999Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f27000Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f27001a1;
    public ImageView.ScaleType b1;

    /* renamed from: c1  reason: collision with root package name */
    public Boolean f27002c1;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.toolbarStyle, 2131952778), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray e10 = k.e(context2, attributeSet, a.f13420s, R.attr.toolbarStyle, 2131952778, new int[0]);
        if (e10.hasValue(2)) {
            setNavigationIconTint(e10.getColor(2, -1));
        }
        this.f27000Z0 = e10.getBoolean(4, false);
        this.f27001a1 = e10.getBoolean(3, false);
        int i10 = e10.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f26998d1;
            if (i10 < scaleTypeArr.length) {
                this.b1 = scaleTypeArr[i10];
            }
        }
        if (e10.hasValue(0)) {
            this.f27002c1 = Boolean.valueOf(e10.getBoolean(0, false));
        }
        e10.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else {
            colorStateList = b.M0(background);
        }
        if (colorStateList != null) {
            g gVar = new g();
            gVar.k(colorStateList);
            gVar.i(context2);
            WeakHashMap weakHashMap = Z.f3247a;
            gVar.j(N.i(this));
            H.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.b1;
    }

    public Integer getNavigationIconTint() {
        return this.f26999Y0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof o;
        if (z10) {
            ((o) menu).w();
        }
        super.n(i10);
        if (z10) {
            ((o) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            M3.H.s0(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f27000Z0 || this.f27001a1) {
            ArrayList d10 = k.d(this, getTitle());
            boolean isEmpty = d10.isEmpty();
            C0588q c0588q = k.f24013c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d10, c0588q);
            }
            ArrayList d11 = k.d(this, getSubtitle());
            if (d11.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d11, c0588q);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f27000Z0 && textView != null) {
                    w(textView, pair);
                }
                if (this.f27001a1 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f27002c1;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.b1;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).j(f6);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f27002c1;
        if (bool == null || bool.booleanValue() != z10) {
            this.f27002c1 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.b1 != scaleType) {
            this.b1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f26999Y0 != null) {
            drawable = drawable.mutate();
            AbstractC5656b.g(drawable, this.f26999Y0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f26999Y0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f27001a1 != z10) {
            this.f27001a1 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f27000Z0 != z10) {
            this.f27000Z0 = z10;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
