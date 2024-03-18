package i8;

import D1.H;
import D1.Z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import s1.AbstractC5521c;
import t1.AbstractC5656b;

/* renamed from: i8.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3502t extends ArrayAdapter {

    /* renamed from: Y  reason: collision with root package name */
    public ColorStateList f32852Y;

    /* renamed from: Z  reason: collision with root package name */
    public ColorStateList f32853Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3503u f32854h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3502t(C3503u c3503u, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f32854h0 = c3503u;
        a();
    }

    public final void a() {
        boolean z10;
        ColorStateList colorStateList;
        C3503u c3503u = this.f32854h0;
        ColorStateList colorStateList2 = c3503u.f32862s0;
        if (colorStateList2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z10) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f32853Z = colorStateList;
        if (c3503u.f32861r0 != 0 && c3503u.f32862s0 != null) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC5521c.b(c3503u.f32862s0.getColorForState(iArr3, 0), c3503u.f32861r0), AbstractC5521c.b(c3503u.f32862s0.getColorForState(iArr2, 0), c3503u.f32861r0), c3503u.f32861r0});
        }
        this.f32852Y = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C3503u c3503u = this.f32854h0;
            RippleDrawable rippleDrawable = null;
            if (c3503u.getText().toString().contentEquals(textView.getText()) && c3503u.f32861r0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c3503u.f32861r0);
                if (this.f32853Z != null) {
                    AbstractC5656b.h(colorDrawable, this.f32852Y);
                    rippleDrawable = new RippleDrawable(this.f32853Z, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = Z.f3247a;
            H.q(textView, rippleDrawable);
        }
        return view2;
    }
}
