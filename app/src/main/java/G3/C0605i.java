package G3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import java.util.HashMap;
import w3.C6106m;

/* renamed from: G3.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0605i extends s {

    /* renamed from: D0  reason: collision with root package name */
    public static final String[] f5923D0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: C0  reason: collision with root package name */
    public int f5924C0;

    public C0605i(int i10) {
        this.f5924C0 = i10;
    }

    public static void I(z zVar) {
        int visibility = zVar.f5982b.getVisibility();
        HashMap hashMap = zVar.f5981a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = zVar.f5982b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [G3.I, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static I K(z zVar, z zVar2) {
        ?? obj = new Object();
        obj.f5896a = false;
        obj.f5897b = false;
        if (zVar != null) {
            HashMap hashMap = zVar.f5981a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.f5898c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.f5900e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (zVar2 != null) {
                    HashMap hashMap2 = zVar2.f5981a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.f5899d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f5901f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (zVar == null && zVar2 != null) {
                            int i10 = obj.f5898c;
                            int i11 = obj.f5899d;
                            if (i10 != i11 || obj.f5900e != obj.f5901f) {
                                if (i10 != i11) {
                                    if (i10 == 0) {
                                        obj.f5897b = false;
                                        obj.f5896a = true;
                                    } else if (i11 == 0) {
                                        obj.f5897b = true;
                                        obj.f5896a = true;
                                    }
                                } else if (obj.f5901f == null) {
                                    obj.f5897b = false;
                                    obj.f5896a = true;
                                } else if (obj.f5900e == null) {
                                    obj.f5897b = true;
                                    obj.f5896a = true;
                                }
                            }
                        } else if (zVar != null && obj.f5899d == 0) {
                            obj.f5897b = true;
                            obj.f5896a = true;
                        } else if (zVar2 == null && obj.f5898c == 0) {
                            obj.f5897b = false;
                            obj.f5896a = true;
                        }
                        return obj;
                    }
                }
                obj.f5899d = -1;
                obj.f5901f = null;
                if (zVar == null) {
                }
                if (zVar != null) {
                }
                if (zVar2 == null) {
                    obj.f5897b = false;
                    obj.f5896a = true;
                }
                return obj;
            }
        }
        obj.f5898c = -1;
        obj.f5900e = null;
        if (zVar2 != null) {
        }
        obj.f5899d = -1;
        obj.f5901f = null;
        if (zVar == null) {
        }
        if (zVar != null) {
        }
        if (zVar2 == null) {
        }
        return obj;
    }

    public final ObjectAnimator J(View view, float f6, float f10) {
        if (f6 == f10) {
            return null;
        }
        A.f5879a.C(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, A.f5880b, f10);
        ofFloat.addListener(new C6106m(view));
        a(new C0604h(this, 0, view));
        return ofFloat;
    }

    @Override // G3.s
    public final void e(z zVar) {
        I(zVar);
    }

    @Override // G3.s
    public final void h(z zVar) {
        I(zVar);
        zVar.f5981a.put("android:fade:transitionAlpha", Float.valueOf(A.f5879a.B(zVar.f5982b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (K(o(r3, false), r(r3, false)).f5896a != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    @Override // G3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        View view;
        int i10;
        Object obj;
        View view2;
        float f6;
        z zVar3;
        float f10;
        float f11;
        C0605i c0605i;
        float f12;
        boolean z10;
        View view3;
        View view4;
        boolean z11;
        boolean z12;
        Bitmap bitmap;
        int i11;
        ViewGroup viewGroup2;
        ObjectAnimator objectAnimator;
        float f13;
        Float f14;
        I K10 = K(zVar, zVar2);
        if (K10.f5896a && (K10.f5900e != null || K10.f5901f != null)) {
            float f15 = 0.0f;
            boolean z13 = false;
            if (K10.f5897b) {
                if ((this.f5924C0 & 1) == 1 && zVar2 != null) {
                    View view5 = zVar2.f5982b;
                    if (zVar == null) {
                        View view6 = (View) view5.getParent();
                    }
                    if (zVar != null && (f14 = (Float) zVar.f5981a.get("android:fade:transitionAlpha")) != null) {
                        f13 = f14.floatValue();
                    } else {
                        f13 = 0.0f;
                    }
                    if (f13 != 1.0f) {
                        f15 = f13;
                    }
                    objectAnimator = J(view5, f15, 1.0f);
                    return objectAnimator;
                }
                objectAnimator = null;
                return objectAnimator;
            }
            int i12 = K10.f5899d;
            if ((this.f5924C0 & 2) == 2 && zVar != null) {
                if (zVar2 != null) {
                    view = zVar2.f5982b;
                } else {
                    view = null;
                }
                View view7 = zVar.f5982b;
                View view8 = (View) view7.getTag(R.id.save_overlay_view);
                if (view8 != null) {
                    zVar3 = zVar;
                    i10 = i12;
                    obj = "android:fade:transitionAlpha";
                    f6 = 1.0f;
                    z13 = true;
                    view2 = null;
                } else {
                    if (view != null && view.getParent() != null) {
                        if (i12 == 4 || view7 == view) {
                            view3 = view;
                            z10 = false;
                            view = null;
                            if (z10) {
                            }
                            i10 = i12;
                            obj = "android:fade:transitionAlpha";
                            view4 = view3;
                            zVar3 = zVar;
                            view8 = view;
                            view2 = view4;
                            f6 = 1.0f;
                            z13 = false;
                        }
                    } else if (view != null) {
                        z10 = false;
                        view3 = null;
                        if (z10) {
                            if (view7.getParent() == null) {
                                zVar3 = zVar;
                                i10 = i12;
                                obj = "android:fade:transitionAlpha";
                                f6 = 1.0f;
                                view2 = view3;
                                view8 = view7;
                            } else if (view7.getParent() instanceof View) {
                                View view9 = (View) view7.getParent();
                                if (!K(r(view9, true), o(view9, true)).f5896a) {
                                    boolean z14 = y.f5978a;
                                    Matrix matrix = new Matrix();
                                    matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                    E e10 = A.f5879a;
                                    e10.D(view7, matrix);
                                    e10.E(viewGroup, matrix);
                                    RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                    matrix.mapRect(rectF);
                                    int round = Math.round(rectF.left);
                                    int round2 = Math.round(rectF.top);
                                    int round3 = Math.round(rectF.right);
                                    int round4 = Math.round(rectF.bottom);
                                    ImageView imageView = new ImageView(view7.getContext());
                                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    if (y.f5978a) {
                                        z12 = !view7.isAttachedToWindow();
                                        z11 = viewGroup.isAttachedToWindow();
                                    } else {
                                        z12 = false;
                                        z11 = false;
                                    }
                                    boolean z15 = y.f5979b;
                                    if (z15 && z12) {
                                        if (!z11) {
                                            i10 = i12;
                                            obj = "android:fade:transitionAlpha";
                                            view4 = view3;
                                            bitmap = null;
                                            if (bitmap != null) {
                                                imageView.setImageBitmap(bitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                            imageView.layout(round, round2, round3, round4);
                                            zVar3 = zVar;
                                            view8 = imageView;
                                            view2 = view4;
                                            f6 = 1.0f;
                                            z13 = false;
                                        } else {
                                            ViewGroup viewGroup3 = (ViewGroup) view7.getParent();
                                            int indexOfChild = viewGroup3.indexOfChild(view7);
                                            viewGroup.getOverlay().add(view7);
                                            viewGroup2 = viewGroup3;
                                            view4 = view3;
                                            i11 = indexOfChild;
                                        }
                                    } else {
                                        view4 = view3;
                                        viewGroup2 = null;
                                        i11 = 0;
                                    }
                                    i10 = i12;
                                    int round5 = Math.round(rectF.width());
                                    int round6 = Math.round(rectF.height());
                                    if (round5 <= 0 || round6 <= 0) {
                                        obj = "android:fade:transitionAlpha";
                                        bitmap = null;
                                    } else {
                                        obj = "android:fade:transitionAlpha";
                                        float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                        int round7 = Math.round(round5 * min);
                                        int round8 = Math.round(round6 * min);
                                        matrix.postTranslate(-rectF.left, -rectF.top);
                                        matrix.postScale(min, min);
                                        if (y.f5980c) {
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                            Canvas canvas = new Canvas(bitmap);
                                            canvas.concat(matrix);
                                            view7.draw(canvas);
                                        }
                                    }
                                    if (z15 && z12) {
                                        viewGroup.getOverlay().remove(view7);
                                        viewGroup2.addView(view7, i11);
                                    }
                                    if (bitmap != null) {
                                    }
                                    imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                    imageView.layout(round, round2, round3, round4);
                                    zVar3 = zVar;
                                    view8 = imageView;
                                    view2 = view4;
                                    f6 = 1.0f;
                                    z13 = false;
                                } else {
                                    i10 = i12;
                                    obj = "android:fade:transitionAlpha";
                                    view4 = view3;
                                    int id2 = view9.getId();
                                    if (view9.getParent() == null && id2 != -1) {
                                        viewGroup.findViewById(id2);
                                    }
                                    zVar3 = zVar;
                                    view8 = view;
                                    view2 = view4;
                                    f6 = 1.0f;
                                    z13 = false;
                                }
                            }
                        }
                        i10 = i12;
                        obj = "android:fade:transitionAlpha";
                        view4 = view3;
                        zVar3 = zVar;
                        view8 = view;
                        view2 = view4;
                        f6 = 1.0f;
                        z13 = false;
                    }
                    z10 = true;
                    view = null;
                    view3 = null;
                    if (z10) {
                    }
                    i10 = i12;
                    obj = "android:fade:transitionAlpha";
                    view4 = view3;
                    zVar3 = zVar;
                    view8 = view;
                    view2 = view4;
                    f6 = 1.0f;
                    z13 = false;
                }
                HashMap hashMap = zVar3.f5981a;
                if (view8 != null) {
                    if (!z13) {
                        int[] iArr = (int[]) hashMap.get("android:visibility:screenLocation");
                        int i13 = iArr[0];
                        int i14 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view8.offsetLeftAndRight((i13 - iArr2[0]) - view8.getLeft());
                        view8.offsetTopAndBottom((i14 - iArr2[1]) - view8.getTop());
                        viewGroup.getOverlay().add(view8);
                    }
                    A.f5879a.getClass();
                    Float f16 = (Float) hashMap.get(obj);
                    if (f16 != null) {
                        f11 = f16.floatValue();
                        f12 = 0.0f;
                        c0605i = this;
                    } else {
                        f12 = 0.0f;
                        c0605i = this;
                        f11 = f6;
                    }
                    ObjectAnimator J10 = c0605i.J(view8, f11, f12);
                    if (!z13) {
                        if (J10 == null) {
                            viewGroup.getOverlay().remove(view8);
                            return J10;
                        }
                        view7.setTag(R.id.save_overlay_view, view8);
                        c0605i.a(new G(c0605i, viewGroup, view8, view7));
                        return J10;
                    }
                    return J10;
                }
                Object obj2 = obj;
                if (view2 != null) {
                    int visibility = view2.getVisibility();
                    E e11 = A.f5879a;
                    e11.z(view2, 0);
                    e11.getClass();
                    Float f17 = (Float) hashMap.get(obj2);
                    if (f17 != null) {
                        f10 = f17.floatValue();
                    } else {
                        f10 = f6;
                    }
                    ObjectAnimator J11 = J(view2, f10, 0.0f);
                    if (J11 != null) {
                        H h10 = new H(view2, i10);
                        J11.addListener(h10);
                        J11.addPauseListener(h10);
                        a(h10);
                    } else {
                        e11.z(view2, visibility);
                    }
                    return J11;
                }
                return null;
            }
        }
        return null;
    }

    @Override // G3.s
    public final /* bridge */ /* synthetic */ String[] q() {
        return f5923D0;
    }

    @Override // G3.s
    public final boolean s(z zVar, z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f5981a.containsKey("android:visibility:visibility") != zVar.f5981a.containsKey("android:visibility:visibility")) {
            return false;
        }
        I K10 = K(zVar, zVar2);
        if (!K10.f5896a) {
            return false;
        }
        if (K10.f5898c != 0 && K10.f5899d != 0) {
            return false;
        }
        return true;
    }
}
