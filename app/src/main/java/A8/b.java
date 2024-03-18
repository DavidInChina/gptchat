package a8;

import B1.n;
import B1.o;
import D1.H;
import D1.I;
import D1.Z;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import c8.C2304a;
import java.util.WeakHashMap;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f23931A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f23932B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f23933C;

    /* renamed from: E  reason: collision with root package name */
    public Bitmap f23935E;

    /* renamed from: F  reason: collision with root package name */
    public float f23936F;

    /* renamed from: G  reason: collision with root package name */
    public float f23937G;

    /* renamed from: H  reason: collision with root package name */
    public float f23938H;

    /* renamed from: I  reason: collision with root package name */
    public float f23939I;

    /* renamed from: J  reason: collision with root package name */
    public float f23940J;

    /* renamed from: K  reason: collision with root package name */
    public int f23941K;

    /* renamed from: L  reason: collision with root package name */
    public int[] f23942L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f23943M;

    /* renamed from: N  reason: collision with root package name */
    public final TextPaint f23944N;

    /* renamed from: O  reason: collision with root package name */
    public final TextPaint f23945O;
    public TimeInterpolator P;
    public TimeInterpolator Q;

    /* renamed from: R  reason: collision with root package name */
    public float f23946R;
    public float S;
    public float T;

    /* renamed from: U  reason: collision with root package name */
    public ColorStateList f23947U;

    /* renamed from: V  reason: collision with root package name */
    public float f23948V;

    /* renamed from: W  reason: collision with root package name */
    public float f23949W;

    /* renamed from: X  reason: collision with root package name */
    public float f23950X;

    /* renamed from: Y  reason: collision with root package name */
    public StaticLayout f23951Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f23952Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f23953a;

    /* renamed from: a0  reason: collision with root package name */
    public float f23954a0;

    /* renamed from: b  reason: collision with root package name */
    public float f23955b;

    /* renamed from: b0  reason: collision with root package name */
    public float f23956b0;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f23958c0;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f23968j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f23969k;

    /* renamed from: l  reason: collision with root package name */
    public float f23970l;

    /* renamed from: m  reason: collision with root package name */
    public float f23971m;

    /* renamed from: n  reason: collision with root package name */
    public float f23972n;

    /* renamed from: o  reason: collision with root package name */
    public float f23973o;

    /* renamed from: p  reason: collision with root package name */
    public float f23974p;

    /* renamed from: q  reason: collision with root package name */
    public float f23975q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f23976r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f23977s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f23978t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f23979u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f23980v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f23981w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f23982x;

    /* renamed from: y  reason: collision with root package name */
    public C2304a f23983y;

    /* renamed from: f  reason: collision with root package name */
    public int f23963f = 16;

    /* renamed from: g  reason: collision with root package name */
    public int f23965g = 16;

    /* renamed from: h  reason: collision with root package name */
    public float f23966h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f23967i = 15.0f;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f23984z = TextUtils.TruncateAt.END;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f23934D = true;

    /* renamed from: d0  reason: collision with root package name */
    public final int f23960d0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public final float f23962e0 = 1.0f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f23964f0 = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f23959d = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final Rect f23957c = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f23961e = new RectF();

    public b(View view) {
        this.f23953a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f23944N = textPaint;
        this.f23945O = new TextPaint(textPaint);
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f6, int i10, int i11) {
        float f10 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i11) * f6) + (Color.alpha(i10) * f10)), Math.round((Color.red(i11) * f6) + (Color.red(i10) * f10)), Math.round((Color.green(i11) * f6) + (Color.green(i10) * f10)), Math.round((Color.blue(i11) * f6) + (Color.blue(i10) * f10)));
    }

    public static float f(float f6, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return P7.a.a(f6, f10, f11);
    }

    public final boolean b(CharSequence charSequence) {
        n nVar;
        WeakHashMap weakHashMap = Z.f3247a;
        boolean z10 = true;
        if (I.d(this.f23953a) != 1) {
            z10 = false;
        }
        if (this.f23934D) {
            if (z10) {
                nVar = o.f1730d;
            } else {
                nVar = o.f1729c;
            }
            return nVar.b(charSequence.length(), charSequence);
        }
        return z10;
    }

    public final void c(float f6, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        Typeface typeface;
        boolean z12;
        Layout.Alignment alignment;
        boolean z13;
        boolean z14;
        boolean z15;
        StaticLayout staticLayout;
        boolean z16;
        boolean z17;
        boolean z18;
        if (this.f23931A == null) {
            return;
        }
        float width = this.f23959d.width();
        float width2 = this.f23957c.width();
        if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            f11 = this.f23967i;
            f10 = this.f23948V;
            this.f23936F = 1.0f;
            typeface = this.f23976r;
        } else {
            float f12 = this.f23966h;
            float f13 = this.f23949W;
            Typeface typeface2 = this.f23979u;
            if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                this.f23936F = 1.0f;
            } else {
                this.f23936F = f(this.f23966h, this.f23967i, f6, this.Q) / this.f23966h;
            }
            float f14 = this.f23967i / this.f23966h;
            float f15 = width2 * f14;
            if (!z10 && f15 > width) {
                width = Math.min(width / f14, width2);
            } else {
                width = width2;
            }
            f11 = f12;
            f10 = f13;
            typeface = typeface2;
        }
        int i10 = (width > 0.0f ? 1 : (width == 0.0f ? 0 : -1));
        TextPaint textPaint = this.f23944N;
        if (i10 > 0) {
            if (this.f23937G != f11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f23950X != f10) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.f23982x != typeface) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f23951Y != null && width != staticLayout.getWidth()) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z13 && !z14 && !z16 && !z15 && !this.f23943M) {
                z17 = false;
            } else {
                z17 = true;
            }
            this.f23937G = f11;
            this.f23950X = f10;
            this.f23982x = typeface;
            this.f23943M = false;
            if (this.f23936F != 1.0f) {
                z18 = true;
            } else {
                z18 = false;
            }
            textPaint.setLinearText(z18);
            z12 = z17;
        } else {
            z12 = false;
        }
        if (this.f23932B == null || z12) {
            textPaint.setTextSize(this.f23937G);
            textPaint.setTypeface(this.f23982x);
            textPaint.setLetterSpacing(this.f23950X);
            boolean b10 = b(this.f23931A);
            this.f23933C = b10;
            int i11 = this.f23960d0;
            if (i11 <= 1 || b10) {
                i11 = 1;
            }
            if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f23963f, b10 ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        if (this.f23933C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f23933C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            }
            g gVar = new g(this.f23931A, textPaint, (int) width);
            gVar.f24004l = this.f23984z;
            gVar.f24003k = b10;
            gVar.f23997e = alignment;
            gVar.f24002j = false;
            gVar.f23998f = i11;
            float f16 = this.f23962e0;
            gVar.f23999g = 0.0f;
            gVar.f24000h = f16;
            gVar.f24001i = this.f23964f0;
            StaticLayout a5 = gVar.a();
            a5.getClass();
            this.f23951Y = a5;
            this.f23932B = a5.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f23945O;
        textPaint.setTextSize(this.f23967i);
        textPaint.setTypeface(this.f23976r);
        textPaint.setLetterSpacing(this.f23948V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f23942L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f23978t;
            if (typeface != null) {
                this.f23977s = AbstractC4344b.K0(configuration, typeface);
            }
            Typeface typeface2 = this.f23981w;
            if (typeface2 != null) {
                this.f23980v = AbstractC4344b.K0(configuration, typeface2);
            }
            Typeface typeface3 = this.f23977s;
            if (typeface3 == null) {
                typeface3 = this.f23978t;
            }
            this.f23976r = typeface3;
            Typeface typeface4 = this.f23980v;
            if (typeface4 == null) {
                typeface4 = this.f23981w;
            }
            this.f23979u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z10) {
        float f6;
        float f10;
        StaticLayout staticLayout;
        View view = this.f23953a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z10) {
            c(1.0f, z10);
            CharSequence charSequence = this.f23932B;
            TextPaint textPaint = this.f23944N;
            if (charSequence != null && (staticLayout = this.f23951Y) != null) {
                this.f23958c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f23984z);
            }
            CharSequence charSequence2 = this.f23958c0;
            if (charSequence2 != null) {
                this.f23952Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f23952Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f23965g, this.f23933C ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f23959d;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f23971m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f23971m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f23971m = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.f23973o = rect.left;
                } else {
                    this.f23973o = rect.right - this.f23952Z;
                }
            } else {
                this.f23973o = rect.centerX() - (this.f23952Z / 2.0f);
            }
            c(0.0f, z10);
            StaticLayout staticLayout2 = this.f23951Y;
            if (staticLayout2 != null) {
                f6 = staticLayout2.getHeight();
            } else {
                f6 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f23951Y;
            if (staticLayout3 != null && this.f23960d0 > 1) {
                f10 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.f23932B;
                if (charSequence3 != null) {
                    f10 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.f23951Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f23963f, this.f23933C ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f23957c;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f23970l = rect2.centerY() - (f6 / 2.0f);
                } else {
                    this.f23970l = textPaint.descent() + (rect2.bottom - f6);
                }
            } else {
                this.f23970l = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f23972n = rect2.left;
                } else {
                    this.f23972n = rect2.right - f10;
                }
            } else {
                this.f23972n = rect2.centerX() - (f10 / 2.0f);
            }
            Bitmap bitmap = this.f23935E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f23935E = null;
            }
            l(this.f23955b);
            float f11 = this.f23955b;
            float f12 = f(rect2.left, rect.left, f11, this.P);
            RectF rectF = this.f23961e;
            rectF.left = f12;
            rectF.top = f(this.f23970l, this.f23971m, f11, this.P);
            rectF.right = f(rect2.right, rect.right, f11, this.P);
            rectF.bottom = f(rect2.bottom, rect.bottom, f11, this.P);
            this.f23974p = f(this.f23972n, this.f23973o, f11, this.P);
            this.f23975q = f(this.f23970l, this.f23971m, f11, this.P);
            l(f11);
            k2.b bVar = P7.a.f13839b;
            this.f23954a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f11, bVar);
            WeakHashMap weakHashMap = Z.f3247a;
            H.k(view);
            this.f23956b0 = f(1.0f, 0.0f, f11, bVar);
            H.k(view);
            ColorStateList colorStateList = this.f23969k;
            ColorStateList colorStateList2 = this.f23968j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f11, e(colorStateList2), e(this.f23969k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.f23948V;
            float f14 = this.f23949W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f11, bVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f23938H = f(0.0f, this.f23946R, f11, null);
            this.f23939I = f(0.0f, this.S, f11, null);
            this.f23940J = f(0.0f, this.T, f11, null);
            int a5 = a(f11, e(null), e(this.f23947U));
            this.f23941K = a5;
            textPaint.setShadowLayer(this.f23938H, this.f23939I, this.f23940J, a5);
            H.k(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f23969k != colorStateList || this.f23968j != colorStateList) {
            this.f23969k = colorStateList;
            this.f23968j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        C2304a c2304a = this.f23983y;
        if (c2304a != null) {
            c2304a.f26347j = true;
        }
        if (this.f23978t != typeface) {
            this.f23978t = typeface;
            Typeface K02 = AbstractC4344b.K0(this.f23953a.getContext().getResources().getConfiguration(), typeface);
            this.f23977s = K02;
            if (K02 == null) {
                K02 = this.f23978t;
            }
            this.f23976r = K02;
            return true;
        }
        return false;
    }

    public final void k(float f6) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 != this.f23955b) {
            this.f23955b = f6;
            Rect rect = this.f23957c;
            Rect rect2 = this.f23959d;
            float f10 = f(rect.left, rect2.left, f6, this.P);
            RectF rectF = this.f23961e;
            rectF.left = f10;
            rectF.top = f(this.f23970l, this.f23971m, f6, this.P);
            rectF.right = f(rect.right, rect2.right, f6, this.P);
            rectF.bottom = f(rect.bottom, rect2.bottom, f6, this.P);
            this.f23974p = f(this.f23972n, this.f23973o, f6, this.P);
            this.f23975q = f(this.f23970l, this.f23971m, f6, this.P);
            l(f6);
            k2.b bVar = P7.a.f13839b;
            this.f23954a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f6, bVar);
            WeakHashMap weakHashMap = Z.f3247a;
            View view = this.f23953a;
            H.k(view);
            this.f23956b0 = f(1.0f, 0.0f, f6, bVar);
            H.k(view);
            ColorStateList colorStateList = this.f23969k;
            ColorStateList colorStateList2 = this.f23968j;
            TextPaint textPaint = this.f23944N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f6, e(colorStateList2), e(this.f23969k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f11 = this.f23948V;
            float f12 = this.f23949W;
            if (f11 != f12) {
                textPaint.setLetterSpacing(f(f12, f11, f6, bVar));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f23938H = f(0.0f, this.f23946R, f6, null);
            this.f23939I = f(0.0f, this.S, f6, null);
            this.f23940J = f(0.0f, this.T, f6, null);
            int a5 = a(f6, e(null), e(this.f23947U));
            this.f23941K = a5;
            textPaint.setShadowLayer(this.f23938H, this.f23939I, this.f23940J, a5);
            H.k(view);
        }
    }

    public final void l(float f6) {
        c(f6, false);
        WeakHashMap weakHashMap = Z.f3247a;
        H.k(this.f23953a);
    }

    public final void m(Typeface typeface) {
        boolean z10;
        boolean j6 = j(typeface);
        if (this.f23981w != typeface) {
            this.f23981w = typeface;
            Typeface K02 = AbstractC4344b.K0(this.f23953a.getContext().getResources().getConfiguration(), typeface);
            this.f23980v = K02;
            if (K02 == null) {
                K02 = this.f23981w;
            }
            this.f23979u = K02;
            z10 = true;
        } else {
            z10 = false;
        }
        if (j6 || z10) {
            h(false);
        }
    }
}
