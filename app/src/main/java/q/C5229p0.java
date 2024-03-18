package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import io.sentry.android.core.AbstractC3612c;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: q.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5229p0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f43508l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f43509m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f43510a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43511b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f43512c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f43513d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f43514e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f43515f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f43516g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f43517h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f43518i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f43519j;

    /* renamed from: k  reason: collision with root package name */
    public final C5223m0 f43520k;

    static {
        new ConcurrentHashMap();
    }

    public C5229p0(TextView textView) {
        this.f43518i = textView;
        this.f43519j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f43520k = new C5225n0();
        } else {
            this.f43520k = new C5223m0();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f43509m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            AbstractC3612c.s("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            AbstractC3612c.s("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        int i10;
        if (!f()) {
            return;
        }
        if (this.f43511b) {
            if (this.f43518i.getMeasuredHeight() > 0 && this.f43518i.getMeasuredWidth() > 0) {
                if (this.f43520k.b(this.f43518i)) {
                    i10 = 1048576;
                } else {
                    i10 = (this.f43518i.getMeasuredWidth() - this.f43518i.getTotalPaddingLeft()) - this.f43518i.getTotalPaddingRight();
                }
                int height = (this.f43518i.getHeight() - this.f43518i.getCompoundPaddingBottom()) - this.f43518i.getCompoundPaddingTop();
                if (i10 > 0 && height > 0) {
                    RectF rectF = f43508l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = i10;
                            rectF.bottom = height;
                            float c10 = c(rectF);
                            if (c10 != this.f43518i.getTextSize()) {
                                g(0, c10);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f43511b = true;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f43515f.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 0;
            int i12 = 1;
            while (i12 <= i10) {
                int i13 = (i12 + i10) / 2;
                int i14 = this.f43515f[i13];
                TextView textView = this.f43518i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b10 = AbstractC5217j0.b(textView);
                TextPaint textPaint = this.f43517h;
                if (textPaint == null) {
                    this.f43517h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f43517h.set(textView.getPaint());
                this.f43517h.setTextSize(i14);
                StaticLayout a5 = AbstractC5221l0.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f43518i, this.f43517h, this.f43520k);
                if ((b10 != -1 && (a5.getLineCount() > b10 || a5.getLineEnd(a5.getLineCount() - 1) != text.length())) || a5.getHeight() > rectF.bottom) {
                    i11 = i13 - 1;
                    i10 = i11;
                } else {
                    int i15 = i13 + 1;
                    i11 = i12;
                    i12 = i15;
                }
            }
            return this.f43515f[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f43510a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i10, float f6) {
        Resources resources;
        Context context = this.f43519j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i10, f6, resources.getDisplayMetrics());
        TextView textView = this.f43518i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a5 = AbstractC5219k0.a(textView);
            if (textView.getLayout() != null) {
                this.f43511b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    AbstractC3612c.s("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a5) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f43510a == 1) {
            if (!this.f43516g || this.f43515f.length == 0) {
                int floor = ((int) Math.floor((this.f43514e - this.f43513d) / this.f43512c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f43512c) + this.f43513d);
                }
                this.f43515f = b(iArr);
            }
            this.f43511b = true;
        } else {
            this.f43511b = false;
        }
        return this.f43511b;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z10;
        if (this.f43515f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43516g = z10;
        if (z10) {
            this.f43510a = 1;
            this.f43513d = iArr[0];
            this.f43514e = iArr[length - 1];
            this.f43512c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f43518i instanceof C5247z);
    }

    public final void k(float f6, float f10, float f11) {
        if (f6 > 0.0f) {
            if (f10 > f6) {
                if (f11 > 0.0f) {
                    this.f43510a = 1;
                    this.f43513d = f6;
                    this.f43514e = f10;
                    this.f43512c = f11;
                    this.f43516g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
    }
}
