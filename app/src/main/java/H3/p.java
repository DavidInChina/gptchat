package H3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q1.AbstractC5260f;
import r9.y;
import t1.AbstractC5655a;
import t1.AbstractC5656b;
import t1.AbstractC5657c;
import w.C6059f;

/* loaded from: classes2.dex */
public final class p extends g {

    /* renamed from: o0  reason: collision with root package name */
    public static final PorterDuff.Mode f7423o0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: Z  reason: collision with root package name */
    public n f7424Z;

    /* renamed from: h0  reason: collision with root package name */
    public PorterDuffColorFilter f7425h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorFilter f7426i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7427j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7428k0;

    /* renamed from: l0  reason: collision with root package name */
    public final float[] f7429l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Matrix f7430m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f7431n0;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, H3.n] */
    public p() {
        this.f7428k0 = true;
        this.f7429l0 = new float[9];
        this.f7430m0 = new Matrix();
        this.f7431n0 = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f7412c = null;
        constantState.f7413d = f7423o0;
        constantState.f7411b = new m();
        this.f7424Z = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5656b.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f7431n0;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f7426i0;
            if (colorFilter == null) {
                colorFilter = this.f7425h0;
            }
            Matrix matrix = this.f7430m0;
            canvas.getMatrix(matrix);
            float[] fArr = this.f7429l0;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && AbstractC5657c.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f7424Z;
                Bitmap bitmap = nVar.f7415f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f7415f.getHeight()) {
                    nVar.f7415f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f7420k = true;
                }
                if (!this.f7428k0) {
                    n nVar2 = this.f7424Z;
                    nVar2.f7415f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f7415f);
                    m mVar = nVar2.f7411b;
                    mVar.a(mVar.f7401g, m.f7394p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f7424Z;
                    if (nVar3.f7420k || nVar3.f7416g != nVar3.f7412c || nVar3.f7417h != nVar3.f7413d || nVar3.f7419j != nVar3.f7414e || nVar3.f7418i != nVar3.f7411b.getRootAlpha()) {
                        n nVar4 = this.f7424Z;
                        nVar4.f7415f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f7415f);
                        m mVar2 = nVar4.f7411b;
                        mVar2.a(mVar2.f7401g, m.f7394p, canvas3, min, min2);
                        n nVar5 = this.f7424Z;
                        nVar5.f7416g = nVar5.f7412c;
                        nVar5.f7417h = nVar5.f7413d;
                        nVar5.f7418i = nVar5.f7411b.getRootAlpha();
                        nVar5.f7419j = nVar5.f7414e;
                        nVar5.f7420k = false;
                    }
                }
                n nVar6 = this.f7424Z;
                if (nVar6.f7411b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f7421l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f7421l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f7421l.setAlpha(nVar6.f7411b.getRootAlpha());
                    nVar6.f7421l.setColorFilter(colorFilter);
                    paint = nVar6.f7421l;
                }
                canvas.drawBitmap(nVar6.f7415f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5655a.a(drawable);
        }
        return this.f7424Z.f7411b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f7424Z.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5656b.c(drawable);
        }
        return this.f7426i0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7366Y != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f7366Y.getConstantState());
        }
        this.f7424Z.f7410a = getChangingConfigurations();
        return this.f7424Z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f7424Z.f7411b.f7403i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f7424Z.f7411b.f7402h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [H3.i, H3.l, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5656b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f7424Z;
        nVar.f7411b = new m();
        TypedArray O02 = y.O0(resources, theme, attributeSet, a.f7342a);
        n nVar2 = this.f7424Z;
        m mVar2 = nVar2.f7411b;
        int i14 = !y.z0(xmlPullParser, "tintMode") ? -1 : O02.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i15 = 3;
        if (i14 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i14 != 5) {
            if (i14 != 9) {
                switch (i14) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f7413d = mode;
        ColorStateList q02 = y.q0(O02, xmlPullParser, theme);
        if (q02 != null) {
            nVar2.f7412c = q02;
        }
        boolean z11 = nVar2.f7414e;
        if (y.z0(xmlPullParser, "autoMirrored")) {
            z11 = O02.getBoolean(5, z11);
        }
        nVar2.f7414e = z11;
        float f6 = mVar2.f7404j;
        if (y.z0(xmlPullParser, "viewportWidth")) {
            f6 = O02.getFloat(7, f6);
        }
        mVar2.f7404j = f6;
        float f10 = mVar2.f7405k;
        if (y.z0(xmlPullParser, "viewportHeight")) {
            f10 = O02.getFloat(8, f10);
        }
        mVar2.f7405k = f10;
        if (mVar2.f7404j <= 0.0f) {
            throw new XmlPullParserException(O02.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            mVar2.f7402h = O02.getDimension(3, mVar2.f7402h);
            int i16 = 2;
            float dimension = O02.getDimension(2, mVar2.f7403i);
            mVar2.f7403i = dimension;
            if (mVar2.f7402h <= 0.0f) {
                throw new XmlPullParserException(O02.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (y.z0(xmlPullParser, "alpha")) {
                    alpha = O02.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                boolean z12 = false;
                String string = O02.getString(0);
                if (string != null) {
                    mVar2.f7407m = string;
                    mVar2.f7409o.put(string, mVar2);
                }
                O02.recycle();
                nVar.f7410a = getChangingConfigurations();
                int i17 = 1;
                nVar.f7420k = true;
                n nVar3 = this.f7424Z;
                m mVar3 = nVar3.f7411b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f7401g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z13 = true;
                while (eventType != i17 && (xmlPullParser.getDepth() >= depth || eventType != i15)) {
                    if (eventType == i16) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i10 = depth;
                        C6059f c6059f = mVar3.f7409o;
                        if (equals) {
                            ?? lVar = new l();
                            lVar.f7368f = 0.0f;
                            lVar.f7370h = 1.0f;
                            lVar.f7371i = 1.0f;
                            lVar.f7372j = 0.0f;
                            lVar.f7373k = 1.0f;
                            lVar.f7374l = 0.0f;
                            Paint.Cap cap = Paint.Cap.BUTT;
                            lVar.f7375m = cap;
                            Paint.Join join = Paint.Join.MITER;
                            lVar.f7376n = join;
                            lVar.f7377o = 4.0f;
                            TypedArray O03 = y.O0(resources, theme, attributeSet, a.f7344c);
                            if (!y.z0(xmlPullParser, "pathData")) {
                                mVar = mVar3;
                            } else {
                                mVar = mVar3;
                                String string2 = O03.getString(0);
                                if (string2 != null) {
                                    lVar.f7391b = string2;
                                }
                                String string3 = O03.getString(2);
                                if (string3 != null) {
                                    lVar.f7390a = R4.b.k0(string3);
                                }
                                lVar.f7369g = y.r0(O03, xmlPullParser, theme, "fillColor", 1);
                                float f11 = lVar.f7371i;
                                if (y.z0(xmlPullParser, "fillAlpha")) {
                                    f11 = O03.getFloat(12, f11);
                                }
                                lVar.f7371i = f11;
                                int i18 = !y.z0(xmlPullParser, "strokeLineCap") ? -1 : O03.getInt(8, -1);
                                Paint.Cap cap2 = lVar.f7375m;
                                if (i18 != 0) {
                                    if (i18 != 1) {
                                        cap = i18 != 2 ? cap2 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                }
                                lVar.f7375m = cap;
                                int i19 = !y.z0(xmlPullParser, "strokeLineJoin") ? -1 : O03.getInt(9, -1);
                                Paint.Join join2 = lVar.f7376n;
                                if (i19 == 0) {
                                    join2 = join;
                                } else if (i19 == 1) {
                                    join2 = Paint.Join.ROUND;
                                } else if (i19 == 2) {
                                    join2 = Paint.Join.BEVEL;
                                }
                                lVar.f7376n = join2;
                                float f12 = lVar.f7377o;
                                if (y.z0(xmlPullParser, "strokeMiterLimit")) {
                                    f12 = O03.getFloat(10, f12);
                                }
                                lVar.f7377o = f12;
                                lVar.f7367e = y.r0(O03, xmlPullParser, theme, "strokeColor", 3);
                                float f13 = lVar.f7370h;
                                if (y.z0(xmlPullParser, "strokeAlpha")) {
                                    f13 = O03.getFloat(11, f13);
                                }
                                lVar.f7370h = f13;
                                float f14 = lVar.f7368f;
                                if (y.z0(xmlPullParser, "strokeWidth")) {
                                    f14 = O03.getFloat(4, f14);
                                }
                                lVar.f7368f = f14;
                                float f15 = lVar.f7373k;
                                if (y.z0(xmlPullParser, "trimPathEnd")) {
                                    f15 = O03.getFloat(6, f15);
                                }
                                lVar.f7373k = f15;
                                float f16 = lVar.f7374l;
                                if (y.z0(xmlPullParser, "trimPathOffset")) {
                                    f16 = O03.getFloat(7, f16);
                                }
                                lVar.f7374l = f16;
                                float f17 = lVar.f7372j;
                                if (y.z0(xmlPullParser, "trimPathStart")) {
                                    f17 = O03.getFloat(5, f17);
                                }
                                lVar.f7372j = f17;
                                int i20 = lVar.f7392c;
                                if (y.z0(xmlPullParser, "fillType")) {
                                    i20 = O03.getInt(13, i20);
                                }
                                lVar.f7392c = i20;
                            }
                            O03.recycle();
                            jVar.f7379b.add(lVar);
                            if (lVar.getPathName() != null) {
                                c6059f.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f7410a = lVar.f7393d | nVar3.f7410a;
                            z10 = false;
                            i13 = 1;
                            z13 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (y.z0(xmlPullParser, "pathData")) {
                                    TypedArray O04 = y.O0(resources, theme, attributeSet, a.f7345d);
                                    String string4 = O04.getString(0);
                                    if (string4 != null) {
                                        lVar2.f7391b = string4;
                                    }
                                    String string5 = O04.getString(1);
                                    if (string5 != null) {
                                        lVar2.f7390a = R4.b.k0(string5);
                                    }
                                    lVar2.f7392c = !y.z0(xmlPullParser, "fillType") ? 0 : O04.getInt(2, 0);
                                    O04.recycle();
                                }
                                jVar.f7379b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    c6059f.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f7410a = lVar2.f7393d | nVar3.f7410a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray O05 = y.O0(resources, theme, attributeSet, a.f7343b);
                                float f18 = jVar2.f7380c;
                                if (y.z0(xmlPullParser, "rotation")) {
                                    f18 = O05.getFloat(5, f18);
                                }
                                jVar2.f7380c = f18;
                                i13 = 1;
                                jVar2.f7381d = O05.getFloat(1, jVar2.f7381d);
                                jVar2.f7382e = O05.getFloat(2, jVar2.f7382e);
                                float f19 = jVar2.f7383f;
                                if (y.z0(xmlPullParser, "scaleX")) {
                                    f19 = O05.getFloat(3, f19);
                                }
                                jVar2.f7383f = f19;
                                float f20 = jVar2.f7384g;
                                if (y.z0(xmlPullParser, "scaleY")) {
                                    f20 = O05.getFloat(4, f20);
                                }
                                jVar2.f7384g = f20;
                                float f21 = jVar2.f7385h;
                                if (y.z0(xmlPullParser, "translateX")) {
                                    f21 = O05.getFloat(6, f21);
                                }
                                jVar2.f7385h = f21;
                                float f22 = jVar2.f7386i;
                                if (y.z0(xmlPullParser, "translateY")) {
                                    f22 = O05.getFloat(7, f22);
                                }
                                jVar2.f7386i = f22;
                                z10 = false;
                                String string6 = O05.getString(0);
                                if (string6 != null) {
                                    jVar2.f7389l = string6;
                                }
                                jVar2.c();
                                O05.recycle();
                                jVar.f7379b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    c6059f.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f7410a = jVar2.f7388k | nVar3.f7410a;
                            }
                            z10 = false;
                            i13 = 1;
                        }
                        i11 = i13;
                        i12 = 3;
                    } else {
                        z10 = z12;
                        mVar = mVar3;
                        i12 = i15;
                        i10 = depth;
                        i11 = 1;
                        if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i15 = i12;
                    z12 = z10;
                    i17 = i11;
                    depth = i10;
                    mVar3 = mVar;
                    i16 = 2;
                }
                if (!z13) {
                    this.f7425h0 = a(nVar.f7412c, nVar.f7413d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(O02.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(O02.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return AbstractC5655a.d(drawable);
        }
        return this.f7424Z.f7414e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f7424Z;
            if (nVar != null) {
                m mVar = nVar.f7411b;
                if (mVar.f7408n == null) {
                    mVar.f7408n = Boolean.valueOf(mVar.f7401g.a());
                }
                if (mVar.f7408n.booleanValue() || ((colorStateList = this.f7424Z.f7412c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, H3.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7427j0 && super.mutate() == this) {
            n nVar = this.f7424Z;
            ?? constantState = new Drawable.ConstantState();
            constantState.f7412c = null;
            constantState.f7413d = f7423o0;
            if (nVar != null) {
                constantState.f7410a = nVar.f7410a;
                m mVar = new m(nVar.f7411b);
                constantState.f7411b = mVar;
                if (nVar.f7411b.f7399e != null) {
                    mVar.f7399e = new Paint(nVar.f7411b.f7399e);
                }
                if (nVar.f7411b.f7398d != null) {
                    constantState.f7411b.f7398d = new Paint(nVar.f7411b.f7398d);
                }
                constantState.f7412c = nVar.f7412c;
                constantState.f7413d = nVar.f7413d;
                constantState.f7414e = nVar.f7414e;
            }
            this.f7424Z = constantState;
            this.f7427j0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f7424Z;
        ColorStateList colorStateList = nVar.f7412c;
        if (colorStateList != null && (mode = nVar.f7413d) != null) {
            this.f7425h0 = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f7411b;
        if (mVar.f7408n == null) {
            mVar.f7408n = Boolean.valueOf(mVar.f7401g.a());
        }
        if (mVar.f7408n.booleanValue()) {
            boolean b10 = nVar.f7411b.f7401g.b(iArr);
            nVar.f7420k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f7424Z.f7411b.getRootAlpha() != i10) {
            this.f7424Z.f7411b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5655a.e(drawable, z10);
        } else {
            this.f7424Z.f7414e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f7426i0 = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5260f.P(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5656b.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f7424Z;
        if (nVar.f7412c != colorStateList) {
            nVar.f7412c = colorStateList;
            this.f7425h0 = a(colorStateList, nVar.f7413d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            AbstractC5656b.i(drawable, mode);
            return;
        }
        n nVar = this.f7424Z;
        if (nVar.f7413d != mode) {
            nVar.f7413d = mode;
            this.f7425h0 = a(nVar.f7412c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.f7428k0 = true;
        this.f7429l0 = new float[9];
        this.f7430m0 = new Matrix();
        this.f7431n0 = new Rect();
        this.f7424Z = nVar;
        this.f7425h0 = a(nVar.f7412c, nVar.f7413d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f7366Y;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
