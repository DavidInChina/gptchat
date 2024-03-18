package i5;

import h5.C3324b;
import i4.C3471d;

/* renamed from: i5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3475a {

    /* renamed from: a  reason: collision with root package name */
    public final C3324b f32705a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3480f f32706b;

    /* renamed from: c  reason: collision with root package name */
    public final P5.c f32707c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, P5.c] */
    public AbstractC3475a(C3324b c3324b, C3479e c3479e, C3471d c3471d) {
        this.f32705a = c3324b;
        this.f32706b = c3479e;
    }

    public final boolean a(long j6, long j10) {
        if (j6 <= 0) {
            return false;
        }
        this.f32707c.getClass();
        if (j6 > (j10 * 1000) + System.currentTimeMillis()) {
            return false;
        }
        return true;
    }
}
