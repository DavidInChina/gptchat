package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: m  reason: collision with root package name */
    public static final SparseIntArray f36927m;

    /* renamed from: a  reason: collision with root package name */
    public float f36928a;

    /* renamed from: b  reason: collision with root package name */
    public float f36929b;

    /* renamed from: c  reason: collision with root package name */
    public float f36930c;

    /* renamed from: d  reason: collision with root package name */
    public float f36931d;

    /* renamed from: e  reason: collision with root package name */
    public float f36932e;

    /* renamed from: f  reason: collision with root package name */
    public float f36933f;

    /* renamed from: g  reason: collision with root package name */
    public float f36934g;

    /* renamed from: h  reason: collision with root package name */
    public float f36935h;

    /* renamed from: i  reason: collision with root package name */
    public float f36936i;

    /* renamed from: j  reason: collision with root package name */
    public float f36937j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f36938k;

    /* renamed from: l  reason: collision with root package name */
    public float f36939l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f36927m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f36952h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f36927m.get(index)) {
                case 1:
                    this.f36928a = obtainStyledAttributes.getFloat(index, this.f36928a);
                    break;
                case 2:
                    this.f36929b = obtainStyledAttributes.getFloat(index, this.f36929b);
                    break;
                case 3:
                    this.f36930c = obtainStyledAttributes.getFloat(index, this.f36930c);
                    break;
                case 4:
                    this.f36931d = obtainStyledAttributes.getFloat(index, this.f36931d);
                    break;
                case 5:
                    this.f36932e = obtainStyledAttributes.getFloat(index, this.f36932e);
                    break;
                case 6:
                    this.f36933f = obtainStyledAttributes.getDimension(index, this.f36933f);
                    break;
                case 7:
                    this.f36934g = obtainStyledAttributes.getDimension(index, this.f36934g);
                    break;
                case 8:
                    this.f36935h = obtainStyledAttributes.getDimension(index, this.f36935h);
                    break;
                case 9:
                    this.f36936i = obtainStyledAttributes.getDimension(index, this.f36936i);
                    break;
                case 10:
                    this.f36937j = obtainStyledAttributes.getDimension(index, this.f36937j);
                    break;
                case 11:
                    this.f36938k = true;
                    this.f36939l = obtainStyledAttributes.getDimension(index, this.f36939l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
