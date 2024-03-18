package p0;

import G0.AbstractC0579h;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class s implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public static final s f41717Y = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        if (qVar != null) {
            if (qVar2 != null) {
                int i10 = 0;
                if (androidx.compose.ui.focus.a.u(qVar) && androidx.compose.ui.focus.a.u(qVar2)) {
                    androidx.compose.ui.node.a A10 = AbstractC0579h.A(qVar);
                    androidx.compose.ui.node.a A11 = AbstractC0579h.A(qVar2);
                    if (AbstractC3557B.K(A10, A11)) {
                        return 0;
                    }
                    Object[] objArr = new androidx.compose.ui.node.a[16];
                    int i11 = 0;
                    while (A10 != null) {
                        int i12 = i11 + 1;
                        if (objArr.length < i12) {
                            objArr = Arrays.copyOf(objArr, Math.max(i12, objArr.length * 2));
                            AbstractC3557B.b0("copyOf(this, newSize)", objArr);
                        }
                        if (i11 != 0) {
                            kf.q.W2(0 + 1, 0, i11, objArr, objArr);
                        }
                        objArr[0] = A10;
                        i11++;
                        A10 = A10.E();
                    }
                    Object[] objArr2 = new androidx.compose.ui.node.a[16];
                    int i13 = 0;
                    while (A11 != null) {
                        int i14 = i13 + 1;
                        if (objArr2.length < i14) {
                            objArr2 = Arrays.copyOf(objArr2, Math.max(i14, objArr2.length * 2));
                            AbstractC3557B.b0("copyOf(this, newSize)", objArr2);
                        }
                        if (i13 != 0) {
                            kf.q.W2(0 + 1, 0, i13, objArr2, objArr2);
                        }
                        objArr2[0] = A11;
                        i13++;
                        A11 = A11.E();
                    }
                    int min = Math.min(i11 - 1, i13 - 1);
                    if (min >= 0) {
                        while (AbstractC3557B.K(objArr[i10], objArr2[i10])) {
                            if (i10 != min) {
                                i10++;
                            }
                        }
                        return AbstractC3557B.e0(((androidx.compose.ui.node.a) objArr[i10]).F(), ((androidx.compose.ui.node.a) objArr2[i10]).F());
                    }
                    throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                } else if (androidx.compose.ui.focus.a.u(qVar)) {
                    return -1;
                } else {
                    if (!androidx.compose.ui.focus.a.u(qVar2)) {
                        return 0;
                    }
                    return 1;
                }
            }
            throw new IllegalArgumentException("compare requires non-null focus targets".toString());
        }
        throw new IllegalArgumentException("compare requires non-null focus targets".toString());
    }
}
