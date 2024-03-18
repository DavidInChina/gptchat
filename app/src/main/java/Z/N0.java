package Z;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import xf.AbstractC6438a;

/* loaded from: classes.dex */
public final class N0 implements Iterable, AbstractC6438a {

    /* renamed from: Z  reason: collision with root package name */
    public int f22521Z;

    /* renamed from: i0  reason: collision with root package name */
    public int f22523i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f22524j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f22525k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f22526l0;

    /* renamed from: n0  reason: collision with root package name */
    public HashMap f22528n0;

    /* renamed from: Y  reason: collision with root package name */
    public int[] f22520Y = new int[0];

    /* renamed from: h0  reason: collision with root package name */
    public Object[] f22522h0 = new Object[0];

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList f22527m0 = new ArrayList();

    public final boolean I(C1705d c1705d) {
        int o02;
        if (c1705d.a() && (o02 = M3.H.o0(this.f22527m0, c1705d.f22611a, this.f22521Z)) >= 0 && AbstractC3557B.K(this.f22527m0.get(o02), c1705d)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Q(0, this.f22521Z, this);
    }

    public final int r(C1705d c1705d) {
        if (!this.f22525k0) {
            if (c1705d.a()) {
                return c1705d.f22611a;
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        AbstractC1734s.j("Use active SlotWriter to determine anchor location instead".toString());
        throw null;
    }

    public final M0 s() {
        if (!this.f22525k0) {
            this.f22524j0++;
            return new M0(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final Q0 y() {
        if (!this.f22525k0) {
            if (this.f22524j0 <= 0) {
                this.f22525k0 = true;
                this.f22526l0++;
                return new Q0(this);
            }
            AbstractC1734s.j("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        AbstractC1734s.j("Cannot start a writer when another writer is pending".toString());
        throw null;
    }
}
