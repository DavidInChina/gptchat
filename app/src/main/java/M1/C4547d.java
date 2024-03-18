package m1;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import l1.AbstractC4329a;

/* renamed from: m1.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4547d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC4544a f38851a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38852b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38853c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38854d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38855e;

    /* renamed from: f  reason: collision with root package name */
    public final int f38856f;

    /* renamed from: g  reason: collision with root package name */
    public final int f38857g;

    /* renamed from: h  reason: collision with root package name */
    public int f38858h;

    /* renamed from: i  reason: collision with root package name */
    public int f38859i;

    /* renamed from: j  reason: collision with root package name */
    public int f38860j;

    /* renamed from: k  reason: collision with root package name */
    public View f38861k;

    /* renamed from: l  reason: collision with root package name */
    public View f38862l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f38863m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f38864n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f38865o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f38866p;

    public C4547d() {
        super(-2, -2);
        this.f38852b = false;
        this.f38853c = 0;
        this.f38854d = 0;
        this.f38855e = -1;
        this.f38856f = -1;
        this.f38857g = 0;
        this.f38858h = 0;
        this.f38866p = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return this.f38865o;
        }
        return this.f38864n;
    }

    public C4547d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC4544a abstractC4544a;
        this.f38852b = false;
        this.f38853c = 0;
        this.f38854d = 0;
        this.f38855e = -1;
        this.f38856f = -1;
        this.f38857g = 0;
        this.f38858h = 0;
        this.f38866p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4329a.f37737b);
        this.f38853c = obtainStyledAttributes.getInteger(0, 0);
        this.f38856f = obtainStyledAttributes.getResourceId(1, -1);
        this.f38854d = obtainStyledAttributes.getInteger(2, 0);
        this.f38855e = obtainStyledAttributes.getInteger(6, -1);
        this.f38857g = obtainStyledAttributes.getInt(5, 0);
        this.f38858h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f38852b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f24885A0;
            if (TextUtils.isEmpty(string)) {
                abstractC4544a = null;
            } else {
                if (string.startsWith(Separators.DOT)) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f24885A0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f24887C0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f24886B0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC4544a = (AbstractC4544a) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(R.a.r("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f38851a = abstractC4544a;
        }
        obtainStyledAttributes.recycle();
        AbstractC4544a abstractC4544a2 = this.f38851a;
        if (abstractC4544a2 != null) {
            abstractC4544a2.c(this);
        }
    }

    public C4547d(C4547d c4547d) {
        super((ViewGroup.MarginLayoutParams) c4547d);
        this.f38852b = false;
        this.f38853c = 0;
        this.f38854d = 0;
        this.f38855e = -1;
        this.f38856f = -1;
        this.f38857g = 0;
        this.f38858h = 0;
        this.f38866p = new Rect();
    }

    public C4547d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f38852b = false;
        this.f38853c = 0;
        this.f38854d = 0;
        this.f38855e = -1;
        this.f38856f = -1;
        this.f38857g = 0;
        this.f38858h = 0;
        this.f38866p = new Rect();
    }

    public C4547d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f38852b = false;
        this.f38853c = 0;
        this.f38854d = 0;
        this.f38855e = -1;
        this.f38856f = -1;
        this.f38857g = 0;
        this.f38858h = 0;
        this.f38866p = new Rect();
    }
}
