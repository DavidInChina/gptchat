package s2;

/* loaded from: classes2.dex */
public final class q implements e3.d {

    /* renamed from: a  reason: collision with root package name */
    public int f45174a;

    /* renamed from: b  reason: collision with root package name */
    public int f45175b;

    /* renamed from: c  reason: collision with root package name */
    public int f45176c;

    /* renamed from: d  reason: collision with root package name */
    public int f45177d;

    /* renamed from: e  reason: collision with root package name */
    public Object f45178e;

    @Override // e3.d
    public final int a() {
        return -1;
    }

    @Override // e3.d
    public final int b() {
        return this.f45174a;
    }

    @Override // e3.d
    public final int c() {
        int i10 = this.f45175b;
        Object obj = this.f45178e;
        if (i10 == 8) {
            return ((u) obj).u();
        }
        if (i10 == 16) {
            return ((u) obj).z();
        }
        int i11 = this.f45176c;
        this.f45176c = i11 + 1;
        if (i11 % 2 == 0) {
            int u10 = ((u) obj).u();
            this.f45177d = u10;
            return (u10 & 240) >> 4;
        }
        return this.f45177d & 15;
    }
}
