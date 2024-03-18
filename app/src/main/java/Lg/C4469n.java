package lg;

/* renamed from: lg.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4469n implements Comparable {

    /* renamed from: Z  reason: collision with root package name */
    public final int f38405Z;

    /* renamed from: h0  reason: collision with root package name */
    public final EnumC4454L f38406h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f38407i0;

    /* renamed from: Y  reason: collision with root package name */
    public final r f38404Y = null;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f38408j0 = false;

    public C4469n(int i10, EnumC4454L enumC4454L, boolean z10) {
        this.f38405Z = i10;
        this.f38406h0 = enumC4454L;
        this.f38407i0 = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38405Z - ((C4469n) obj).f38405Z;
    }
}
