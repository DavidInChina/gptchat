package com.google.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: d  reason: collision with root package name */
    public static final S f27491d = new S(0);

    /* renamed from: a  reason: collision with root package name */
    public final C2510h1 f27492a = new C2510h1(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f27493b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27494c;

    public S() {
    }

    public static int c(N1 n12, int i10, Object obj) {
        int o02 = AbstractC2549y.o0(i10);
        if (n12 == N1.GROUP) {
            o02 *= 2;
        }
        return d(n12, obj) + o02;
    }

    public static int d(N1 n12, Object obj) {
        switch (n12.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC2549y.f27642d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC2549y.f27642d;
                return 4;
            case 2:
                return AbstractC2549y.s0(((Long) obj).longValue());
            case 3:
                return AbstractC2549y.s0(((Long) obj).longValue());
            case 4:
                return AbstractC2549y.g0(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC2549y.f27642d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC2549y.f27642d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC2549y.f27642d;
                return 1;
            case 8:
                if (obj instanceof AbstractC2534q) {
                    return AbstractC2549y.Y((AbstractC2534q) obj);
                }
                return AbstractC2549y.n0((String) obj);
            case 9:
                Logger logger6 = AbstractC2549y.f27642d;
                return ((M0) obj).getSerializedSize();
            case 10:
                Logger logger7 = AbstractC2549y.f27642d;
                int serializedSize = ((M0) obj).getSerializedSize();
                return AbstractC2549y.q0(serializedSize) + serializedSize;
            case 11:
                if (obj instanceof AbstractC2534q) {
                    return AbstractC2549y.Y((AbstractC2534q) obj);
                }
                Logger logger8 = AbstractC2549y.f27642d;
                int length = ((byte[]) obj).length;
                return AbstractC2549y.q0(length) + length;
            case 12:
                return AbstractC2549y.q0(((Integer) obj).intValue());
            case 13:
                if (obj instanceof AbstractC2515j0) {
                    return AbstractC2549y.g0(((AbstractC2515j0) obj).a());
                }
                return AbstractC2549y.g0(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = AbstractC2549y.f27642d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = AbstractC2549y.f27642d;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return AbstractC2549y.q0((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return AbstractC2549y.s0((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(C2488a0 c2488a0, Object obj) {
        N1 n12 = c2488a0.f27516h0;
        boolean z10 = c2488a0.f27517i0;
        int i10 = c2488a0.f27515Z;
        if (z10) {
            List<Object> list = (List) obj;
            int i11 = 0;
            if (c2488a0.f27518j0) {
                if (list.isEmpty()) {
                    return 0;
                }
                for (Object obj2 : list) {
                    i11 += d(n12, obj2);
                }
                return AbstractC2549y.q0(i11) + AbstractC2549y.o0(i10) + i11;
            }
            for (Object obj3 : list) {
                i11 += c(n12, i10, obj3);
            }
            return i11;
        }
        return c(n12, i10, obj);
    }

    public static int g(Map.Entry entry) {
        C2488a0 c2488a0 = (C2488a0) entry.getKey();
        Object value = entry.getValue();
        if (c2488a0.f27516h0.f27433Y == O1.f27466o0 && !c2488a0.f27517i0 && !c2488a0.f27518j0) {
            int p02 = AbstractC2549y.p0(2, ((C2488a0) entry.getKey()).f27515Z) + (AbstractC2549y.o0(1) * 2);
            int o02 = AbstractC2549y.o0(3);
            int serializedSize = ((M0) value).getSerializedSize();
            return AbstractC2469q0.e(serializedSize, serializedSize, o02, p02);
        }
        return e(c2488a0, value);
    }

    public static boolean k(Map.Entry entry) {
        C2488a0 c2488a0 = (C2488a0) entry.getKey();
        if (c2488a0.f27516h0.f27433Y == O1.f27466o0) {
            if (c2488a0.f27517i0) {
                for (Object obj : (List) entry.getValue()) {
                    if (obj instanceof N0) {
                        if (!((N0) obj).isInitialized()) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                }
                return true;
            }
            Object value = entry.getValue();
            if (value instanceof N0) {
                return ((N0) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(C2488a0 c2488a0, Object obj) {
        boolean z10;
        N1 n12 = c2488a0.f27516h0;
        Charset charset = AbstractC2536r0.f27584a;
        obj.getClass();
        switch (n12.f27433Y.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 6:
                if ((obj instanceof AbstractC2534q) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof AbstractC2515j0)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            case 8:
                z10 = obj instanceof M0;
                if (z10) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2488a0.f27515Z), c2488a0.f27516h0.f27433Y, obj.getClass().getName()));
        }
    }

    public static void r(AbstractC2549y abstractC2549y, N1 n12, int i10, Object obj) {
        if (n12 == N1.GROUP) {
            abstractC2549y.M0(i10, 3);
            ((M0) obj).writeTo(abstractC2549y);
            abstractC2549y.M0(i10, 4);
            return;
        }
        abstractC2549y.M0(i10, n12.f27434Z);
        switch (n12.ordinal()) {
            case 0:
                abstractC2549y.D0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                abstractC2549y.B0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                abstractC2549y.Q0(((Long) obj).longValue());
                return;
            case 3:
                abstractC2549y.Q0(((Long) obj).longValue());
                return;
            case 4:
                abstractC2549y.F0(((Integer) obj).intValue());
                return;
            case 5:
                abstractC2549y.D0(((Long) obj).longValue());
                return;
            case 6:
                abstractC2549y.B0(((Integer) obj).intValue());
                return;
            case 7:
                abstractC2549y.v0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof AbstractC2534q) {
                    abstractC2549y.z0((AbstractC2534q) obj);
                    return;
                } else {
                    abstractC2549y.L0((String) obj);
                    return;
                }
            case 9:
                ((M0) obj).writeTo(abstractC2549y);
                return;
            case 10:
                abstractC2549y.H0((M0) obj);
                return;
            case 11:
                if (obj instanceof AbstractC2534q) {
                    abstractC2549y.z0((AbstractC2534q) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                abstractC2549y.x0(bArr, bArr.length);
                return;
            case 12:
                abstractC2549y.O0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof AbstractC2515j0) {
                    abstractC2549y.F0(((AbstractC2515j0) obj).a());
                    return;
                } else {
                    abstractC2549y.F0(((Integer) obj).intValue());
                    return;
                }
            case 14:
                abstractC2549y.B0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC2549y.D0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                abstractC2549y.O0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                abstractC2549y.Q0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a(C2488a0 c2488a0, Object obj) {
        List list;
        if (c2488a0.f27517i0) {
            q(c2488a0, obj);
            C2510h1 c2510h1 = this.f27492a;
            Object obj2 = c2510h1.get(c2488a0);
            if (obj2 == null) {
                list = new ArrayList();
                c2510h1.put(c2488a0, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public final S clone() {
        C2510h1 c2510h1;
        S s10 = new S();
        int i10 = 0;
        while (true) {
            c2510h1 = this.f27492a;
            if (i10 >= c2510h1.f27555Z.size()) {
                break;
            }
            Map.Entry i11 = c2510h1.i(i10);
            s10.p((C2488a0) i11.getKey(), i11.getValue());
            i10++;
        }
        for (Map.Entry entry : c2510h1.j()) {
            s10.p((C2488a0) entry.getKey(), entry.getValue());
        }
        s10.f27494c = this.f27494c;
        return s10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return this.f27492a.equals(((S) obj).f27492a);
    }

    public final int f() {
        C2510h1 c2510h1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            c2510h1 = this.f27492a;
            if (i10 >= c2510h1.f27555Z.size()) {
                break;
            }
            i11 += g(c2510h1.i(i10));
            i10++;
        }
        for (Map.Entry entry : c2510h1.j()) {
            i11 += g(entry);
        }
        return i11;
    }

    public final int h() {
        C2510h1 c2510h1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            c2510h1 = this.f27492a;
            if (i10 >= c2510h1.f27555Z.size()) {
                break;
            }
            Map.Entry i12 = c2510h1.i(i10);
            i11 += e((C2488a0) i12.getKey(), i12.getValue());
            i10++;
        }
        for (Map.Entry entry : c2510h1.j()) {
            i11 += e((C2488a0) entry.getKey(), entry.getValue());
        }
        return i11;
    }

    public final int hashCode() {
        return this.f27492a.hashCode();
    }

    public final boolean i() {
        return this.f27492a.isEmpty();
    }

    public final boolean j() {
        int i10 = 0;
        while (true) {
            C2510h1 c2510h1 = this.f27492a;
            if (i10 < c2510h1.f27555Z.size()) {
                if (!k(c2510h1.i(i10))) {
                    return false;
                }
                i10++;
            } else {
                for (Map.Entry entry : c2510h1.j()) {
                    if (!k(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final Iterator l() {
        boolean z10 = this.f27494c;
        C2510h1 c2510h1 = this.f27492a;
        if (z10) {
            return new androidx.datastore.preferences.protobuf.F(c2510h1.entrySet().iterator(), 2);
        }
        return c2510h1.entrySet().iterator();
    }

    public final void m() {
        C2510h1 c2510h1;
        Map map;
        Map map2;
        if (this.f27493b) {
            return;
        }
        int i10 = 0;
        while (true) {
            c2510h1 = this.f27492a;
            if (i10 >= c2510h1.f27555Z.size()) {
                break;
            }
            Map.Entry i11 = c2510h1.i(i10);
            if (i11.getValue() instanceof AbstractC2497d0) {
                ((AbstractC2497d0) i11.getValue()).makeImmutable();
            }
            i10++;
        }
        if (!c2510h1.f27557i0) {
            for (int i12 = 0; i12 < c2510h1.f27555Z.size(); i12++) {
                Map.Entry i13 = c2510h1.i(i12);
                if (((C2488a0) i13.getKey()).f27517i0) {
                    i13.setValue(Collections.unmodifiableList((List) i13.getValue()));
                }
            }
            for (Map.Entry entry : c2510h1.j()) {
                if (((C2488a0) entry.getKey()).f27517i0) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!c2510h1.f27557i0) {
            if (c2510h1.f27556h0.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(c2510h1.f27556h0);
            }
            c2510h1.f27556h0 = map;
            if (c2510h1.f27559k0.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(c2510h1.f27559k0);
            }
            c2510h1.f27559k0 = map2;
            c2510h1.f27557i0 = true;
        }
        this.f27493b = true;
    }

    public final void n(S s10) {
        C2510h1 c2510h1;
        int i10 = 0;
        while (true) {
            int size = s10.f27492a.f27555Z.size();
            c2510h1 = s10.f27492a;
            if (i10 >= size) {
                break;
            }
            o(c2510h1.i(i10));
            i10++;
        }
        for (Map.Entry entry : c2510h1.j()) {
            o(entry);
        }
    }

    public final void o(Map.Entry entry) {
        C2488a0 c2488a0 = (C2488a0) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = c2488a0.f27517i0;
        C2510h1 c2510h1 = this.f27492a;
        if (z10) {
            Object obj = c2510h1.get(c2488a0);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            c2510h1.put(c2488a0, obj);
        } else if (c2488a0.f27516h0.f27433Y == O1.f27466o0) {
            Object obj3 = c2510h1.get(c2488a0);
            if (obj3 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                c2510h1.put(c2488a0, value);
                return;
            }
            X x10 = (X) ((M0) obj3).toBuilder();
            x10.f((AbstractC2497d0) ((M0) value));
            c2510h1.put(c2488a0, x10.b());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            c2510h1.put(c2488a0, value);
        }
    }

    public final void p(C2488a0 c2488a0, Object obj) {
        if (c2488a0.f27517i0) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    q(c2488a0, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            q(c2488a0, obj);
        }
        this.f27492a.put(c2488a0, obj);
    }

    public S(int i10) {
        m();
        m();
    }
}
