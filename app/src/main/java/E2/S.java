package E2;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public long f4231a;

    /* renamed from: b  reason: collision with root package name */
    public long f4232b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4233c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4234d;

    public S(long j6, int i10) {
        Gi.e.n(((I2.a) this.f4233c) == null);
        this.f4231a = j6;
        this.f4232b = j6 + i10;
    }

    public final int a(long j6) {
        return ((int) (j6 - this.f4231a)) + ((I2.a) this.f4233c).f7958b;
    }

    public S(String str, byte[] bArr, long j6, long j10) {
        this.f4233c = str;
        this.f4234d = bArr;
        this.f4231a = j6;
        this.f4232b = j10;
    }
}
