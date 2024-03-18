package w0;

import N.C1025i;
import android.graphics.Shader;
import r0.AbstractC5350n;
import r0.C5351o;
import r0.N;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f47649a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f47650b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f47651c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f47652d = {16842755, 16843781};

    public static final AbstractC5350n a(C1025i c1025i) {
        boolean z10;
        Object obj = c1025i.f12351h0;
        if (((Shader) obj) != null || c1025i.f12350Z != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Shader shader = (Shader) obj;
            if (shader != null) {
                return new C5351o(shader);
            }
            return new N(androidx.compose.ui.graphics.a.b(c1025i.f12350Z));
        }
        return null;
    }
}
