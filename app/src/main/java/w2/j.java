package w2;

import java.io.File;

/* loaded from: classes.dex */
public abstract class j implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final String f47688Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f47689Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f47690h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f47691i0;

    /* renamed from: j0  reason: collision with root package name */
    public final File f47692j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f47693k0;

    public j(String str, long j6, long j10, long j11, File file) {
        boolean z10;
        this.f47688Y = str;
        this.f47689Z = j6;
        this.f47690h0 = j10;
        if (file != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47691i0 = z10;
        this.f47692j0 = file;
        this.f47693k0 = j11;
    }

    /* renamed from: a */
    public final int compareTo(j jVar) {
        String str = jVar.f47688Y;
        String str2 = this.f47688Y;
        if (!str2.equals(str)) {
            return str2.compareTo(jVar.f47688Y);
        }
        int i10 = ((this.f47689Z - jVar.f47689Z) > 0L ? 1 : ((this.f47689Z - jVar.f47689Z) == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 < 0) {
            return -1;
        }
        return 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f47689Z);
        sb2.append(", ");
        return android.gov.nist.core.a.m(sb2, this.f47690h0, "]");
    }
}
