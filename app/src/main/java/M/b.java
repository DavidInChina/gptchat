package M;

import M3.H;
import N0.E;
import S0.r;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static b f11262h;

    /* renamed from: a  reason: collision with root package name */
    public final Z0.l f11263a;

    /* renamed from: b  reason: collision with root package name */
    public final E f11264b;

    /* renamed from: c  reason: collision with root package name */
    public final Z0.b f11265c;

    /* renamed from: d  reason: collision with root package name */
    public final r f11266d;

    /* renamed from: e  reason: collision with root package name */
    public final E f11267e;

    /* renamed from: f  reason: collision with root package name */
    public float f11268f = Float.NaN;

    /* renamed from: g  reason: collision with root package name */
    public float f11269g = Float.NaN;

    public b(Z0.l lVar, E e10, Z0.b bVar, r rVar) {
        this.f11263a = lVar;
        this.f11264b = e10;
        this.f11265c = bVar;
        this.f11266d = rVar;
        this.f11267e = R4.b.U1(e10, lVar);
    }

    public final long a(int i10, long j6) {
        float f6 = this.f11269g;
        float f10 = this.f11268f;
        int i11 = 0;
        if (Float.isNaN(f6) || Float.isNaN(f10)) {
            float b10 = H.g(c.f11270a, this.f11267e, A7.b.n(0, 0, 0, 0, 15), this.f11265c, this.f11266d, null, 1, 96).b();
            float b11 = H.g(c.f11271b, this.f11267e, A7.b.n(0, 0, 0, 0, 15), this.f11265c, this.f11266d, null, 2, 96).b() - b10;
            this.f11269g = b10;
            this.f11268f = b11;
            f10 = b11;
            f6 = b10;
        }
        if (i10 != 1) {
            int Y02 = AbstractC4344b.Y0((f10 * (i10 - 1)) + f6);
            if (Y02 >= 0) {
                i11 = Y02;
            }
            int g10 = Z0.a.g(j6);
            if (i11 > g10) {
                i11 = g10;
            }
        } else {
            i11 = Z0.a.i(j6);
        }
        return A7.b.m(Z0.a.j(j6), Z0.a.h(j6), i11, Z0.a.g(j6));
    }
}
