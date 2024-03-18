package N;

import E0.AbstractC0461u;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import nf.AbstractC4828h;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final long f12240a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12241b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0461u f12242c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12243d;

    /* renamed from: e  reason: collision with root package name */
    public final C1034s f12244e;

    /* renamed from: f  reason: collision with root package name */
    public final Comparator f12245f;

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashMap f12246g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f12247h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public int f12248i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f12249j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f12250k = -1;

    public S(long j6, long j10, AbstractC0461u abstractC0461u, boolean z10, C1034s c1034s, b0 b0Var) {
        this.f12240a = j6;
        this.f12241b = j10;
        this.f12242c = abstractC0461u;
        this.f12243d = z10;
        this.f12244e = c1034s;
        this.f12245f = b0Var;
    }

    public final int a(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        int f6 = AbstractC6708l.f(AbstractC4828h.h0(i11, i12));
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2) {
                    throw new RuntimeException();
                }
                return i10;
            }
            return this.f12250k;
        }
        return this.f12250k - 1;
    }
}
