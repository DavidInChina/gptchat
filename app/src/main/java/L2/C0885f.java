package L2;

import s2.AbstractC5530A;

/* renamed from: L2.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0885f {

    /* renamed from: a  reason: collision with root package name */
    public final long f10594a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10595b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10596c;

    /* renamed from: d  reason: collision with root package name */
    public long f10597d;

    /* renamed from: e  reason: collision with root package name */
    public long f10598e;

    /* renamed from: f  reason: collision with root package name */
    public long f10599f;

    /* renamed from: g  reason: collision with root package name */
    public long f10600g;

    /* renamed from: h  reason: collision with root package name */
    public long f10601h;

    public C0885f(long j6, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f10594a = j6;
        this.f10595b = j10;
        this.f10597d = j11;
        this.f10598e = j12;
        this.f10599f = j13;
        this.f10600g = j14;
        this.f10596c = j15;
        this.f10601h = a(j10, j11, j12, j13, j14, j15);
    }

    public static long a(long j6, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 < j13 && j10 + 1 < j11) {
            long j15 = ((float) (j6 - j10)) * (((float) (j13 - j12)) / ((float) (j11 - j10)));
            return AbstractC5530A.j(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }
        return j12;
    }
}
