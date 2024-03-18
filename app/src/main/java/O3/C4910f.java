package o3;

/* renamed from: o3.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4910f implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f40556Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4906b f40557Z;

    public C4910f(int i10, C4906b c4906b) {
        this.f40556Y = i10;
        this.f40557Z = c4906b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f40556Y, ((C4910f) obj).f40556Y);
    }
}
