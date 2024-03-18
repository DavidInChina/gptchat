package c8;

import S0.C1342c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import l8.AbstractC4344b;
import r1.p;

/* renamed from: c8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306c {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f26352a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26353b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26354c;

    /* renamed from: d  reason: collision with root package name */
    public final int f26355d;

    /* renamed from: e  reason: collision with root package name */
    public final float f26356e;

    /* renamed from: f  reason: collision with root package name */
    public final float f26357f;

    /* renamed from: g  reason: collision with root package name */
    public final float f26358g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f26359h;

    /* renamed from: i  reason: collision with root package name */
    public final float f26360i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f26361j;

    /* renamed from: k  reason: collision with root package name */
    public float f26362k;

    /* renamed from: l  reason: collision with root package name */
    public final int f26363l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f26364m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f26365n;

    public C2306c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, O7.a.f13426y);
        this.f26362k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f26361j = A7.b.L0(context, obtainStyledAttributes, 3);
        A7.b.L0(context, obtainStyledAttributes, 4);
        A7.b.L0(context, obtainStyledAttributes, 5);
        this.f26354c = obtainStyledAttributes.getInt(2, 0);
        this.f26355d = obtainStyledAttributes.getInt(1, 1);
        int i11 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f26363l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f26353b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f26352a = A7.b.L0(context, obtainStyledAttributes, 6);
        this.f26356e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f26357f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f26358g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, O7.a.f13418q);
        this.f26359h = obtainStyledAttributes2.hasValue(0);
        this.f26360i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f26365n;
        int i10 = this.f26354c;
        if (typeface == null && (str = this.f26353b) != null) {
            this.f26365n = Typeface.create(str, i10);
        }
        if (this.f26365n == null) {
            int i11 = this.f26355d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f26365n = Typeface.DEFAULT;
                    } else {
                        this.f26365n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f26365n = Typeface.SERIF;
                }
            } else {
                this.f26365n = Typeface.SANS_SERIF;
            }
            this.f26365n = Typeface.create(this.f26365n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f26364m) {
            return this.f26365n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b10 = p.b(context, this.f26363l);
                this.f26365n = b10;
                if (b10 != null) {
                    this.f26365n = Typeface.create(b10, this.f26354c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f26353b, e10);
            }
        }
        a();
        this.f26364m = true;
        return this.f26365n;
    }

    public final void c(Context context, P4.a aVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f26363l;
        if (i10 == 0) {
            this.f26364m = true;
        }
        if (this.f26364m) {
            aVar.s0(this.f26365n, true);
            return;
        }
        try {
            C1342c c1342c = new C1342c(this, aVar);
            ThreadLocal threadLocal = p.f44306a;
            if (context.isRestricted()) {
                c1342c.a(-4);
            } else {
                p.c(context, i10, new TypedValue(), 0, c1342c, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f26364m = true;
            aVar.r0(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f26353b, e10);
            this.f26364m = true;
            aVar.r0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i10 = this.f26363l;
        if (i10 != 0) {
            ThreadLocal threadLocal = p.f44306a;
            if (!context.isRestricted()) {
                typeface = p.c(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, P4.a aVar) {
        int i10;
        int i11;
        f(context, textPaint, aVar);
        ColorStateList colorStateList = this.f26361j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.f26352a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f26358g, this.f26356e, this.f26357f, i11);
    }

    public final void f(Context context, TextPaint textPaint, P4.a aVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f26365n);
        c(context, new C2305b(this, context, textPaint, aVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z10;
        float f6;
        Typeface K02 = AbstractC4344b.K0(context.getResources().getConfiguration(), typeface);
        if (K02 != null) {
            typeface = K02;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f26354c;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        textPaint.setFakeBoldText(z10);
        if ((i10 & 2) != 0) {
            f6 = -0.25f;
        } else {
            f6 = 0.0f;
        }
        textPaint.setTextSkewX(f6);
        textPaint.setTextSize(this.f26362k);
        if (this.f26359h) {
            textPaint.setLetterSpacing(this.f26360i);
        }
    }
}
