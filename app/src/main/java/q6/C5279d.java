package q6;

import Lg.n;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import id.AbstractC3557B;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import jf.C3959i;
import kf.AbstractC4268D;
import nf.AbstractC4828h;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.EnumC5090b;
import v6.C5977a;

/* renamed from: q6.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5279d extends AbstractGestureDetector$OnGestureListenerC5277b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5092d f43951a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f43952b;

    /* renamed from: c  reason: collision with root package name */
    public final C5977a[] f43953c;

    /* renamed from: d  reason: collision with root package name */
    public final y6.f f43954d;

    /* renamed from: e  reason: collision with root package name */
    public final Reference f43955e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC5091c f43956f;

    /* renamed from: h  reason: collision with root package name */
    public i6.d f43958h;

    /* renamed from: j  reason: collision with root package name */
    public float f43960j;

    /* renamed from: k  reason: collision with root package name */
    public float f43961k;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f43957g = new int[2];

    /* renamed from: i  reason: collision with root package name */
    public WeakReference f43959i = new WeakReference(null);

    public C5279d(AbstractC5092d abstractC5092d, WeakReference weakReference, C5977a[] c5977aArr, y6.f fVar, WeakReference weakReference2, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("sdkCore", abstractC5092d);
        AbstractC3557B.c0("attributesProviders", c5977aArr);
        AbstractC3557B.c0("interactionPredicate", fVar);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f43951a = abstractC5092d;
        this.f43952b = weakReference;
        this.f43953c = c5977aArr;
        this.f43954d = fVar;
        this.f43955e = weakReference2;
        this.f43956f = abstractC5091c;
    }

    public static void b(ViewGroup viewGroup, float f6, float f10, LinkedList linkedList, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            AbstractC3557B.b0("child", childAt);
            childAt.getLocationInWindow(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            int width = childAt.getWidth();
            int height = childAt.getHeight();
            if (f6 >= i11 && f6 <= i11 + width && f10 >= i12 && f10 <= i12 + height) {
                linkedList.add(childAt);
            }
        }
    }

    public final View a(View view, float f6, float f10) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(view);
        View view2 = null;
        boolean z10 = true;
        while (!linkedList.isEmpty()) {
            View view3 = (View) linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                AbstractC3557B.b0("view", view3);
                if (n.I2(view3.getClass().getName(), "androidx.compose.ui.platform.ComposeView", false)) {
                    z10 = false;
                }
            }
            AbstractC3557B.b0("view", view3);
            if (view3.isClickable() && view3.getVisibility() == 0) {
                view2 = view3;
            }
            if (view3 instanceof ViewGroup) {
                b((ViewGroup) view3, f6, f10, linkedList, this.f43957g);
            }
        }
        if (view2 == null && z10) {
            P4.a.m0(this.f43956f, 3, EnumC5090b.f42738Y, C5278c.f43945h0, null, false, 56);
        }
        return view2;
    }

    public final LinkedHashMap c(View view, String str, MotionEvent motionEvent) {
        String str2;
        LinkedHashMap c12 = AbstractC4268D.c1(new C3959i("action.target.classname", AbstractC4828h.p0(view)), new C3959i("action.target.resource_id", str));
        if (motionEvent != null) {
            float x10 = motionEvent.getX() - this.f43960j;
            float y10 = motionEvent.getY() - this.f43961k;
            if (Math.abs(x10) > Math.abs(y10)) {
                if (x10 > 0.0f) {
                    str2 = "right";
                } else {
                    str2 = "left";
                }
            } else if (y10 > 0.0f) {
                str2 = "down";
            } else {
                str2 = "up";
            }
            c12.put("action.gesture.direction", str2);
        }
        for (C5977a c5977a : this.f43953c) {
            c5977a.getClass();
            C5977a.a(view, c12);
        }
        return c12;
    }

    public final void d(View view) {
        LinkedHashMap c12 = AbstractC4268D.c1(new C3959i("action.target.classname", AbstractC4828h.p0(view)), new C3959i("action.target.resource_id", AbstractC4828h.k0((Context) this.f43955e.get(), view.getId())));
        for (C5977a c5977a : this.f43953c) {
            c5977a.getClass();
            C5977a.a(view, c12);
        }
        i6.f a5 = i6.b.a(this.f43951a);
        i6.d dVar = i6.d.f32722Y;
        AbstractC4828h.j0(this.f43954d, view);
        a5.l(dVar, "", c12);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        AbstractC3557B.c0("e", motionEvent);
        this.f43959i.clear();
        this.f43958h = null;
        this.f43961k = 0.0f;
        this.f43960j = 0.0f;
        this.f43960j = motionEvent.getX();
        this.f43961k = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        AbstractC3557B.c0("endUpEvent", motionEvent2);
        this.f43958h = i6.d.f32724h0;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        AbstractC3557B.c0("e", motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r18.f43959i = new java.lang.ref.WeakReference(r9);
        r2 = c(r9, nf.AbstractC4828h.k0((android.content.Context) r18.f43955e.get(), r9.getId()), null);
        r4 = i6.d.f32723Z;
        nf.AbstractC4828h.j0(r18.f43954d, r9);
        r1.r(r2);
        r18.f43958h = r4;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f10) {
        View decorView;
        View view;
        AbstractC3557B.c0("currentMoveEvent", motionEvent2);
        i6.f a5 = i6.b.a(this.f43951a);
        Window window = (Window) this.f43952b.get();
        if (window != null && (decorView = window.getDecorView()) != null && this.f43958h == null) {
            if (motionEvent != null) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                LinkedList linkedList = new LinkedList();
                linkedList.add(decorView);
                boolean z10 = true;
                while (!linkedList.isEmpty()) {
                    view = (View) linkedList.removeFirst();
                    if (linkedList.isEmpty()) {
                        AbstractC3557B.b0("view", view);
                        if (n.I2(view.getClass().getName(), "androidx.compose.ui.platform.ComposeView", false)) {
                            z10 = false;
                        }
                    }
                    AbstractC3557B.b0("view", view);
                    if (view.getVisibility() == 0 && (ScrollingView.class.isAssignableFrom(view.getClass()) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass()))) {
                        break;
                    } else if (view instanceof ViewGroup) {
                        b((ViewGroup) view, x10, y10, linkedList, this.f43957g);
                    }
                }
                if (z10) {
                    P4.a.m0(this.f43956f, 3, EnumC5090b.f42738Y, C5278c.f43944Z, null, false, 56);
                }
            }
            view = null;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        AbstractC3557B.c0("e", motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view;
        View a5;
        AbstractC3557B.c0("e", motionEvent);
        Window window = (Window) this.f43952b.get();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (view != null && (a5 = a(view, motionEvent.getX(), motionEvent.getY())) != null) {
            d(a5);
            return false;
        }
        return false;
    }
}
