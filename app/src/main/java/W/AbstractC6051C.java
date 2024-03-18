package w;

/* renamed from: w.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6051C {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f47565a = new Object();

    public static final void a(C6050B c6050b) {
        int i10 = c6050b.f47564i0;
        int[] iArr = c6050b.f47562Z;
        Object[] objArr = c6050b.f47563h0;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f47565a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c6050b.f47561Y = false;
        c6050b.f47564i0 = i11;
    }
}
