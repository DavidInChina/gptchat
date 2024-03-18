package G3;

import D1.Z;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: G3.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0603g extends s {

    /* renamed from: C0  reason: collision with root package name */
    public static final String[] f5914C0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: D0  reason: collision with root package name */
    public static final C0599c f5915D0 = new C0599c(0, PointF.class, "topLeft");

    /* renamed from: E0  reason: collision with root package name */
    public static final C0599c f5916E0 = new C0599c(1, PointF.class, "bottomRight");

    /* renamed from: F0  reason: collision with root package name */
    public static final C0599c f5917F0 = new C0599c(2, PointF.class, "bottomRight");

    /* renamed from: G0  reason: collision with root package name */
    public static final C0599c f5918G0 = new C0599c(3, PointF.class, "topLeft");

    /* renamed from: H0  reason: collision with root package name */
    public static final C0599c f5919H0 = new C0599c(4, PointF.class, "position");

    /* JADX WARN: Type inference failed for: r0v2, types: [G3.b, android.util.Property] */
    static {
        new Property(PointF.class, "boundsOrigin").f5903a = new Rect();
    }

    public static void I(z zVar) {
        View view = zVar.f5982b;
        WeakHashMap weakHashMap = Z.f3247a;
        if (D1.K.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = zVar.f5981a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", zVar.f5982b.getParent());
        }
    }

    @Override // G3.s
    public final void e(z zVar) {
        I(zVar);
    }

    @Override // G3.s
    public final void h(z zVar) {
        I(zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [G3.f, java.lang.Object] */
    @Override // G3.s
    public final Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        int i10;
        ObjectAnimator objectAnimator;
        C0603g c0603g;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        HashMap hashMap = zVar.f5981a;
        HashMap hashMap2 = zVar2.f5981a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
            if (i11 == i12 && i13 == i14) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        } else {
            i10 = 0;
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        if (i10 > 0) {
            View view = zVar2.f5982b;
            A.a(view, i11, i13, i15, i17);
            if (i10 == 2) {
                if (i19 == i21 && i20 == i22) {
                    c0603g = this;
                    c0603g.f5966y0.getClass();
                    objectAnimator = ObjectAnimator.ofObject(view, f5919H0, (TypeConverter) null, P5.c.E(i11, i13, i12, i14));
                } else {
                    c0603g = this;
                    ?? obj = new Object();
                    obj.f5911e = view;
                    c0603g.f5966y0.getClass();
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(obj, f5915D0, (TypeConverter) null, P5.c.E(i11, i13, i12, i14));
                    c0603g.f5966y0.getClass();
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(obj, f5916E0, (TypeConverter) null, P5.c.E(i15, i17, i16, i18));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject, ofObject2);
                    animatorSet.addListener(new C0600d(obj));
                    objectAnimator = animatorSet;
                }
            } else {
                c0603g = this;
                if (i11 == i12 && i13 == i14) {
                    c0603g.f5966y0.getClass();
                    objectAnimator = ObjectAnimator.ofObject(view, f5917F0, (TypeConverter) null, P5.c.E(i15, i17, i16, i18));
                } else {
                    c0603g.f5966y0.getClass();
                    objectAnimator = ObjectAnimator.ofObject(view, f5918G0, (TypeConverter) null, P5.c.E(i11, i13, i12, i14));
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                L4.a.T0(viewGroup4, true);
                c0603g.a(new C0601e(viewGroup4));
            }
            return objectAnimator;
        }
        return null;
    }

    @Override // G3.s
    public final String[] q() {
        return f5914C0;
    }
}
