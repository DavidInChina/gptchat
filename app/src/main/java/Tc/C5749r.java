package tc;

import ah.AbstractC1998i;
import dh.C2695d;
import dh.u0;
import java.util.Set;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* renamed from: tc.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5749r {
    public static final C5748q Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f46101e = {null, null, null, new C2695d(u0.f28491a, 2)};

    /* renamed from: a  reason: collision with root package name */
    public final C5746o f46102a;

    /* renamed from: b  reason: collision with root package name */
    public final C5755x f46103b;

    /* renamed from: c  reason: collision with root package name */
    public final C5752u f46104c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f46105d;

    public C5749r(int i10, C5746o c5746o, C5755x c5755x, C5752u c5752u, Set set) {
        if (15 == (i10 & 15)) {
            this.f46102a = c5746o;
            this.f46103b = c5755x;
            this.f46104c = c5752u;
            this.f46105d = set;
            return;
        }
        R4.b.e2(i10, 15, C5747p.f46100b);
        throw null;
    }
}
