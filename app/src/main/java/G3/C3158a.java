package g3;

import java.util.List;
import x8.N;

/* renamed from: g3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3158a {

    /* renamed from: a  reason: collision with root package name */
    public final N f31162a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31163b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31164c;

    /* renamed from: d  reason: collision with root package name */
    public final long f31165d;

    public C3158a(long j6, long j10, List list) {
        this.f31162a = N.V(list);
        this.f31163b = j6;
        this.f31164c = j10;
        long j11 = -9223372036854775807L;
        if (j6 != -9223372036854775807L && j10 != -9223372036854775807L) {
            j11 = j6 + j10;
        }
        this.f31165d = j11;
    }
}
