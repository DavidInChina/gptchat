package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035u {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f25115c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final i0 f25116a = new i0(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f25117b;

    static {
        new C2035u(0);
    }

    public C2035u() {
    }

    public static void b(AbstractC2031p abstractC2031p, F0 f02, int i10, Object obj) {
        if (f02 == F0.GROUP) {
            abstractC2031p.X(i10, 3);
            ((AbstractC2011b) obj).c(abstractC2031p);
            abstractC2031p.X(i10, 4);
            return;
        }
        abstractC2031p.X(i10, f02.f24980Z);
        switch (f02.ordinal()) {
            case 0:
                abstractC2031p.Q(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                abstractC2031p.O(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                abstractC2031p.b0(((Long) obj).longValue());
                return;
            case 3:
                abstractC2031p.b0(((Long) obj).longValue());
                return;
            case 4:
                abstractC2031p.S(((Integer) obj).intValue());
                return;
            case 5:
                abstractC2031p.Q(((Long) obj).longValue());
                return;
            case 6:
                abstractC2031p.O(((Integer) obj).intValue());
                return;
            case 7:
                abstractC2031p.I(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof AbstractC2025j) {
                    abstractC2031p.M((AbstractC2025j) obj);
                    return;
                } else {
                    abstractC2031p.W((String) obj);
                    return;
                }
            case 9:
                ((AbstractC2011b) obj).c(abstractC2031p);
                return;
            case 10:
                abstractC2031p.U((AbstractC2011b) obj);
                return;
            case 11:
                if (obj instanceof AbstractC2025j) {
                    abstractC2031p.M((AbstractC2025j) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                abstractC2031p.K(bArr, bArr.length);
                return;
            case 12:
                abstractC2031p.Z(((Integer) obj).intValue());
                return;
            case 13:
                abstractC2031p.S(((Integer) obj).intValue());
                return;
            case 14:
                abstractC2031p.O(((Integer) obj).intValue());
                return;
            case 15:
                abstractC2031p.Q(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                abstractC2031p.Z((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC2031p.b0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map map;
        Map map2;
        if (this.f25117b) {
            return;
        }
        i0 i0Var = this.f25116a;
        if (!i0Var.f25063i0) {
            if (i0Var.f25061Z.size() <= 0) {
                Iterator it = i0Var.j().iterator();
                if (it.hasNext()) {
                    AbstractC2469q0.p(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                AbstractC2469q0.p(i0Var.i(0).getKey());
                throw null;
            }
        }
        if (!i0Var.f25063i0) {
            if (i0Var.f25062h0.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(i0Var.f25062h0);
            }
            i0Var.f25062h0 = map;
            if (i0Var.f25065k0.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(i0Var.f25065k0);
            }
            i0Var.f25065k0 = map2;
            i0Var.f25063i0 = true;
        }
        this.f25117b = true;
    }

    public final Object clone() {
        C2035u c2035u = new C2035u();
        i0 i0Var = this.f25116a;
        if (i0Var.f25061Z.size() <= 0) {
            Iterator it = i0Var.j().iterator();
            if (!it.hasNext()) {
                return c2035u;
            }
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC2469q0.p(entry.getKey());
            entry.getValue();
            throw null;
        }
        Map.Entry i10 = i0Var.i(0);
        AbstractC2469q0.p(i10.getKey());
        i10.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2035u)) {
            return false;
        }
        return this.f25116a.equals(((C2035u) obj).f25116a);
    }

    public final int hashCode() {
        return this.f25116a.hashCode();
    }

    public C2035u(int i10) {
        a();
        a();
    }
}
