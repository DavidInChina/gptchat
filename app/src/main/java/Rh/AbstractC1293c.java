package Rh;

import android.gov.nist.core.Separators;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import yh.C6641v;

/* renamed from: Rh.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1293c implements p1 {

    /* renamed from: h0  reason: collision with root package name */
    public static final Map f15798h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final Map f15799i0;

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC1297e f15800Y;

    /* renamed from: Z  reason: collision with root package name */
    public final p1 f15801Z;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Class[] clsArr = {Boolean.TYPE, Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Void.TYPE};
        for (int i10 = 0; i10 < 9; i10++) {
            Class cls = clsArr[i10];
            hashMap.put(cls.getName(), C6641v.l1(cls));
            StringBuilder sb2 = new StringBuilder();
            Nh.r.a(cls, sb2);
            hashMap2.put(sb2.toString(), cls.getName());
        }
        f15798h0 = Collections.unmodifiableMap(hashMap);
        f15799i0 = Collections.unmodifiableMap(hashMap2);
    }

    public AbstractC1293c(AbstractC1297e abstractC1297e, p1 p1Var) {
        this.f15800Y = abstractC1297e;
        this.f15801Z = p1Var;
    }

    @Override // Rh.p1
    public final o1 a(String str) {
        o1 o1Var;
        o1 a5 = this.f15801Z.a(str);
        if (!a5.b()) {
            if (!str.contains(Separators.SLASH)) {
                int i10 = 0;
                while (str.startsWith("[")) {
                    i10++;
                    str = str.substring(1);
                }
                if (i10 > 0) {
                    String str2 = (String) f15799i0.get(str);
                    if (str2 == null) {
                        str = str.substring(1, str.length() - 1);
                    } else {
                        str = str2;
                    }
                }
                yh.l1 l1Var = (yh.l1) f15798h0.get(str);
                AbstractC1297e abstractC1297e = this.f15800Y;
                if (l1Var == null) {
                    o1Var = abstractC1297e.a(str);
                } else {
                    o1Var = new n1(l1Var);
                }
                if (o1Var == null) {
                    o1Var = abstractC1297e.c(str, b(str));
                }
                if (i10 == 0) {
                    return o1Var;
                }
                return new C1289a(o1Var, i10);
            }
            throw new IllegalArgumentException(str.concat(" contains the illegal character '/'"));
        }
        return a5;
    }

    public abstract o1 b(String str);

    public final boolean c(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f15800Y.equals(((AbstractC1293c) obj).f15800Y)) {
            return true;
        }
        return false;
    }

    public final int d() {
        return this.f15800Y.hashCode() + (getClass().hashCode() * 31);
    }

    public boolean equals(Object obj) {
        if (!c(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!this.f15801Z.equals(((AbstractC1293c) obj).f15801Z)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f15801Z.hashCode() + (d() * 31);
    }
}
