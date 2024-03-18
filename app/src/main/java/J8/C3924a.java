package j8;

import M3.H;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.openai.chatgpt.R;
import q.C5215i0;

/* renamed from: j8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3924a extends C5215i0 {
    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            int i12 = iArr[i11];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i12, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i10 = dimensionPixelSize;
            } else {
                i10 = typedArray.getDimensionPixelSize(i12, -1);
            }
        }
        return i10;
    }

    @Override // q.C5215i0, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (H.k0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, O7.a.f13418q);
            int m10 = m(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m10 >= 0) {
                setLineHeight(m10);
            }
        }
    }
}
