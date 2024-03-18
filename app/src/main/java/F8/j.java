package f8;

import M3.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC4828h f29710a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public AbstractC4828h f29711b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public AbstractC4828h f29712c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public AbstractC4828h f29713d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f29714e = new C2944a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public c f29715f = new C2944a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public c f29716g = new C2944a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public c f29717h = new C2944a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public e f29718i = H.J();

    /* renamed from: j  reason: collision with root package name */
    public e f29719j = H.J();

    /* renamed from: k  reason: collision with root package name */
    public e f29720k = H.J();

    /* renamed from: l  reason: collision with root package name */
    public e f29721l = H.J();

    public static d7.h a(Context context, int i10, int i11, C2944a c2944a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(O7.a.f13423v);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c10 = c(obtainStyledAttributes, 5, c2944a);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            d7.h hVar = new d7.h(1);
            AbstractC4828h I10 = H.I(i13);
            hVar.f28072a = I10;
            d7.h.b(I10);
            hVar.f28076e = c11;
            AbstractC4828h I11 = H.I(i14);
            hVar.f28073b = I11;
            d7.h.b(I11);
            hVar.f28077f = c12;
            AbstractC4828h I12 = H.I(i15);
            hVar.f28074c = I12;
            d7.h.b(I12);
            hVar.f28078g = c13;
            AbstractC4828h I13 = H.I(i16);
            hVar.f28075d = I13;
            d7.h.b(I13);
            hVar.f28079h = c14;
            return hVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static d7.h b(Context context, AttributeSet attributeSet, int i10, int i11) {
        C2944a c2944a = new C2944a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13417p, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c2944a);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new C2944a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f29721l.getClass().equals(e.class) && this.f29719j.getClass().equals(e.class) && this.f29718i.getClass().equals(e.class) && this.f29720k.getClass().equals(e.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a5 = this.f29714e.a(rectF);
        if (this.f29715f.a(rectF) == a5 && this.f29717h.a(rectF) == a5 && this.f29716g.a(rectF) == a5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f29711b instanceof i) && (this.f29710a instanceof i) && (this.f29712c instanceof i) && (this.f29713d instanceof i)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 || !z11 || !z12) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d7.h, java.lang.Object] */
    public final d7.h e() {
        ?? obj = new Object();
        obj.f28072a = new Object();
        obj.f28073b = new Object();
        obj.f28074c = new Object();
        obj.f28075d = new Object();
        obj.f28076e = new C2944a(0.0f);
        obj.f28077f = new C2944a(0.0f);
        obj.f28078g = new C2944a(0.0f);
        obj.f28079h = new C2944a(0.0f);
        obj.f28080i = H.J();
        obj.f28081j = H.J();
        obj.f28082k = H.J();
        obj.f28072a = this.f29710a;
        obj.f28073b = this.f29711b;
        obj.f28074c = this.f29712c;
        obj.f28075d = this.f29713d;
        obj.f28076e = this.f29714e;
        obj.f28077f = this.f29715f;
        obj.f28078g = this.f29716g;
        obj.f28079h = this.f29717h;
        obj.f28080i = this.f29718i;
        obj.f28081j = this.f29719j;
        obj.f28082k = this.f29720k;
        obj.f28083l = this.f29721l;
        return obj;
    }
}
