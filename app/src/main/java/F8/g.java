package f8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import e8.C2807a;
import io.sentry.android.core.AbstractC3612c;
import java.util.BitSet;
import s1.AbstractC5521c;

/* loaded from: classes2.dex */
public class g extends Drawable implements u {

    /* renamed from: B0  reason: collision with root package name */
    public static final Paint f29686B0;

    /* renamed from: A0  reason: collision with root package name */
    public final boolean f29687A0;

    /* renamed from: Y  reason: collision with root package name */
    public f f29688Y;

    /* renamed from: Z  reason: collision with root package name */
    public final s[] f29689Z;

    /* renamed from: h0  reason: collision with root package name */
    public final s[] f29690h0;

    /* renamed from: i0  reason: collision with root package name */
    public final BitSet f29691i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f29692j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Matrix f29693k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Path f29694l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Path f29695m0;

    /* renamed from: n0  reason: collision with root package name */
    public final RectF f29696n0;

    /* renamed from: o0  reason: collision with root package name */
    public final RectF f29697o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Region f29698p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Region f29699q0;

    /* renamed from: r0  reason: collision with root package name */
    public j f29700r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Paint f29701s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Paint f29702t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C2807a f29703u0;

    /* renamed from: v0  reason: collision with root package name */
    public final S4.o f29704v0;

    /* renamed from: w0  reason: collision with root package name */
    public final l f29705w0;

    /* renamed from: x0  reason: collision with root package name */
    public PorterDuffColorFilter f29706x0;

    /* renamed from: y0  reason: collision with root package name */
    public PorterDuffColorFilter f29707y0;

    /* renamed from: z0  reason: collision with root package name */
    public final RectF f29708z0;

