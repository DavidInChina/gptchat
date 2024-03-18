package k1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.AbstractC3612c;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: h0  reason: collision with root package name */
    public int[] f36774h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f36775i0;

    /* renamed from: j0  reason: collision with root package name */
    public Context f36776j0;

    /* renamed from: k0  reason: collision with root package name */
    public i1.j f36777k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f36778l0;

    /* renamed from: m0  reason: collision with root package name */
    public HashMap f36779m0;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Context context;
        ConstraintLayout constraintLayout;
        int i10;
        Object obj;
        HashMap hashMap;
        if (str == null || str.length() == 0 || (context = this.f36776j0) == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getParent();
        }
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (isInEditMode() && constraintLayout != null) {
            if ((trim instanceof String) && (hashMap = constraintLayout.f24882t0) != null && hashMap.containsKey(trim)) {
                obj = constraintLayout.f24882t0.get(trim);
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                i10 = ((Integer) obj).intValue();
                if (i10 == 0 && constraintLayout != null) {
                    i10 = d(constraintLayout, trim);
                }
                if (i10 == 0) {
                    try {
                        i10 = q.class.getField(trim).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i10 == 0) {
                    i10 = context.getResources().getIdentifier(trim, ParameterNames.ID, context.getPackageName());
                }
                if (i10 == 0) {
                    this.f36779m0.put(Integer.valueOf(i10), trim);
                    b(i10);
                    return;
                }
                AbstractC3612c.r("ConstraintHelper", "Could not find id of \"" + trim + Separators.DOUBLE_QUOTE);
                return;
            }
        }
        i10 = 0;
        if (i10 == 0) {
            i10 = d(constraintLayout, trim);
        }
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f36775i0 + 1;
        int[] iArr = this.f36774h0;
        if (i11 > iArr.length) {
            this.f36774h0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f36774h0;
        int i12 = this.f36775i0;
        iArr2[i12] = i10;
        this.f36775i0 = i12 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f36775i0; i10++) {
                View view = (View) constraintLayout.f24870h0.get(this.f36774h0[i10]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f36776j0.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f36946b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f36778l0 = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(i1.d dVar, boolean z10);

    public final void g() {
        if (this.f36777k0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f36824k0 = this.f36777k0;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f36774h0, this.f36775i0);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f36778l0;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f36778l0 = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f36775i0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f36778l0 = null;
        this.f36775i0 = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
