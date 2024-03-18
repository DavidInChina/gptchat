package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p1.AbstractC5038c;
import p1.AbstractC5042g;
import t1.AbstractC5656b;
import w.AbstractC6067n;
import w.C6049A;
import w.C6050B;
import w.C6066m;
import w.C6068o;
import x.AbstractC6262a;

/* loaded from: classes2.dex */
public final class X0 {

    /* renamed from: i  reason: collision with root package name */
    public static X0 f43373i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f43375a;

    /* renamed from: b  reason: collision with root package name */
    public C6049A f43376b;

    /* renamed from: c  reason: collision with root package name */
    public C6050B f43377c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f43378d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f43379e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f43380f;

    /* renamed from: g  reason: collision with root package name */
    public C5241w f43381g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f43372h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final V0 f43374j = new C6068o(6);

    public static synchronized X0 d() {
        X0 x02;
        synchronized (X0.class) {
            try {
                if (f43373i == null) {
                    X0 x03 = new X0();
                    f43373i = x03;
                    j(x03);
                }
                x02 = f43373i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x02;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (X0.class) {
            V0 v02 = f43374j;
            v02.getClass();
            int i11 = (31 + i10) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) v02.b(Integer.valueOf(mode.hashCode() + i11));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) v02.c(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(X0 x02) {
        if (Build.VERSION.SDK_INT < 24) {
            x02.a("vector", new U0(3));
            x02.a("animated-vector", new U0(1));
            x02.a("animated-selector", new U0(0));
            x02.a("drawable", new U0(2));
        }
    }

    public final void a(String str, U0 u02) {
        if (this.f43376b == null) {
            this.f43376b = new C6049A(0);
        }
        this.f43376b.put(str, u02);
    }

    public final synchronized void b(Context context, long j6, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C6066m c6066m = (C6066m) this.f43378d.get(context);
                if (c6066m == null) {
                    c6066m = new C6066m((Object) null);
                    this.f43378d.put(context, c6066m);
                }
                c6066m.h(j6, new WeakReference(constantState));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f43379e == null) {
            this.f43379e = new TypedValue();
        }
        TypedValue typedValue = this.f43379e;
        context.getResources().getValue(i10, typedValue, true);
        long j6 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e10 = e(context, j6);
        if (e10 != null) {
            return e10;
        }
        LayerDrawable layerDrawable = null;
        if (this.f43381g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, 2131230781)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C5241w.j(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C5241w.j(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C5241w.j(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j6, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j6) {
        C6066m c6066m = (C6066m) this.f43378d.get(context);
        if (c6066m == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c6066m.d(j6);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b10 = AbstractC6262a.b(c6066m.f47598Z, c6066m.f47600i0, j6);
            if (b10 >= 0) {
                Object[] objArr = c6066m.f47599h0;
                Object obj = objArr[b10];
                Object obj2 = AbstractC6067n.f47601a;
                if (obj != obj2) {
                    objArr[b10] = obj2;
                    c6066m.f47597Y = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r11.f43376b.get(r0) != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
        t1.AbstractC5656b.i(r12, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:24:0x0051, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c3, B:48:0x00cc, B:49:0x00d3, B:50:0x00d4, B:52:0x00dd, B:54:0x00e4, B:58:0x00ee, B:60:0x00f6, B:62:0x00fc, B:67:0x010f, B:69:0x0113, B:71:0x0119, B:75:0x0130, B:82:0x0166, B:83:0x018d, B:90:0x019a, B:93:0x019f, B:94:0x01a8), top: B:97:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:24:0x0051, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c3, B:48:0x00cc, B:49:0x00d3, B:50:0x00d4, B:52:0x00dd, B:54:0x00e4, B:58:0x00ee, B:60:0x00f6, B:62:0x00fc, B:67:0x010f, B:69:0x0113, B:71:0x0119, B:75:0x0130, B:82:0x0166, B:83:0x018d, B:90:0x019a, B:93:0x019f, B:94:0x01a8), top: B:97:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:24:0x0051, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c3, B:48:0x00cc, B:49:0x00d3, B:50:0x00d4, B:52:0x00dd, B:54:0x00e4, B:58:0x00ee, B:60:0x00f6, B:62:0x00fc, B:67:0x010f, B:69:0x0113, B:71:0x0119, B:75:0x0130, B:82:0x0166, B:83:0x018d, B:90:0x019a, B:93:0x019f, B:94:0x01a8), top: B:97:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019a A[Catch: all -> 0x00e9, TRY_LEAVE, TryCatch #1 {all -> 0x00e9, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:12:0x0027, B:14:0x002c, B:16:0x0032, B:18:0x0038, B:21:0x0046, B:24:0x0051, B:25:0x0058, B:27:0x005c, B:28:0x0063, B:31:0x007d, B:33:0x0081, B:35:0x008d, B:36:0x0095, B:41:0x00a1, B:43:0x00b4, B:47:0x00c3, B:48:0x00cc, B:49:0x00d3, B:50:0x00d4, B:52:0x00dd, B:54:0x00e4, B:58:0x00ee, B:60:0x00f6, B:62:0x00fc, B:67:0x010f, B:69:0x0113, B:71:0x0119, B:75:0x0130, B:82:0x0166, B:83:0x018d, B:90:0x019a, B:93:0x019f, B:94:0x01a8), top: B:97:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable g(Context context, int i10, boolean z10) {
        Drawable drawable;
        int next;
        try {
            if (!this.f43380f) {
                this.f43380f = true;
                Drawable f6 = f(context, R.drawable.abc_vector_test);
                if (f6 == null || (!(f6 instanceof H3.p) && !"android.graphics.drawable.VectorDrawable".equals(f6.getClass().getName()))) {
                    this.f43380f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            C6049A c6049a = this.f43376b;
            Drawable drawable2 = null;
            r3 = null;
            PorterDuff.Mode mode = null;
            if (c6049a != null && !c6049a.isEmpty()) {
                C6050B c6050b = this.f43377c;
                if (c6050b != null) {
                    String str = (String) c6050b.c(i10);
                    if (!"appcompat_skip_skip".equals(str)) {
                        if (str != null) {
                        }
                    }
                } else {
                    this.f43377c = new C6050B(0);
                }
                if (this.f43379e == null) {
                    this.f43379e = new TypedValue();
                }
                TypedValue typedValue = this.f43379e;
                Resources resources = context.getResources();
                resources.getValue(i10, typedValue, true);
                long j6 = (typedValue.assetCookie << 32) | typedValue.data;
                drawable = e(context, j6);
                if (drawable == null) {
                    CharSequence charSequence = typedValue.string;
                    if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                        try {
                            XmlResourceParser xml = resources.getXml(i10);
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                            while (true) {
                                next = xml.next();
                                if (next == 2 || next == 1) {
                                    break;
                                }
                            }
                            if (next == 2) {
                                String name = xml.getName();
                                this.f43377c.a(i10, name);
                                W0 w02 = (W0) this.f43376b.get(name);
                                if (w02 != null) {
                                    drawable = ((U0) w02).a(context, xml, asAttributeSet, context.getTheme());
                                }
                                if (drawable != null) {
                                    drawable.setChangingConfigurations(typedValue.changingConfigurations);
                                    b(context, j6, drawable);
                                }
                            } else {
                                throw new XmlPullParserException("No start tag found");
                            }
                        } catch (Exception e10) {
                            AbstractC3612c.d("ResourceManagerInternal", "Exception while inflating drawable", e10);
                        }
                    }
                    if (drawable == null) {
                        this.f43377c.a(i10, "appcompat_skip_skip");
                    }
                }
                if (drawable == null) {
                    drawable = c(context, i10);
                }
                if (drawable == null) {
                    Object obj = AbstractC5042g.f41723a;
                    drawable = AbstractC5038c.b(context, i10);
                }
                if (drawable != null) {
                    ColorStateList i11 = i(context, i10);
                    if (i11 != null) {
                        int[] iArr = AbstractC5238u0.f43561a;
                        Drawable mutate = drawable.mutate();
                        AbstractC5656b.h(mutate, i11);
                        if (this.f43381g != null && i10 == R.drawable.abc_switch_thumb_material) {
                            mode = PorterDuff.Mode.MULTIPLY;
                        }
                        drawable2 = mutate;
                    } else {
                        if (this.f43381g != null) {
                            if (i10 == R.drawable.abc_seekbar_track_material) {
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                                int c10 = p1.c(context, R.attr.colorControlNormal);
                                PorterDuff.Mode mode2 = C5243x.f43584b;
                                C5241w.o(findDrawableByLayerId, c10, mode2);
                                C5241w.o(layerDrawable.findDrawableByLayerId(16908303), p1.c(context, R.attr.colorControlNormal), mode2);
                                C5241w.o(layerDrawable.findDrawableByLayerId(16908301), p1.c(context, R.attr.colorControlActivated), mode2);
                            } else if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                                int b10 = p1.b(context, R.attr.colorControlNormal);
                                PorterDuff.Mode mode3 = C5243x.f43584b;
                                C5241w.o(findDrawableByLayerId2, b10, mode3);
                                C5241w.o(layerDrawable2.findDrawableByLayerId(16908303), p1.c(context, R.attr.colorControlActivated), mode3);
                                C5241w.o(layerDrawable2.findDrawableByLayerId(16908301), p1.c(context, R.attr.colorControlActivated), mode3);
                            }
                            drawable2 = drawable;
                        }
                        if (!m(context, i10, drawable) && z10) {
                        }
                        drawable2 = drawable;
                    }
                    drawable = drawable2;
                }
                if (drawable != null) {
                    AbstractC5238u0.a(drawable);
                }
            }
            drawable = null;
            if (drawable == null) {
            }
            if (drawable == null) {
            }
            if (drawable != null) {
            }
            if (drawable != null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawable;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        C6050B c6050b;
        WeakHashMap weakHashMap = this.f43375a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (c6050b = (C6050B) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) c6050b.c(i10);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            C5241w c5241w = this.f43381g;
            if (c5241w != null) {
                colorStateList2 = c5241w.k(context, i10);
            }
            if (colorStateList2 != null) {
                if (this.f43375a == null) {
                    this.f43375a = new WeakHashMap();
                }
                C6050B c6050b2 = (C6050B) this.f43375a.get(context);
                if (c6050b2 == null) {
                    c6050b2 = new C6050B();
                    this.f43375a.put(context, c6050b2);
                }
                c6050b2.a(i10, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized void k(Context context) {
        C6066m c6066m = (C6066m) this.f43378d.get(context);
        if (c6066m != null) {
            c6066m.b();
        }
    }

    public final synchronized void l(C5241w c5241w) {
        this.f43381g = c5241w;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(Context context, int i10, Drawable drawable) {
        int i11;
        boolean z10;
        int i12;
        PorterDuffColorFilter h10;
        C5241w c5241w = this.f43381g;
        if (c5241w == null) {
            return false;
        }
        PorterDuff.Mode mode = C5243x.f43584b;
        if (C5241w.d((int[]) c5241w.f43573a, i10)) {
            i11 = R.attr.colorControlNormal;
        } else if (C5241w.d((int[]) c5241w.f43575c, i10)) {
            i11 = R.attr.colorControlActivated;
        } else {
            if (C5241w.d((int[]) c5241w.f43576d, i10)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i10 == 2131230801) {
                z10 = true;
                i12 = Math.round(40.8f);
                i11 = 16842800;
                if (!z10) {
                    return false;
                }
                int[] iArr = AbstractC5238u0.f43561a;
                Drawable mutate = drawable.mutate();
                int c10 = p1.c(context, i11);
                synchronized (C5243x.class) {
                    h10 = h(c10, mode);
                }
                mutate.setColorFilter(h10);
                if (i12 != -1) {
                    mutate.setAlpha(i12);
                }
                return true;
            } else if (i10 != R.drawable.abc_dialog_material_background) {
                i11 = 0;
                z10 = false;
                i12 = -1;
                if (!z10) {
                }
            }
            i11 = 16842801;
        }
        z10 = true;
        i12 = -1;
        if (!z10) {
        }
    }
}
