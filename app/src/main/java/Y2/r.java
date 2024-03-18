package y2;

import android.util.Base64;
import p2.q0;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements w8.l {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50679Y;

    public /* synthetic */ r(int i10) {
        this.f50679Y = i10;
    }

    @Override // w8.l
    public final Object get() {
        switch (this.f50679Y) {
            case 0:
                return new C6523j();
            case 1:
                byte[] bArr = new byte[12];
                z2.y.f51553i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                int i10 = J2.i.f8754a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
                    invoke.getClass();
                    return (q0) invoke;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
