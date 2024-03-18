package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import f1.AbstractC2933a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f36918e;

    /* renamed from: a  reason: collision with root package name */
    public int f36919a;

    /* renamed from: b  reason: collision with root package name */
    public int f36920b;

    /* renamed from: c  reason: collision with root package name */
    public float f36921c;

    /* renamed from: d  reason: collision with root package name */
    public float f36922d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f36918e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f36949e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f36918e.get(index)) {
                case 1:
                    this.f36922d = obtainStyledAttributes.getFloat(index, this.f36922d);
                    break;
                case 2:
                    this.f36920b = obtainStyledAttributes.getInt(index, this.f36920b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC2933a.f29522a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f36919a = n.f(obtainStyledAttributes, index, this.f36919a);
                    break;
                case 6:
                    this.f36921c = obtainStyledAttributes.getFloat(index, this.f36921c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
