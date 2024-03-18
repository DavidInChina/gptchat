package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import c1.AbstractC2279d;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l.AbstractC4308a;

/* renamed from: q.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5207f0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f43415a;

    /* renamed from: b  reason: collision with root package name */
    public r1 f43416b;

    /* renamed from: c  reason: collision with root package name */
    public r1 f43417c;

    /* renamed from: d  reason: collision with root package name */
    public r1 f43418d;

    /* renamed from: e  reason: collision with root package name */
    public r1 f43419e;

    /* renamed from: f  reason: collision with root package name */
    public r1 f43420f;

    /* renamed from: g  reason: collision with root package name */
    public r1 f43421g;

    /* renamed from: h  reason: collision with root package name */
    public r1 f43422h;

    /* renamed from: i  reason: collision with root package name */
    public final C5229p0 f43423i;

    /* renamed from: j  reason: collision with root package name */
    public int f43424j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f43425k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f43426l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f43427m;

    public C5207f0(TextView textView) {
        this.f43415a = textView;
        this.f43423i = new C5229p0(textView);
    }

    public static r1 c(Context context, C5243x c5243x, int i10) {
        ColorStateList i11;
        synchronized (c5243x) {
            i11 = c5243x.f43586a.i(context, i10);
        }
        if (i11 != null) {
            r1 r1Var = new r1(0);
            r1Var.f43545c = true;
            r1Var.f43546d = i11;
            return r1Var;
        }
        return null;
    }

    public final void a(Drawable drawable, r1 r1Var) {
        if (drawable != null && r1Var != null) {
            C5243x.e(drawable, r1Var, this.f43415a.getDrawableState());
        }
    }

    public final void b() {
        r1 r1Var = this.f43416b;
        TextView textView = this.f43415a;
        if (r1Var != null || this.f43417c != null || this.f43418d != null || this.f43419e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f43416b);
            a(compoundDrawables[1], this.f43417c);
            a(compoundDrawables[2], this.f43418d);
            a(compoundDrawables[3], this.f43419e);
        }
        if (this.f43420f != null || this.f43421g != null) {
            Drawable[] a5 = AbstractC5192a0.a(textView);
            a(a5[0], this.f43420f);
            a(a5[2], this.f43421g);
        }
    }

    public final ColorStateList d() {
        r1 r1Var = this.f43422h;
        if (r1Var != null) {
            return (ColorStateList) r1Var.f43546d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        r1 r1Var = this.f43422h;
        if (r1Var != null) {
            return (PorterDuff.Mode) r1Var.f43547e;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i10) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        float f6;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int fontMetricsInt;
        int i11;
        int resourceId;
        TextView textView = this.f43415a;
        Context context = textView.getContext();
        C5243x a5 = C5243x.a();
        int[] iArr = AbstractC4308a.f37671h;
        U3.u I10 = U3.u.I(context, attributeSet, iArr, i10, 0);
        D1.Z.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) I10.f17493h0, i10);
        int z12 = I10.z(0, -1);
        if (I10.E(3)) {
            this.f43416b = c(context, a5, I10.z(3, 0));
        }
        if (I10.E(1)) {
            this.f43417c = c(context, a5, I10.z(1, 0));
        }
        if (I10.E(4)) {
            this.f43418d = c(context, a5, I10.z(4, 0));
        }
        if (I10.E(2)) {
            this.f43419e = c(context, a5, I10.z(2, 0));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (I10.E(5)) {
            this.f43420f = c(context, a5, I10.z(5, 0));
        }
        if (I10.E(6)) {
            this.f43421g = c(context, a5, I10.z(6, 0));
        }
        I10.N();
        boolean z13 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC4308a.f37686w;
        if (z12 != -1) {
            U3.u uVar = new U3.u(context, context.obtainStyledAttributes(z12, iArr2));
            if (!z13 && uVar.E(14)) {
                z11 = uVar.o(14, false);
                z10 = true;
            } else {
                z11 = false;
                z10 = false;
            }
            m(context, uVar);
            if (uVar.E(15)) {
                str2 = uVar.A(15);
            } else {
                str2 = null;
            }
            if (i12 >= 26 && uVar.E(13)) {
                str = uVar.A(13);
            } else {
                str = null;
            }
            uVar.N();
        } else {
            z11 = false;
            z10 = false;
            str2 = null;
            str = null;
        }
        U3.u uVar2 = new U3.u(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z13 && uVar2.E(14)) {
            z11 = uVar2.o(14, false);
            z10 = true;
        }
        if (uVar2.E(15)) {
            str2 = uVar2.A(15);
        }
        String str3 = str2;
        if (i12 >= 26 && uVar2.E(13)) {
            str = uVar2.A(13);
        }
        String str4 = str;
        if (i12 >= 28 && uVar2.E(0) && uVar2.s(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, uVar2);
        uVar2.N();
        if (!z13 && z10) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f43426l;
        if (typeface != null) {
            if (this.f43425k == -1) {
                textView.setTypeface(typeface, this.f43424j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            AbstractC5201d0.d(textView, str4);
        }
        if (str3 != null) {
            if (i12 >= 24) {
                AbstractC5198c0.b(textView, AbstractC5198c0.a(str3));
            } else {
                AbstractC5192a0.c(textView, AbstractC5195b0.a(str3.split(Separators.COMMA)[0]));
            }
        }
        int[] iArr3 = AbstractC4308a.f37672i;
        C5229p0 c5229p0 = this.f43423i;
        Context context2 = c5229p0.f43519j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c5229p0.f43518i;
        D1.Z.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            c5229p0.f43510a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f6 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f6 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f10 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f11 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                c5229p0.f43515f = C5229p0.b(iArr4);
                c5229p0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (c5229p0.j()) {
            if (c5229p0.f43510a == 1) {
                if (!c5229p0.f43516g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f10 == -1.0f) {
                        i11 = 2;
                        f10 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i11 = 2;
                    }
                    if (f11 == -1.0f) {
                        f11 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                    }
                    if (f6 == -1.0f) {
                        f6 = 1.0f;
                    }
                    c5229p0.k(f10, f11, f6);
                }
                c5229p0.h();
            }
        } else {
            c5229p0.f43510a = 0;
        }
        if (G1.f43294b && c5229p0.f43510a != 0) {
            int[] iArr5 = c5229p0.f43515f;
            if (iArr5.length > 0) {
                if (AbstractC5201d0.a(textView) != -1.0f) {
                    AbstractC5201d0.b(textView, Math.round(c5229p0.f43513d), Math.round(c5229p0.f43514e), Math.round(c5229p0.f43512c), 0);
                } else {
                    AbstractC5201d0.c(textView, iArr5, 0);
                }
            }
        }
        U3.u uVar3 = new U3.u(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int z14 = uVar3.z(8, -1);
        if (z14 != -1) {
            drawable = a5.b(context, z14);
        } else {
            drawable = null;
        }
        int z15 = uVar3.z(13, -1);
        if (z15 != -1) {
            drawable2 = a5.b(context, z15);
        } else {
            drawable2 = null;
        }
        int z16 = uVar3.z(9, -1);
        if (z16 != -1) {
            drawable3 = a5.b(context, z16);
        } else {
            drawable3 = null;
        }
        int z17 = uVar3.z(6, -1);
        if (z17 != -1) {
            drawable4 = a5.b(context, z17);
        } else {
            drawable4 = null;
        }
        int z18 = uVar3.z(10, -1);
        if (z18 != -1) {
            drawable5 = a5.b(context, z18);
        } else {
            drawable5 = null;
        }
        int z19 = uVar3.z(7, -1);
        if (z19 != -1) {
            drawable6 = a5.b(context, z19);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a10 = AbstractC5192a0.a(textView);
                Drawable drawable7 = a10[0];
                if (drawable7 == null && a10[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a10[1];
                    }
                    Drawable drawable8 = a10[2];
                    if (drawable4 == null) {
                        drawable4 = a10[3];
                    }
                    AbstractC5192a0.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a11 = AbstractC5192a0.a(textView);
            if (drawable5 == null) {
                drawable5 = a11[0];
            }
            if (drawable2 == null) {
                drawable2 = a11[1];
            }
            if (drawable6 == null) {
                drawable6 = a11[2];
            }
            if (drawable4 == null) {
                drawable4 = a11[3];
            }
            AbstractC5192a0.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (uVar3.E(11)) {
            ColorStateList p10 = uVar3.p(11);
            if (Build.VERSION.SDK_INT >= 24) {
                H1.u.f(textView, p10);
            } else if (textView instanceof H1.A) {
                ((H1.A) textView).setSupportCompoundDrawablesTintList(p10);
            }
        }
        if (uVar3.E(12)) {
            PorterDuff.Mode b10 = AbstractC5238u0.b(uVar3.x(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                H1.u.g(textView, b10);
            } else if (textView instanceof H1.A) {
                ((H1.A) textView).setSupportCompoundDrawablesTintMode(b10);
            }
        }
        int s10 = uVar3.s(15, -1);
        int s11 = uVar3.s(18, -1);
        int s12 = uVar3.s(19, -1);
        uVar3.N();
        if (s10 != -1) {
            AbstractC2279d.x(textView, s10);
        }
        if (s11 != -1) {
            AbstractC2279d.y(textView, s11);
        }
        if (s12 != -1) {
            R4.b.T(s12);
            if (s12 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(s12 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String A10;
        U3.u uVar = new U3.u(context, context.obtainStyledAttributes(i10, AbstractC4308a.f37686w));
        boolean E10 = uVar.E(14);
        TextView textView = this.f43415a;
        if (E10) {
            textView.setAllCaps(uVar.o(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (uVar.E(0) && uVar.s(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, uVar);
        if (i11 >= 26 && uVar.E(13) && (A10 = uVar.A(13)) != null) {
            AbstractC5201d0.d(textView, A10);
        }
        uVar.N();
        Typeface typeface = this.f43426l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f43424j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        C5229p0 c5229p0 = this.f43423i;
        if (c5229p0.j()) {
            DisplayMetrics displayMetrics = c5229p0.f43519j.getResources().getDisplayMetrics();
            c5229p0.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c5229p0.h()) {
                c5229p0.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        C5229p0 c5229p0 = this.f43423i;
        if (c5229p0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c5229p0.f43519j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c5229p0.f43515f = C5229p0.b(iArr2);
                if (!c5229p0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c5229p0.f43516g = false;
            }
            if (c5229p0.h()) {
                c5229p0.a();
            }
        }
    }

    public final void j(int i10) {
        C5229p0 c5229p0 = this.f43423i;
        if (c5229p0.j()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = c5229p0.f43519j.getResources().getDisplayMetrics();
                    c5229p0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c5229p0.h()) {
                        c5229p0.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(android.gov.nist.core.a.e("Unknown auto-size text type: ", i10));
            }
            c5229p0.f43510a = 0;
            c5229p0.f43513d = -1.0f;
            c5229p0.f43514e = -1.0f;
            c5229p0.f43512c = -1.0f;
            c5229p0.f43515f = new int[0];
            c5229p0.f43511b = false;
        }
    }

    public final void k(ColorStateList colorStateList) {
        boolean z10 = false;
        if (this.f43422h == null) {
            this.f43422h = new r1(0);
        }
        r1 r1Var = this.f43422h;
        r1Var.f43546d = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        }
        r1Var.f43545c = z10;
        this.f43416b = r1Var;
        this.f43417c = r1Var;
        this.f43418d = r1Var;
        this.f43419e = r1Var;
        this.f43420f = r1Var;
        this.f43421g = r1Var;
    }

    public final void l(PorterDuff.Mode mode) {
        boolean z10 = false;
        if (this.f43422h == null) {
            this.f43422h = new r1(0);
        }
        r1 r1Var = this.f43422h;
        r1Var.f43547e = mode;
        if (mode != null) {
            z10 = true;
        }
        r1Var.f43544b = z10;
        this.f43416b = r1Var;
        this.f43417c = r1Var;
        this.f43418d = r1Var;
        this.f43419e = r1Var;
        this.f43420f = r1Var;
        this.f43421g = r1Var;
    }

    public final void m(Context context, U3.u uVar) {
        String A10;
        boolean z10;
        boolean z11;
        this.f43424j = uVar.x(2, this.f43424j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int x10 = uVar.x(11, -1);
            this.f43425k = x10;
            if (x10 != -1) {
                this.f43424j &= 2;
            }
        }
        int i11 = 10;
        boolean z12 = false;
        if (!uVar.E(10) && !uVar.E(12)) {
            if (uVar.E(1)) {
                this.f43427m = false;
                int x11 = uVar.x(1, 1);
                if (x11 != 1) {
                    if (x11 != 2) {
                        if (x11 == 3) {
                            this.f43426l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f43426l = Typeface.SERIF;
                    return;
                }
                this.f43426l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f43426l = null;
        if (uVar.E(12)) {
            i11 = 12;
        }
        int i12 = this.f43425k;
        int i13 = this.f43424j;
        if (!context.isRestricted()) {
            try {
                Typeface w10 = uVar.w(i11, this.f43424j, new Y(this, i12, i13, new WeakReference(this.f43415a)));
                if (w10 != null) {
                    if (i10 >= 28 && this.f43425k != -1) {
                        Typeface create = Typeface.create(w10, 0);
                        int i14 = this.f43425k;
                        if ((this.f43424j & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f43426l = AbstractC5204e0.a(create, i14, z11);
                    } else {
                        this.f43426l = w10;
                    }
                }
                if (this.f43426l == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43427m = z10;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f43426l == null && (A10 = uVar.A(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f43425k != -1) {
                Typeface create2 = Typeface.create(A10, 0);
                int i15 = this.f43425k;
                if ((this.f43424j & 2) != 0) {
                    z12 = true;
                }
                this.f43426l = AbstractC5204e0.a(create2, i15, z12);
                return;
            }
            this.f43426l = Typeface.create(A10, this.f43424j);
        }
    }
}
