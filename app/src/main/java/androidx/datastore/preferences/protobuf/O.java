package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final U3.i f24999a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f25000b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f25001c;

    public O(B0 b02, D0 d02, O1.i iVar) {
        this.f24999a = new U3.i(b02, "", d02, iVar);
    }

    public static int a(U3.i iVar, Object obj, Object obj2) {
        int i10;
        int a5;
        int E10;
        int a10;
        int E11;
        F0 f02 = (F0) iVar.f17414Y;
        int i11 = C2035u.f25115c;
        int i12 = 1;
        int C10 = AbstractC2031p.C(1);
        C0 c02 = F0.GROUP;
        if (f02 == c02) {
            C10 *= 2;
        }
        switch (f02.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i10 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                i10 = 4;
                break;
            case 2:
                i10 = AbstractC2031p.G(((Long) obj).longValue());
                break;
            case 3:
                i10 = AbstractC2031p.G(((Long) obj).longValue());
                break;
            case 4:
                i10 = AbstractC2031p.u(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                i10 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                i10 = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                i10 = 1;
                break;
            case 8:
                if (obj instanceof AbstractC2025j) {
                    i10 = AbstractC2031p.m((AbstractC2025j) obj);
                    break;
                } else {
                    i10 = AbstractC2031p.B((String) obj);
                    break;
                }
            case 9:
                i10 = ((AbstractC2011b) obj).a();
                break;
            case 10:
                a10 = ((AbstractC2011b) obj).a();
                E11 = AbstractC2031p.E(a10);
                i10 = a10 + E11;
                break;
            case 11:
                if (obj instanceof AbstractC2025j) {
                    i10 = AbstractC2031p.m((AbstractC2025j) obj);
                    break;
                } else {
                    a10 = ((byte[]) obj).length;
                    E11 = AbstractC2031p.E(a10);
                    i10 = a10 + E11;
                    break;
                }
            case 12:
                i10 = AbstractC2031p.E(((Integer) obj).intValue());
                break;
            case 13:
                i10 = AbstractC2031p.u(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                i10 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                i10 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i10 = AbstractC2031p.E((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i10 = AbstractC2031p.G((longValue >> 63) ^ (longValue << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int i13 = i10 + C10;
        F0 f03 = (F0) iVar.f17416h0;
        int C11 = AbstractC2031p.C(2);
        if (f03 == c02) {
            C11 *= 2;
        }
        switch (f03.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                i12 = 8;
                break;
            case 1:
                ((Float) obj2).getClass();
                i12 = 4;
                break;
            case 2:
                i12 = AbstractC2031p.G(((Long) obj2).longValue());
                break;
            case 3:
                i12 = AbstractC2031p.G(((Long) obj2).longValue());
                break;
            case 4:
                i12 = AbstractC2031p.u(((Integer) obj2).intValue());
                break;
            case 5:
                ((Long) obj2).getClass();
                i12 = 8;
                break;
            case 6:
                ((Integer) obj2).getClass();
                i12 = 4;
                break;
            case 7:
                ((Boolean) obj2).getClass();
                break;
            case 8:
                if (obj2 instanceof AbstractC2025j) {
                    i12 = AbstractC2031p.m((AbstractC2025j) obj2);
                    break;
                } else {
                    i12 = AbstractC2031p.B((String) obj2);
                    break;
                }
            case 9:
                i12 = ((AbstractC2011b) obj2).a();
                break;
            case 10:
                a5 = ((AbstractC2011b) obj2).a();
                E10 = AbstractC2031p.E(a5);
                i12 = E10 + a5;
                break;
            case 11:
                if (obj2 instanceof AbstractC2025j) {
                    i12 = AbstractC2031p.m((AbstractC2025j) obj2);
                    break;
                } else {
                    a5 = ((byte[]) obj2).length;
                    E10 = AbstractC2031p.E(a5);
                    i12 = E10 + a5;
                    break;
                }
            case 12:
                i12 = AbstractC2031p.E(((Integer) obj2).intValue());
                break;
            case 13:
                i12 = AbstractC2031p.u(((Integer) obj2).intValue());
                break;
            case 14:
                ((Integer) obj2).getClass();
                i12 = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                i12 = 8;
                break;
            case 16:
                int intValue2 = ((Integer) obj2).intValue();
                i12 = AbstractC2031p.E((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i12 = AbstractC2031p.G((longValue2 >> 63) ^ (longValue2 << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i12 + C11 + i13;
    }

    public static void b(AbstractC2031p abstractC2031p, U3.i iVar, Object obj, Object obj2) {
        C2035u.b(abstractC2031p, (F0) iVar.f17414Y, 1, obj);
        C2035u.b(abstractC2031p, (F0) iVar.f17416h0, 2, obj2);
    }
}
