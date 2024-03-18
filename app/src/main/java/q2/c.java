package Q2;

import B1.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s2.u;

/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: b  reason: collision with root package name */
    public long f14393b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f14394c;

    /* renamed from: d  reason: collision with root package name */
    public long[] f14395d;

    public static Serializable d(int i10, u uVar) {
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(uVar.o()));
                                uVar.G(2);
                                return date;
                            }
                            int x10 = uVar.x();
                            ArrayList arrayList = new ArrayList(x10);
                            for (int i11 = 0; i11 < x10; i11++) {
                                Serializable d10 = d(uVar.u(), uVar);
                                if (d10 != null) {
                                    arrayList.add(d10);
                                }
                            }
                            return arrayList;
                        }
                        return e(uVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String f6 = f(uVar);
                        int u10 = uVar.u();
                        if (u10 == 9) {
                            return hashMap;
                        }
                        Serializable d11 = d(u10, uVar);
                        if (d11 != null) {
                            hashMap.put(f6, d11);
                        }
                    }
                } else {
                    return f(uVar);
                }
            } else {
                if (uVar.u() != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(uVar.o()));
        }
    }

    public static HashMap e(u uVar) {
        int x10 = uVar.x();
        HashMap hashMap = new HashMap(x10);
        for (int i10 = 0; i10 < x10; i10++) {
            String f6 = f(uVar);
            Serializable d10 = d(uVar.u(), uVar);
            if (d10 != null) {
                hashMap.put(f6, d10);
            }
        }
        return hashMap;
    }

    public static String f(u uVar) {
        int z10 = uVar.z();
        int i10 = uVar.f45194b;
        uVar.G(z10);
        return new String(uVar.f45193a, i10, z10);
    }

    public final boolean c(long j6, u uVar) {
        if (uVar.u() != 2 || !"onMetaData".equals(f(uVar)) || uVar.a() == 0 || uVar.u() != 8) {
            return false;
        }
        HashMap e10 = e(uVar);
        Object obj = e10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f14393b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f14394c = new long[size];
                this.f14395d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f14394c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f14395d[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f14394c = new long[0];
                        this.f14395d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
