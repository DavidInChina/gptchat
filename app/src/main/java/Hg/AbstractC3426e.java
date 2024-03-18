package hg;

/* renamed from: hg.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3426e {

    /* renamed from: a  reason: collision with root package name */
    public final int f32296a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32297b;

    public AbstractC3426e(int i10, int i11) {
        this.f32296a = i10;
        this.f32297b = i11;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hg.c, hg.e] */
    public static C3424c a(AbstractC3426e abstractC3426e) {
        return new AbstractC3426e(abstractC3426e.f32296a + abstractC3426e.f32297b, 1);
    }

    public static C3424c b() {
        return new C3424c(0);
    }
}
