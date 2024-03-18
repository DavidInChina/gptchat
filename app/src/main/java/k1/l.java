package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public int f36923a;

    /* renamed from: b  reason: collision with root package name */
    public int f36924b;

    /* renamed from: c  reason: collision with root package name */
    public float f36925c;

    /* renamed from: d  reason: collision with root package name */
    public float f36926d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f36950f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f36925c = obtainStyledAttributes.getFloat(index, this.f36925c);
            } else if (index == 0) {
                int i11 = obtainStyledAttributes.getInt(index, this.f36923a);
                this.f36923a = i11;
                this.f36923a = n.f36940d[i11];
            } else if (index == 4) {
                this.f36924b = obtainStyledAttributes.getInt(index, this.f36924b);
            } else if (index == 3) {
                this.f36926d = obtainStyledAttributes.getFloat(index, this.f36926d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