    static {
        Paint paint = new Paint(1);
        f29686B0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f29688Y;
        this.f29705w0.a(fVar.f29665a, fVar.f29674j, rectF, this.f29704v0, path);
        if (this.f29688Y.f29673i != 1.0f) {
            Matrix matrix = this.f29693k0;
            matrix.reset();
            float f6 = this.f29688Y.f29673i;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f29708z0, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c10;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = c(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10 && (c10 = c((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(c10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int c(int i10) {
        float f6;
        float f10;
        int i11;
        f fVar = this.f29688Y;
        float f11 = fVar.f29678n + fVar.f29679o + fVar.f29677m;
        Z7.a aVar = fVar.f29666b;
        if (aVar != null && aVar.f23231a && AbstractC5521c.d(i10, 255) == aVar.f23234d) {
            if (aVar.f23235e > 0.0f && f11 > 0.0f) {
                f10 = Math.min(((((float) Math.log1p(f11 / f6)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f10 = 0.0f;
            }
            int alpha = Color.alpha(i10);
            int k02 = P4.a.k0(f10, AbstractC5521c.d(i10, 255), aVar.f23232b);
            if (f10 > 0.0f && (i11 = aVar.f23233c) != 0) {
                k02 = AbstractC5521c.b(AbstractC5521c.d(i11, Z7.a.f23230f), k02);
            }
            return AbstractC5521c.d(k02, alpha);
        }
        return i10;
    }

    public final void d(Canvas canvas) {
        if (this.f29691i0.cardinality() > 0) {
            AbstractC3612c.r("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f29688Y.f29682r;
        Path path = this.f29694l0;
        C2807a c2807a = this.f29703u0;
        if (i10 != 0) {
            canvas.drawPath(path, c2807a.f29035a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            s sVar = this.f29689Z[i11];
            int i12 = this.f29688Y.f29681q;
            Matrix matrix = s.f29751b;
            sVar.a(matrix, c2807a, i12, canvas);
            this.f29690h0[i11].a(matrix, c2807a, this.f29688Y.f29681q, canvas);
        }
        if (this.f29687A0) {
            f fVar = this.f29688Y;
            int sin = (int) (Math.sin(Math.toRadians(fVar.f29683s)) * fVar.f29682r);
            f fVar2 = this.f29688Y;
            int cos = (int) (Math.cos(Math.toRadians(fVar2.f29683s)) * fVar2.f29682r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f29686B0);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
        if (r1 < 29) goto L36;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        float f6;
        Paint paint = this.f29701s0;
        paint.setColorFilter(this.f29706x0);
        int alpha = paint.getAlpha();
        int i10 = this.f29688Y.f29676l;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f29702t0;
        paint2.setColorFilter(this.f29707y0);
        paint2.setStrokeWidth(this.f29688Y.f29675k);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f29688Y.f29676l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z10 = this.f29692j0;
        Path path = this.f29694l0;
        if (z10) {
            float f10 = 0.0f;
            if (h()) {
                f6 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f6 = 0.0f;
            }
            float f11 = -f6;
            j jVar = this.f29688Y.f29665a;
            d7.h e10 = jVar.e();
            c cVar = jVar.f29714e;
            if (!(cVar instanceof h)) {
                cVar = new b(f11, cVar);
            }
            e10.f28076e = cVar;
            c cVar2 = jVar.f29715f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f11, cVar2);
            }
            e10.f28077f = cVar2;
            c cVar3 = jVar.f29717h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f11, cVar3);
            }
            e10.f28079h = cVar3;
            c cVar4 = jVar.f29716g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f11, cVar4);
            }
            e10.f28078g = cVar4;
            j a5 = e10.a();
            this.f29700r0 = a5;
            float f12 = this.f29688Y.f29674j;
            RectF rectF = this.f29697o0;
            rectF.set(g());
            if (h()) {
                f10 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f10, f10);
            this.f29705w0.a(a5, f12, rectF, null, this.f29695m0);
            a(g(), path);
            this.f29692j0 = false;
        }
        f fVar = this.f29688Y;
        int i12 = fVar.f29680p;
        if (i12 != 1 && fVar.f29681q > 0) {
            if (i12 != 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (!fVar.f29665a.d(g())) {
                    if (!path.isConvex()) {
                    }
                }
            }
            canvas.save();
            f fVar2 = this.f29688Y;
            double sin = Math.sin(Math.toRadians(fVar2.f29683s));
            f fVar3 = this.f29688Y;
            canvas.translate((int) (sin * fVar2.f29682r), (int) (Math.cos(Math.toRadians(fVar3.f29683s)) * fVar3.f29682r));
            if (!this.f29687A0) {
                d(canvas);
                canvas.restore();
            } else {
                RectF rectF2 = this.f29708z0;
                int width = (int) (rectF2.width() - getBounds().width());
                int height = (int) (rectF2.height() - getBounds().height());
                if (width >= 0 && height >= 0) {
                    Bitmap createBitmap = Bitmap.createBitmap((this.f29688Y.f29681q * 2) + ((int) rectF2.width()) + width, (this.f29688Y.f29681q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f13 = (getBounds().left - this.f29688Y.f29681q) - width;
                    float f14 = (getBounds().top - this.f29688Y.f29681q) - height;
                    canvas2.translate(-f13, -f14);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f13, f14, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
            }
        }
        f fVar4 = this.f29688Y;
        Paint.Style style = fVar4.f29685u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, fVar4.f29665a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (jVar.d(rectF)) {
            float a5 = jVar.f29715f.a(rectF) * this.f29688Y.f29674j;
            canvas.drawRoundRect(rectF, a5, a5, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void f(Canvas canvas) {
        float f6;
        Paint paint = this.f29702t0;
        Path path = this.f29695m0;
        j jVar = this.f29700r0;
        RectF rectF = this.f29697o0;
        rectF.set(g());
        if (h()) {
            f6 = paint.getStrokeWidth() / 2.0f;
        } else {
            f6 = 0.0f;
        }
        rectF.inset(f6, f6);
        e(canvas, paint, path, jVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f29696n0;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f29688Y.f29676l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f29688Y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.f29688Y;
        if (fVar.f29680p == 2) {
            return;
        }
        if (fVar.f29665a.d(g())) {
            outline.setRoundRect(getBounds(), this.f29688Y.f29665a.f29714e.a(g()) * this.f29688Y.f29674j);
            return;
        }
        RectF g10 = g();
        Path path = this.f29694l0;
        a(g10, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
        } else if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f29688Y.f29672h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f29698p0;
        region.set(bounds);
        RectF g10 = g();
        Path path = this.f29694l0;
        a(g10, path);
        Region region2 = this.f29699q0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f29688Y.f29685u;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f29702t0.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        this.f29688Y.f29666b = new Z7.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f29692j0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f29688Y.f29670f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f29688Y.f29669e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f29688Y.f29668d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f29688Y.f29667c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(float f6) {
        f fVar = this.f29688Y;
        if (fVar.f29678n != f6) {
            fVar.f29678n = f6;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        f fVar = this.f29688Y;
        if (fVar.f29667c != colorStateList) {
            fVar.f29667c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f29688Y.f29667c != null && color2 != (colorForState2 = this.f29688Y.f29667c.getColorForState(iArr, (color2 = (paint2 = this.f29701s0).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f29688Y.f29668d != null && color != (colorForState = this.f29688Y.f29668d.getColorForState(iArr, (color = (paint = this.f29702t0).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f29706x0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f29707y0;
        f fVar = this.f29688Y;
        this.f29706x0 = b(fVar.f29670f, fVar.f29671g, this.f29701s0, true);
        f fVar2 = this.f29688Y;
        this.f29707y0 = b(fVar2.f29669e, fVar2.f29671g, this.f29702t0, false);
        f fVar3 = this.f29688Y;
        if (fVar3.f29684t) {
            int colorForState = fVar3.f29670f.getColorForState(getState(), 0);
            C2807a c2807a = this.f29703u0;
            c2807a.getClass();
            c2807a.f29038d = AbstractC5521c.d(colorForState, 68);
            c2807a.f29039e = AbstractC5521c.d(colorForState, 20);
            c2807a.f29040f = AbstractC5521c.d(colorForState, 0);
            c2807a.f29035a.setColor(c2807a.f29038d);
        }
        if (!C1.b.a(porterDuffColorFilter, this.f29706x0) || !C1.b.a(porterDuffColorFilter2, this.f29707y0)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f29688Y = new f(this.f29688Y);
        return this;
    }

    public final void n() {
        f fVar = this.f29688Y;
        float f6 = fVar.f29678n + fVar.f29679o;
        fVar.f29681q = (int) Math.ceil(0.75f * f6);
        this.f29688Y.f29682r = (int) Math.ceil(f6 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f29692j0 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean l10 = l(iArr);
        boolean m10 = m();
        if (!l10 && !m10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        f fVar = this.f29688Y;
        if (fVar.f29676l != i10) {
            fVar.f29676l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f29688Y.getClass();
        super.invalidateSelf();
    }

    @Override // f8.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f29688Y.f29665a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f29688Y.f29670f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f29688Y;
        if (fVar.f29671g != mode) {
            fVar.f29671g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(j.b(context, attributeSet, i10, i11).a());
    }

    public g(j jVar) {
        this(new f(jVar));
    }

    public g(f fVar) {
        l lVar;
        this.f29689Z = new s[4];
        this.f29690h0 = new s[4];
        this.f29691i0 = new BitSet(8);
        this.f29693k0 = new Matrix();
        this.f29694l0 = new Path();
        this.f29695m0 = new Path();
        this.f29696n0 = new RectF();
        this.f29697o0 = new RectF();
        this.f29698p0 = new Region();
        this.f29699q0 = new Region();
        Paint paint = new Paint(1);
        this.f29701s0 = paint;
        Paint paint2 = new Paint(1);
        this.f29702t0 = paint2;
        this.f29703u0 = new C2807a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = k.f29722a;
        } else {
            lVar = new l();
        }
        this.f29705w0 = lVar;
        this.f29708z0 = new RectF();
        this.f29687A0 = true;
        this.f29688Y = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f29704v0 = new S4.o(6, this);
    }
}
