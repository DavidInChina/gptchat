package S1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class g extends P5.c {

    /* renamed from: Z  reason: collision with root package name */
    public final TextView f16076Z;

    /* renamed from: h0  reason: collision with root package name */
    public final e f16077h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f16078i0 = true;

    public g(TextView textView) {
        super(11);
        this.f16076Z = textView;
        this.f16077h0 = new e(textView);
    }

    @Override // P5.c
    public final InputFilter[] D(InputFilter[] inputFilterArr) {
        if (!this.f16078i0) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof e) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            e eVar = this.f16077h0;
            if (i13 < length2) {
                if (inputFilterArr[i13] != eVar) {
                    i13++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // P5.c
    public final void K(boolean z10) {
        if (z10) {
            Q();
        }
    }

    @Override // P5.c
    public final void N(boolean z10) {
        this.f16078i0 = z10;
        Q();
        TextView textView = this.f16076Z;
        textView.setFilters(D(textView.getFilters()));
    }

    public final void Q() {
        TextView textView = this.f16076Z;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f16078i0) {
            if (!(transformationMethod instanceof k) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new k(transformationMethod);
            }
        } else if (transformationMethod instanceof k) {
            transformationMethod = ((k) transformationMethod).f16085a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
