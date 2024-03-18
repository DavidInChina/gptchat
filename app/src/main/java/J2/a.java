package J2;

import p2.p0;
import p2.q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f8732a;

    public a(i iVar) {
        this.f8732a = iVar;
    }

    public final void a() {
        try {
            ((a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(q0.class).newInstance(this.f8732a)).a();
        } catch (Exception e10) {
            int i10 = p0.f42218Y;
            if (e10 instanceof p0) {
                throw ((p0) e10);
            }
            throw new Exception(e10);
        }
    }
}
