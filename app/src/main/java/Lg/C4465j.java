package lg;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: lg.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4465j {

    /* renamed from: d  reason: collision with root package name */
    public static final C4465j f38396d = new C4465j(0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f38398b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38399c = false;

    /* renamed from: a  reason: collision with root package name */
    public final C4444B f38397a = new C4444B(16);

    public C4465j() {
    }

    public static int c(EnumC4454L enumC4454L, Object obj) {
        switch (enumC4454L.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C4462g.g(((Long) obj).longValue());
            case 3:
                return C4462g.g(((Long) obj).longValue());
            case 4:
                return C4462g.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C4462g.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case 9:
                return ((AbstractC4456a) obj).a();
            case 10:
                return C4462g.e((AbstractC4456a) obj);
            case 11:
                if (obj instanceof AbstractC4460e) {
                    AbstractC4460e abstractC4460e = (AbstractC4460e) obj;
                    return abstractC4460e.size() + C4462g.f(abstractC4460e.size());
                }
                byte[] bArr = (byte[]) obj;
                return C4462g.f(bArr.length) + bArr.length;
            case 12:
                return C4462g.f(((Integer) obj).intValue());
            case 13:
                if (obj instanceof q) {
                    return C4462g.c(((q) obj).a());
                }
                return C4462g.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C4462g.f((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return C4462g.g((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C4469n c4469n, Object obj) {
        EnumC4454L enumC4454L = c4469n.f38406h0;
        boolean z10 = c4469n.f38407i0;
        int i10 = c4469n.f38405Z;
        if (z10) {
            int i11 = 0;
            if (c4469n.f38408j0) {
                for (Object obj2 : (List) obj) {
                    i11 += c(enumC4454L, obj2);
                }
                return C4462g.f(i11) + C4462g.h(i10) + i11;
            }
            for (Object obj3 : (List) obj) {
                int h10 = C4462g.h(i10);
                if (enumC4454L == EnumC4454L.GROUP) {
                    h10 *= 2;
                }
                i11 += c(enumC4454L, obj3) + h10;
            }
            return i11;
        }
        int h11 = C4462g.h(i10);
        if (enumC4454L == EnumC4454L.GROUP) {
            h11 *= 2;
        }
        return c(enumC4454L, obj) + h11;
    }

    public static boolean e(Map.Entry entry) {
        C4469n c4469n = (C4469n) entry.getKey();
        if (c4469n.f38406h0.f38355Y == EnumC4455M.f38365o0) {
            if (c4469n.f38407i0) {
                for (AbstractC4456a abstractC4456a : (List) entry.getValue()) {
                    if (!abstractC4456a.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }
            Object value = entry.getValue();
            if (value instanceof AbstractC4456a) {
                if (!((AbstractC4456a) value).isInitialized()) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    public static Object h(C4461f c4461f, EnumC4454L enumC4454L) {
        boolean z10 = true;
        switch (enumC4454L.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c4461f.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c4461f.i()));
            case 2:
                return Long.valueOf(c4461f.l());
            case 3:
                return Long.valueOf(c4461f.l());
            case 4:
                return Integer.valueOf(c4461f.k());
            case 5:
                return Long.valueOf(c4461f.j());
            case 6:
                return Integer.valueOf(c4461f.i());
            case 7:
                if (c4461f.l() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 8:
                int k10 = c4461f.k();
                int i10 = c4461f.f38380b;
                int i11 = c4461f.f38382d;
                if (k10 <= i10 - i11 && k10 > 0) {
                    String str = new String(c4461f.f38379a, i11, k10, "UTF-8");
                    c4461f.f38382d += k10;
                    return str;
                } else if (k10 == 0) {
                    return "";
                } else {
                    return new String(c4461f.h(k10), "UTF-8");
                }
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c4461f.e();
            case 12:
                return Integer.valueOf(c4461f.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c4461f.i());
            case 15:
                return Long.valueOf(c4461f.j());
            case 16:
                int k11 = c4461f.k();
                return Integer.valueOf((-(k11 & 1)) ^ (k11 >>> 1));
            case 17:
                long l10 = c4461f.l();
                return Long.valueOf((-(l10 & 1)) ^ (l10 >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(EnumC4454L enumC4454L, Object obj) {
        boolean z10;
        obj.getClass();
        switch (enumC4454L.f38355Y.ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 1:
                z10 = obj instanceof Long;
                if (z10) {
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 2:
                z10 = obj instanceof Float;
                if (z10) {
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 3:
                z10 = obj instanceof Double;
                if (z10) {
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 4:
                z10 = obj instanceof Boolean;
                if (z10) {
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 5:
                z10 = obj instanceof String;
                if (z10) {
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 6:
                if ((obj instanceof AbstractC4460e) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 7:
                if ((obj instanceof Integer) || (obj instanceof q)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if (obj instanceof AbstractC4456a) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(C4462g c4462g, EnumC4454L enumC4454L, int i10, Object obj) {
        if (enumC4454L == EnumC4454L.GROUP) {
            c4462g.x(i10, 3);
            ((AbstractC4456a) obj).d(c4462g);
            c4462g.x(i10, 4);
            return;
        }
        c4462g.x(i10, enumC4454L.f38356Z);
        l(c4462g, enumC4454L, obj);
    }

    public static void l(C4462g c4462g, EnumC4454L enumC4454L, Object obj) {
        switch (enumC4454L.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                c4462g.getClass();
                c4462g.u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                c4462g.getClass();
                c4462g.t(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                c4462g.w(((Long) obj).longValue());
                return;
            case 3:
                c4462g.w(((Long) obj).longValue());
                return;
            case 4:
                c4462g.n(((Integer) obj).intValue());
                return;
            case 5:
                c4462g.u(((Long) obj).longValue());
                return;
            case 6:
                c4462g.t(((Integer) obj).intValue());
                return;
            case 7:
                c4462g.q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                c4462g.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c4462g.v(bytes.length);
                c4462g.s(bytes);
                return;
            case 9:
                c4462g.getClass();
                ((AbstractC4456a) obj).d(c4462g);
                return;
            case 10:
                c4462g.p((AbstractC4456a) obj);
                return;
            case 11:
                if (obj instanceof AbstractC4460e) {
                    AbstractC4460e abstractC4460e = (AbstractC4460e) obj;
                    c4462g.getClass();
                    c4462g.v(abstractC4460e.size());
                    c4462g.r(abstractC4460e);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                c4462g.getClass();
                c4462g.v(bArr.length);
                c4462g.s(bArr);
                return;
            case 12:
                c4462g.v(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof q) {
                    c4462g.n(((q) obj).a());
                    return;
                } else {
                    c4462g.n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                c4462g.t(((Integer) obj).intValue());
                return;
            case 15:
                c4462g.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c4462g.v((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c4462g.w((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a(C4469n c4469n, Object obj) {
        List list;
        if (c4469n.f38407i0) {
            j(c4469n.f38406h0, obj);
            C4444B c4444b = this.f38397a;
            Object obj2 = c4444b.get(c4469n);
            if (obj2 == null) {
                list = new ArrayList();
                c4444b.put(c4469n, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public final C4465j clone() {
        C4444B c4444b;
        C4465j c4465j = new C4465j();
        int i10 = 0;
        while (true) {
            c4444b = this.f38397a;
            if (i10 >= c4444b.f38339Z.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c4444b.f38339Z.get(i10);
            c4465j.i((C4469n) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : c4444b.h()) {
            c4465j.i((C4469n) entry2.getKey(), entry2.getValue());
        }
        c4465j.f38399c = this.f38399c;
        return c4465j;
    }

    public final void f() {
        Map map;
        if (this.f38398b) {
            return;
        }
        C4444B c4444b = this.f38397a;
        if (!c4444b.f38341i0) {
            for (int i10 = 0; i10 < c4444b.f38339Z.size(); i10++) {
                Map.Entry entry = (Map.Entry) c4444b.f38339Z.get(i10);
                if (((C4469n) entry.getKey()).f38407i0) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c4444b.h()) {
                if (((C4469n) entry2.getKey()).f38407i0) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c4444b.f38341i0) {
            if (c4444b.f38340h0.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(c4444b.f38340h0);
            }
            c4444b.f38340h0 = map;
            c4444b.f38341i0 = true;
        }
        this.f38398b = true;
    }

    public final void g(Map.Entry entry) {
        C4469n c4469n = (C4469n) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = c4469n.f38407i0;
        C4444B c4444b = this.f38397a;
        if (z10) {
            Object obj = c4444b.get(c4469n);
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
            c4444b.put(c4469n, obj);
        } else if (c4469n.f38406h0.f38355Y == EnumC4455M.f38365o0) {
            Object obj3 = c4444b.get(c4469n);
            if (obj3 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                c4444b.put(c4469n, value);
                return;
            }
            c4444b.put(c4469n, ((AbstractC4466k) ((AbstractC4456a) obj3).c()).c((p) ((AbstractC4456a) value)).a());
        } else {
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            c4444b.put(c4469n, value);
        }
    }

    public final void i(C4469n c4469n, Object obj) {
        boolean z10 = c4469n.f38407i0;
        EnumC4454L enumC4454L = c4469n.f38406h0;
        if (z10) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j(enumC4454L, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            j(enumC4454L, obj);
        }
        this.f38397a.put(c4469n, obj);
    }

    public C4465j(int i10) {
        f();
    }
}
