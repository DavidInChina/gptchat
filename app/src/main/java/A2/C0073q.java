package A2;

import p2.C5065s;

/* renamed from: A2.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073q extends Exception {

    /* renamed from: Y  reason: collision with root package name */
    public final int f583Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f584Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0073q(int i10, int i11, int i12, int i13, C5065s c5065s, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        String str;
        StringBuilder A10 = E9.f.A("AudioTrack init failed ", i10, " Config(", i11, ", ");
        A10.append(i12);
        A10.append(", ");
        A10.append(i13);
        A10.append(") ");
        A10.append(c5065s);
        if (z10) {
            str = " (recoverable)";
        } else {
            str = "";
        }
        A10.append(str);
        this.f583Y = i10;
        this.f584Z = z10;
    }
}
