package com.google.android.material.button;

import D1.AbstractC0365n;
import D1.H;
import D1.I;
import D1.Z;
import N.b0;
import O7.a;
import T7.d;
import a8.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.h;
import com.openai.chatgpt.R;
import f8.C2944a;
import f8.j;
import io.sentry.android.core.AbstractC3612c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k8.AbstractC4203a;
import y7.b;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f27087r0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public Integer[] f27092l0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f27094n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f27095o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f27096p0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f27088h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public final b f27089i0 = new b(this);

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashSet f27090j0 = new LinkedHashSet();

    /* renamed from: k0  reason: collision with root package name */
    public final b0 f27091k0 = new b0(5, this);

    /* renamed from: m0  reason: collision with root package name */
    public boolean f27093m0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public HashSet f27097q0 = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952710), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray e10 = k.e(getContext(), attributeSet, a.f13412k, R.attr.materialButtonToggleGroupStyle, 2131952710, new int[0]);
        setSingleSelection(e10.getBoolean(3, false));
        this.f27096p0 = e10.getResourceId(1, -1);
        this.f27095o0 = e10.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(e10.getBoolean(0, true));
        e10.recycle();
        WeakHashMap weakHashMap = Z.f3247a;
        H.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = Z.f3247a;
            materialButton.setId(I.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f27089i0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                AbstractC0365n.g(layoutParams, 0);
                AbstractC0365n.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                AbstractC0365n.h(layoutParams, 0);
            }
            materialButton.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            AbstractC0365n.g(layoutParams3, 0);
            AbstractC0365n.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            AbstractC3612c.c("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f27084v0);
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f27088h0.add(new d(shapeAppearanceModel.f29714e, shapeAppearanceModel.f29717h, shapeAppearanceModel.f29715f, shapeAppearanceModel.f29716g));
        materialButton.setEnabled(isEnabled());
        Z.l(materialButton, new Q7.a(1, this));
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            AbstractC3612c.c("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f27097q0);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f27094n0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f27095o0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        if (getChildAt(i10).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f27097q0;
        this.f27097q0 = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f27093m0 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f27093m0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f27090j0.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f27091k0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f27092l0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z10;
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                d7.h e10 = materialButton.getShapeAppearanceModel().e();
                d dVar2 = (d) this.f27088h0.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    C2944a c2944a = d.f16949e;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (Df.H.b0(this)) {
                                dVar = new d(c2944a, c2944a, dVar2.f16951b, dVar2.f16952c);
                            } else {
                                dVar = new d(dVar2.f16950a, dVar2.f16953d, c2944a, c2944a);
                            }
                        } else {
                            dVar = new d(dVar2.f16950a, c2944a, dVar2.f16951b, c2944a);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (Df.H.b0(this)) {
                                dVar = new d(dVar2.f16950a, dVar2.f16953d, c2944a, c2944a);
                            } else {
                                dVar = new d(c2944a, c2944a, dVar2.f16951b, dVar2.f16952c);
                            }
                        } else {
                            dVar = new d(c2944a, dVar2.f16953d, c2944a, dVar2.f16952c);
                        }
                    } else {
                        dVar2 = null;
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    e10.f28076e = new C2944a(0.0f);
                    e10.f28077f = new C2944a(0.0f);
                    e10.f28078g = new C2944a(0.0f);
                    e10.f28079h = new C2944a(0.0f);
                } else {
                    e10.f28076e = dVar2.f16950a;
                    e10.f28079h = dVar2.f16953d;
                    e10.f28077f = dVar2.f16951b;
                    e10.f28078g = dVar2.f16952c;
                }
                materialButton.setShapeAppearanceModel(e10.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.f27094n0 && !this.f27097q0.isEmpty()) {
            return ((Integer) this.f27097q0.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f27097q0.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f27092l0;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        AbstractC3612c.r("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f27096p0;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f27094n0) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i10));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f27088h0.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f27095o0 = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f27094n0 != z10) {
            this.f27094n0 = z10;
            d(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.f27094n0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
